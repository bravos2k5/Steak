/*
 * Created by JFormDesigner on Sat Jul 13 22:22:26 ICT 2024
 */

package steamfake.view.account;

import steamfake.dao.AccountDAO;
import steamfake.graphics.RadiusButton;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;
import steamfake.utils.XSecurity;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class ChangePassword extends JDialog {
    public ChangePassword(Window owner) {
        super(owner);
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        btnSubmit = new RadiusButton();
        btnCancel = new RadiusButton();
        txtOldPassword = new JPasswordField();
        txtNewPassword1 = new JPasswordField();
        txtNewPassword2 = new JPasswordField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        var contentPane = getContentPane();

        //---- label4 ----
        label4.setText("M\u1eadt kh\u1ea9u c\u0169");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("M\u1eadt kh\u1ea9u m\u1edbi");
        label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label6 ----
        label6.setText("Nh\u1eadp l\u1ea1i m\u1eadt kh\u1ea9u m\u1edbi");
        label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- btnSubmit ----
        btnSubmit.setText("\u0110\u1ed5i m\u1eadt kh\u1ea9u");
        btnSubmit.setBackground(new Color(0x35452a));
        btnSubmit.setHoverColor(new Color(0x429509));
        btnSubmit.setOriginColor(new Color(0x35452a));
        btnSubmit.setRadius(5);
        btnSubmit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        //---- btnCancel ----
        btnCancel.setText("H\u1ee7y b\u1ecf");
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setHoverColor(new Color(0x9d2424));
        btnCancel.setRadius(5);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOldPassword, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addGap(189, 189, 189)
                                    .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(txtNewPassword2, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNewPassword1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 26, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtOldPassword, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addComponent(txtNewPassword1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNewPassword2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private RadiusButton btnSubmit;
    private RadiusButton btnCancel;
    private JPasswordField txtOldPassword;
    private JPasswordField txtNewPassword1;
    private JPasswordField txtNewPassword2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        this.setTitle("Đổi mật khẩu");
        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon/key.png");
        this.setIconImage(icon);
        btnSubmit.addActionListener(e -> changePassword());
        btnCancel.addActionListener(e -> this.dispose());
    }

    private void changePassword() {
        String originalOldPassword = SessionManager.user.getPassword();
        String oldPassword = new String(txtOldPassword.getPassword());
        String newPassword1 = new String(txtNewPassword1.getPassword());
        String newPassword2 = new String(txtNewPassword2.getPassword());
        if(!newPassword1.equals(newPassword2)) {
            XMessage.notificate(this, "Mật khẩu mới không khớp");
            return;
        }
        if(XSecurity.isValidPassword(oldPassword,originalOldPassword)) {
            final String newHashedPassword = XSecurity.hashPassword(newPassword1);
            if(AccountDAO.gI().changePassword(SessionManager.user.getUsername(),newHashedPassword) > 0) {
                XMessage.notificate(this, "Đổi mật khẩu thành công");
                SessionManager.user.setPassword(newHashedPassword);
                this.dispose();
            } else {
                XMessage.notificate(this, "Đổi mật khẩu thất bại");
            }
        } else {
            XMessage.alert(this, "Mật khẩu cũ không đúng");
        }
    }
}
