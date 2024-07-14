package steamfake.view.factory;

import steamfake.dao.AccountDAO;
import steamfake.dao.GameDAO;
import steamfake.model.Account;
import steamfake.model.Game;
import steamfake.utils.XImage;
import steamfake.utils.azure.AzureBlobService;
import steamfake.view.mainframe.ListGamePanel;

import javax.swing.*;
import java.io.File;

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

    private static String getFolderResource(Game game) {
        return "data/images/games/" + game.getId() + "/demo";
    }


}
