/*
 * Created by JFormDesigner on Mon Jul 15 17:58:26 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.EvaluationDAO;
import steamfake.graphics.CustomTextBox;
import steamfake.model.Account;
import steamfake.model.join.Evaluation;
import steamfake.utils.ResourceManager;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * @author BRAVOS
 */
public class CommentPanel extends JPanel {

    private final Evaluation evaluation;

    public CommentPanel(Evaluation evaluation) {
        this.evaluation = evaluation;
        initComponents();
        initialize();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvatar = new JLabel();
        lblName = new JLabel();
        label5 = new JLabel();
        lblRate = new JLabel();
        panel1 = new JPanel();
        txtComment = new CustomTextBox();
        lblDeleteComment = new JLabel();

        //======== this ========
        setOpaque(false);

        //---- lblName ----
        lblName.setText("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- label5 ----
        label5.setText("Ch\u1ea5m \u0111i\u1ec3m:");
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- lblRate ----
        lblRate.setText("100/100");
        lblRate.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
            panel1.add(txtComment);
        }

        //---- lblDeleteComment ----
        lblDeleteComment.setIcon(new ImageIcon(getClass().getResource("/icon/delete-mini.png")));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblRate))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 801, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblDeleteComment)))))
                    .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblName)
                                .addComponent(lblDeleteComment))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(lblRate))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblAvatar;
    private JLabel lblName;
    private JLabel label5;
    private JLabel lblRate;
    private JPanel panel1;
    private CustomTextBox txtComment;
    private JLabel lblDeleteComment;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        loadInfo();
        lblDeleteComment.setVisible(SessionManager.user != null && SessionManager.user.isAdmin());
        lblDeleteComment.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleteComment();
            }
        });
    }

    private void loadInfo() {
        lblName.setText(evaluation.getName());
        lblAvatar.setSize(new Dimension(81,81));
        if(evaluation.getAvatar() != null && !evaluation.getAvatar().isBlank()) {
            String path = "data/avatars/" + evaluation.getAccountID() + "/" + evaluation.getAvatar();
            if(!new File(path).exists()) {
                Account account = new Account(evaluation.getAccountID());
                account.setAvatar(evaluation.getAvatar());
                ResourceManager.downloadAvatar(account);
            }
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(path),lblAvatar));
        }
        else {
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")),lblAvatar));
        }

        lblRate.setText(evaluation.getRate() + "");
        txtComment.setText(evaluation.getComment());
        revalidate();
        repaint();
    }

    private void deleteComment() {
        int choice = XMessage.confirm(MFrame.getInstance(),"Bạn có chắc chắn muốn xóa bình luận này không?");
        if(choice == JOptionPane.YES_OPTION) {
            int result = EvaluationDAO.gI().delete(evaluation);
            if(result > 0) {
                Container parent = this.getParent();
                parent.remove(this);
                parent.revalidate();
                parent.repaint();
                XMessage.notificate(MFrame.getInstance(),"Xóa bình luận thành công!");
            }
            else {
                XMessage.notificate(MFrame.getInstance(),"Xóa bình luận thất bại!");
            }
        }
    }


}
