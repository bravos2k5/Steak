/*
 * Created by JFormDesigner on Mon Jul 15 21:07:27 ICT 2024
 */

package steamfake.view.admin.addmoney;

import steamfake.graphics.RadiusButton;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class BankDetail extends JDialog {
    public BankDetail(Window owner) {
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
        label4.setText("H\u00ecnh th\u1ee9c :");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField3 ----
        textField3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

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
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(129, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 555, Short.MAX_VALUE)
                    .addComponent(btnCancel2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnUpload2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28))
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
                    .addGap(55, 55, 55)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpload2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(38, Short.MAX_VALUE))
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
    private RadiusButton btnCancel2;
    private RadiusButton btnUpload2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
