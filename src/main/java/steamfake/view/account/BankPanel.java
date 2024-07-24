/*
 * Created by JFormDesigner on Wed Jul 24 07:28:18 ICT 2024
 */

package steamfake.view.account;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class
BankPanel extends JDialog {
    public BankPanel(Window owner) {
        super(owner);
        initComponents();
        this.getContentPane().setBackground(new Color(0x191b20));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        comboBox1 = new JComboBox();
        btnCancel = new RadiusButton();
        btnUpdate = new RadiusButton();
        txtUsername = new RadiusTextField();
        btnChangePassword = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- comboBox1 ----
        comboBox1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        comboBox1.setBackground(new Color(0x252730));

        //---- btnCancel ----
        btnCancel.setText("X\u00f3a");
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setHoverColor(new Color(0x9d2424));
        btnCancel.setRadius(5);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //---- btnUpdate ----
        btnUpdate.setText("Th\u00eam");
        btnUpdate.setBackground(new Color(0x35452a));
        btnUpdate.setHoverColor(new Color(0x429509));
        btnUpdate.setOriginColor(new Color(0x35452a));
        btnUpdate.setRadius(5);
        btnUpdate.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //---- txtUsername ----
        txtUsername.setForcusColor(new Color(0x0c8ce9));
        txtUsername.setNoForcusColor(new Color(0x191b20));
        txtUsername.setStartGradientColor(new Color(0x191b20));
        txtUsername.setEndGradientColor(new Color(0x191b20));
        txtUsername.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtUsername.setRadius(0);
        txtUsername.setBackground(new Color(0x252730));

        //---- btnChangePassword ----
        btnChangePassword.setOriginColor(new Color(0x205cc3));
        btnChangePassword.setHoverColor(new Color(0x4886f0));
        btnChangePassword.setRadius(0);
        btnChangePassword.setBackground(new Color(0x205cc3));
        btnChangePassword.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnChangePassword.setIcon(new ImageIcon(getClass().getResource("/icon/Up.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnChangePassword, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(14, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChangePassword, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JComboBox comboBox1;
    private RadiusButton btnCancel;
    private RadiusButton btnUpdate;
    private RadiusTextField txtUsername;
    private RadiusButton btnChangePassword;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new BankPanel(null).setVisible(true);
    }
}
