/*
 * Created by JFormDesigner on Thu Jul 11 23:38:39 ICT 2024
 */

package steamfake.view.managegame;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.formdev.flatlaf.FlatDarkLaf;
import components.*;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class SettingGame extends JDialog {
    public SettingGame(Window owner) {
        super(owner);
        initComponents();
        this.getContentPane().setBackground(new Color(25,27,32));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        radiusTextField1 = new RadiusTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        radiusTextField2 = new RadiusTextField();
        comboBox1 = new JComboBox();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        radiusTextField3 = new RadiusTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        radiusTextField4 = new RadiusTextField();
        label10 = new JLabel();
        radiusTextField5 = new RadiusTextField();
        label11 = new JLabel();
        label12 = new JLabel();
        radiusTextField6 = new RadiusTextField();
        label13 = new JLabel();
        label14 = new JLabel();
        checkBox1 = new JCheckBox();
        label15 = new JLabel();
        label16 = new RadiusButton();
        label17 = new RadiusButton();
        radiusTextField7 = new RadiusTextField();
        label18 = new JLabel();
        radiusButton1 = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- radiusTextField1 ----
        radiusTextField1.setRadius(0);
        radiusTextField1.setForcusColor(new Color(0x0c8ce9));
        radiusTextField1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField1.setEndGradientColor(new Color(0x252730));
        radiusTextField1.setBackground(new Color(0x252730));
        radiusTextField1.setNoForcusColor(new Color(0x191b20));
        radiusTextField1.setText("x");
        radiusTextField1.setStartGradientColor(new Color(0x252730));

        //---- label1 ----
        label1.setText("T\u00ean game");
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label2 ----
        label2.setText("Gi\u00e1 game");
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusTextField2 ----
        radiusTextField2.setRadius(0);
        radiusTextField2.setForcusColor(new Color(0x0c8ce9));
        radiusTextField2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField2.setEndGradientColor(new Color(0x252730));
        radiusTextField2.setNoForcusColor(new Color(0x191b20));
        radiusTextField2.setBackground(new Color(0x252730));
        radiusTextField2.setStartGradientColor(new Color(0x252730));

        //---- comboBox1 ----
        comboBox1.setBackground(new Color(0x252730));

        //---- label3 ----
        label3.setText("\u0110\u1ed9 tu\u1ed5i");
        label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setBackground(new Color(0x252730));
            textArea1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
            scrollPane1.setViewportView(textArea1);
        }

        //---- label4 ----
        label4.setText("M\u00f4 t\u1ea3");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("text");
        label5.setBackground(Color.white);
        label5.setIcon(new ImageIcon(getClass().getResource("/icon/image 8.png")));

        //---- label6 ----
        label6.setText("Upload File");
        label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- label7 ----
        label7.setText("Upload File to :");
        label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        label7.setForeground(new Color(0x5c5c5d));

        //---- radiusTextField3 ----
        radiusTextField3.setForcusColor(new Color(0x0c8ce9));
        radiusTextField3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField3.setBackground(new Color(0x191b20));
        radiusTextField3.setStartGradientColor(new Color(0x252730));

        //---- label8 ----
        label8.setText("Yeu cau he thong");
        label8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- label9 ----
        label9.setText("RAM");
        label9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusTextField4 ----
        radiusTextField4.setRadius(0);
        radiusTextField4.setForcusColor(new Color(0x0c8ce9));
        radiusTextField4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField4.setEndGradientColor(new Color(0x252730));
        radiusTextField4.setNoForcusColor(new Color(0x191b20));
        radiusTextField4.setBackground(new Color(0x252730));
        radiusTextField4.setStartGradientColor(new Color(0x252730));

        //---- label10 ----
        label10.setText("MB");
        label10.setHorizontalAlignment(SwingConstants.CENTER);
        label10.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusTextField5 ----
        radiusTextField5.setRadius(0);
        radiusTextField5.setForcusColor(new Color(0x0c8ce9));
        radiusTextField5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField5.setEndGradientColor(new Color(0x252730));
        radiusTextField5.setNoForcusColor(new Color(0x191b20));
        radiusTextField5.setBackground(new Color(0x252730));
        radiusTextField5.setStartGradientColor(new Color(0x252730));

        //---- label11 ----
        label11.setText("MB");
        label11.setHorizontalAlignment(SwingConstants.CENTER);
        label11.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label12 ----
        label12.setText("ROM");
        label12.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- radiusTextField6 ----
        radiusTextField6.setRadius(0);
        radiusTextField6.setForcusColor(new Color(0x0c8ce9));
        radiusTextField6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField6.setEndGradientColor(new Color(0x252730));
        radiusTextField6.setNoForcusColor(new Color(0x191b20));
        radiusTextField6.setBackground(new Color(0x252730));
        radiusTextField6.setStartGradientColor(new Color(0x252730));

        //---- label13 ----
        label13.setText("MB");
        label13.setHorizontalAlignment(SwingConstants.CENTER);
        label13.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label14 ----
        label14.setText("Phien ban");
        label14.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- checkBox1 ----
        checkBox1.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- label15 ----
        label15.setText("B\u1ea1n c\u00f3 \u0111\u1ed3ng \u00fd \u0111i\u1ec1u kho\u1ea3n vv...");
        label15.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        label15.setBackground(new Color(0x505051));

        //---- label16 ----
        label16.setText("\u0110\u0103ng l\u00ean");
        label16.setHorizontalAlignment(SwingConstants.CENTER);
        label16.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        label16.setBackground(new Color(0x35452a));
        label16.setHoverColor(new Color(0x429509));
        label16.setOriginColor(new Color(0x35452a));
        label16.setRadius(5);

        //---- label17 ----
        label17.setText("H\u1ee7y b\u1ecf");
        label17.setHorizontalAlignment(SwingConstants.CENTER);
        label17.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        label17.setBackground(new Color(0x3e3737));
        label17.setOriginColor(new Color(0x3e3737));
        label17.setRadius(5);
        label17.setHoverColor(new Color(0x9d2424));

        //---- radiusTextField7 ----
        radiusTextField7.setForcusColor(new Color(0x0c8ce9));
        radiusTextField7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        radiusTextField7.setBackground(new Color(0x191b20));
        radiusTextField7.setStartGradientColor(new Color(0x252730));

        //---- label18 ----
        label18.setText("Upload \u1ea2nh");
        label18.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- radiusButton1 ----
        radiusButton1.setIcon(new ImageIcon(getClass().getResource("/icon/+.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label1)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label2)
                                                .addComponent(radiusTextField2, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
                                            .addGap(50, 50, 50)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label3)
                                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                                    .addGap(148, 148, 148)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(checkBox1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label15, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(radiusTextField4, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(label9))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label12)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(radiusTextField5, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label14)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(radiusTextField6, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addComponent(label7)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(radiusTextField3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                            .addGap(52, 52, 52))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                            .addGap(295, 295, 295)))
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label18, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radiusTextField7, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label17, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(42, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                    .addGap(44, 44, 44)
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label18, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(radiusTextField4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(radiusTextField5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(radiusTextField6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label16, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label17, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusTextField radiusTextField1;
    private JLabel label1;
    private JLabel label2;
    private RadiusTextField radiusTextField2;
    private JComboBox comboBox1;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private RadiusTextField radiusTextField3;
    private JLabel label8;
    private JLabel label9;
    private RadiusTextField radiusTextField4;
    private JLabel label10;
    private RadiusTextField radiusTextField5;
    private JLabel label11;
    private JLabel label12;
    private RadiusTextField radiusTextField6;
    private JLabel label13;
    private JLabel label14;
    private JCheckBox checkBox1;
    private JLabel label15;
    private RadiusButton label16;
    private RadiusButton label17;
    private RadiusTextField radiusTextField7;
    private JLabel label18;
    private RadiusButton radiusButton1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new SettingGame(null).setVisible(true);
    }
}
