/*
 * Created by JFormDesigner on Wed Jul 10 17:44:27 ICT 2024
 */

package steamfake.view.withdrawmoney;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ACER
 */
public class ListWithdrawMoney extends JPanel {
    public ListWithdrawMoney() {
        initComponents();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(0xFF1E1E1E, true));
                setBorder(null);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(new Color(0x3a3d42));
                setBorder(BorderFactory.createLineBorder(new Color(0x252730), 1));
            }
        });

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        colNgayRut = new JLabel();
        colSoTien = new JLabel();
        colType = new JLabel();
        colStatus = new JLabel();

        //======== this ========
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMaximumSize(new Dimension(548, 50));

        //---- colNgayRut ----
        colNgayRut.setText("Ng\u00e0y r\u00fat");
        colNgayRut.setHorizontalAlignment(SwingConstants.CENTER);
        colNgayRut.setFont(new Font("Inter", Font.BOLD, 16));

        //---- colSoTien ----
        colSoTien.setText("S\u1ed1 ti\u1ec1n r\u00fat");
        colSoTien.setHorizontalAlignment(SwingConstants.CENTER);
        colSoTien.setFont(new Font("Inter", Font.BOLD, 16));
        colSoTien.setPreferredSize(new Dimension(73, 20));

        //---- colType ----
        colType.setText("H\u00ecnh th\u1ee9c");
        colType.setHorizontalAlignment(SwingConstants.CENTER);
        colType.setFont(new Font("Inter", Font.BOLD, 16));
        colType.setPreferredSize(new Dimension(73, 20));

        //---- colStatus ----
        colStatus.setText("Ng\u00e0y r\u00fat");
        colStatus.setHorizontalAlignment(SwingConstants.CENTER);
        colStatus.setFont(new Font("Inter", Font.BOLD, 16));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(colNgayRut, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(colSoTien, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(colType, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(colStatus, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(colNgayRut, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(colSoTien, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(colType, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(colStatus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
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
