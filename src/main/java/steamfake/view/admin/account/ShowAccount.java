/*
 * Created by JFormDesigner on Fri Jul 19 20:14:08 ICT 2024
 */

package steamfake.view.admin.account;

import steamfake.dao.AccountDAO;
import steamfake.graphics.DateTimeTextField;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusLabel;
import steamfake.graphics.RadiusTextField;
import steamfake.model.Account;
import steamfake.utils.SessionManager;
import steamfake.utils.XFile;
import steamfake.utils.XImage;
import steamfake.utils.XRegex;
import steamfake.utils.azure.AzureBlobService;
import steamfake.view.account.ChangePassword;
import steamfake.view.mainframe.HeaderPanel;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Date;

/**
 * @author ADMIN
 */
public class ShowAccount extends JFrame {
    public ShowAccount() {
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        panel2 = new JPanel();
        lbl123 = new JLabel();
        label5 = new JLabel();
        txtEmail = new RadiusTextField();
        btnChangeEmail = new RadiusButton();
        label6 = new JLabel();
        label7 = new JLabel();
        txtPhoneNumber = new RadiusTextField();
        txtJoinDate = new RadiusTextField();
        btnChangePassword = new RadiusButton();
        txtUUID = new RadiusTextField();
        label8 = new JLabel();
        txtName = new RadiusTextField();
        label9 = new JLabel();
        txtDob = new DateTimeTextField();
        label10 = new JLabel();
        cboSex = new JComboBox();
        label11 = new JLabel();
        txtNameAccount = new RadiusTextField();
        lblAvatar = new RadiusLabel();
        lblName = new JLabel();
        label14 = new JLabel();
        lblSoDuGame = new JLabel();
        lblSoDuDoanhThu = new JLabel();
        label17 = new JLabel();
        btnBan = new RadiusButton();
        btnUpdate = new RadiusButton();
        btnCancel = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //---- label1 ----
            label1.setText("C\u00e0i \u0110\u1eb7t T\u00e0i Kho\u1ea3n");
            label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

            //---- label3 ----
            label3.setText("Th\u00f4ng tin t\u00e0i kho\u1ea3n :");
            label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x191b20));

                //---- lbl123 ----
                lbl123.setText("T\u00ean t\u00e0i kho\u1ea3n");
                lbl123.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- label5 ----
                label5.setText("Email");
                label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- txtEmail ----
                txtEmail.setForcusColor(new Color(0x0c8ce9));
                txtEmail.setNoForcusColor(new Color(0x191b20));
                txtEmail.setStartGradientColor(new Color(0x191b20));
                txtEmail.setEndGradientColor(new Color(0x191b20));
                txtEmail.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                txtEmail.setRadius(0);
                txtEmail.setBackground(new Color(0x252730));

                //---- btnChangeEmail ----
                btnChangeEmail.setOriginColor(new Color(0x205cc3));
                btnChangeEmail.setHoverColor(new Color(0x4886f0));
                btnChangeEmail.setRadius(0);
                btnChangeEmail.setBackground(new Color(0x205cc3));
                btnChangeEmail.setIcon(new ImageIcon(getClass().getResource("/icon/Refresh.png")));

                //---- label6 ----
                label6.setText("Ng\u00e0y tham gia:");
                label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- label7 ----
                label7.setText("S\u1ed1 \u0111i\u1ec7n tho\u1ea1i");
                label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- txtPhoneNumber ----
                txtPhoneNumber.setForcusColor(new Color(0x0c8ce9));
                txtPhoneNumber.setNoForcusColor(new Color(0x191b20));
                txtPhoneNumber.setStartGradientColor(new Color(0x191b20));
                txtPhoneNumber.setEndGradientColor(new Color(0x191b20));
                txtPhoneNumber.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                txtPhoneNumber.setRadius(0);
                txtPhoneNumber.setBackground(new Color(0x252730));

                //---- txtJoinDate ----
                txtJoinDate.setForcusColor(new Color(0x0c8ce9));
                txtJoinDate.setNoForcusColor(new Color(0x191b20));
                txtJoinDate.setStartGradientColor(new Color(0x191b20));
                txtJoinDate.setEndGradientColor(new Color(0x191b20));
                txtJoinDate.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                txtJoinDate.setRadius(0);
                txtJoinDate.setBackground(new Color(0x252730));
                txtJoinDate.setEditable(false);
                txtJoinDate.setEnabled(false);

                //---- btnChangePassword ----
                btnChangePassword.setText("\u0110\u1ed5i m\u1eadt kh\u1ea9u");
                btnChangePassword.setOriginColor(new Color(0x205cc3));
                btnChangePassword.setHoverColor(new Color(0x4886f0));
                btnChangePassword.setRadius(0);
                btnChangePassword.setBackground(new Color(0x205cc3));
                btnChangePassword.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

                //---- txtUUID ----
                txtUUID.setForcusColor(new Color(0x0c8ce9));
                txtUUID.setNoForcusColor(new Color(0x191b20));
                txtUUID.setStartGradientColor(new Color(0x191b20));
                txtUUID.setEndGradientColor(new Color(0x191b20));
                txtUUID.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                txtUUID.setRadius(0);
                txtUUID.setBackground(new Color(0x252730));

                //---- label8 ----
                label8.setText("UUID");
                label8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- txtName ----
                txtName.setForcusColor(new Color(0x0c8ce9));
                txtName.setNoForcusColor(new Color(0x252730));
                txtName.setStartGradientColor(new Color(0x252730));
                txtName.setEndGradientColor(new Color(0x252730));
                txtName.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                txtName.setRadius(0);
                txtName.setBackground(new Color(0x191b20));

                //---- label9 ----
                label9.setText("H\u1ecd t\u00ean");
                label9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- txtDob ----
                txtDob.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                txtDob.setBackground(new Color(0x191b20));

                //---- label10 ----
                label10.setText("Ng\u00e0y Sinh");
                label10.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- cboSex ----
                cboSex.setBackground(new Color(0x191b20));

                //---- label11 ----
                label11.setText("Gi\u1edbi t\u00ednh");
                label11.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

                //---- txtNameAccount ----
                txtNameAccount.setForcusColor(new Color(0x0c8ce9));
                txtNameAccount.setNoForcusColor(new Color(0x191b20));
                txtNameAccount.setStartGradientColor(new Color(0x191b20));
                txtNameAccount.setEndGradientColor(new Color(0x191b20));
                txtNameAccount.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                txtNameAccount.setRadius(0);
                txtNameAccount.setBackground(new Color(0x252730));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(lbl123, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNameAccount, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnChangeEmail, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(72, 72, 72))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 820, Short.MAX_VALUE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addGroup(panel2Layout.createParallelGroup()
                                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panel2Layout.createParallelGroup()
                                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDob, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
                                            .addGap(184, 184, 184)
                                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(label11, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(cboSex, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                        .addComponent(txtUUID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                            .addGroup(panel2Layout.createParallelGroup()
                                                .addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                            .addGap(80, 80, 80)
                                            .addGroup(panel2Layout.createParallelGroup()
                                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panel2Layout.createSequentialGroup()
                                                    .addComponent(txtJoinDate, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnChangePassword, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))))
                                    .addContainerGap(72, Short.MAX_VALUE))))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(lbl123, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNameAccount, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnChangeEmail, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(59, 59, 59)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJoinDate, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChangePassword, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUUID, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboSex, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(txtDob, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(25, Short.MAX_VALUE))
                );
            }

            //---- lblAvatar ----
            lblAvatar.setRadius(0);
            lblAvatar.setBackground(new Color(0x191b20));
            lblAvatar.setIcon(new ImageIcon(getClass().getResource("/icon/default_avatar.png")));

            //---- lblName ----
            lblName.setText("Tr\u1ecbnh V\u0103n Thu\u1eadt");
            lblName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblName.setHorizontalAlignment(SwingConstants.RIGHT);

            //---- label14 ----
            label14.setIcon(new ImageIcon(getClass().getResource("/icon/Dollar Coin.png")));

            //---- lblSoDuGame ----
            lblSoDuGame.setText("1.000.000.000.000");
            lblSoDuGame.setHorizontalAlignment(SwingConstants.RIGHT);
            lblSoDuGame.setFont(new Font("Inter", Font.BOLD, 16));
            lblSoDuGame.setForeground(Color.yellow);

            //---- lblSoDuDoanhThu ----
            lblSoDuDoanhThu.setText("1.000.000.000.000");
            lblSoDuDoanhThu.setHorizontalAlignment(SwingConstants.RIGHT);
            lblSoDuDoanhThu.setFont(new Font("Inter", Font.BOLD, 16));
            lblSoDuDoanhThu.setForeground(Color.blue);

            //---- label17 ----
            label17.setIcon(new ImageIcon(getClass().getResource("/icon/coin.png")));

            //---- btnBan ----
            btnBan.setText("Ban!");
            btnBan.setBackground(new Color(0x3e3737));
            btnBan.setOriginColor(new Color(0x3e3737));
            btnBan.setHoverColor(new Color(0x9d2424));
            btnBan.setRadius(5);
            btnBan.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- btnUpdate ----
            btnUpdate.setText("Update");
            btnUpdate.setBackground(new Color(0x35452a));
            btnUpdate.setHoverColor(new Color(0x429509));
            btnUpdate.setOriginColor(new Color(0x35452a));
            btnUpdate.setRadius(5);
            btnUpdate.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- btnCancel ----
            btnCancel.setText("Cancel");
            btnCancel.setBackground(new Color(0x3e3737));
            btnCancel.setOriginColor(new Color(0x3e3737));
            btnCancel.setHoverColor(new Color(0x999999));
            btnCancel.setRadius(5);
            btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
                                        .addGap(342, 342, 342)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                .addComponent(lblSoDuGame, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblName, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                .addComponent(lblSoDuDoanhThu, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(label17)))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(lblSoDuDoanhThu, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoDuGame, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBan, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 1108, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 744, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }
    private void initialize() {
        btnChangePassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ChangePassword(MFrame.gI()).setVisible(true);
            }
        });
        lblAvatar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeAvatar();
            }
        });
        btnUpdate.addActionListener(e -> updateAction());
        txtNameAccount.setEnabled(false);
        txtEmail.setEnabled(false);
        txtNameAccount.setDisabledTextColor(Color.white);
        txtEmail.setDisabledTextColor(Color.white);
        txtUUID.setDisabledTextColor(Color.white);
        txtJoinDate.setDisabledTextColor(Color.white);
        txtJoinDate.setEnabled(false);
        txtUUID.setEnabled(false);
        fillSexCbo();
        loadInfo();
//        btnChangeEmail.addActionListener(e -> updateEmail());
    }

//    private void updateEmail() {
//    }

    private void loadInfo() {
        Account account = SessionManager.user;
        lblName.setText(account.getHoTen());
        lblSoDuDoanhThu.setText(account.getSoDuThuNhap() + "");
        lblSoDuGame.setText(account.getSoDuGame() + "");
        lblAvatar.setSize(new Dimension(120, 120));
        if(account.getAvatar() != null && !account.getAvatar().isEmpty()) {
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon("data/avatars/" + account.getId() + "/" + account.getAvatar()),lblAvatar));
        }
        else {
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")),lblAvatar));
        }
        txtNameAccount.setText(account.getUsername());
        txtEmail.setText(account.getEmail());
        txtPhoneNumber.setText(account.getPhone());
        txtJoinDate.setText(account.getNgayTao().toString());
        txtUUID.setText(account.getId().toString());
        txtName.setText(account.getHoTen());
        txtDob.getDatePicker().setSelectedDate(account.getDob().toLocalDate());
        cboSex.setSelectedItem(account.getGioiTinh());
    }

    public void setTxtEmail(String email) {
        txtEmail.setText(email);
    }

    private void fillSexCbo() {
        cboSex.addItem("Nam");
        cboSex.addItem("Nữ");
        cboSex.addItem("Khác");
    }

    private void changeAvatar() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        XImage.imageFileFilter(fileChooser);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(path), lblAvatar));
            lblAvatar.setToolTipText(path);
        }
    }

    private void updateAction() {
        String msg = "";
        String oldAvatar = SessionManager.user.getAvatar();
        if(txtEmail.getText().isBlank() || txtName.getText().isBlank() ||
                txtPhoneNumber.getText().isBlank() || txtDob.getDatePicker().getSelectedDate() == null) {
            msg += "Vui lòng nhập đầy đủ thông tin\n";
        }
        if(!XRegex.isPhone(txtPhoneNumber.getText())) {
            msg += "Số điện thoại không hợp lệ\n";
        }
        if(!msg.isBlank()) {
            JOptionPane.showMessageDialog(this, msg, "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Account account = SessionManager.user;
        account.setHoTen(txtName.getText());
        account.setDob(Date.valueOf(txtDob.getDatePicker().getSelectedDate()));
        account.setGioiTinh(cboSex.getSelectedIndex());
        account.setPhone(txtPhoneNumber.getText());

        String avatar = lblAvatar.getToolTipText();
        if(avatar != null && !avatar.isEmpty()) {
            account.setAvatar(new File(avatar).getName());
        }
        if(AccountDAO.gI().updatePersonalInfo(account) > 0) {
            if (avatar != null && !avatar.isEmpty()) {
                AzureBlobService.upload(avatar,"avatars/" + account.getId() + "/" + new File(avatar).getName(),"images");
                AzureBlobService.delete("avatars/" + account.getId() + "/" + oldAvatar,"images");
                XFile.copyFile(avatar,"data/avatars/" + account.getId() + "/" + new File(avatar).getName());
                new File("data/avatasr/" + account.getId() + "/" + oldAvatar).deleteOnExit();
            }
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            SessionManager.user = account;
            HeaderPanel.gI().updateAccount();
        }
        else {
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

//    private void updateEmail() {
//        new ChangeEmail(MFrame.getInstance(), this).setVisible(true);
//    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JPanel panel2;
    private JLabel lbl123;
    private JLabel label5;
    private RadiusTextField txtEmail;
    private RadiusButton btnChangeEmail;
    private JLabel label6;
    private JLabel label7;
    private RadiusTextField txtPhoneNumber;
    private RadiusTextField txtJoinDate;
    private RadiusButton btnChangePassword;
    private RadiusTextField txtUUID;
    private JLabel label8;
    private RadiusTextField txtName;
    private JLabel label9;
    private DateTimeTextField txtDob;
    private JLabel label10;
    private JComboBox cboSex;
    private JLabel label11;
    private RadiusTextField txtNameAccount;
    private RadiusLabel lblAvatar;
    private JLabel lblName;
    private JLabel label14;
    private JLabel lblSoDuGame;
    private JLabel lblSoDuDoanhThu;
    private JLabel label17;
    private RadiusButton btnBan;
    private RadiusButton btnUpdate;
    private RadiusButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
