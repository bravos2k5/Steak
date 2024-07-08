/*
 * Created by JFormDesigner on Fri Jul 05 23:03:13 ICT 2024
 */

package steamfake.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import steamfake.graphics.*;

/**
 * @author ADMIN
 */
public class LoginDialog extends JDialog {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new LoginDialog(null).setVisible(true);
    }
    public LoginDialog(Window owner) {
        super(owner);
        initComponents();
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
        lbQuenMK.setText("<html>Quên mật Khẩu?<html>");
    }

    private void lbDangKyMouseClicked(MouseEvent e) {
        RegisterDialog RegisterDialog = new RegisterDialog(this);
        LoginDialog.this.dispose();
        RegisterDialog.setVisible(true);
    }

    private void lbQuenMKMouseClicked(MouseEvent e) {
        QuenMKDialog QuenMKDialog = new QuenMKDialog(this);
        LoginDialog.this.dispose();
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
        buttonGradient1 = new ButtonGradient();

        //======== this ========
        var contentPane = getContentPane();

        //======== panelBorder1 ========
        {
            panelBorder1.setBackground(new Color(0x191b20));

            //======== oneRoundedPanel1 ========
            {
                oneRoundedPanel1.setBackground(new Color(0x990099));

                //---- label1 ----
                label1.setText("text");
                label1.setIcon(new ImageIcon("D:\\DA1\\SteamFake\\src\\main\\java\\Icon\\Steam.png"));
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
                            .addGroup(oneRoundedPanel1Layout.createParallelGroup()
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(label2)))
                            .addContainerGap(76, Short.MAX_VALUE))
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
            label3.setText("Login Account");
            label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));

            //---- label4 ----
            label4.setText("T\u00e0i kho\u1ea3n:");
            label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

            //---- label5 ----
            label5.setText("M\u1eadt Kh\u1ea9u:");
            label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

            //---- lbDangKy ----
            lbDangKy.setText("\u0110\u0103ng k\u00fd");
            lbDangKy.setForeground(new Color(0x6f6f6f));
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

            //---- buttonGradient1 ----
            buttonGradient1.setText("\u0110\u0103ng Nh\u1eadp");
            buttonGradient1.setBackground(new Color(0x9900ff));
            buttonGradient1.setColor1(new Color(0x8a8a8a));
            buttonGradient1.setColor2(new Color(0x393939));
            buttonGradient1.setSizeSpeed(20.0F);
            buttonGradient1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            buttonGradient1.setForeground(new Color(0x191b20));

            GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
            panelBorder1.setLayout(panelBorder1Layout);
            panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(oneRoundedPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
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
                                .addComponent(label3)
                                .addGap(173, 173, 173))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(buttonGradient1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addGap(210, 210, 210))))
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
                        .addComponent(buttonGradient1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(164, Short.MAX_VALUE))
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
    private ButtonGradient buttonGradient1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
