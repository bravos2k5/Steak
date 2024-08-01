/*
 * Created by JFormDesigner on Tue Jul 30 23:56:07 ICT 2024
 */

package steamfake.view.admin.withdrawmoney;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import steamfake.dao.AccountDAO;
import steamfake.dao.RutTienDAO;
import steamfake.graphics.*;
import steamfake.model.Account;
import steamfake.model.PhieuRutTien;
import steamfake.utils.XMessage;

/**
 * @author ACER
 */
public class PreviewWithdraw extends JDialog {
    private final PhieuRutTien phieuRutTien;
    private final Account account;
    private final WithdrawManagement withdrawManagement;

    public PreviewWithdraw(Window owner, PhieuRutTien phieuRutTien, Account account, WithdrawManagement withdrawManagement) {
        super(owner);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.withdrawManagement = withdrawManagement;
        this.phieuRutTien = phieuRutTien;
        this.account = account;
        initComponents();
        initialize();
        initEvent();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        txtIDAccout = new RadiusTextField();
        lbl123 = new JLabel();
        txtUserName = new RadiusTextField();
        lbl124 = new JLabel();
        txtMethod = new RadiusTextField();
        lbl125 = new JLabel();
        txtPrice = new RadiusTextField();
        lbl126 = new JLabel();
        txtStatus = new RadiusTextField();
        lbl127 = new JLabel();
        lbl128 = new JLabel();
        txtFullName = new RadiusTextField();
        btnCancel = new RadiusButton();
        btnReject = new RadiusButton();
        btnAccept = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- txtIDAccout ----
        txtIDAccout.setForcusColor(new Color(0x0c8ce9));
        txtIDAccout.setNoForcusColor(new Color(0x191b20));
        txtIDAccout.setStartGradientColor(new Color(0x191b20));
        txtIDAccout.setEndGradientColor(new Color(0x191b20));
        txtIDAccout.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtIDAccout.setRadius(0);
        txtIDAccout.setBackground(new Color(0x252730));
        txtIDAccout.setEditable(false);
        txtIDAccout.setEnabled(false);

        //---- lbl123 ----
        lbl123.setText("ID Account");
        lbl123.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- txtUserName ----
        txtUserName.setForcusColor(new Color(0x0c8ce9));
        txtUserName.setNoForcusColor(new Color(0x191b20));
        txtUserName.setStartGradientColor(new Color(0x191b20));
        txtUserName.setEndGradientColor(new Color(0x191b20));
        txtUserName.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtUserName.setRadius(0);
        txtUserName.setBackground(new Color(0x252730));
        txtUserName.setEditable(false);
        txtUserName.setEnabled(false);

        //---- lbl124 ----
        lbl124.setText("T\u00ean t\u00e0i kho\u1ea3n");
        lbl124.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- txtMethod ----
        txtMethod.setForcusColor(new Color(0x0c8ce9));
        txtMethod.setNoForcusColor(new Color(0x191b20));
        txtMethod.setStartGradientColor(new Color(0x191b20));
        txtMethod.setEndGradientColor(new Color(0x191b20));
        txtMethod.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtMethod.setRadius(0);
        txtMethod.setBackground(new Color(0x252730));
        txtMethod.setEditable(false);
        txtMethod.setEnabled(false);

        //---- lbl125 ----
        lbl125.setText("HInh Thuc");
        lbl125.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- txtPrice ----
        txtPrice.setForcusColor(new Color(0x0c8ce9));
        txtPrice.setNoForcusColor(new Color(0x191b20));
        txtPrice.setStartGradientColor(new Color(0x191b20));
        txtPrice.setEndGradientColor(new Color(0x191b20));
        txtPrice.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtPrice.setRadius(0);
        txtPrice.setBackground(new Color(0x252730));
        txtPrice.setEditable(false);
        txtPrice.setEnabled(false);

        //---- lbl126 ----
        lbl126.setText("S\u1ed1 ti\u1ec1n");
        lbl126.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- txtStatus ----
        txtStatus.setForcusColor(new Color(0x0c8ce9));
        txtStatus.setNoForcusColor(new Color(0x191b20));
        txtStatus.setStartGradientColor(new Color(0x191b20));
        txtStatus.setEndGradientColor(new Color(0x191b20));
        txtStatus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtStatus.setRadius(0);
        txtStatus.setBackground(new Color(0x252730));
        txtStatus.setEditable(false);
        txtStatus.setEnabled(false);

        //---- lbl127 ----
        lbl127.setText("Trang Thai");
        lbl127.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- lbl128 ----
        lbl128.setText("H\u1ecd t\u00ean");
        lbl128.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- txtFullName ----
        txtFullName.setForcusColor(new Color(0x0c8ce9));
        txtFullName.setNoForcusColor(new Color(0x191b20));
        txtFullName.setStartGradientColor(new Color(0x191b20));
        txtFullName.setEndGradientColor(new Color(0x191b20));
        txtFullName.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtFullName.setRadius(0);
        txtFullName.setBackground(new Color(0x252730));
        txtFullName.setEditable(false);
        txtFullName.setEnabled(false);

        //---- btnCancel ----
        btnCancel.setText("Cancel");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(Color.gray);

        //---- btnReject ----
        btnReject.setText("T\u1eeb ch\u1ed1i");
        btnReject.setHorizontalAlignment(SwingConstants.CENTER);
        btnReject.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnReject.setBackground(new Color(0x3e3737));
        btnReject.setOriginColor(new Color(0x3e3737));
        btnReject.setRadius(5);
        btnReject.setHoverColor(new Color(0x9d2424));

        //---- btnAccept ----
        btnAccept.setText("Duy\u1ec7t");
        btnAccept.setHorizontalAlignment(SwingConstants.CENTER);
        btnAccept.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnAccept.setBackground(new Color(0x35452a));
        btnAccept.setHoverColor(new Color(0x429509));
        btnAccept.setOriginColor(new Color(0x35452a));
        btnAccept.setRadius(5);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReject, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl126, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl128, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl124, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl123, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIDAccout, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                        .addComponent(txtUserName, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                        .addComponent(txtFullName, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(lbl125, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMethod, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtStatus, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(lbl127, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addComponent(txtPrice, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                    .addContainerGap(47, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(lbl123, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtIDAccout, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl124, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl128, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtFullName, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(lbl125, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMethod, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(lbl127, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(lbl126, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReject, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private void initialize() {
        txtIDAccout.setText(phieuRutTien.getAccountID() + "");
        txtUserName.setText(account.getUsername());
        txtFullName.setText(account.getHoTen());
        String status = switch (phieuRutTien.getTrangThai()) {
            case PhieuRutTien.PENDING -> "Chưa duyet";
            case PhieuRutTien.ACCEPTED -> "Dã duyet";
            case PhieuRutTien.REJECTED -> "Từ Chối";
            default -> "";
        };
        txtStatus.setText(status);
        String method = switch (phieuRutTien.getMethod()) {
            case PhieuRutTien.METHOD_ATM -> "ATM";
            case PhieuRutTien.METHOD_GAME -> "TK Game";
            default -> "";
        };
        txtMethod.setText(method);
        txtPrice.setText(phieuRutTien.getSoTienRut() + "");
    }

    private void initEvent() {
        btnAccept.addActionListener(e -> acceptWithdraw(PhieuRutTien.ACCEPTED));
        btnReject.addActionListener(e -> acceptWithdraw(PhieuRutTien.REJECTED));
        btnCancel.addActionListener(e -> {
            dispose();
        });

    }

    private void acceptWithdraw(int status) {
        if (status == PhieuRutTien.ACCEPTED) {
            if (RutTienDAO.gI().updateStatus(phieuRutTien, PhieuRutTien.ACCEPTED) > 0) {
                XMessage.notificate(PreviewWithdraw.this, "Duyet Thanh cong");
                dispose();
            } else {
                XMessage.alert(PreviewWithdraw.this, "Duyet That Bai");
            }

        } else if (status == PhieuRutTien.REJECTED) {
            if (RutTienDAO.gI().rejectWithdraw(phieuRutTien) > 0) {
                XMessage.notificate(PreviewWithdraw.this, "Tu choi thanh cong");
                dispose();
            } else {
                XMessage.alert(PreviewWithdraw.this, "Tu choi That bai");
            }
        }

    }

    @Override
    public void dispose() {
        withdrawManagement.fillToWithdraw();
        super.dispose();
    }// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusTextField txtIDAccout;
    private JLabel lbl123;
    private RadiusTextField txtUserName;
    private JLabel lbl124;
    private RadiusTextField txtMethod;
    private JLabel lbl125;
    private RadiusTextField txtPrice;
    private JLabel lbl126;
    private RadiusTextField txtStatus;
    private JLabel lbl127;
    private JLabel lbl128;
    private RadiusTextField txtFullName;
    private RadiusButton btnCancel;
    private RadiusButton btnReject;
    private RadiusButton btnAccept;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
