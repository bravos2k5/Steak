/*
 * Created by JFormDesigner on Fri Jul 05 23:03:13 ICT 2024
 */

package steamfake.view.login;

import java.awt.*;
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelBorder1 = new PanelBorder();
        oneRoundedPanel1 = new OneRoundedPanel();
        label1 = new JLabel();
        label2 = new JLabel();

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
                                    .addGap(74, 74, 74)
                                    .addComponent(label2)))
                            .addContainerGap(75, Short.MAX_VALUE))
                );
                oneRoundedPanel1Layout.setVerticalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label2)
                            .addContainerGap(298, Short.MAX_VALUE))
                );
            }

            GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
            panelBorder1.setLayout(panelBorder1Layout);
            panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(oneRoundedPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 581, Short.MAX_VALUE))
            );
            panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup()
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
