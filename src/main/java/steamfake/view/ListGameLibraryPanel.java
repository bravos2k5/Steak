/*
 * Created by JFormDesigner on Sun Jul 07 12:08:40 ICT 2024
 */

package steamfake.view;

import steamfake.graphics.RadiusLabel;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class ListGameLibraryPanel extends JPanel {
    public ListGameLibraryPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        radiusLabel1 = new RadiusLabel();
        separator2 = new JSeparator();
        label1 = new JLabel();
        radiusLabel2 = new RadiusLabel();
        label2 = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //---- radiusLabel1 ----
        radiusLabel1.setText("text");
        radiusLabel1.setBorderColor(Color.white);
        radiusLabel1.setRadius(10);

        //---- separator2 ----
        separator2.setOpaque(true);
        separator2.setBackground(new Color(0x818181));
        separator2.setForeground(new Color(0x818181));

        //---- label1 ----
        label1.setText("text");
        label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setForeground(new Color(0x5c5c5d));

        //---- radiusLabel2 ----
        radiusLabel2.setText("Play");
        radiusLabel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        radiusLabel2.setBackground(new Color(0x3d8a00));
        radiusLabel2.setForeground(Color.white);
        radiusLabel2.setRadius(20);

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/icon/Settings.png")));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 1050, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(97, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                            .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusLabel radiusLabel1;
    private JSeparator separator2;
    private JLabel label1;
    private RadiusLabel radiusLabel2;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
