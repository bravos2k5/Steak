/*
 * Created by JFormDesigner on Fri Jul 05 23:03:13 ICT 2024
 */

package steamfake.view.login;

import steamfake.dao.AccountDAO;
import steamfake.graphics.ButtonGradient;
import steamfake.graphics.OneRoundedPanel;
import steamfake.graphics.PanelBorder;
import steamfake.model.Account;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.HeaderPanel;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ADMIN
 */
public class LoginDialog extends JDialog {

    public LoginDialog(Window owner) {
        super(owner);
        initComponents();
        initialize();
    }

    private void lbDangKyMouseEntered(MouseEvent e) {
        lbDangKy.setForeground(Color.WHITE);
        lbDangKy.setText("<html><u>Đăng ký</u></html>");
    }

    private void lbDangKyMouseExited(MouseEvent e) {
        lbDangKy.setForeground(Color.decode("#6f6f6f"));
        lbDangKy.setText("<html>Đăng ký</html>");
    }

    private void lbQuenMKMouseEntered(MouseEvent e) {
        lbQuenMK.setForeground(Color.WHITE);
        lbQuenMK.setText("<html><u>Quên mật khẩu?</u></html>");
    }

    private void lbQuenMKMouseExited(MouseEvent e) {
        lbQuenMK.setForeground(Color.decode("#6f6f6f"));
        lbQuenMK.setText("<html>Quên mật khẩu?<html>");
    }

    private void lbDangKyMouseClicked(MouseEvent e) {
        RegisterDialog RegisterDialog = new RegisterDialog(this);
        RegisterDialog.setVisible(true);
    }

    private void lbQuenMKMouseClicked(MouseEvent e) {
        QuenMKDialog QuenMKDialog = new QuenMKDialog(MFrame.gI());
        QuenMKDialog.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelBorder1 = new PanelBorder();
        oneRoundedPanel1 = new OneRoundedPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        txtTaiKhoan = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        txtPassword = new JPasswordField();
        lbDangKy = new JLabel();
        lbQuenMK = new JLabel();
        btnLogin = new ButtonGradient();
        label6 = new JLabel();
        lblGuest = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        var contentPane = getContentPane();

        //======== panelBorder1 ========
        {
            panelBorder1.setBackground(new Color(0x191b20));

            //======== oneRoundedPanel1 ========
            {
                oneRoundedPanel1.setBackground(new Color(0x990099));

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/icon/Steambig.png")));
                label1.setBackground(Color.black);

                //---- label2 ----
                label2.setText("Login");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 64));
                label2.setForeground(Color.white);

                GroupLayout oneRoundedPanel1Layout = new GroupLayout(oneRoundedPanel1);
                oneRoundedPanel1.setLayout(oneRoundedPanel1Layout);
                oneRoundedPanel1Layout.setHorizontalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(label2)
                            .addContainerGap(76, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, oneRoundedPanel1Layout.createSequentialGroup()
                            .addContainerGap(109, Short.MAX_VALUE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95))
                );
                oneRoundedPanel1Layout.setVerticalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label2)
                            .addContainerGap(303, Short.MAX_VALUE))
                );
            }

            //---- label3 ----
            label3.setText("SteaK");
            label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));

            //---- label4 ----
            label4.setText("T\u00e0i kho\u1ea3n:");
            label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

            //---- label5 ----
            label5.setText("M\u1eadt kh\u1ea9u:");
            label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

            //---- lbDangKy ----
            lbDangKy.setText("\u0110\u0103ng k\u00fd");
            lbDangKy.setForeground(new Color(0x6f6f6f));
            lbDangKy.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lbDangKy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lbDangKy.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbDangKyMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    lbDangKyMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    lbDangKyMouseExited(e);
                }
            });

            //---- lbQuenMK ----
            lbQuenMK.setText("Qu\u00ean m\u1eadt kh\u1ea9u?");
            lbQuenMK.setForeground(new Color(0x6f6f6f));
            lbQuenMK.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lbQuenMK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lbQuenMK.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbQuenMKMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    lbQuenMKMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    lbQuenMKMouseExited(e);
                }
            });

            //---- btnLogin ----
            btnLogin.setText("\u0110\u0103ng Nh\u1eadp");
            btnLogin.setBackground(new Color(0x9900ff));
            btnLogin.setColor1(new Color(0x8a8a8a));
            btnLogin.setColor2(new Color(0x393939));
            btnLogin.setSizeSpeed(20.0F);
            btnLogin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            btnLogin.setForeground(new Color(0x191b20));

            //---- label6 ----
            label6.setText("\u00a9 B\u1ea3n quy\u1ec1n thu\u1ed9c v\u1ec1 SteaK 1884 - 2024");

            //---- lblGuest ----
            lblGuest.setText("T\u00f4i ch\u01b0a mu\u1ed1n \u0111\u0103ng nh\u1eadp. Ti\u1ebfp t\u1ee5c v\u1edbi vai tr\u00f2 kh\u00e1ch ?");
            lblGuest.setForeground(new Color(0x6f6f6f));
            lblGuest.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblGuest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
            panelBorder1.setLayout(panelBorder1Layout);
            panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(oneRoundedPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup()
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(label5))
                                    .addContainerGap())
                                .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                            .addComponent(lbDangKy)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                                            .addComponent(lbQuenMK))
                                        .addComponent(txtPassword, GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTaiKhoan, GroupLayout.Alignment.LEADING))
                                    .addGap(103, 103, 103)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(label6)
                                .addGap(181, 181, 181))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(240, 240, 240))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(lblGuest)
                                .addGap(113, 113, 113))))
            );
            panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDangKy)
                            .addComponent(lbQuenMK))
                        .addGap(52, 52, 52)
                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGuest)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(label6)
                        .addGap(39, 39, 39))
                    .addComponent(oneRoundedPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panelBorder1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panelBorder1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private JTextField txtTaiKhoan;
    private JLabel label4;
    private JLabel label5;
    private JPasswordField txtPassword;
    private JLabel lbDangKy;
    private JLabel lbQuenMK;
    private ButtonGradient btnLogin;
    private JLabel label6;
    private JLabel lblGuest;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        btnLogin.addActionListener(e -> loginAction());
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    loginAction();
                }
            }
        });
        lblGuest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginDialog.this.dispose();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblGuest.setForeground(Color.WHITE);
                lblGuest.setText("<html><u>Tôi chưa muốn đăng nhập. Tiếp tục với vai trò khách ?</u></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblGuest.setForeground(Color.decode("#6f6f6f"));
                lblGuest.setText("<html>Tôi chưa muốn đăng nhập. Tiếp tục với vai trò khách ?</html>");
            }
        });
    }

    private void loginAction() {
        String username = txtTaiKhoan.getText();
        char[] password = txtPassword.getPassword();
        if(username.isBlank() || password.length == 0) {
            XMessage.alert(this, "Tên tài khoản và mật khẩu không được để trống");
            return;
        }
        Account account = AccountDAO.gI().login(username,new String(password));
        if(account == null) {
            XMessage.alert(this, "Tài khoản hoặc mật khẩu không đúng");
            return;
        }
        if(account.isBan()) {
            XMessage.alert(this, "Tài khoản của bạn đã bị khóa");
            return;
        }
        SessionManager.user = account;
        HeaderPanel.gI().updateAccount();
        this.dispose();
    }

}
