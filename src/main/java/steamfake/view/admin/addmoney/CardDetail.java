/*
 * Created by JFormDesigner on Mon Jul 15 20:45:46 ICT 2024
 */

package steamfake.view.admin.addmoney;

import steamfake.graphics.RadiusButton;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class CardDetail extends JDialog {
    public CardDetail(Window owner) {
        super(owner);
        initComponents();
        

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        textField5 = new JTextField();
        label6 = new JLabel();
        textField6 = new JTextField();
        label7 = new JLabel();
        btnCancel2 = new RadiusButton();
        btnUpload2 = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label2 ----
        label2.setText("ID :");
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField1 ----
        textField1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label3 ----
        label3.setText("ID Account :");
        label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField2 ----
        textField2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label4 ----
        label4.setText("M\u00e3 th\u1ebb :");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField3 ----
        textField3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("S\u1ed1 Seri");
        label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField4 ----
        textField4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- textField5 ----
        textField5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label6 ----
        label6.setText("Nh\u00e0 m\u1ea1ng");
        label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label6.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField6 ----
        textField6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label7 ----
        label7.setText("S\u1ed1 ti\u1ec1n");
        label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label7.setHorizontalAlignment(SwingConstants.CENTER);

        //---- btnCancel2 ----
        btnCancel2.setText("T\u1eeb ch\u1ed1i");
        btnCancel2.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel2.setBackground(new Color(0x3e3737));
        btnCancel2.setOriginColor(new Color(0x3e3737));
        btnCancel2.setRadius(5);
        btnCancel2.setHoverColor(new Color(0x9d2424));

        //---- btnUpload2 ----
        btnUpload2.setText("Duy\u1ec7t");
        btnUpload2.setHorizontalAlignment(SwingConstants.CENTER);
        btnUpload2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnUpload2.setBackground(new Color(0x35452a));
        btnUpload2.setHoverColor(new Color(0x429509));
        btnUpload2.setOriginColor(new Color(0x35452a));
        btnUpload2.setRadius(5);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(129, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 559, Short.MAX_VALUE)
                    .addComponent(btnCancel2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnUpload2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpload2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label7;
    private RadiusButton btnCancel2;
    private RadiusButton btnUpload2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
