/*
 * Created by JFormDesigner on Fri Jul 05 21:10:33 ICT 2024
 */

package steamfake.view.mainframe;

import steamfake.graphics.RadiusTextField;
import steamfake.model.Account;
import steamfake.utils.ResourceManager;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;
import steamfake.utils.XMessage;
import steamfake.view.login.LoginDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
        lblSearch = new JLabel();
        lblMoney = new JLabel();
        iconAddMoney = new JLabel();
        iconSettingAccount = new JLabel();
        iconLogOut = new JLabel();
        radiusTextField1 = new RadiusTextField();
        lblAvata = new JLabel();
        lblAdmin = new JLabel();
        lblName = new JLabel();
        lblRole = new JLabel();

        //======== this ========
        setBackground(new Color(0x252730));

        //---- lblSearch ----
        lblSearch.setIcon(new ImageIcon(getClass().getResource("/icon/Search.png")));
        lblSearch.setBackground(new Color(0x252730));
        lblSearch.setOpaque(true);

        //---- lblMoney ----
        lblMoney.setText("100M");
        lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
        lblMoney.setIcon(new ImageIcon(getClass().getResource("/icon/Dollar Coin.png")));
        lblMoney.setFont(new Font("Inter", Font.BOLD, 18));
        lblMoney.setBackground(new Color(0x252730));
        lblMoney.setOpaque(true);

        //---- iconAddMoney ----
        iconAddMoney.setIcon(new ImageIcon(getClass().getResource("/icon/Add Dollar.png")));
        iconAddMoney.setBackground(new Color(0x252730));
        iconAddMoney.setOpaque(true);

        //---- iconSettingAccount ----
        iconSettingAccount.setIcon(new ImageIcon(getClass().getResource("/icon/Accessibility Tools.png")));
        iconSettingAccount.setBackground(new Color(0x252730));
        iconSettingAccount.setOpaque(true);

        //---- iconLogOut ----
        iconLogOut.setIcon(new ImageIcon(getClass().getResource("/icon/Shutdown.png")));
        iconLogOut.setBackground(new Color(0x252730));
        iconLogOut.setOpaque(true);

        //---- radiusTextField1 ----
        radiusTextField1.setForeground(Color.white);
        radiusTextField1.setPlaceholder("Search");
        radiusTextField1.setEndGradientColor(new Color(0x30333d));
        radiusTextField1.setBackground(new Color(0x252730));
        radiusTextField1.setStartGradientColor(new Color(0x30333d));
        radiusTextField1.setForcusColor(new Color(0x0c8ce9));

        //---- lblAvata ----
        lblAvata.setText("Icon");
        lblAvata.setHorizontalTextPosition(SwingConstants.CENTER);
        lblAvata.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblAdmin ----
        lblAdmin.setIcon(new ImageIcon(getClass().getResource("/icon/protection.png")));
        lblAdmin.setBackground(new Color(0x252730));
        lblAdmin.setOpaque(true);

        //---- lblName ----
        lblName.setText("Tr\u1ecbnh V\u0103n Thu\u1eadt");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 13));

        //---- lblRole ----
        lblRole.setText("Quan tri vien");
        lblRole.setIcon(new ImageIcon(getClass().getResource("/icon/User.png")));
        lblRole.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        lblRole.setForeground(new Color(0x70ff00));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblName)
                        .addComponent(lblRole, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                    .addComponent(radiusTextField1, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblMoney, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblAdmin)
                    .addGap(18, 18, 18)
                    .addComponent(iconAddMoney)
                    .addGap(33, 33, 33)
                    .addComponent(iconSettingAccount)
                    .addGap(18, 18, 18)
                    .addComponent(iconLogOut)
                    .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblSearch, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radiusTextField1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(17, 17, 17))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblMoney, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(iconAddMoney)
                                        .addComponent(lblAdmin)
                                        .addComponent(iconSettingAccount, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(iconLogOut))))
                            .addContainerGap(8, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName)
                            .addGap(7, 7, 7)
                            .addComponent(lblRole)
                            .addGap(0, 8, Short.MAX_VALUE))))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblSearch;
    private JLabel lblMoney;
    private JLabel iconAddMoney;
    private JLabel iconSettingAccount;
    private JLabel iconLogOut;
    private RadiusTextField radiusTextField1;
    private JLabel lblAvata;
    private JLabel lblAdmin;
    private JLabel lblName;
    private JLabel lblRole;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        lblName.setText("Chưa đăng nhập");
        lblAdmin.setVisible(false);
        lblRole.setText("Khách");
        lblMoney.setText("Cái nịt");
        lblAvata.setText("");
        lblAvata.setSize(new Dimension(50,50));
        initEffectHover();
        initSettingAccountPage();
    }

    private void initEffectHover() {
        JLabel[] labels = {iconAddMoney, iconSettingAccount, iconLogOut,lblAdmin,lblSearch};
        for(JLabel label : labels) {
            label.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    label.setBackground(new Color(0x30333d));
                    label.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    label.setBackground(new Color(0x252730));
                    label.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            });
        }
    }

    public void updateAccount() {
        Account account = SessionManager.user;
        if(account != null) {
            lblAdmin.setVisible(account.isAdmin());
            lblName.setText(account.getHoTen());
            lblRole.setText(account.isAdmin() ? "Quản trị viên" : "Thành viên");
            lblMoney.setText(account.getSoDuGame() + " VND");
            String avtPath = "data/avatars/" + account.getId() + "/" + account.getAvatar();
            if(account.getAvatar() != null && !account.getAvatar().isBlank() &&
                    !new File(avtPath).exists()) {
                ResourceManager.downloadAvatar(account);
            }
            if(new File(avtPath).exists()) {
                lblAvata.setIcon(XImage.scaleImageForLabel(new ImageIcon(avtPath), lblAvata));
            }
            if(account.getAvatar() == null || account.getAvatar().isBlank()) {
                lblAvata.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")), lblAvata));
            }
        }
        else {
            lblAvata.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")), lblAvata));
        }
        repaint();
    }

    public void updateMoney(){
        SwingUtilities.invokeLater(() -> lblMoney.setText(SessionManager.user.getSoDuGame() + " VND"));
    }

    private void initSettingAccountPage() {
        iconSettingAccount.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!SessionManager.isLogin()) {
                    XMessage.notificate(MFrame.getInstance(),"Bạn cần đăng nhập để sử dụng chức năng này");
                    new LoginDialog(MFrame.getInstance()).setVisible(true);
                    return;
                }
                MFrame.getInstance().initSettingAccountPage();
            }
        });
    }

}
