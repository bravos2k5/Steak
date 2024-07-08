/*
 * Created by JFormDesigner on Sat Jul 06 15:09:44 ICT 2024
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
        LoginDialog LoginDialog = new LoginDialog(null);
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
        txtEmail = new JTextField();
        label5 = new JLabel();
        txtNhapMkMoi = new JTextField();
        label6 = new JLabel();
        txtNhapLaiMK = new JTextField();
        label7 = new JLabel();
        txtNhapMa = new JTextField();
        btnGui = new JButton();
        buttonGradient1 = new ButtonGradient();
        lbQuayLai = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== panelBorder1 ========
        {
            panelBorder1.setBackground(new Color(0x191b20));

            //======== oneRoundedPanel1 ========
            {

                //---- label1 ----
                label1.setText("text");
                label1.setIcon(new ImageIcon("D:\\DA1\\SteamFake\\src\\main\\java\\Icon\\Steam.png"));
                label1.setBackground(Color.black);

                //---- label2 ----
                label2.setText("Forgot Password");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 36));
                label2.setForeground(Color.white);

                GroupLayout oneRoundedPanel1Layout = new GroupLayout(oneRoundedPanel1);
                oneRoundedPanel1.setLayout(oneRoundedPanel1Layout);
                oneRoundedPanel1Layout.setHorizontalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGroup(oneRoundedPanel1Layout.createParallelGroup()
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(label2))
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(29, Short.MAX_VALUE))
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
            label3.setText("Forgot Password");
            label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

            //---- label4 ----
            label4.setText("Email:");
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

            //---- buttonGradient1 ----
            buttonGradient1.setText("Done");
            buttonGradient1.setForeground(new Color(0x191b20));
            buttonGradient1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
            buttonGradient1.setColor1(new Color(0x8a8a8a));
            buttonGradient1.setColor2(new Color(0x393939));
            buttonGradient1.setSizeSpeed(20.0F);

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
                                .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addGap(168, 168, 168))
                                .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup()
                                        .addComponent(label4)
                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE))
                                    .addGap(58, 58, 58))
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup()
                                        .addComponent(label5)
                                        .addComponent(txtNhapMkMoi, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6)
                                        .addComponent(txtNhapLaiMK, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label7)
                                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                            .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap()))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(buttonGradient1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbQuayLai)
                                .addContainerGap())))
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
                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5)
                        .addGap(6, 6, 6)
                        .addComponent(txtNhapMkMoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(buttonGradient1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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
    private JTextField txtEmail;
    private JLabel label5;
    private JTextField txtNhapMkMoi;
    private JLabel label6;
    private JTextField txtNhapLaiMK;
    private JLabel label7;
    private JTextField txtNhapMa;
    private JButton btnGui;
    private ButtonGradient buttonGradient1;
    private JLabel lbQuayLai;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
