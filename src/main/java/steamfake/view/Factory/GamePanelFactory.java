package steamfake.view.Factory;

import steamfake.dao.AccountDAO;
import steamfake.dao.GameDAO;
import steamfake.model.Account;
import steamfake.model.Game;
import steamfake.utils.XImage;
import steamfake.utils.azure.AzureBlobService;
import steamfake.view.MainFrame.HotGamePanel;
import steamfake.view.MainFrame.ListGamePanel;

import javax.swing.*;
import java.io.File;
import java.util.List;

public class GamePanelFactory {

    public static ListGamePanel createListGamePanel(Game game) {
        ListGamePanel listGamePanel = new ListGamePanel();
        String folderResource = "data/images/games/" + game.getId() + "/avatar";
        if(new File(folderResource).mkdirs()) {
            AzureBlobService.download(folderResource + "/" + game.getAvatar(), "games/" + game.getId().toString() + "/" + game.getAvatar(),"images");
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

    public static HotGamePanel createHotGamePanel(Game game) {
        HotGamePanel hotGamePanel = new HotGamePanel();
        String folderResource = "data/images/games/" + game.getId() + "/demo";
        File folderResourceFile = new File(folderResource);
        if(folderResourceFile.mkdirs() || folderResourceFile.listFiles().length <= 1){
            AzureBlobService.downloadManyFile(folderResource,"games/" + game.getId() + "/","images");
        }
        File[] files = new File(folderResource).listFiles();
        List<ImageIcon> imageIconList = hotGamePanel.getImageIconList();
        if (files != null) {
            for(File file : files) {
                imageIconList.add(XImage.scaleImageForLabel(new ImageIcon(file.getAbsolutePath()),hotGamePanel.getLbImage()));
            }
            hotGamePanel.getLbImage().setText("");
            hotGamePanel.getLbImage().setIcon(imageIconList.getFirst());
        }
        hotGamePanel.getLblDownloads().setText(GameDAO.gI().selectLuotTai(game) + "");
        hotGamePanel.getLblNameGame().setText(game.getName());
        hotGamePanel.getLblPrice().setText(game.getGiaTien() + "");
        hotGamePanel.getLblReviews().setText(GameDAO.gI().selectAvgRate(game) + "");
        return hotGamePanel;
    }


}
