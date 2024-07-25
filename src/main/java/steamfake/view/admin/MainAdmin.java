/*
 * Created by JFormDesigner on Wed Jul 24 16:20:49 ICT 2024
 */

package steamfake.view.admin;

import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author ACER
 */
public class MainAdmin extends JDialog {
    public MainAdmin(Window owner) {
        super(owner);
        initComponents();
        initialize();
        this.getContentPane().setBackground(new Color(0x191b20));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        btnAddMoney = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("Accout");
        button1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        button1.setBackground(new Color(0x252730));

        //---- button2 ----
        button2.setText("Game");
        button2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        button2.setBackground(new Color(0x252730));

        //---- button3 ----
        button3.setText("Withdraw");
        button3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        button3.setBackground(new Color(0x252730));

        //---- btnAddMoney ----
        btnAddMoney.setText("Add Money");
        btnAddMoney.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnAddMoney.setBackground(new Color(0x252730));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnAddMoney, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnAddMoney, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton btnAddMoney;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        btnAddMoney.addActionListener(e -> new ManageAddMoney(getOwner()).setVisible(true));

    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new MainAdmin(null).setVisible(true);

    }
}
