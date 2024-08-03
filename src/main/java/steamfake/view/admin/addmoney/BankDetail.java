/*
 * Created by JFormDesigner on Mon Jul 15 21:07:27 ICT 2024
 */

package steamfake.view.admin.addmoney;

import steamfake.dao.NapTienDAO;
import steamfake.graphics.RadiusButton;
import steamfake.model.NapCK;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class BankDetail extends JDialog {

    private final NapCK napCK;
    private final AddMoneyManagement owner;

    public BankDetail(AddMoneyManagement owner, NapCK napCK) {
        super(owner);
        this.napCK = napCK;
        this.owner = owner;
        initComponents();
        txtID.setText(napCK.getId().toString());
        txtAccountID.setText(napCK.getAccountID().toString());
        txtHinhThuc.setText(napCK.getHinhThuc() == NapCK.MOMO ? "MOMO" : "Ngân hàng");
        btnAccept.addActionListener(e -> accept());
        btnCancel.addActionListener(e -> reject());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label2 = new JLabel();
        txtID = new JTextField();
        label3 = new JLabel();
        txtAccountID = new JTextField();
        label4 = new JLabel();
        txtHinhThuc = new JTextField();
        btnCancel = new RadiusButton();
        btnAccept = new RadiusButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        var contentPane = getContentPane();

        //---- label2 ----
        label2.setText("ID :");
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtID ----
        txtID.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label3 ----
        label3.setText("ID Account :");
        label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtAccountID ----
        txtAccountID.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label4 ----
        label4.setText("H\u00ecnh th\u1ee9c :");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtHinhThuc ----
        txtHinhThuc.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- btnCancel ----
        btnCancel.setText("T\u1eeb ch\u1ed1i");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(new Color(0x9d2424));

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
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtHinhThuc, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtAccountID, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(129, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 555, Short.MAX_VALUE)
                    .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(txtAccountID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHinhThuc, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(55, 55, 55)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label2;
    private JTextField txtID;
    private JLabel label3;
    private JTextField txtAccountID;
    private JLabel label4;
    private JTextField txtHinhThuc;
    private RadiusButton btnCancel;
    private RadiusButton btnAccept;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void accept() {
        napCK.setStatus(NapCK.ACCEPTED);
        int result = NapTienDAO.getInstance().acceptPhieuNap(napCK);
        if(result > 0) {
            owner.handleAfterWork(napCK);
            JOptionPane.showMessageDialog(this, "Duyệt thành công");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Duyệt thất bại");
        }
    }

    private void reject() {
        napCK.setStatus(NapCK.REJECTED);
        int result = NapTienDAO.getInstance().rejectPhieuNap(napCK);
        if(result > 0) {
            owner.handleAfterWork(napCK);
            JOptionPane.showMessageDialog(this, "Từ chối thành công");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Từ chối thất bại");
        }
    }

}
