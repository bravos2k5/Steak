/*
 * Created by JFormDesigner on Thu Jul 18 06:48:21 ICT 2024
 */

package steamfake.view.account;

import steamfake.dao.AccountDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusTextField;
import steamfake.utils.SessionManager;
import steamfake.utils.XEmail;
import steamfake.utils.XMessage;
import steamfake.utils.XRegex;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author BRAVOS
 */
public class ChangeEmailDialog extends JDialog {
    private String otp = "";
    private String newEmail = "";
    private long lastSendOTP = 0;
    private final AccountPanel accountPanel;

    public ChangeEmailDialog(Window window, AccountPanel accountPanel) {
        super(window);
        this.accountPanel = accountPanel;
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        txtNewEmail = new RadiusTextField();
        btnSend = new RadiusButton();
        txtOTP = new RadiusTextField();
        btnSubmit = new RadiusButton();
        btnCancel = new RadiusButton();

        //======== this ========
        setName("\u0110\u1ed5i email");
        setModal(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //---- txtNewEmail ----
        txtNewEmail.setPlaceholder("Nh\u1eadp email m\u1edbi");
        txtNewEmail.setEndGradientColor(new Color(0x191b20));
        txtNewEmail.setStartGradientColor(new Color(0x191b20));
        txtNewEmail.setForcusColor(Color.cyan);

        //---- btnSend ----
        btnSend.setText("G\u1eedi m\u00e3");

        //---- txtOTP ----
        txtOTP.setPlaceholder("Nh\u1eadp m\u00e3 x\u00e1c th\u1ef1c g\u1eedi \u0111\u1ebfn email");
        txtOTP.setEndGradientColor(new Color(0x191b20));
        txtOTP.setStartGradientColor(new Color(0x191b20));
        txtOTP.setForcusColor(Color.cyan);

        //---- btnSubmit ----
        btnSubmit.setText("X\u00e1c nh\u1eadn");
        btnSubmit.setBackground(new Color(0x35452a));
        btnSubmit.setHoverColor(new Color(0x429509));
        btnSubmit.setOriginColor(new Color(0x35452a));
        btnSubmit.setRadius(5);
        btnSubmit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        //---- btnCancel ----
        btnCancel.setText("H\u1ee7y b\u1ecf");
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setHoverColor(new Color(0x9d2424));
        btnCancel.setRadius(5);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(txtOTP, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(txtNewEmail, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSend, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNewEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSend, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addComponent(txtOTP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusTextField txtNewEmail;
    private RadiusButton btnSend;
    private RadiusTextField txtOTP;
    private RadiusButton btnSubmit;
    private RadiusButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        btnSend.addActionListener(e -> sendOTP(txtNewEmail.getText()));
        btnSubmit.addActionListener(e -> changeEmail());
        btnCancel.addActionListener(e -> dispose());
    }

    private void changeEmail() {
        String email = txtNewEmail.getText();
        if(!XRegex.isEmail(email) || !email.equals(newEmail)) {
            XMessage.alert(this,"Email không hợp lệ");
            return;
        }
        if(!otp.equals(txtOTP.getText())) {
            XMessage.alert(this,"Mã xác thực không đúng");
            return;
        }
        if(AccountDAO.gI().changeEmail(SessionManager.user.getUsername(), email) > 0) {
            SessionManager.user.setEmail(email);
            accountPanel.setTxtEmail(email);
            XMessage.notificate(this,"Đổi email thành công");
        } else {
            XMessage.alert(this,"Đổi email thất bại");
        }
        dispose();
    }

    private void sendOTP(String email) {
        if (System.currentTimeMillis() - lastSendOTP > 60000){
            if (XRegex.isEmail(email)) {
                newEmail = email.trim();
                otp = new Random().nextInt(899999) + 100000 + "";
                XEmail.gI().sendEmail(email,"Xác thực email mới","Mã xác thực của bạn là: <b>" + otp + "</b>");
                lastSendOTP = System.currentTimeMillis();
                XMessage.notificate(this,"Đã gửi mã xác thực đến email của bạn");
            }
            else {
                XMessage.alert(this,"Email không hợp lệ");
            }
        }
        else {
            XMessage.alert(this,"Vui lòng đợi 1 phút trước khi gửi lại mã xác thực");
        }
    }

}
