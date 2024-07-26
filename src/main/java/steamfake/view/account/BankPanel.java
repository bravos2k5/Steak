/*
 * Created by JFormDesigner on Wed Jul 24 07:28:18 ICT 2024
 */

package steamfake.view.account;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.StaticData;
import steamfake.dao.BankAccountDAO;
import steamfake.dao.BankDAO;
import steamfake.graphics.*;
import steamfake.model.Bank;
import steamfake.model.BankAccount;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * @author ACER
 */
public class
BankPanel extends JDialog {

    private boolean isEditing = false;

    public BankPanel(Window owner) {
        super(owner);
        initComponents();
        this.getContentPane().setBackground(new Color(0x191b20));

        initialize();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        cbbNameBank = new JComboBox();
        btnDelete = new RadiusButton();
        btnAdd = new RadiusButton();
        txtNumber = new RadiusTextField();
        lbl123 = new JLabel();
        lbl124 = new JLabel();
        lbl125 = new JLabel();
        txtName = new RadiusTextField();
        btnUpdate = new RadiusButton();

        //======== this ========
        setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        var contentPane = getContentPane();

        //---- cbbNameBank ----
        cbbNameBank.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        cbbNameBank.setBackground(new Color(0x252730));

        //---- btnDelete ----
        btnDelete.setText("X\u00f3a");
        btnDelete.setBackground(new Color(0x3e3737));
        btnDelete.setOriginColor(new Color(0x3e3737));
        btnDelete.setHoverColor(new Color(0x9d2424));
        btnDelete.setRadius(5);
        btnDelete.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //---- btnAdd ----
        btnAdd.setText("Th\u00eam");
        btnAdd.setBackground(new Color(0x35452a));
        btnAdd.setHoverColor(new Color(0x429509));
        btnAdd.setOriginColor(new Color(0x35452a));
        btnAdd.setRadius(5);
        btnAdd.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //---- txtNumber ----
        txtNumber.setForcusColor(new Color(0x0c8ce9));
        txtNumber.setNoForcusColor(new Color(0x191b20));
        txtNumber.setStartGradientColor(new Color(0x191b20));
        txtNumber.setEndGradientColor(new Color(0x191b20));
        txtNumber.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtNumber.setRadius(0);
        txtNumber.setBackground(new Color(0x252730));

        //---- lbl123 ----
        lbl123.setText("Ng\u00e2n h\u00e0ng");
        lbl123.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- lbl124 ----
        lbl124.setText("S\u1ed1 t\u00e0i kho\u1ea3n ");
        lbl124.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- lbl125 ----
        lbl125.setText("T\u00ean ng\u00e2n h\u00e0ng");
        lbl125.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        //---- txtName ----
        txtName.setForcusColor(new Color(0x0c8ce9));
        txtName.setNoForcusColor(new Color(0x191b20));
        txtName.setStartGradientColor(new Color(0x191b20));
        txtName.setEndGradientColor(new Color(0x191b20));
        txtName.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        txtName.setRadius(0);
        txtName.setBackground(new Color(0x252730));

        //---- btnUpdate ----
        btnUpdate.setText("C\u1eadp nh\u1eadt");
        btnUpdate.setBackground(new Color(0x35452a));
        btnUpdate.setHoverColor(new Color(0x429509));
        btnUpdate.setOriginColor(new Color(0x35452a));
        btnUpdate.setRadius(5);
        btnUpdate.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl125, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl123, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbbNameBank, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                        .addComponent(lbl124, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNumber, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                        .addComponent(txtName, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(lbl123, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbbNameBank, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl124, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbl125, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(43, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JComboBox cbbNameBank;
    private RadiusButton btnDelete;
    private RadiusButton btnAdd;
    private RadiusTextField txtNumber;
    private JLabel lbl123;
    private JLabel lbl124;
    private JLabel lbl125;
    private RadiusTextField txtName;
    private RadiusButton btnUpdate;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        initEvent();
    }

    private void initEvent() {
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!isEditing) {
                    isEditing = true;
                    btnAdd.setText("Save");
                    txtName.setVisible(false);
                    btnUpdate.setVisible(false);
                    lbl125.setVisible(false);
                    loadCBBAdd();
                } else {
                    addBankAccount();
                }

            }
        });
        btnDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isEditing) {
                    btnUpdate.setVisible(true);
                    txtName.setVisible(true);
                    isEditing = false;
                    lbl125.setVisible(true);
                    btnDelete.setText("Xoa");
                } else {

                }
            }
        });

    }


    private void update() {
        if (isString(txtNumber.getText())) {
            BankAccount bankAccount = (BankAccount) cbbNameBank.getSelectedItem();
            bankAccount.setSoTaiKhoan(txtNumber.getText());
            if (BankAccountDAO.gI().update(bankAccount) > 0) {
                XMessage.notificate(this, "Sua tai khoan thanh cong");
                loadCBBAccountBank();
            }
        }
        XMessage.alert(null, "Số tài khoản phải đủ 10 chữ số và không có chữ");
    }

    private void delete() {
        if (isString(txtNumber.getText())) {
            BankAccount bankAccount = (BankAccount) cbbNameBank.getSelectedItem();
            if (BankAccountDAO.gI().delete(bankAccount) > 0) {
                XMessage.notificate(this, "Sua tai khoan thanh cong");
                loadCBBAccountBank();
            }
        }
        XMessage.alert(null, "Số tài khoản phải đủ 10 chữ số và không có chữ");

    }

    private void loadCBBAccountBank() {
        BankAccountDAO.gI().selectByAccount(SessionManager.user).forEach(cbbNameBank::addItem);
    }

    private void loadCBBAdd() {
        StaticData.bankList.stream().filter(Bank::isStatus).forEach(cbbNameBank::addItem);
    }

    private void addBankAccount() {
        Bank bank = (Bank) cbbNameBank.getSelectedItem();
        if (isString(txtNumber.getText())) {
            if (bank != null) {
                BankAccount bankAccount = new BankAccount();
                bankAccount.setAccountID(SessionManager.user.getId());
                bankAccount.setSoTaiKhoan(txtNumber.getText().trim());
                bankAccount.setBankID(bank.getId());
                if (BankAccountDAO.gI().insert(bankAccount) > 0) {
                    XMessage.notificate(this, "Them ngan hang thanh cong");
                    loadCBBAdd();
                }
                XMessage.alert(this, "Thêm thất bại");
            }
        } else {
            XMessage.alert(null, "Số tài khoản phải đủ 10 chữ số và không có chữ");
        }

    }

    private boolean isString(String str) {
        return str.matches("\\d{10}");
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new BankPanel(null).setVisible(true);
    }
}
