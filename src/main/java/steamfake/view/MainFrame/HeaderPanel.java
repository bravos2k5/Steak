/*
 * Created by JFormDesigner on Fri Jul 05 21:10:33 ICT 2024
 */

package steamfake.view.MainFrame;

import java.awt.*;
import javax.swing.*;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        initComponents();
        lblName.setText("nguyen quoc bao");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvata = new JLabel();
        lblName = new JLabel();
        lblRole = new JLabel();
        txtSearch = new JTextField();
        lblSearch = new JLabel();
        lblMoney = new JLabel();
        iconAddMoney = new JLabel();
        separator3 = new JSeparator();
        iconSettingAccount = new JLabel();
        iconLogOut = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //---- lblAvata ----
        lblAvata.setText("Icon");
        lblAvata.setOpaque(true);
        lblAvata.setHorizontalTextPosition(SwingConstants.CENTER);
        lblAvata.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblName ----
        lblName.setText("Tr\u1ecbnh V\u0103n Thu\u1eadt");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //---- lblRole ----
        lblRole.setText("Th\u00e0nh vi\u00ean");
        lblRole.setIcon(new ImageIcon(getClass().getResource("/icon/User.png")));
        lblRole.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        lblRole.setForeground(new Color(0x70ff00));

        //---- txtSearch ----
        txtSearch.setForeground(new Color(0x676d83));
        txtSearch.setBorder(null);
        txtSearch.setOpaque(true);
        txtSearch.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtSearch.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        txtSearch.setText("Search");
        txtSearch.setCaretPosition(6);
        txtSearch.setMargin(new Insets(3, 6, 2, 6));
        txtSearch.setBackground(new Color(0x30333d));

        //---- lblSearch ----
        lblSearch.setIcon(new ImageIcon(getClass().getResource("/icon/Search.png")));
        lblSearch.setBackground(new Color(0x30333d));
        lblSearch.setOpaque(true);

        //---- lblMoney ----
        lblMoney.setText("100M");
        lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
        lblMoney.setLabelFor(txtSearch);
        lblMoney.setIcon(new ImageIcon(getClass().getResource("/icon/Dollar Coin.png")));
        lblMoney.setFont(new Font("Inter", Font.BOLD, 20));
        lblMoney.setBackground(new Color(0x252730));
        lblMoney.setOpaque(true);

        //---- iconAddMoney ----
        iconAddMoney.setIcon(new ImageIcon(getClass().getResource("/icon/Add Dollar.png")));

        //---- separator3 ----
        separator3.setOrientation(SwingConstants.VERTICAL);
        separator3.setOpaque(true);
        separator3.setBackground(Color.white);
        separator3.setForeground(Color.white);

        //---- iconSettingAccount ----
        iconSettingAccount.setIcon(new ImageIcon(getClass().getResource("/icon/Accessibility Tools.png")));

        //---- iconLogOut ----
        iconLogOut.setIcon(new ImageIcon(getClass().getResource("/icon/Shutdown.png")));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRole, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblSearch)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                    .addComponent(lblMoney, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(iconAddMoney)
                    .addGap(18, 18, 18)
                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(iconSettingAccount)
                    .addGap(18, 18, 18)
                    .addComponent(iconLogOut)
                    .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(17, 17, 17))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRole))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(iconAddMoney))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(iconLogOut)
                                .addComponent(iconSettingAccount, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblMoney, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(8, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblAvata;
    private JLabel lblName;
    private JLabel lblRole;
    private JTextField txtSearch;
    private JLabel lblSearch;
    private JLabel lblMoney;
    private JLabel iconAddMoney;
    private JSeparator separator3;
    private JLabel iconSettingAccount;
    private JLabel iconLogOut;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
