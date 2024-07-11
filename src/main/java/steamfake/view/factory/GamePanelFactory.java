package steamfake.view.factory;

import steamfake.dao.AccountDAO;
import steamfake.dao.GameDAO;
import steamfake.graphics.swing.PictureBox;
import steamfake.model.Account;
import steamfake.model.Game;
import steamfake.utils.XImage;
import steamfake.utils.azure.AzureBlobService;
import steamfake.view.HotGamePanel2;
import steamfake.view.mainframe.ListGamePanel;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GamePanelFactory {

    public static ListGamePanel createListGamePanel(Game game) {
        ListGamePanel listGamePanel = new ListGamePanel();
        String folderResource = getFolderResource(game);
        if(new File(folderResource).mkdirs()) {
            AzureBlobService.download(folderResource + "/" + game.getAvatar(),
                    "games/" + game.getId().toString() + "/" + game.getAvatar(),"images");
        }
        listGamePanel.getLblImageGame().setIcon(XImage.scaleImageForLabel(new ImageIcon(folderResource + "/avatar.png"), listGamePanel.getLblImageGame()));
        listGamePanel.getLblDownload().setText(GameDAO.gI().selectLuotTai(game) + "");
        listGamePanel.getLblNameGame().setText(game.getName());
        listGamePanel.getLblNameCreator().setText("<html><p style=\\\"max-width:180px;text-align:center\\\">" +
                AccountDAO.gI().selectByID(new Account(game.getPublisherID())).getUsername());
        listGamePanel.getLblPrice().setText(game.getGiaTien() + "");
        listGamePanel.getLblReviews().setText(GameDAO.gI().selectAvgRate(game) + "");
        return listGamePanel;
    }


    public static HotGamePanel2 createHotGamePanel2(Game game) {
        HotGamePanel2 hotGamePanel = new HotGamePanel2();
        String folderResource = getFolderResource(game);
        File folderResourceFile = new File(folderResource);
        if(folderResourceFile.mkdirs() || folderResourceFile.listFiles().length <= 1){
            AzureBlobService.downloadManyFile(folderResource,"games/" + game.getId() + "/","images");
        }
        File[] files = new File(folderResource).listFiles();
        List<PictureBox> pictureBoxes = new ArrayList<>();
        if (files != null) {
            for(File file : files) {
                if(file.getName().equals(game.getAvatar())) continue;
                PictureBox pictureBox = new PictureBox();
                pictureBox.setImage(new ImageIcon(file.getAbsolutePath()));
                pictureBoxes.add(pictureBox);
            }
        }
        hotGamePanel.getSlsImages().initSlideshow(pictureBoxes);
        hotGamePanel.getLblDownloads().setText(GameDAO.gI().selectLuotTai(game) + "");
        hotGamePanel.getLblNameGame().setText(game.getName());
        hotGamePanel.getLblPrice().setText(game.getGiaTien() + "");
        hotGamePanel.getLblReviews().setText(GameDAO.gI().selectAvgRate(game) + "");
        return hotGamePanel;
    }

    private static String getFolderResource(Game game) {
        return "data/images/games/" + game.getId() + "/demo";
    }


}
