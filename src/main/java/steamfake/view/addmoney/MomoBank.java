/*
 * Created by JFormDesigner on Sun Jul 21 16:39:42 ICT 2024
 */

package steamfake.view.addmoney;

import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusPanel;
import steamfake.model.NapCK;
import steamfake.utils.Payment;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * @author ACER
 */
public class MomoBank extends JDialog {
    private final AddMoney addMoney ;
    public MomoBank(Window owner, AddMoney addMoney) {
        super(owner);
        initComponents();
        this.addMoney = addMoney;
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        btnPay = new RadiusButton();
        radiusPanel3 = new RadiusPanel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        lblNoiDung = new JLabel();
        panel1 = new JPanel();
        lblQR = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- btnPay ----
        btnPay.setText("Thanh to\u00e1n");
        btnPay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //======== radiusPanel3 ========
        {
            radiusPanel3.setBackground(new Color(0x46484c));
            radiusPanel3.setBorderColor(Color.white);

            //---- label22 ----
            label22.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
            label22.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

            //---- label23 ----
            label23.setText("T\u00ean t\u00e0i kho\u1ea3n");
            label23.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

            //---- label24 ----
            label24.setText("N\u1ed9i dung");
            label24.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

            //---- label27 ----
            label27.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
            label27.setHorizontalAlignment(SwingConstants.CENTER);
            label27.setText("0704795312");

            //---- label28 ----
            label28.setText("Nguy\u1ec5n Qu\u1ed1c B\u1ea3o");
            label28.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
            label28.setHorizontalAlignment(SwingConstants.CENTER);

            //---- lblNoiDung ----
            lblNoiDung.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
            lblNoiDung.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout radiusPanel3Layout = new GroupLayout(radiusPanel3);
            radiusPanel3.setLayout(radiusPanel3Layout);
            radiusPanel3Layout.setHorizontalGroup(
                radiusPanel3Layout.createParallelGroup()
                    .addGroup(radiusPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(radiusPanel3Layout.createParallelGroup()
                            .addComponent(label22, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label23, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label24, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(radiusPanel3Layout.createParallelGroup()
                            .addGroup(radiusPanel3Layout.createSequentialGroup()
                                .addGroup(radiusPanel3Layout.createParallelGroup()
                                    .addComponent(label28, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(label27, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                                .addGap(24, 24, 24))
                            .addGroup(radiusPanel3Layout.createSequentialGroup()
                                .addComponent(lblNoiDung, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))))
            );
            radiusPanel3Layout.setVerticalGroup(
                radiusPanel3Layout.createParallelGroup()
                    .addGroup(radiusPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(radiusPanel3Layout.createParallelGroup()
                            .addGroup(radiusPanel3Layout.createSequentialGroup()
                                .addComponent(label27, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(label28, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lblNoiDung, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGroup(radiusPanel3Layout.createSequentialGroup()
                                .addComponent(label22, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label23, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label24, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(43, Short.MAX_VALUE))
            );
        }

        //======== panel1 ========
        {
            panel1.setOpaque(false);

            //---- lblQR ----
            lblQR.setHorizontalAlignment(SwingConstants.CENTER);
            lblQR.setHorizontalTextPosition(SwingConstants.CENTER);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblQR, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblQR, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(radiusPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(radiusPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private void initialize() {
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x191b20));
        btnPay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addMoney.addBank(NapCK.MOMO);
                dispose();
            }
        });
        lblNoiDung.setText(SessionManager.user.getId().toString());
        loadQR();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusButton btnPay;
    private RadiusPanel radiusPanel3;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label27;
    private JLabel label28;
    private JLabel lblNoiDung;
    private JPanel panel1;
    private JLabel lblQR;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void loadQR() {
        lblQR.setIcon(null);
        lblQR.setSize(new Dimension(488, 383));
        lblQR.setText("Đang tải...");
        new Thread(() -> {
            BufferedImage image = Payment.gI().getPaymentQR(SessionManager.user.getId().toString(),
                    Integer.parseInt(addMoney.getSoTienNapBank().replaceAll("\\.","")));
            SwingUtilities.invokeLater(() -> {
                lblQR.setText("");
                lblQR.setIcon(XImage.scaleImageForLabel(new ImageIcon(image), lblQR));
            });
        }).start();
    }
}
