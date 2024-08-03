/*
 * Created by JFormDesigner on Wed Jul 10 16:42:34 ICT 2024
 */

package steamfake.view.withdrawmoney;

import steamfake.dao.RutTienDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusLabel;
import steamfake.graphics.RadiusTextField;
import steamfake.model.BankAccount;
import steamfake.model.PhieuRutNganHang;
import steamfake.model.PhieuRutTien;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author ACER
 */
public class WithdrawMoneyPanel extends JPanel {
    
    public WithdrawMoneyPanel() {
        initComponents();
        scrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        panel2 = new JPanel();
        txtWithdrawMoney = new RadiusTextField();
        label1 = new JLabel();
        lblBalance = new JLabel();
        label3 = new JLabel();
        btn100k = new RadiusButton();
        btn200k = new RadiusButton();
        btn400k = new RadiusButton();
        btn2m = new RadiusButton();
        btn1m = new RadiusButton();
        btnJack = new RadiusButton();
        label4 = new JLabel();
        lblGameBalance = new RadiusLabel();
        lblBank = new RadiusLabel();
        cboBank = new JComboBox();
        label5 = new JLabel();
        btnConfirm = new RadiusButton();
        panel3 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        scrollPane1 = new JScrollPane();
        historyPanel = new JPanel();

        //======== this ========
        setBackground(new Color(0x191b20));
        setMaximumSize(new Dimension(1141, 766));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));
            panel1.setMaximumSize(new Dimension(1129, 685));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(0x191b20));
                panel2.setMaximumSize(new Dimension(479, 630));

                //---- txtWithdrawMoney ----
                txtWithdrawMoney.setRadius(7);
                txtWithdrawMoney.setFont(new Font("Inter", Font.PLAIN, 20));
                txtWithdrawMoney.setPlaceholder("Nh\u1eadp s\u1ed1 ti\u1ec1n mu\u1ed1n r\u00fat(\u0111)");
                txtWithdrawMoney.setHorizontalAlignment(SwingConstants.LEFT);
                txtWithdrawMoney.setStartGradientColor(new Color(0x191b20));
                txtWithdrawMoney.setEndGradientColor(new Color(0x191b20));
                txtWithdrawMoney.setForcusColor(new Color(0x0c8ce9));
                txtWithdrawMoney.setBackground(new Color(0x191b20));

                //---- label1 ----
                label1.setText("S\u1ed1 d\u01b0 doanh thu :");
                label1.setFont(new Font("Inter", Font.PLAIN, 20));

                //---- lblBalance ----
                lblBalance.setText("0");
                lblBalance.setFont(new Font("Inter", Font.PLAIN, 20));
                lblBalance.setHorizontalAlignment(SwingConstants.RIGHT);

                //---- label3 ----
                label3.setText("Ch\u1ecdn nhanh s\u1ed1 ti\u1ec1n");
                label3.setFont(new Font("Inter", Font.PLAIN, 20));

                //---- btn100k ----
                btn100k.setText("100.000");
                btn100k.setRadius(5);
                btn100k.setFont(new Font("Inter", Font.BOLD, 16));
                btn100k.setBackground(new Color(0x252730));
                btn100k.setHoverColor(Color.darkGray);
                btn100k.setOriginColor(new Color(0x252730));

                //---- btn200k ----
                btn200k.setText("200.000");
                btn200k.setRadius(5);
                btn200k.setFont(new Font("Inter", Font.BOLD, 16));
                btn200k.setBackground(new Color(0x252730));
                btn200k.setHoverColor(Color.darkGray);
                btn200k.setOriginColor(new Color(0x252730));

                //---- btn400k ----
                btn400k.setText("500.000");
                btn400k.setRadius(5);
                btn400k.setFont(new Font("Inter", Font.BOLD, 16));
                btn400k.setBackground(new Color(0x252730));
                btn400k.setOriginColor(new Color(0x252730));
                btn400k.setHoverColor(Color.darkGray);

                //---- btn2m ----
                btn2m.setText("2.000.000");
                btn2m.setRadius(5);
                btn2m.setFont(new Font("Inter", Font.BOLD, 16));
                btn2m.setBackground(new Color(0x252730));
                btn2m.setHoverColor(Color.darkGray);
                btn2m.setOriginColor(new Color(0x252730));

                //---- btn1m ----
                btn1m.setText("1.000.000");
                btn1m.setRadius(5);
                btn1m.setFont(new Font("Inter", Font.BOLD, 16));
                btn1m.setBackground(new Color(0x252730));
                btn1m.setHoverColor(Color.darkGray);
                btn1m.setOriginColor(new Color(0x252730));

                //---- btnJack ----
                btnJack.setText("5.000.000");
                btnJack.setRadius(5);
                btnJack.setFont(new Font("Inter", Font.BOLD, 16));
                btnJack.setBackground(new Color(0x252730));
                btnJack.setOriginColor(new Color(0x252730));
                btnJack.setHoverColor(Color.darkGray);

                //---- label4 ----
                label4.setText("H\u00e3y ch\u1ecdn ph\u01b0\u01a1ng th\u1ee9c r\u00fat ti\u1ec1n");
                label4.setFont(new Font("Inter", Font.PLAIN, 20));

                //---- lblGameBalance ----
                lblGameBalance.setText("T\u00e0i kho\u1ea3n game");
                lblGameBalance.setIcon(new ImageIcon(getClass().getResource("/icon/Wallet.png")));
                lblGameBalance.setHorizontalAlignment(SwingConstants.LEFT);
                lblGameBalance.setFont(new Font("Inter", Font.BOLD, 18));
                lblGameBalance.setBackground(new Color(0x252730));
                lblGameBalance.setRadius(5);
                lblGameBalance.setOpaque(true);

                //---- lblBank ----
                lblBank.setText("Ng\u00e2n h\u00e0ng");
                lblBank.setIcon(new ImageIcon(getClass().getResource("/icon/Euro Bank Building.png")));
                lblBank.setHorizontalAlignment(SwingConstants.LEFT);
                lblBank.setFont(new Font("Inter", Font.BOLD, 18));
                lblBank.setBackground(new Color(0x252730));
                lblBank.setRadius(5);
                lblBank.setOpaque(true);

                //---- cboBank ----
                cboBank.setFont(new Font("Inter", Font.BOLD, 20));
                cboBank.setMaximumRowCount(5);
                cboBank.setBackground(new Color(0x252730));

                //---- label5 ----
                label5.setText("B\u1ea3o m\u1eadt tuy\u1ec7t \u0111\u1ed1i theo chu\u1ea9n cao nh\u1ea5t");
                label5.setIcon(new ImageIcon(getClass().getResource("/icon/Protect.png")));
                label5.setFont(new Font("Inter", Font.PLAIN, 12));

                //---- btnConfirm ----
                btnConfirm.setText("X\u00e1c nh\u1eadn");
                btnConfirm.setOriginColor(new Color(0x35452a));
                btnConfirm.setBackground(new Color(0x35452a));
                btnConfirm.setHoverColor(new Color(0x429509));
                btnConfirm.setRadius(5);

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(lblGameBalance, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBank, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(btn1m, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(btn2m, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(btnJack, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBalance, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtWithdrawMoney, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                            .addComponent(btn100k, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                            .addComponent(btn200k, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(btn400k, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))))
                                .addComponent(cboBank)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)))
                            .addContainerGap(27, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBalance))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtWithdrawMoney, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btn100k, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn400k, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn200k, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(btn1m, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2m, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnJack, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGameBalance, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBank, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(cboBank, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(26, Short.MAX_VALUE))
                );
            }

            //======== panel3 ========
            {
                panel3.setBackground(new Color(0x191b20));

                //---- label6 ----
                label6.setText("Ng\u00e0y r\u00fat");
                label6.setHorizontalAlignment(SwingConstants.CENTER);
                label6.setFont(new Font("Inter", Font.BOLD, 16));

                //---- label7 ----
                label7.setText("S\u1ed1 ti\u1ec1n r\u00fat");
                label7.setHorizontalAlignment(SwingConstants.CENTER);
                label7.setFont(new Font("Inter", Font.BOLD, 16));
                label7.setPreferredSize(new Dimension(73, 20));

                //---- label8 ----
                label8.setText("H\u00ecnh th\u1ee9c");
                label8.setHorizontalAlignment(SwingConstants.CENTER);
                label8.setFont(new Font("Inter", Font.BOLD, 16));
                label8.setPreferredSize(new Dimension(73, 20));

                //---- label9 ----
                label9.setText("Tr\u1ea1ng th\u00e1i");
                label9.setHorizontalAlignment(SwingConstants.CENTER);
                label9.setFont(new Font("Inter", Font.BOLD, 16));

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label7, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                );
            }

            //======== scrollPane1 ========
            {
                scrollPane1.setBorder(null);
                scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                //======== historyPanel ========
                {
                    historyPanel.setMaximumSize(new Dimension(1000, 10000));
                    historyPanel.setLayout(new BoxLayout(historyPanel, BoxLayout.Y_AXIS));
                }
                scrollPane1.setViewportView(historyPanel);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane1))
                        .addContainerGap(65, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 35, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JPanel panel2;
    private RadiusTextField txtWithdrawMoney;
    private JLabel label1;
    private JLabel lblBalance;
    private JLabel label3;
    private RadiusButton btn100k;
    private RadiusButton btn200k;
    private RadiusButton btn400k;
    private RadiusButton btn2m;
    private RadiusButton btn1m;
    private RadiusButton btnJack;
    private JLabel label4;
    private RadiusLabel lblGameBalance;
    private RadiusLabel lblBank;
    private JComboBox cboBank;
    private JLabel label5;
    private RadiusButton btnConfirm;
    private JPanel panel3;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JScrollPane scrollPane1;
    private JPanel historyPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private final List<PhieuRutTien> phieuRutTienList = RutTienDAO.gI().selectByAccountID(SessionManager.user);
    private Integer selectedMethod = null;

    private void initialize() {
        lblBalance.setText(SessionManager.user.getSoDuThuNhap() + "");
        fillWithdrawData();
        initEvent();
        initEffect();
        cboBank.setVisible(false);
    }

    private void initEvent() {
        btn100k.addActionListener(e -> btn100kActionPerformed());
        btn200k.addActionListener(e -> btn200kActionPerformed());
        btn400k.addActionListener(e -> btn500kActionPerformed());
        btn2m.addActionListener(e -> btn2mActionPerformed());
        btn1m.addActionListener(e -> btn1mActionPerformed());
        btnJack.addActionListener(e -> btnJackActionPerformed());
        btnConfirm.addActionListener(e -> btnConfirmActionPerformed());
    }

    private void btnConfirmActionPerformed() {
        String txtTienRut = txtWithdrawMoney.getText();
        if(selectedMethod == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phương thức rút tiền");
            return;
        }
        if(txtTienRut.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tiền muốn rút");
            return;
        }
        try {
            float soTienRut = Float.parseFloat(txtTienRut);
            if(soTienRut < 10000 || soTienRut > SessionManager.user.getSoDuThuNhap()) {
                JOptionPane.showMessageDialog(this, "Số tiền phải lớn hơn 10.000 và nhỏ hơn số dư tài khoản");
                return;
            }
            PhieuRutNganHang phieuRutTien = new PhieuRutNganHang();
            phieuRutTien.setSoTienRut(soTienRut);
            phieuRutTien.setId(UUID.randomUUID());
            phieuRutTien.setAccountID(SessionManager.user.getId());
            phieuRutTien.setNgayRut(new Date(System.currentTimeMillis()));
            phieuRutTien.setMethod(selectedMethod);
            if(selectedMethod == PhieuRutTien.METHOD_ATM) {
                BankAccount bankAccount = (BankAccount) cboBank.getSelectedItem();
                if(bankAccount == null) {
                    XMessage.notificate(MFrame.gI(), "Vui lòng chọn ngân hàng");
                    return;
                } else {
                    phieuRutTien.setBankID(bankAccount.getBankID());
                    phieuRutTien.setSoTaiKhoan(bankAccount.getSoTaiKhoan());
                }
            }
            if (RutTienDAO.gI().insert(phieuRutTien) > 0) {
                addRow(phieuRutTien);
                SessionManager.user.setSoDuThuNhap(SessionManager.user.getSoDuThuNhap() - soTienRut);
                lblBalance.setText(SessionManager.user.getSoDuThuNhap() + "");
                XMessage.notificate(MFrame.gI(), "Đã tạo lệnh rút tiền");
            } else {
                XMessage.notificate(MFrame.gI(), "Rút tiền thất bại");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số tiền rút không hợp lệ");
        }

    }

    private void fillCboNganHang() {
        SwingUtilities.invokeLater(() -> {
            cboBank.removeAllItems();
            for(BankAccount bankAccount : SessionManager.bankAccountList) {
                cboBank.addItem(bankAccount);
            }
        });
    }

    private void initEffect() {
        lblBank.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chooseBankMethod();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblBank.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblBank.setBackground(new Color(0x252730));
            }
        });

        lblGameBalance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chooseGameMethod();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblGameBalance.setBackground(Color.GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblGameBalance.setBackground(new Color(0x252730));
            }
        });
    }

    private void btn100kActionPerformed() {
        txtWithdrawMoney.setText("100000");
    }

    private void btn200kActionPerformed() {
        txtWithdrawMoney.setText("200000");
    }

    private void btn500kActionPerformed() {
        txtWithdrawMoney.setText("500000");
    }

    private void btn2mActionPerformed() {
        txtWithdrawMoney.setText("2000000");
    }

    private void btn1mActionPerformed() {
        txtWithdrawMoney.setText("1000000");
    }

    private void btnJackActionPerformed() {
        txtWithdrawMoney.setText("5000000");
    }

    private void chooseBankMethod() {
        lblBank.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.WHITE));
        lblGameBalance.setBorder(null);
        selectedMethod = PhieuRutTien.METHOD_ATM;
        SessionManager.loadBankAccountList();
        if (cboBank.getItemCount() == 0) {
            fillCboNganHang();
        }
        cboBank.setVisible(true);
    }

    private void chooseGameMethod() {
        lblGameBalance.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.WHITE));
        lblBank.setBorder(null);
        selectedMethod = PhieuRutTien.METHOD_GAME;
        cboBank.setVisible(false);
    }

    private void fillWithdrawData() {
        for(PhieuRutTien phieuRutTien : phieuRutTienList) {
            addRow(phieuRutTien);
        }
    }

    private void addRow(PhieuRutTien phieuRutTien) {
        WithdrawInfoItem data = new WithdrawInfoItem();
        data.getColNgayRut().setText(phieuRutTien.getNgayRut().toString());
        data.getColSoTien().setText(phieuRutTien.getSoTienRut() + "");
        data.getColType().setText(phieuRutTien.getMethod() == PhieuRutTien.METHOD_ATM ? "Ngân hàng" : "Tài khoản game");
        if(phieuRutTien.getTrangThai() == PhieuRutTien.ACCEPTED) {
            data.getColStatus().setText("Thành công");
            data.getColStatus().setForeground(Color.GREEN);
        } else if(phieuRutTien.getTrangThai() == PhieuRutTien.REJECTED) {
            data.getColStatus().setText("Từ chối");
            data.getColStatus().setForeground(Color.RED);
        } else {
            data.getColStatus().setText("Đang chờ");
            data.getColStatus().setForeground(Color.YELLOW);
        }
        historyPanel.add(data);
        historyPanel.repaint();
        historyPanel.revalidate();
    }

}
