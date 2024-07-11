/*
 * Created by JFormDesigner on Wed Jul 10 17:44:27 ICT 2024
 */

package steamfake.view.withdrawmoney;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class ListWithdrawMoney extends JPanel {
    public ListWithdrawMoney() {
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        colNgayRut = new JLabel();
        colSoTien = new JLabel();
        colType = new JLabel();
        colStatus = new JLabel();

        //======== this ========
        setBackground(new Color(0x252730));
        setPreferredSize(new Dimension(550, 50));
        setMinimumSize(new Dimension(550, 20));

        //---- colNgayRut ----
        colNgayRut.setText("text");
        colNgayRut.setFont(new Font("Inter", Font.BOLD, 16));
        colNgayRut.setHorizontalAlignment(SwingConstants.CENTER);
        colNgayRut.setPreferredSize(new Dimension(73, 20));

        //---- colSoTien ----
        colSoTien.setText("text");
        colSoTien.setHorizontalAlignment(SwingConstants.CENTER);
        colSoTien.setFont(new Font("Inter", Font.BOLD, 16));
        colSoTien.setForeground(Color.white);
        colSoTien.setPreferredSize(new Dimension(73, 20));

        //---- colType ----
        colType.setText("Bank");
        colType.setHorizontalAlignment(SwingConstants.CENTER);
        colType.setFont(new Font("Inter", Font.BOLD, 16));
        colType.setPreferredSize(new Dimension(73, 20));

        //---- colStatus ----
        colStatus.setText("\u0110ang ch\u1edd");
        colStatus.setHorizontalAlignment(SwingConstants.CENTER);
        colStatus.setFont(new Font("Inter", Font.BOLD, 16));
        colStatus.setPreferredSize(new Dimension(73, 20));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(colNgayRut, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(colSoTien, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(colType, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(colStatus, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(colNgayRut, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colSoTien, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(colType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(colStatus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel colNgayRut;
    private JLabel colSoTien;
    private JLabel colType;
    private JLabel colStatus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public JLabel getColNgayRut() {
        return colNgayRut;
    }

    public void setColNgayRut(JLabel colNgayRut) {
        this.colNgayRut = colNgayRut;
    }

    public JLabel getColSoTien() {
        return colSoTien;
    }

    public void setColSoTien(JLabel colSoTien) {
        this.colSoTien = colSoTien;
    }

    public JLabel getColType() {
        return colType;
    }

    public void setColType(JLabel colType) {
        this.colType = colType;
    }

    public JLabel getColStatus() {
        return colStatus;
    }

    public void setColStatus(JLabel colStatus) {
        this.colStatus = colStatus;
    }
}
