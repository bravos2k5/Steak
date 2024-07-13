/*
 * Created by JFormDesigner on Wed Jul 10 20:15:21 ICT 2024
 */

package steamfake.view.gameDetalPanel.slide;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.swing.*;

/**
 * @author ADMIN
 */
public class silde4 extends JPanel {
    public silde4() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        pictureBox1 = new PictureBox();
        pictureBox2 = new PictureBox();

        //======== this ========

        //======== pictureBox1 ========
        {
            pictureBox1.setImage(new ImageIcon(getClass().getResource("/images/ZenlessZoneZero_Gameplay_Soldier11-1536x864.jpg")));
            pictureBox1.add(pictureBox2, JLayeredPane.DEFAULT_LAYER);
            pictureBox2.setBounds(new Rectangle(new Point(250, 235), pictureBox2.getPreferredSize()));
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(pictureBox1, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(pictureBox1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private PictureBox pictureBox1;
    private PictureBox pictureBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
