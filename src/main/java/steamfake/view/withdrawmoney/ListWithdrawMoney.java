/*
 * Created by JFormDesigner on Wed Jul 10 17:44:27 ICT 2024
 */

package steamfake.view.withdrawmoney;

import javax.swing.*;
import javax.swing.GroupLayout;
import java.awt.*;
import java.util.Random;
import components.*;

/**
 * @author ACER
 */
public class ListWithdrawMoney extends JPanel {
    public ListWithdrawMoney() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setBackground(new Color(0x252730));

        //---- label1 ----
        label1.setText("text");
        label1.setFont(new Font("Inter", Font.BOLD, 16));
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label2 ----
        label2.setText("text");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setFont(new Font("Inter", Font.BOLD, 16));
        label2.setForeground(new Color(0x33ff33));

        //---- label3 ----
        label3.setText("Bank");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(new Font("Inter", Font.BOLD, 16));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(label1, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
