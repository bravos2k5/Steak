/*
 * Created by JFormDesigner on Wed Jul 10 18:59:53 ICT 2024
 */

package steamfake.view.gameDetalPanel.slide;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.swing.*;

/**
 * @author ADMIN
 */
public class slide1 extends JPanel {
    public slide1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        pictureBox1 = new PictureBox();

        //======== this ========
        setBackground(new Color(0x0099ff));

        //======== pictureBox1 ========
        {
            pictureBox1.setImage(new ImageIcon(getClass().getResource("/images/cau-hinh-toi-thieu-de-chien-tua-game-zenless-zone-zero-240626021614.jpg")));
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pictureBox1, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(pictureBox1, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private PictureBox pictureBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
