/*
 * Created by JFormDesigner on Fri Jul 05 21:20:42 ICT 2024
 */

package raven;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import raven.datetime.component.date.DatePicker;

import javax.swing.*;

/**
 * @author BRAVOS
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
        new DatePicker().setEditor(txtDate);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - baonqps41272
        txtDate = new JFormattedTextField();

        //======== this ========
        var contentPane = getContentPane();

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(txtDate, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(txtDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - baonqps41272
    private JFormattedTextField txtDate;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new MainFrame().setVisible(true);
    }

}
