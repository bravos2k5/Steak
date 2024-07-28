/*
 * Created by JFormDesigner on Wed Jul 10 23:15:31 ICT 2024
 */

package steamfake.view.addmoney;

import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusPanel;
import steamfake.model.NapCK;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author ACER
 */
public class BankMoney extends JDialog {

    private final AddMoney addMoney ;

    public BankMoney(Window owner ,AddMoney addMoney) {
        super(owner);
        this.addMoney = addMoney;
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        panel2 = new JPanel();
        radiusPanel1 = new RadiusPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        lblNoiDungCK = new JLabel();
        lblSoTienCK = new JLabel();
        label25 = new JLabel();
        btnPay = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x191b20));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x252730));

                //======== radiusPanel1 ========
                {
                    radiusPanel1.setBackground(new Color(0x46484c));
                    radiusPanel1.setBorderColor(Color.white);

                    //---- label1 ----
                    label1.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                    label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                    //---- label2 ----
                    label2.setText("T\u00ean ng\u01b0\u1eddi nh\u1eadn");
                    label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                    //---- label3 ----
                    label3.setText("T\u00ean ng\u00e2n h\u00e0ng");
                    label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                    //---- label4 ----
                    label4.setText("N\u1ed9i dung");
                    label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                    //---- label5 ----
                    label5.setText("S\u1ed1 ti\u1ec1n");
                    label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                    //---- label6 ----
                    label6.setText("104879865299");
                    label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    label6.setHorizontalAlignment(SwingConstants.CENTER);

                    //---- label7 ----
                    label7.setText("Tr\u1ecbnh V\u0103n Thu\u1eadt");
                    label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    label7.setHorizontalAlignment(SwingConstants.CENTER);

                    //---- label8 ----
                    label8.setText("Vietinbank");
                    label8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    label8.setHorizontalAlignment(SwingConstants.CENTER);

                    //---- lblNoiDungCK ----
                    lblNoiDungCK.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    lblNoiDungCK.setHorizontalAlignment(SwingConstants.CENTER);
                    lblNoiDungCK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    //---- lblSoTienCK ----
                    lblSoTienCK.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    lblSoTienCK.setHorizontalAlignment(SwingConstants.CENTER);

                    GroupLayout radiusPanel1Layout = new GroupLayout(radiusPanel1);
                    radiusPanel1.setLayout(radiusPanel1Layout);
                    radiusPanel1Layout.setHorizontalGroup(
                        radiusPanel1Layout.createParallelGroup()
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(radiusPanel1Layout.createParallelGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(radiusPanel1Layout.createParallelGroup()
                                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                                        .addGroup(radiusPanel1Layout.createParallelGroup()
                                            .addComponent(label7, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                            .addComponent(label8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblNoiDungCK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label6, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(55, 55, 55))
                                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSoTienCK, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(55, Short.MAX_VALUE))))
                    );
                    radiusPanel1Layout.setVerticalGroup(
                        radiusPanel1Layout.createParallelGroup()
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(radiusPanel1Layout.createParallelGroup()
                                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNoiDungCK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSoTienCK, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(15, Short.MAX_VALUE))
                    );
                }

                //---- label25 ----
                label25.setText("L\u01b0u \u00fd : N\u1ed9i dung sai l\u00e0 ti\u1ec1n b\u1ea1n s\u1ebd ko \u0111\u01b0\u1ee3c ho\u00e0n tr\u1ea3 d\u01b0\u1edbi b\u1ea5t k\u1ef3 h\u00ecnh th\u1ee9c n\u00e0o");
                label25.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                //---- btnPay ----
                btnPay.setText("Thanh to\u00e1n");
                btnPay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label25, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(27, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label25, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(26, Short.MAX_VALUE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JPanel panel2;
    private RadiusPanel radiusPanel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel lblNoiDungCK;
    private JLabel lblSoTienCK;
    private JLabel label25;
    private RadiusButton btnPay;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        lblNoiDungCK.setText(SessionManager.user.getId().toString());
        lblSoTienCK.setText(addMoney.getSoTienNapBank());
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x191b20));
        btnPay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        lblNoiDungCK.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(SessionManager.user.getId().toString()), null);
                XMessage.notificate(BankMoney.this, "Đã copy nội dung chuyển khoản");
            }
        });
    }

    @Override
    public void dispose() {
        super.dispose();
        addMoney.addBank(NapCK.NGAN_HANG);
    }

}
