/*
 * Created by JFormDesigner on Wed Jul 10 21:55:49 ICT 2024
 */

package steamfake.view.addmoney;

import steamfake.model.NapTien;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class HistoryItem extends JPanel {

    private final NapTien napTien;

    public HistoryItem(NapTien napTien) {
        this.napTien = napTien;
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblId = new JLabel();
        lblDate = new JLabel();
        lblSoTien = new JLabel();
        lblStatus = new JLabel();

        //======== this ========
        setBackground(new Color(0x1b1d26));
        setMaximumSize(new Dimension(1000, 50));

        //---- lblId ----
        lblId.setText("12345678912345678912345678912345");
        lblId.setFont(new Font("Inter", Font.BOLD, 14));
        lblId.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblDate ----
        lblDate.setText("01/01/2020");
        lblDate.setFont(new Font("Inter", Font.BOLD, 14));
        lblDate.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblSoTien ----
        lblSoTien.setText("10.000");
        lblSoTien.setFont(new Font("Inter", Font.BOLD, 14));
        lblSoTien.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblStatus ----
        lblStatus.setText("\u0110\u00e3 duy\u1ec7t");
        lblStatus.setFont(new Font("Inter", Font.BOLD, 14));
        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
        lblStatus.setForeground(new Color(0x03fd67));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblSoTien, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblId, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSoTien, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblId;
    private JLabel lblDate;
    private JLabel lblSoTien;
    private JLabel lblStatus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        lblId.setText(napTien.getId().toString());
        lblDate.setText(napTien.getNgayNap().toString());
        lblSoTien.setText(napTien.getSoTien() + "");
        String status;
        if(napTien.getStatus() == NapTien.PENDING) {
            lblStatus.setForeground(new Color(0xffd700));
            status = "Đang chờ";
        }
        else if(napTien.getStatus() == NapTien.ACCEPTED) {
            lblStatus.setForeground(new Color(0x03fd67));
            status = "Đã duyệt";
        }
        else {
            lblStatus.setForeground(new Color(0xff0000));
            status = "Đã hủy";
        }
        lblStatus.setText(status);
    }

}
