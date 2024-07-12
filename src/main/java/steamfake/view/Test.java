/*
 * Created by JFormDesigner on Fri Jul 05 22:25:21 ICT 2024
 */

package steamfake.view;

import java.awt.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import steamfake.graphics.*;

/**
 * @author BRAVOS
 */
public class Test extends JFrame {
    public Test() {
        initComponents();

    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new Test().setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dateTimeTextField1 = new DateTimeTextField();

        //======== this ========
        var contentPane = getContentPane();

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(dateTimeTextField1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(dateTimeTextField1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private DateTimeTextField dateTimeTextField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
