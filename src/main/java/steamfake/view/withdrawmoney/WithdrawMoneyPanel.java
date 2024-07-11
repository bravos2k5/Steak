/*
 * Created by JFormDesigner on Wed Jul 10 16:42:34 ICT 2024
 */

package steamfake.view.withdrawmoney;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class WithdrawMoneyPanel extends JPanel {
    public WithdrawMoneyPanel() {
        initComponents();
        scrollPane1.setBorder(null);
        for (int i = 0 ; i<30 ;i++){
            panel4.add(new ListWithdrawMoney());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        panel2 = new JPanel();
        radiusTextField1 = new RadiusTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        radiusButton1 = new RadiusButton();
        radiusButton2 = new RadiusButton();
        radiusButton3 = new RadiusButton();
        radiusButton4 = new RadiusButton();
        radiusButton5 = new RadiusButton();
        radiusButton6 = new RadiusButton();
        label4 = new JLabel();
        radiusLabel1 = new RadiusLabel();
        radiusLabel2 = new RadiusLabel();
        comboBox1 = new JComboBox<>();
        label5 = new JLabel();
        radiusButton7 = new RadiusButton();
        radiusButton8 = new RadiusButton();
        panel3 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        scrollPane1 = new JScrollPane();
        panel4 = new JPanel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x191b20));

                //---- radiusTextField1 ----
                radiusTextField1.setRadius(7);
                radiusTextField1.setFont(new Font("Inter", Font.PLAIN, 20));
                radiusTextField1.setPlaceholder("Nh\u1ea5p s\u1ed1 ti\u1ec1n(\u0111)");
                radiusTextField1.setHorizontalAlignment(SwingConstants.LEFT);
                radiusTextField1.setStartGradientColor(new Color(0x191b20));
                radiusTextField1.setEndGradientColor(new Color(0x191b20));
                radiusTextField1.setForcusColor(new Color(0x0c8ce9));
                radiusTextField1.setBackground(new Color(0x191b20));

                //---- label1 ----
                label1.setText("S\u1ed1 d\u01b0 doanh thu :");
                label1.setFont(new Font("Inter", Font.PLAIN, 20));

                //---- label2 ----
                label2.setText("0");
                label2.setFont(new Font("Inter", Font.PLAIN, 20));
                label2.setHorizontalAlignment(SwingConstants.RIGHT);

                //---- label3 ----
                label3.setText("Ch\u1ecdn nhanh s\u1ed1 ti\u1ec1n");
                label3.setFont(new Font("Inter", Font.PLAIN, 20));

                //---- radiusButton1 ----
                radiusButton1.setText("50.000");
                radiusButton1.setRadius(5);
                radiusButton1.setFont(new Font("Inter", Font.BOLD, 16));
                radiusButton1.setBackground(new Color(0x252730));
                radiusButton1.setHoverColor(Color.darkGray);
                radiusButton1.setOriginColor(new Color(0x252730));

                //---- radiusButton2 ----
                radiusButton2.setText("50.000");
                radiusButton2.setRadius(5);
                radiusButton2.setFont(new Font("Inter", Font.BOLD, 16));
                radiusButton2.setBackground(new Color(0x252730));
                radiusButton2.setHoverColor(Color.darkGray);
                radiusButton2.setOriginColor(new Color(0x252730));

                //---- radiusButton3 ----
                radiusButton3.setText("50.000");
                radiusButton3.setRadius(5);
                radiusButton3.setFont(new Font("Inter", Font.BOLD, 16));
                radiusButton3.setBackground(new Color(0x252730));
                radiusButton3.setOriginColor(new Color(0x252730));
                radiusButton3.setHoverColor(Color.darkGray);

                //---- radiusButton4 ----
                radiusButton4.setText("50.000");
                radiusButton4.setRadius(5);
                radiusButton4.setFont(new Font("Inter", Font.BOLD, 16));
                radiusButton4.setBackground(new Color(0x252730));
                radiusButton4.setHoverColor(Color.darkGray);
                radiusButton4.setOriginColor(new Color(0x252730));

                //---- radiusButton5 ----
                radiusButton5.setText("50.000");
                radiusButton5.setRadius(5);
                radiusButton5.setFont(new Font("Inter", Font.BOLD, 16));
                radiusButton5.setBackground(new Color(0x252730));
                radiusButton5.setHoverColor(Color.darkGray);
                radiusButton5.setOriginColor(new Color(0x252730));

                //---- radiusButton6 ----
                radiusButton6.setText("50.000");
                radiusButton6.setRadius(5);
                radiusButton6.setFont(new Font("Inter", Font.BOLD, 16));
                radiusButton6.setBackground(new Color(0x252730));
                radiusButton6.setOriginColor(new Color(0x252730));
                radiusButton6.setHoverColor(Color.darkGray);

                //---- label4 ----
                label4.setText("H\u00e3y ch\u1ecdn ph\u01b0\u01a1ng th\u1ee9c r\u00fat ti\u1ec1n");
                label4.setFont(new Font("Inter", Font.PLAIN, 20));

                //---- radiusLabel1 ----
                radiusLabel1.setText("T\u00e0i kho\u1ea3n game");
                radiusLabel1.setIcon(new ImageIcon(getClass().getResource("/icon/Wallet.png")));
                radiusLabel1.setHorizontalAlignment(SwingConstants.LEFT);
                radiusLabel1.setFont(new Font("Inter", Font.BOLD, 18));
                radiusLabel1.setBackground(new Color(0x252730));
                radiusLabel1.setRadius(5);

                //---- radiusLabel2 ----
                radiusLabel2.setText("Ng\u00e2n h\u00e0ng");
                radiusLabel2.setIcon(new ImageIcon(getClass().getResource("/icon/Euro Bank Building.png")));
                radiusLabel2.setHorizontalAlignment(SwingConstants.LEFT);
                radiusLabel2.setFont(new Font("Inter", Font.BOLD, 18));
                radiusLabel2.setBackground(new Color(0x252730));
                radiusLabel2.setRadius(5);

                //---- comboBox1 ----
                comboBox1.setFont(new Font("Inter", Font.BOLD, 20));
                comboBox1.setMaximumRowCount(5);
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7"
                }));
                comboBox1.setBackground(new Color(0x252730));

                //---- label5 ----
                label5.setText("B\u1ea3o m\u1eadt tuy\u1ec7t \u0111\u1ed1i theo chu\u1ea9n cao nh\u1ea5t");
                label5.setIcon(new ImageIcon(getClass().getResource("/icon/Protect.png")));
                label5.setFont(new Font("Inter", Font.PLAIN, 12));

                //---- radiusButton7 ----
                radiusButton7.setText("X\u00e1c nh\u1eadn");
                radiusButton7.setOriginColor(new Color(0x35452a));
                radiusButton7.setBackground(new Color(0x35452a));
                radiusButton7.setHoverColor(new Color(0x429509));
                radiusButton7.setRadius(5);

                //---- radiusButton8 ----
                radiusButton8.setText("H\u1ee7y b\u1ecf");
                radiusButton8.setOriginColor(new Color(0x3e3737));
                radiusButton8.setBackground(new Color(0x3e3737));
                radiusButton8.setHoverColor(new Color(0xf23636));
                radiusButton8.setRadius(5);

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(radiusButton5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(radiusButton4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(radiusButton6, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(radiusTextField1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                            .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(radiusButton3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
                                .addComponent(comboBox1)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radiusButton8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(radiusButton7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(27, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(radiusButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(26, Short.MAX_VALUE))
                );
            }

            //======== panel3 ========
            {
                panel3.setBackground(new Color(0x191b20));

                //---- label6 ----
                label6.setText("Ng\u00e0y r\u00fat");
                label6.setHorizontalAlignment(SwingConstants.CENTER);
                label6.setFont(new Font("Inter", Font.BOLD, 16));

                //---- label7 ----
                label7.setText("S\u1ed1 ti\u1ec1n r\u00fat");
                label7.setHorizontalAlignment(SwingConstants.CENTER);
                label7.setFont(new Font("Inter", Font.BOLD, 16));

                //---- label8 ----
                label8.setText("H\u00ccnh th\u1ee9c");
                label8.setHorizontalAlignment(SwingConstants.CENTER);
                label8.setFont(new Font("Inter", Font.BOLD, 16));

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(label8, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addComponent(label6, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(label7, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(label8, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                );
            }

            //======== scrollPane1 ========
            {
                scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

                //======== panel4 ========
                {
                    panel4.setBorder(null);
                    panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
                }
                scrollPane1.setViewportView(panel4);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                        .addContainerGap(25, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 35, Short.MAX_VALUE))
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
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JPanel panel2;
    private RadiusTextField radiusTextField1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private RadiusButton radiusButton1;
    private RadiusButton radiusButton2;
    private RadiusButton radiusButton3;
    private RadiusButton radiusButton4;
    private RadiusButton radiusButton5;
    private RadiusButton radiusButton6;
    private JLabel label4;
    private RadiusLabel radiusLabel1;
    private RadiusLabel radiusLabel2;
    private JComboBox<String> comboBox1;
    private JLabel label5;
    private RadiusButton radiusButton7;
    private RadiusButton radiusButton8;
    private JPanel panel3;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JScrollPane scrollPane1;
    private JPanel panel4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
