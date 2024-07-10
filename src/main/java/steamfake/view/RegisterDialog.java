/*
 * Created by JFormDesigner on Sat Jul 06 12:02:07 ICT 2024
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
public class RegisterDialog extends JDialog {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new RegisterDialog(null).setVisible(true);
    }
    public RegisterDialog(Window owner) {
        super(owner);
        initComponents();
    }

    private void lbQuayLaiMouseEntered(MouseEvent e) {
        lbQuayLai.setForeground(Color.WHITE);
        lbQuayLai.setText("<html><u>Quay lai</u></html>");
    }

    private void lbQuayLaiMouseExited(MouseEvent e) {
        lbQuayLai.setForeground(Color.decode("#6f6f6f"));
        lbQuayLai.setText("<html>Quay lai</html>");
    }

    private void lbQuayLaiMouseClicked(MouseEvent e) {
        LoginDialog LoginDialog = new LoginDialog(null);
        RegisterDialog.this.dispose();
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
        txtTaiKhoan = new JTextField();
        label5 = new JLabel();
        txtHoTen = new JTextField();
        label6 = new JLabel();
        txtMk = new JPasswordField();
        label7 = new JLabel();
        txtNhapLaiMk = new JPasswordField();
        label8 = new JLabel();
        txtNgaySinh = new DateTimeTextField();
        label9 = new JLabel();
        txtEmail = new JTextField();
        label10 = new JLabel();
        txtNhapMa = new JTextField();
        btnDangKy = new ButtonGradient();
        lbQuayLai = new JLabel();
        btnGui = new JButton();

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
                label2.setText("Register");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 62));
                label2.setForeground(Color.white);

                GroupLayout oneRoundedPanel1Layout = new GroupLayout(oneRoundedPanel1);
                oneRoundedPanel1.setLayout(oneRoundedPanel1Layout);
                oneRoundedPanel1Layout.setHorizontalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGroup(oneRoundedPanel1Layout.createParallelGroup()
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(label2))
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(42, Short.MAX_VALUE))
                );
                oneRoundedPanel1Layout.setVerticalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //---- label3 ----
            label3.setText("Register Account");
            label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));

            //---- label4 ----
            label4.setText("T\u00e0i kho\u1ea3n:");
            label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label5 ----
            label5.setText("H\u1ecd t\u00ean:");
            label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label6 ----
            label6.setText("M\u1eadt kh\u1ea9u:");
            label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label7 ----
            label7.setText("Nh\u1eadp l\u1ea1i m\u1eadt kh\u1ea9u:");
            label7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label8 ----
            label8.setText("Ng\u00e0y sinh:");
            label8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label9 ----
            label9.setText("Email:");
            label9.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label10 ----
            label10.setText("Nh\u1eadp m\u00e3:");
            label10.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- btnDangKy ----
            btnDangKy.setText("\u0110\u0103ng k\u00fd");
            btnDangKy.setColor1(new Color(0x8a8a8a));
            btnDangKy.setColor2(new Color(0x393939));
            btnDangKy.setSizeSpeed(20.0F);
            btnDangKy.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            btnDangKy.setForeground(new Color(0x191b20));

            //---- lbQuayLai ----
            lbQuayLai.setText("Quay l\u1ea1i");
            lbQuayLai.setForeground(new Color(0x6f6f6f));
            lbQuayLai.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbQuayLaiMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    lbQuayLaiMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    lbQuayLaiMouseExited(e);
                }
            });

            //---- btnGui ----
            btnGui.setText("G\u1eedi");

            GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
            panelBorder1.setLayout(panelBorder1Layout);
            panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(oneRoundedPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(150, 150, 150))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                        .addComponent(label10)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelBorder1Layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label4)
                                            .addComponent(txtTaiKhoan)
                                            .addComponent(label5)
                                            .addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6)
                                            .addComponent(txtMk)
                                            .addComponent(label7)
                                            .addComponent(txtNhapLaiMk, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label8))
                                        .addComponent(label9)
                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbQuayLai)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
            );
            panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addComponent(oneRoundedPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label7)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhapLaiMk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label9)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup()
                            .addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuayLai))
                        .addGap(60, 60, 60))
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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panelBorder1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE))
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
    private JTextField txtTaiKhoan;
    private JLabel label5;
    private JTextField txtHoTen;
    private JLabel label6;
    private JPasswordField txtMk;
    private JLabel label7;
    private JPasswordField txtNhapLaiMk;
    private JLabel label8;
    private DateTimeTextField txtNgaySinh;
    private JLabel label9;
    private JTextField txtEmail;
    private JLabel label10;
    private JTextField txtNhapMa;
    private ButtonGradient btnDangKy;
    private JLabel lbQuayLai;
    private JButton btnGui;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
