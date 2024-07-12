/*
 * Created by JFormDesigner on Wed Jul 10 19:14:03 ICT 2024
 */

package steamfake.view.gameDetalPanel.slide;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.swing.*;

/**
 * @author ADMIN
 */
public class slide2 extends JPanel {
    public slide2() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        pictureBox1 = new PictureBox();

        //======== this ========
        setBackground(new Color(0x006666));

        //======== pictureBox1 ========
        {
            pictureBox1.setImage(new ImageIcon(getClass().getResource("/images/game-zenless-zone-zero-poster.jpg")));
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pictureBox1, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(pictureBox1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private PictureBox pictureBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
