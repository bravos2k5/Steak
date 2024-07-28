/*
 * Created by JFormDesigner on Sun Jul 21 16:39:42 ICT 2024
 */

package steamfake.view.addmoney;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.*;
import steamfake.model.NapCK;

/**
 * @author ACER
 */
public class MomoBank extends JDialog {
    private final AddMoney addMoney ;
    public MomoBank(Window owner, AddMoney addMoney) {
        super(owner);
        initComponents();
        this.addMoney = addMoney;
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x191b20));
        btnPay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        radiusPanel3 = new RadiusPanel();
        label22 = new JLabel();
        label23 = new JLabel();
        label24 = new JLabel();
        label27 = new JLabel();
        label28 = new JLabel();
        label29 = new JLabel();
        label21 = new JLabel();
        btnPay = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //======== radiusPanel3 ========
            {
                radiusPanel3.setBackground(new Color(0x46484c));
                radiusPanel3.setBorderColor(Color.white);

                //---- label22 ----
                label22.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                label22.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                //---- label23 ----
                label23.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                label23.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                //---- label24 ----
                label24.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                label24.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

                //---- label27 ----
                label27.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                label27.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                label27.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label28 ----
                label28.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                label28.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                label28.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label29 ----
                label29.setText("S\u1ed1 t\u00e0i kho\u1ea3n :");
                label29.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                label29.setHorizontalAlignment(SwingConstants.CENTER);

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
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                            .addGroup(radiusPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label28, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label27, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label29, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24))
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
                                    .addComponent(label29, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addGroup(radiusPanel3Layout.createSequentialGroup()
                                    .addComponent(label22, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label23, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label24, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(15, Short.MAX_VALUE))
                );
            }

            //---- label21 ----
            label21.setIcon(new ImageIcon(getClass().getResource("/icon/image 8.png")));

            //---- btnPay ----
            btnPay.setText("Thanh to\u00e1n");
            btnPay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(label21)
                                .addGap(133, 133, 133))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(radiusPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label21)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiusPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    @Override
    public void dispose() {
        addMoney.addBank(NapCK.MOMO);
    }// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private RadiusPanel radiusPanel3;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label21;
    private RadiusButton btnPay;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
