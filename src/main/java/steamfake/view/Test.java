/*
 * Created by JFormDesigner on Fri Jul 05 22:25:21 ICT 2024
 */

package steamfake.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import steamfake.graphics.*;

/**
 * @author BRAVOS
 */
public class Test extends JFrame {
    public Test() {
        initComponents();
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()==2){
                    radiusPanel1.setBorderColor(Color.BLUE);
                    radiusPanel1.repaint();
                    radiusPanel1.validate();
                }
            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new Test().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        radiusPanel1 = new RadiusPanel();
        radioButton1 = new JRadioButton();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //======== radiusPanel1 ========
        {
            radiusPanel1.setBorderColor(Color.pink);

            //---- radioButton1 ----
            radioButton1.setText("text");

            GroupLayout radiusPanel1Layout = new GroupLayout(radiusPanel1);
            radiusPanel1.setLayout(radiusPanel1Layout);
            radiusPanel1Layout.setHorizontalGroup(
                radiusPanel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, radiusPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton1)
                        .addContainerGap())
            );
            radiusPanel1Layout.setVerticalGroup(
                radiusPanel1Layout.createParallelGroup()
                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                        .addComponent(radioButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textField1)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusPanel radiusPanel1;
    private JRadioButton radioButton1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
