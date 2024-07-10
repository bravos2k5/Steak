/*
 * Created by JFormDesigner on Sat Jul 06 15:09:44 ICT 2024
 */

package steamfake.view;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import steamfake.dao.AccountDAO;
import steamfake.graphics.ButtonGradient;
import steamfake.graphics.OneRoundedPanel;
import steamfake.graphics.PanelBorder;
import steamfake.utils.XEmail;
import steamfake.utils.XMessage;
import steamfake.utils.XSecurity;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * @author ADMIN
 */
public class QuenMKDialog extends JDialog {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new QuenMKDialog(null).setVisible(true);
    }
    public QuenMKDialog(Window owner) {
        super(owner);
        initComponents();
    }

    private void label8MouseEntered(MouseEvent e) {
        lbQuayLai.setForeground(Color.WHITE);
        lbQuayLai.setText("<html><u>Quay lai</u></html>");
    }

    private void label8MouseExited(MouseEvent e) {
        lbQuayLai.setForeground(Color.decode("#6f6f6f"));
        lbQuayLai.setText("<html>Quay lai</html>");
    }

    private void label8MouseClicked(MouseEvent e) {
        LoginDialog LoginDialog = new LoginDialog(MFrame.getInstance());
        QuenMKDialog.this.dispose();
        LoginDialog.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelBorder1 = new PanelBorder();
        oneRoundedPanel1 = new OneRoundedPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        txtUsername = new JTextField();
        label5 = new JLabel();
        txtNewMK = new JPasswordField();
        label6 = new JLabel();
        txtNhapLaiMK = new JPasswordField();
        label7 = new JLabel();
        txtNhapMa = new JTextField();
        btnGui = new JButton();
        btnConfirm = new ButtonGradient();
        lbQuayLai = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== panelBorder1 ========
        {
            panelBorder1.setBackground(new Color(0x191b20));

            //======== oneRoundedPanel1 ========
            {

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/icon/Steambig.png")));
                label1.setBackground(Color.black);

                //---- label2 ----
                label2.setText("Forgot password");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 36));
                label2.setForeground(Color.white);

                GroupLayout oneRoundedPanel1Layout = new GroupLayout(oneRoundedPanel1);
                oneRoundedPanel1.setLayout(oneRoundedPanel1Layout);
                oneRoundedPanel1Layout.setHorizontalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(label2)
                            .addContainerGap(29, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, oneRoundedPanel1Layout.createSequentialGroup()
                            .addContainerGap(118, Short.MAX_VALUE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(107, 107, 107))
                );
                oneRoundedPanel1Layout.setVerticalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label2)
                            .addContainerGap(184, Short.MAX_VALUE))
                );
            }

            //---- label3 ----
            label3.setText("Qu\u00ean m\u1eadt kh\u1ea9u");
            label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

            //---- label4 ----
            label4.setText("T\u00ean t\u00e0i kho\u1ea3n:");
            label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label5 ----
            label5.setText("M\u1eadt kh\u1ea9u m\u1edbi:");
            label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label6 ----
            label6.setText("Nh\u1eadp l\u1ea1i m\u1eadt kh\u1ea9u:");
            label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label7 ----
            label7.setText("Nh\u1eadp m\u00e3:");
            label7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- btnGui ----
            btnGui.setText("G\u1eedi");

            //---- btnConfirm ----
            btnConfirm.setText("X\u00e1c nh\u1eadn");
            btnConfirm.setForeground(new Color(0x191b20));
            btnConfirm.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
            btnConfirm.setColor1(new Color(0x8a8a8a));
            btnConfirm.setColor2(new Color(0x393939));
            btnConfirm.setSizeSpeed(20.0F);

            //---- lbQuayLai ----
            lbQuayLai.setText("Quay l\u1ea1i");
            lbQuayLai.setForeground(new Color(0x6f6f6f));
            lbQuayLai.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label8MouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    label8MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    label8MouseExited(e);
                }
            });

            GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
            panelBorder1.setLayout(panelBorder1Layout);
            panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(oneRoundedPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                        .addGroup(panelBorder1Layout.createParallelGroup()
                                            .addComponent(label4)
                                            .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58))
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addGroup(panelBorder1Layout.createParallelGroup()
                                            .addComponent(label5)
                                            .addComponent(txtNewMK, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6)
                                            .addComponent(txtNhapLaiMK, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label7)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap()))
                                .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                    .addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                    .addGap(207, 207, 207))
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addComponent(lbQuayLai)
                                    .addContainerGap()))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(180, 180, 180))))
            );
            panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addComponent(oneRoundedPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label4)
                        .addGap(6, 6, 6)
                        .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5)
                        .addGap(6, 6, 6)
                        .addComponent(txtNewMK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label6)
                        .addGap(6, 6, 6)
                        .addComponent(txtNhapLaiMK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(lbQuayLai)
                        .addGap(19, 19, 19))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panelBorder1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelBorder1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private PanelBorder panelBorder1;
    private OneRoundedPanel oneRoundedPanel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField txtUsername;
    private JLabel label5;
    private JPasswordField txtNewMK;
    private JLabel label6;
    private JPasswordField txtNhapLaiMK;
    private JLabel label7;
    private JTextField txtNhapMa;
    private JButton btnGui;
    private ButtonGradient btnConfirm;
    private JLabel lbQuayLai;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private String verifyUsername;
    private String verifyCode;

    private void initialize() {
        btnGui.addActionListener(e -> sendCode());
        btnConfirm.addActionListener(e -> confirmAction());
    }

    private void sendCode() {
        String username = txtUsername.getText();
        if(username.isBlank()) {
            XMessage.alert(this,"Vui lòng nhập tên tài khoản");
        }
        else if (username.length() >= 5) {
            String email = AccountDAO.gI().forgetPassword(username);
            String code = 100000 + new Random().nextInt(899999) + "";
            if(email == null) {
                XMessage.alert(this,"Tài khoản không tồn tại");
            }
            else {
                XEmail.sendEmail(email, "SteaK forget password","Mã xác nhận đổi mật khẩu của bạn là: <b> " + code + "</b>");
                verifyUsername = username;
                verifyCode = code;
                XMessage.notificate(this,"Mã xác nhận đã được gửi đến email đăng ký của bạn");
            }
        }
    }

    private void confirmAction() {
        String code = txtNhapMa.getText();
        String newMK = new String(txtNewMK.getPassword());
        String confirmMK = new String(txtNhapLaiMK.getPassword());
        if(code.equals(verifyCode)) {
            if(newMK.equals(confirmMK) && AccountDAO.gI().changePassword(verifyUsername, XSecurity.hashPassword(newMK)) > 0) {
                XMessage.notificate(this,"Đổi mật khẩu thành công");
                LoginDialog loginDialog = new LoginDialog(MFrame.getInstance());
                QuenMKDialog.this.dispose();
                loginDialog.setVisible(true);
            }
            else {
                XMessage.alert(this,"Mật khẩu không khớp");
            }
        }
        else {
            XMessage.alert(this,"Mã xác nhận không đúng");
        }
    }

}
