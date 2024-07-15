/*
 * Created by JFormDesigner on Mon Jul 15 17:58:26 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.AccountDAO;
import steamfake.graphics.CustomTextBox;
import steamfake.model.GameLibrary;
import steamfake.utils.XImage;

import javax.swing.*;
import java.awt.*;

/**
 * @author BRAVOS
 */
public class CommentPanel extends JPanel {

    private final GameLibrary gameLibrary;

    public CommentPanel(GameLibrary gameLibrary) {
        this.gameLibrary = gameLibrary;
        initComponents();
        loadInfo();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvatar = new JLabel();
        lblName = new JLabel();
        label5 = new JLabel();
        lblRate = new JLabel();
        txtComment = new CustomTextBox();
        hSpacer1 = new JPanel(null);

        //======== this ========

        //---- lblName ----
        lblName.setText("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- label5 ----
        label5.setText("Ch\u1ea5m \u0111i\u1ec3m:");
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- lblRate ----
        lblRate.setText("100/100");
        lblRate.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- txtComment ----
        txtComment.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //---- hSpacer1 ----
        hSpacer1.setBackground(Color.white);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(txtComment, GroupLayout.PREFERRED_SIZE, 870, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblRate))))
                        .addComponent(hSpacer1, GroupLayout.PREFERRED_SIZE, 934, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName)
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(lblRate))))
                    .addGap(18, 18, 18)
                    .addComponent(txtComment, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(hSpacer1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblAvatar;
    private JLabel lblName;
    private JLabel label5;
    private JLabel lblRate;
    private CustomTextBox txtComment;
    private JPanel hSpacer1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void loadInfo() {
        String[] nameAndAvatar = AccountDAO.gI().selectNameAndAvatarByID(gameLibrary.getAccountId());
        lblName.setText(nameAndAvatar[0]);
        if(nameAndAvatar[1] != null && !nameAndAvatar[1].isBlank()) {
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon("data/avatars/" +
                    gameLibrary.getAccountId() + "/" + nameAndAvatar[1]),lblAvatar));
        }
        else {
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("icon/default_avatar.png")),lblAvatar));
        }

        lblRate.setText(gameLibrary.getRate() + "");
        txtComment.setText("<br></br>" + gameLibrary.getComment());
    }

}
