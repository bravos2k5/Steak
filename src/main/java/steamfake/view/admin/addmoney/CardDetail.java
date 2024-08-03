/*
 * Created by JFormDesigner on Mon Jul 15 20:45:46 ICT 2024
 */

package steamfake.view.admin.addmoney;

import steamfake.dao.NapTienDAO;
import steamfake.graphics.RadiusButton;
import steamfake.model.NapCard;
import steamfake.model.NapTien;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class CardDetail extends JDialog {

    private final NapCard napCard;
    private AddMoneyManagement owner;

    public CardDetail(AddMoneyManagement owner, NapCard napCard) {
        super(owner);
        this.napCard = napCard;
        this.owner = owner;
        initComponents();
        initialize();
        btnAccept.addActionListener(e -> accept());
        btnReject.addActionListener(e -> reject());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label2 = new JLabel();
        txtID = new JTextField();
        label3 = new JLabel();
        txtAccountID = new JTextField();
        label4 = new JLabel();
        txtSecretKey = new JTextField();
        label5 = new JLabel();
        txtSeri = new JTextField();
        txtNhaMang = new JTextField();
        label6 = new JLabel();
        txtSoTienNap = new JTextField();
        label7 = new JLabel();
        btnReject = new RadiusButton();
        btnAccept = new RadiusButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
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
        label4.setText("M\u00e3 th\u1ebb :");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtSecretKey ----
        txtSecretKey.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label5 ----
        label5.setText("S\u1ed1 Seri");
        label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtSeri ----
        txtSeri.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- txtNhaMang ----
        txtNhaMang.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label6 ----
        label6.setText("Nh\u00e0 m\u1ea1ng");
        label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label6.setHorizontalAlignment(SwingConstants.CENTER);

        //---- txtSoTienNap ----
        txtSoTienNap.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label7 ----
        label7.setText("S\u1ed1 ti\u1ec1n");
        label7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        label7.setHorizontalAlignment(SwingConstants.CENTER);

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
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNhaMang, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(txtSecretKey, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtAccountID, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtSeri, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtSoTienNap, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(129, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 559, Short.MAX_VALUE)
                    .addComponent(btnReject, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24))
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
                        .addComponent(txtSecretKey, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSeri, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNhaMang, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoTienNap, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnReject, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27))
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
    private JTextField txtSecretKey;
    private JLabel label5;
    private JTextField txtSeri;
    private JTextField txtNhaMang;
    private JLabel label6;
    private JTextField txtSoTienNap;
    private JLabel label7;
    private RadiusButton btnReject;
    private RadiusButton btnAccept;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        String tenNhaMang;
        switch (napCard.getNhaMang()) {
            case 0 -> tenNhaMang = "Viettel";
            case 1 -> tenNhaMang = "Mobifone";
            case 2 -> tenNhaMang = "Vinaphone";
            case 3 -> tenNhaMang = "Vietnamobile";
            default -> tenNhaMang = "Khác";
        }

        txtID.setText(napCard.getId().toString());
        txtAccountID.setText(napCard.getAccountID().toString());
        txtSecretKey.setText(napCard.getSecretKey());
        txtSeri.setText(napCard.getSeri());
        txtNhaMang.setText(tenNhaMang);
        txtSoTienNap.setText(String.valueOf(napCard.getSoTien()));
    }

    private void accept() {
        napCard.setStatus(NapTien.ACCEPTED);
        int result = NapTienDAO.getInstance().acceptPhieuNap(napCard);
        if (result > 0) {
            owner.handleAfterWork(napCard);
            JOptionPane.showMessageDialog(this, "Duyệt thành công");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Duyệt thất bại");
        }
    }

    private void reject() {
        napCard.setStatus(NapTien.REJECTED);
        int result = NapTienDAO.getInstance().rejectPhieuNap(napCard);
        if (result > 0) {
            owner.handleAfterWork(napCard);
            JOptionPane.showMessageDialog(this, "Từ chối thành công");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Từ chối thất bại");
        }
    }

}
