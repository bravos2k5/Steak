/*
 * Created by JFormDesigner on Sat Jul 13 21:41:08 ICT 2024
 */

package steamfake.view.account;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class Account extends JPanel {
    public Account() {
        initComponents();
        radiusButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ChangePassword(null);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel2 = new JPanel();
        radiusTextField1 = new RadiusTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        radiusTextField2 = new RadiusTextField();
        radiusButton1 = new RadiusButton();
        label6 = new JLabel();
        label7 = new JLabel();
        radiusTextField3 = new RadiusTextField();
        radiusTextField4 = new RadiusTextField();
        radiusButton2 = new RadiusButton();
        radiusTextField5 = new RadiusTextField();
        label8 = new JLabel();
        radiusTextField6 = new RadiusTextField();
        label9 = new JLabel();
        dateTimeTextField1 = new DateTimeTextField();
        label10 = new JLabel();
        comboBox1 = new JComboBox();
        label11 = new JLabel();
        radiusButton3 = new RadiusButton();
        radiusButton4 = new RadiusButton();
        radiusLabel1 = new RadiusLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //---- label1 ----
            label1.setText("C\u00e0i \u0110\u1eb7t T\u00e0i Kho\u1ea3n");
            label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

            //---- label2 ----
            label2.setText("Qu\u1ea3n l\u00fd chi ti\u1ebft t\u00e0i kho\u1ea3n c\u1ee7a b\u1ea1n.");
            label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

            //---- label3 ----
            label3.setText("Th\u00f4ng tin t\u00e0i kho\u1ea3n :");
            label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x191b20));

                //---- radiusTextField1 ----
                radiusTextField1.setForcusColor(new Color(0x0c8ce9));
                radiusTextField1.setNoForcusColor(new Color(0x191b20));
                radiusTextField1.setStartGradientColor(new Color(0x191b20));
                radiusTextField1.setEndGradientColor(new Color(0x191b20));
                radiusTextField1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                radiusTextField1.setRadius(0);
                radiusTextField1.setBackground(new Color(0x252730));

                //---- label4 ----
                label4.setText("T\u00ean t\u00e0i Kho\u1ea3n");
                label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- label5 ----
                label5.setText("Email");
                label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- radiusTextField2 ----
                radiusTextField2.setForcusColor(new Color(0x0c8ce9));
                radiusTextField2.setNoForcusColor(new Color(0x191b20));
                radiusTextField2.setStartGradientColor(new Color(0x191b20));
                radiusTextField2.setEndGradientColor(new Color(0x191b20));
                radiusTextField2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                radiusTextField2.setRadius(0);
                radiusTextField2.setBackground(new Color(0x252730));

                //---- radiusButton1 ----
                radiusButton1.setOriginColor(new Color(0x205cc3));
                radiusButton1.setHoverColor(new Color(0x4886f0));
                radiusButton1.setRadius(0);
                radiusButton1.setBackground(new Color(0x205cc3));
                radiusButton1.setIcon(new ImageIcon(getClass().getResource("/icon/Refresh.png")));

                //---- label6 ----
                label6.setText("Ng\u00e0y tham gia:");
                label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- label7 ----
                label7.setText("S\u1ed1 \u0111i\u1ec7n tho\u1ea1i");
                label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- radiusTextField3 ----
                radiusTextField3.setForcusColor(new Color(0x0c8ce9));
                radiusTextField3.setNoForcusColor(new Color(0x191b20));
                radiusTextField3.setStartGradientColor(new Color(0x191b20));
                radiusTextField3.setEndGradientColor(new Color(0x191b20));
                radiusTextField3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                radiusTextField3.setRadius(0);
                radiusTextField3.setBackground(new Color(0x252730));

                //---- radiusTextField4 ----
                radiusTextField4.setForcusColor(new Color(0x0c8ce9));
                radiusTextField4.setNoForcusColor(new Color(0x191b20));
                radiusTextField4.setStartGradientColor(new Color(0x191b20));
                radiusTextField4.setEndGradientColor(new Color(0x191b20));
                radiusTextField4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                radiusTextField4.setRadius(0);
                radiusTextField4.setBackground(new Color(0x252730));

                //---- radiusButton2 ----
                radiusButton2.setText("\u0110\u1ed5i m\u1eadt kh\u1ea9u");
                radiusButton2.setOriginColor(new Color(0x205cc3));
                radiusButton2.setHoverColor(new Color(0x4886f0));
                radiusButton2.setRadius(0);
                radiusButton2.setBackground(new Color(0x205cc3));
                radiusButton2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

                //---- radiusTextField5 ----
                radiusTextField5.setForcusColor(new Color(0x0c8ce9));
                radiusTextField5.setNoForcusColor(new Color(0x191b20));
                radiusTextField5.setStartGradientColor(new Color(0x191b20));
                radiusTextField5.setEndGradientColor(new Color(0x191b20));
                radiusTextField5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                radiusTextField5.setRadius(0);
                radiusTextField5.setBackground(new Color(0x252730));

                //---- label8 ----
                label8.setText("UUID");
                label8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 820, Short.MAX_VALUE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(radiusTextField2, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(42, 42, 42))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(radiusTextField5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addGap(280, 280, 280)
                                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(radiusTextField3, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                                .addGap(80, 80, 80)
                                                .addComponent(radiusTextField4, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(42, Short.MAX_VALUE))))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(radiusTextField2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addGap(59, 59, 59)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(radiusTextField3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radiusTextField5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(36, Short.MAX_VALUE))
                );
            }

            //---- radiusTextField6 ----
            radiusTextField6.setForcusColor(new Color(0x0c8ce9));
            radiusTextField6.setNoForcusColor(new Color(0x252730));
            radiusTextField6.setStartGradientColor(new Color(0x252730));
            radiusTextField6.setEndGradientColor(new Color(0x252730));
            radiusTextField6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            radiusTextField6.setRadius(0);
            radiusTextField6.setBackground(new Color(0x191b20));

            //---- label9 ----
            label9.setText("H\u1ecd t\u00ean");
            label9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            //---- dateTimeTextField1 ----
            dateTimeTextField1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
            dateTimeTextField1.setBackground(new Color(0x191b20));

            //---- label10 ----
            label10.setText("Ng\u00e0y Sinh");
            label10.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            //---- comboBox1 ----
            comboBox1.setBackground(new Color(0x191b20));

            //---- label11 ----
            label11.setText("Gi\u1edbi t\u00ednh");
            label11.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            //---- radiusButton3 ----
            radiusButton3.setText("\u0110\u0103ng l\u00ean");
            radiusButton3.setBackground(new Color(0x35452a));
            radiusButton3.setHoverColor(new Color(0x429509));
            radiusButton3.setOriginColor(new Color(0x35452a));
            radiusButton3.setRadius(5);
            radiusButton3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- radiusButton4 ----
            radiusButton4.setText("H\u1ee7y b\u1ecf");
            radiusButton4.setBackground(new Color(0x3e3737));
            radiusButton4.setOriginColor(new Color(0x3e3737));
            radiusButton4.setHoverColor(new Color(0x9d2424));
            radiusButton4.setRadius(5);
            radiusButton4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- radiusLabel1 ----
            radiusLabel1.setText("text");
            radiusLabel1.setRadius(0);
            radiusLabel1.setBackground(Color.white);

            //---- label12 ----
            label12.setText("01/01/24");
            label12.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            label12.setHorizontalAlignment(SwingConstants.CENTER);
            label12.setForeground(new Color(0x545457));

            //---- label13 ----
            label13.setText("Tr\u1ecbnh V\u0103n Thu\u1eadt");
            label13.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            label13.setHorizontalAlignment(SwingConstants.RIGHT);

            //---- label14 ----
            label14.setIcon(new ImageIcon(getClass().getResource("/icon/Dollar Coin.png")));

            //---- label15 ----
            label15.setText("1.000.000.000.000");
            label15.setHorizontalAlignment(SwingConstants.RIGHT);
            label15.setFont(new Font("Inter", Font.BOLD, 16));
            label15.setForeground(Color.yellow);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label12, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label13, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                .addComponent(label15, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(radiusTextField6, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateTimeTextField1, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(label10, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radiusButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(radiusButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(radiusTextField6, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(dateTimeTextField1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(radiusButton3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(radiusButton4, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel2;
    private RadiusTextField radiusTextField1;
    private JLabel label4;
    private JLabel label5;
    private RadiusTextField radiusTextField2;
    private RadiusButton radiusButton1;
    private JLabel label6;
    private JLabel label7;
    private RadiusTextField radiusTextField3;
    private RadiusTextField radiusTextField4;
    private RadiusButton radiusButton2;
    private RadiusTextField radiusTextField5;
    private JLabel label8;
    private RadiusTextField radiusTextField6;
    private JLabel label9;
    private DateTimeTextField dateTimeTextField1;
    private JLabel label10;
    private JComboBox comboBox1;
    private JLabel label11;
    private RadiusButton radiusButton3;
    private RadiusButton radiusButton4;
    private RadiusLabel radiusLabel1;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
