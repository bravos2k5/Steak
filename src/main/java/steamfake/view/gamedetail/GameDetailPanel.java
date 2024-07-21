/*
 * Created by JFormDesigner on Tue Jul 16 22:05:50 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.GameLibraryDAO;
import steamfake.model.Game;
import steamfake.model.GameLibrary;
import steamfake.utils.SessionManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @author BRAVOS
 */
public class GameDetailPanel extends JPanel {

    private final Game game;
    private GameLibrary gameLibrary;
    private List<GameLibrary> commentList;

    public GameDetailPanel(Game game) {
        this.game = game;
        if (SessionManager.user != null) {
            gameLibrary = GameLibraryDAO.gI().selectByGameIdAndAccountId(game.getId(), SessionManager.user.getId());
        }
        initComponents();
        initialize();
    }

    public GameLibrary getGameLibrary() {
        return gameLibrary;
    }

    public void setGameLibrary(GameLibrary gameLibrary) {
        this.gameLibrary = gameLibrary;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        detailPanel = new JPanel();
        myCommentPanel = new JPanel();
        commentPanel = new JPanel();

        //======== this ========
        setOpaque(false);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //======== detailPanel ========
        {
            detailPanel.setLayout(new BoxLayout(detailPanel, BoxLayout.Y_AXIS));
        }
        add(detailPanel);

        //======== myCommentPanel ========
        {
            myCommentPanel.setLayout(new BoxLayout(myCommentPanel, BoxLayout.Y_AXIS));
        }
        add(myCommentPanel);

        //======== commentPanel ========
        {
            commentPanel.setLayout(new BoxLayout(commentPanel, BoxLayout.Y_AXIS));
        }
        add(commentPanel);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel detailPanel;
    private JPanel myCommentPanel;
    private JPanel commentPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        detailPanel.add(new GameDetail(game, this));
        loadMyComment();
        loadComment();
    }

    public void loadComment() {
        commentList = GameLibraryDAO.gI().selectCommentByGameID(game.getId());
        commentPanel.removeAll();
        for(GameLibrary gl : commentList) {
            if(!gl.equals(gameLibrary))
                commentPanel.add(new CommentPanel(gl));
        }
        if(commentList.isEmpty()) {
            JLabel label = new JLabel("Chưa có đánh giá nào");
            label.setForeground(Color.white);
            label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        }
        commentPanel.repaint();
        commentPanel.validate();
        this.repaint();
    }

    public void loadMyComment() {
        if(gameLibrary != null) {
            myCommentPanel.removeAll();
            myCommentPanel.add(new MyCommentPanel(gameLibrary));
            myCommentPanel.repaint();
            myCommentPanel.validate();
            this.repaint();
        }
    }

}
