/*
 * Created by JFormDesigner on Wed Jul 10 21:20:27 ICT 2024
 */

package steamfake.view.addmoney;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;

import steamfake.graphics.*;

/**
 * @author ACER
 */
public class AddMoney extends JPanel {
    public AddMoney() {
        initComponents();
        scrollPane1.setBorder(null);
        for (int i = 0 ; i<3 ; i++){
            panel4.add(new HistoryAddMoney());
        }
        radiusButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new BankMoney(null).setVisible(true);
            }
        });

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel2 = new JPanel();
        radiusPanel1 = new RadiusPanel();
        radiusPanel2 = new RadiusPanel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox();
        textField1 = new RadiusTextField();
        textField2 = new RadiusTextField();
        radiusButton1 = new RadiusButton();
        radiusLabel1 = new RadiusLabel();
        scrollPane1 = new JScrollPane();
        panel4 = new JPanel();
        panel3 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label1 = new JLabel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        radiusPanel3 = new RadiusPanel();
        radiusPanel4 = new RadiusPanel();
        comboBox3 = new JComboBox();
        radiusButton2 = new RadiusButton();
        radiusLabel2 = new RadiusPanel();
        radiusLabel3 = new RadiusLabel();
        scrollPane2 = new JScrollPane();
        panel7 = new JPanel();
        panel8 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //======== tabbedPane1 ========
            {
                tabbedPane1.setBackground(new Color(0x252730));
                tabbedPane1.setFont(new Font("Inter", Font.BOLD, 16));

                //======== panel2 ========
                {
                    panel2.setBackground(new Color(0x252730));

                    //======== radiusPanel1 ========
                    {
                        radiusPanel1.setBorderColor(Color.white);
                        radiusPanel1.setBorderWidth(1);
                        radiusPanel1.setBackground(new Color(0x191b20));

                        //======== radiusPanel2 ========
                        {
                            radiusPanel2.setBackground(new Color(0x252730));

                            //---- comboBox1 ----
                            comboBox1.setBackground(new Color(0x191b20));
                            comboBox1.setFont(new Font("Inter", Font.BOLD, 16));
                            comboBox1.setPrototypeDisplayValue("Card");
                            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                                "Viethel"
                            }));
                            comboBox1.setSelectedIndex(-1);

                            //---- comboBox2 ----
                            comboBox2.setBackground(new Color(0x191b20));
                            comboBox2.setFont(new Font("Inter", Font.PLAIN, 16));

                            //---- textField1 ----
                            textField1.setForcusColor(new Color(0x0c8ce9));
                            textField1.setEndGradientColor(new Color(0x191b20));
                            textField1.setStartGradientColor(new Color(0x191b20));
                            textField1.setRadius(7);
                            textField1.setNoForcusColor(new Color(0x191b20));
                            textField1.setFont(new Font("Inter", Font.BOLD, 16));
                            textField1.setBackground(new Color(0x191b20));

                            //---- textField2 ----
                            textField2.setRadius(7);
                            textField2.setForcusColor(new Color(0x0c8ce9));
                            textField2.setNoForcusColor(new Color(0x191b20));
                            textField2.setEndGradientColor(new Color(0x191b20));
                            textField2.setStartGradientColor(new Color(0x191b20));
                            textField2.setFont(new Font("Inter", Font.BOLD, 16));
                            textField2.setBackground(new Color(0x191b20));

                            //---- radiusButton1 ----
                            radiusButton1.setText("N\u1ea1p th\u1ebb");
                            radiusButton1.setOriginColor(new Color(0x35452a));
                            radiusButton1.setBackground(new Color(0x35452a));
                            radiusButton1.setRadius(7);
                            radiusButton1.setHoverColor(new Color(0x429509));
                            radiusButton1.setFont(new Font("Inter", Font.BOLD, 16));

                            //---- radiusLabel1 ----
                            radiusLabel1.setText("10.000 VN\u0110 =8.000 coin");
                            radiusLabel1.setBackground(new Color(0x23304d));
                            radiusLabel1.setFont(new Font(Font.SANS_SERIF, radiusLabel1.getFont().getStyle() | Font.BOLD, radiusLabel1.getFont().getSize() + 4));
                            radiusLabel1.setBorderColor(new Color(0x416dd1));
                            radiusLabel1.setForeground(new Color(0x4ac26c));

                            GroupLayout radiusPanel2Layout = new GroupLayout(radiusPanel2);
                            radiusPanel2.setLayout(radiusPanel2Layout);
                            radiusPanel2Layout.setHorizontalGroup(
                                radiusPanel2Layout.createParallelGroup()
                                    .addGroup(radiusPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                            .addComponent(textField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(radiusButton1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                        .addGap(100, 100, 100)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboBox2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                            .addComponent(textField2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                            .addComponent(radiusLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                        .addGap(26, 26, 26))
                            );
                            radiusPanel2Layout.setVerticalGroup(
                                radiusPanel2Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, radiusPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(radiusButton1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(radiusLabel1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                        .addGap(40, 40, 40))
                            );
                        }

                        GroupLayout radiusPanel1Layout = new GroupLayout(radiusPanel1);
                        radiusPanel1.setLayout(radiusPanel1Layout);
                        radiusPanel1Layout.setHorizontalGroup(
                            radiusPanel1Layout.createParallelGroup()
                                .addGroup(radiusPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(radiusPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(25, Short.MAX_VALUE))
                        );
                        radiusPanel1Layout.setVerticalGroup(
                            radiusPanel1Layout.createParallelGroup()
                                .addGroup(radiusPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(radiusPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(25, Short.MAX_VALUE))
                        );
                    }

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                        //======== panel4 ========
                        {
                            panel4.setBackground(new Color(0x252730));
                            panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
                        }
                        scrollPane1.setViewportView(panel4);
                    }

                    //======== panel3 ========
                    {
                        panel3.setBackground(new Color(0x191b20));

                        //---- label2 ----
                        label2.setText("ID");
                        label2.setFont(new Font("Inter", Font.BOLD, 16));
                        label2.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- label3 ----
                        label3.setText("Ng\u00e0y N\u1ea1p");
                        label3.setFont(new Font("Inter", Font.BOLD, 16));
                        label3.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- label4 ----
                        label4.setText("Tr\u1ea1ng th\u00e1i");
                        label4.setFont(new Font("Inter", Font.BOLD, 16));
                        label4.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- label5 ----
                        label5.setText("ID");
                        label5.setFont(new Font("Inter", Font.BOLD, 16));
                        label5.setHorizontalAlignment(SwingConstants.CENTER);

                        GroupLayout panel3Layout = new GroupLayout(panel3);
                        panel3.setLayout(panel3Layout);
                        panel3Layout.setHorizontalGroup(
                            panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(0, 0, 0)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        panel3Layout.setVerticalGroup(
                            panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        );
                    }

                    //---- label1 ----
                    label1.setText("L\u1ecbch s\u1eed n\u1ea1p th\u1ebb");
                    label1.setFont(new Font("Inter", Font.BOLD, 16));

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addComponent(radiusPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 790, Short.MAX_VALUE))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                    );
                }
                tabbedPane1.addTab("N\u1ea1p th\u1ebb c\u00e0o", panel2);

                //======== panel5 ========
                {
                    panel5.setBackground(new Color(0x252730));

                    //======== panel6 ========
                    {
                        panel6.setBackground(new Color(0x252730));

                        //======== radiusPanel3 ========
                        {
                            radiusPanel3.setBorderColor(Color.white);
                            radiusPanel3.setBorderWidth(1);
                            radiusPanel3.setBackground(new Color(0x191b20));

                            //======== radiusPanel4 ========
                            {
                                radiusPanel4.setBackground(new Color(0x252730));

                                //---- comboBox3 ----
                                comboBox3.setBackground(new Color(0x191b20));
                                comboBox3.setFont(new Font("Inter", Font.BOLD, 16));

                                //---- radiusButton2 ----
                                radiusButton2.setText("N\u1ea1p ti\u1ec1n");
                                radiusButton2.setOriginColor(new Color(0x35452a));
                                radiusButton2.setBackground(new Color(0x35452a));
                                radiusButton2.setRadius(7);
                                radiusButton2.setHoverColor(new Color(0x429509));
                                radiusButton2.setFont(new Font("Inter", Font.BOLD, 16));

                                //======== radiusLabel2 ========
                                {
                                    radiusLabel2.setBackground(new Color(0x23304d));
                                    radiusLabel2.setFont(new Font(Font.SANS_SERIF, radiusLabel2.getFont().getStyle() | Font.BOLD, radiusLabel2.getFont().getSize() + 4));
                                    radiusLabel2.setBorderColor(new Color(0x416dd1));
                                    radiusLabel2.setForeground(new Color(0x4ac26c));

                                    GroupLayout radiusLabel2Layout = new GroupLayout(radiusLabel2);
                                    radiusLabel2.setLayout(radiusLabel2Layout);
                                    radiusLabel2Layout.setHorizontalGroup(
                                        radiusLabel2Layout.createParallelGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                    radiusLabel2Layout.setVerticalGroup(
                                        radiusLabel2Layout.createParallelGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                }

                                //---- radiusLabel3 ----
                                radiusLabel3.setText("10.000 VN\u0110 =10.000 coin");
                                radiusLabel3.setBackground(new Color(0x23304d));
                                radiusLabel3.setFont(new Font(Font.SANS_SERIF, radiusLabel3.getFont().getStyle() | Font.BOLD, radiusLabel3.getFont().getSize() + 4));
                                radiusLabel3.setBorderColor(new Color(0x416dd1));
                                radiusLabel3.setForeground(new Color(0x4ac26c));

                                GroupLayout radiusPanel4Layout = new GroupLayout(radiusPanel4);
                                radiusPanel4.setLayout(radiusPanel4Layout);
                                radiusPanel4Layout.setHorizontalGroup(
                                    radiusPanel4Layout.createParallelGroup()
                                        .addGroup(radiusPanel4Layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addGroup(radiusPanel4Layout.createParallelGroup()
                                                .addGroup(radiusPanel4Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(radiusPanel4Layout.createSequentialGroup()
                                                    .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                                    .addComponent(radiusLabel3, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(40, 40, 40))
                                        .addGroup(radiusPanel4Layout.createSequentialGroup()
                                            .addGap(122, 122, 122)
                                            .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 692, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 136, Short.MAX_VALUE))
                                );
                                radiusPanel4Layout.setVerticalGroup(
                                    radiusPanel4Layout.createParallelGroup()
                                        .addGroup(radiusPanel4Layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(53, 53, 53)
                                            .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                            .addGroup(radiusPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(radiusButton2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radiusLabel3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32))
                                );
                            }

                            GroupLayout radiusPanel3Layout = new GroupLayout(radiusPanel3);
                            radiusPanel3.setLayout(radiusPanel3Layout);
                            radiusPanel3Layout.setHorizontalGroup(
                                radiusPanel3Layout.createParallelGroup()
                                    .addGroup(radiusPanel3Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(radiusPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            radiusPanel3Layout.setVerticalGroup(
                                radiusPanel3Layout.createParallelGroup()
                                    .addGroup(radiusPanel3Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(radiusPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(25, Short.MAX_VALUE))
                            );
                        }

                        //======== scrollPane2 ========
                        {
                            scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                            //======== panel7 ========
                            {
                                panel7.setBackground(new Color(0x252730));
                                panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
                            }
                            scrollPane2.setViewportView(panel7);
                        }

                        //======== panel8 ========
                        {
                            panel8.setBackground(new Color(0x191b20));

                            //---- label6 ----
                            label6.setText("ID");
                            label6.setFont(new Font("Inter", Font.BOLD, 16));
                            label6.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label7 ----
                            label7.setText("Ng\u00e0y N\u1ea1p");
                            label7.setFont(new Font("Inter", Font.BOLD, 16));
                            label7.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label8 ----
                            label8.setText("Tr\u1ea1ng th\u00e1i");
                            label8.setFont(new Font("Inter", Font.BOLD, 16));
                            label8.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label9 ----
                            label9.setText("ID");
                            label9.setFont(new Font("Inter", Font.BOLD, 16));
                            label9.setHorizontalAlignment(SwingConstants.CENTER);

                            GroupLayout panel8Layout = new GroupLayout(panel8);
                            panel8.setLayout(panel8Layout);
                            panel8Layout.setHorizontalGroup(
                                panel8Layout.createParallelGroup()
                                    .addGroup(panel8Layout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            panel8Layout.setVerticalGroup(
                                panel8Layout.createParallelGroup()
                                    .addGroup(panel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            );
                        }

                        //---- label10 ----
                        label10.setText("L\u1ecbch s\u1eed n\u1ea1p ng\u00e2n h\u00e0ng ");
                        label10.setFont(new Font("Inter", Font.BOLD, 16));

                        GroupLayout panel6Layout = new GroupLayout(panel6);
                        panel6.setLayout(panel6Layout);
                        panel6Layout.setHorizontalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panel8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane2, GroupLayout.Alignment.TRAILING)
                                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radiusPanel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        );
                        panel6Layout.setVerticalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(radiusPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                    .addComponent(panel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))
                        );
                    }

                    GroupLayout panel5Layout = new GroupLayout(panel5);
                    panel5.setLayout(panel5Layout);
                    panel5Layout.setHorizontalGroup(
                        panel5Layout.createParallelGroup()
                            .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    panel5Layout.setVerticalGroup(
                        panel5Layout.createParallelGroup()
                            .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("Ng\u00e2n h\u00e0ng", panel5);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(tabbedPane1)
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
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private RadiusPanel radiusPanel1;
    private RadiusPanel radiusPanel2;
    private JComboBox<String> comboBox1;
    private JComboBox comboBox2;
    private RadiusTextField textField1;
    private RadiusTextField textField2;
    private RadiusButton radiusButton1;
    private RadiusLabel radiusLabel1;
    private JScrollPane scrollPane1;
    private JPanel panel4;
    private JPanel panel3;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label1;
    private JPanel panel5;
    private JPanel panel6;
    private RadiusPanel radiusPanel3;
    private RadiusPanel radiusPanel4;
    private JComboBox comboBox3;
    private RadiusButton radiusButton2;
    private RadiusPanel radiusLabel2;
    private RadiusLabel radiusLabel3;
    private JScrollPane scrollPane2;
    private JPanel panel7;
    private JPanel panel8;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
