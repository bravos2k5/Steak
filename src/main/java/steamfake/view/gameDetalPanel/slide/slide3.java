/*
 * Created by JFormDesigner on Wed Jul 10 19:37:51 ICT 2024
 */

package steamfake.view.gameDetalPanel.slide;

import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.swing.*;

/**
 * @author ADMIN
 */
public class slide3 extends JPanel {
    public slide3() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        pictureBox1 = new PictureBox();

        //======== this ========

        //======== pictureBox1 ========
        {
            pictureBox1.setImage(new ImageIcon(getClass().getResource("/images/ZenlessZoneZero_keyvisual_EllenJoe_Proxy-1-1536x864.jpg")));
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
