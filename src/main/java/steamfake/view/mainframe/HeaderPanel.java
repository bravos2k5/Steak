/*
 * Created by JFormDesigner on Fri Jul 05 21:10:33 ICT 2024
 */

package steamfake.view.mainframe;

import steamfake.constance.FilePath;
import steamfake.graphics.RadiusTextField;
import steamfake.model.Account;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;
import steamfake.utils.azure.AzureBlobService;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author ACER
 */
public class HeaderPanel extends JPanel {

    private static HeaderPanel instance;

    public static HeaderPanel getInstance() {
        if (instance == null) {
            instance = new HeaderPanel();
        }
        return instance;
    }

    private HeaderPanel() {
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvata = new JLabel();
        lblName = new JLabel();
        lblRole = new JLabel();
        lblSearch = new JLabel();
        lblMoney = new JLabel();
        iconAddMoney = new JLabel();
        separator3 = new JSeparator();
        iconSettingAccount = new JLabel();
        iconLogOut = new JLabel();
        radiusTextField1 = new RadiusTextField();

        //======== this ========
        setBackground(new Color(0x252730));

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

        //---- lblSearch ----
        lblSearch.setIcon(new ImageIcon(getClass().getResource("/icon/Search.png")));
        lblSearch.setBackground(new Color(0x30333d));
        lblSearch.setOpaque(true);

        //---- lblMoney ----
        lblMoney.setText("100M");
        lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
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

        //---- radiusTextField1 ----
        radiusTextField1.setForeground(Color.white);
        radiusTextField1.setPlaceholder("Search");
        radiusTextField1.setEndGradientColor(Color.white);

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
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                    .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblSearch)
                    .addGap(31, 31, 31)
                    .addComponent(lblMoney, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
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
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblSearch, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(radiusTextField1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(lblMoney, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addContainerGap(8, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblAvata;
    private JLabel lblName;
    private JLabel lblRole;
    private JLabel lblSearch;
    private JLabel lblMoney;
    private JLabel iconAddMoney;
    private JSeparator separator3;
    private JLabel iconSettingAccount;
    private JLabel iconLogOut;
    private RadiusTextField radiusTextField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        lblName.setText("Chưa đăng nhập");
        lblRole.setText("Khách");
        lblMoney.setText("Cái nịt");
        lblAvata.setText("");
        lblAvata.setSize(new Dimension(50,50));
        lblAvata.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")), lblAvata));
    }

    public void updateAccount() {
        Account account = SessionManager.user;
        if(account != null) {
            lblName.setText(account.getHoTen());
            lblRole.setText(account.isAdmin() ? "Quản trị viên" : "Thành viên");
            lblMoney.setText(account.getSoDuGame() + " VND");
            if(account.getAvatar() != null && !account.getAvatar().isBlank() && !new File(FilePath.getLocalAvatarPath(account)).exists()) {
                AzureBlobService.download(FilePath.getLocalAvatarPath(account), FilePath.getRemoteAvatarPath(account),"images");
            }
            if(account.getAvatar() == null || account.getAvatar().isBlank()) {
                lblAvata.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")), lblAvata));
                return;
            }
            lblAvata.setIcon(XImage.scaleImageForLabel(new ImageIcon(account.getAvatar()), lblAvata));
            repaint();
        }
    }

}
