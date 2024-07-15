/*
 * Created by JFormDesigner on Sun Jul 14 12:08:32 ICT 2024
 */

package steamfake.view.manger;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ACER
 */
public class PanelAction extends JPanel {
    public PanelAction() {
        initComponents();
        radiusButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"123");
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        radiusButton1 = new RadiusButton();
        radiusButton2 = new RadiusButton();

        //======== this ========
        setBackground(new Color(0x252730));

        //---- radiusButton1 ----
        radiusButton1.setIcon(new ImageIcon(getClass().getResource("/icon/Checkmark.png")));
        radiusButton1.setRadius(0);
        radiusButton1.setBackground(new Color(0x252730));

        //---- radiusButton2 ----
        radiusButton2.setIcon(new ImageIcon(getClass().getResource("/icon/Close Window.png")));
        radiusButton2.setRadius(0);
        radiusButton2.setBackground(new Color(0x252730));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusButton radiusButton1;
    private RadiusButton radiusButton2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
