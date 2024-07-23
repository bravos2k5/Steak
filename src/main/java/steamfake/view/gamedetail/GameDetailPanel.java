/*
 * Created by JFormDesigner on Tue Jul 16 22:05:50 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.EvaluationDAO;
import steamfake.dao.GameLibraryDAO;
import steamfake.model.Game;
import steamfake.model.GameLibrary;
import steamfake.model.join.Evaluation;
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
    private List<Evaluation> commentList;

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
        commentList = EvaluationDAO.gI().selectByGameID(game.getId());
        commentPanel.removeAll();
        if (!SessionManager.isLogin() || gameLibrary == null) {
            for(Evaluation gl : commentList) {
                commentPanel.add(new CommentPanel(gl));
            }
        }
        else {
            for(Evaluation gl : commentList) {
                if (gl.getAccountID() != SessionManager.user.getId()) {
                    commentPanel.add(new CommentPanel(gl));
                }
            }
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
            Evaluation evaluation = new Evaluation(gameLibrary);
            evaluation.setName(SessionManager.user.getHoTen());
            evaluation.setAvatar(SessionManager.user.getAvatar());
            myCommentPanel.removeAll();
            myCommentPanel.add(new MyCommentPanel(evaluation));
            myCommentPanel.repaint();
            myCommentPanel.validate();
            this.repaint();
        }
    }

}
