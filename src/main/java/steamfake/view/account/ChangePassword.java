/*
 * Created by JFormDesigner on Sat Jul 13 22:22:26 ICT 2024
 */

package steamfake.view.account;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class ChangePassword extends JDialog {
    public ChangePassword(Window owner) {

        super(owner);this.setVisible(true);
        initComponents();
        this.setTitle("Đổi mật khẩu");

        Image icon = Toolkit.getDefaultToolkit().getImage("src/main/resources/icon/key.png");
        this.setIconImage(icon);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label4 = new JLabel();
        radiusTextField1 = new RadiusTextField();
        label5 = new JLabel();
        radiusTextField2 = new RadiusTextField();
        radiusTextField3 = new RadiusTextField();
        label6 = new JLabel();
        radiusButton3 = new RadiusButton();
        radiusButton4 = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label4 ----
        label4.setText("M\u1eadt kh\u1ea9u c\u0169");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusTextField1 ----
        radiusTextField1.setForcusColor(new Color(0x0c8ce9));
        radiusTextField1.setNoForcusColor(new Color(0x191b20));
        radiusTextField1.setStartGradientColor(new Color(0x191b20));
        radiusTextField1.setEndGradientColor(new Color(0x191b20));
        radiusTextField1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        radiusTextField1.setRadius(0);
        radiusTextField1.setBackground(new Color(0x252730));

        //---- label5 ----
        label5.setText("M\u1eadt kh\u1ea9u m\u1edbi");
        label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusTextField2 ----
        radiusTextField2.setForcusColor(new Color(0x0c8ce9));
        radiusTextField2.setNoForcusColor(new Color(0x191b20));
        radiusTextField2.setStartGradientColor(new Color(0x191b20));
        radiusTextField2.setEndGradientColor(new Color(0x191b20));
        radiusTextField2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        radiusTextField2.setRadius(0);
        radiusTextField2.setBackground(new Color(0x252730));

        //---- radiusTextField3 ----
        radiusTextField3.setForcusColor(new Color(0x0c8ce9));
        radiusTextField3.setNoForcusColor(new Color(0x191b20));
        radiusTextField3.setStartGradientColor(new Color(0x191b20));
        radiusTextField3.setEndGradientColor(new Color(0x191b20));
        radiusTextField3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        radiusTextField3.setRadius(0);
        radiusTextField3.setBackground(new Color(0x252730));

        //---- label6 ----
        label6.setText("M\u1eadt kh\u1ea9u m\u1edbi");
        label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusButton3 ----
        radiusButton3.setText("\u0110\u1ed5i m\u1eadt kh\u1ea9u");
        radiusButton3.setBackground(new Color(0x35452a));
        radiusButton3.setHoverColor(new Color(0x429509));
        radiusButton3.setOriginColor(new Color(0x35452a));
        radiusButton3.setRadius(5);
        radiusButton3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        //---- radiusButton4 ----
        radiusButton4.setText("H\u1ee7y b\u1ecf");
        radiusButton4.setBackground(new Color(0x3e3737));
        radiusButton4.setOriginColor(new Color(0x3e3737));
        radiusButton4.setHoverColor(new Color(0x9d2424));
        radiusButton4.setRadius(5);
        radiusButton4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(radiusButton4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                            .addComponent(radiusButton3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField2, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField3, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(26, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(radiusTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(radiusTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(radiusButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(radiusButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label4;
    private RadiusTextField radiusTextField1;
    private JLabel label5;
    private RadiusTextField radiusTextField2;
    private RadiusTextField radiusTextField3;
    private JLabel label6;
    private RadiusButton radiusButton3;
    private RadiusButton radiusButton4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
