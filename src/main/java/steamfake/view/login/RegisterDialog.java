/*
 * Created by JFormDesigner on Sat Jul 06 12:02:07 ICT 2024
 */

package steamfake.view.login;

import steamfake.dao.AccountDAO;
import steamfake.graphics.ButtonGradient;
import steamfake.graphics.DateTimeTextField;
import steamfake.graphics.OneRoundedPanel;
import steamfake.graphics.PanelBorder;
import steamfake.model.Account;
import steamfake.utils.*;
import steamfake.view.mainframe.HeaderPanel;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

/**
 * @author ADMIN
 */
public class RegisterDialog extends JDialog {

    public RegisterDialog(Window owner) {
        super(owner);
        initComponents();
        initialize();
    }

    private void lbQuayLaiMouseEntered(MouseEvent e) {
        lbQuayLai.setForeground(Color.WHITE);
        lbQuayLai.setText("<html><u>Quay lai</u></html>");
    }

    private void lbQuayLaiMouseExited(MouseEvent e) {
        lbQuayLai.setForeground(Color.decode("#6f6f6f"));
        lbQuayLai.setText("<html>Quay lai</html>");
    }

    private void lbQuayLaiMouseClicked(MouseEvent e) {
        LoginDialog LoginDialog = new LoginDialog(MFrame.gI());
        RegisterDialog.this.dispose();
        LoginDialog.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelBorder1 = new PanelBorder();
        oneRoundedPanel1 = new OneRoundedPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        txtTaiKhoan = new JTextField();
        label5 = new JLabel();
        txtHoTen = new JTextField();
        label6 = new JLabel();
        txtMk = new JPasswordField();
        label7 = new JLabel();
        txtNhapLaiMk = new JPasswordField();
        label8 = new JLabel();
        txtNgaySinh = new DateTimeTextField();
        label9 = new JLabel();
        txtEmail = new JTextField();
        label10 = new JLabel();
        txtNhapMa = new JTextField();
        btnDangKy = new ButtonGradient();
        lbQuayLai = new JLabel();
        btnGui = new JButton();
        lblUsernameStatus = new JLabel();
        label11 = new JLabel();
        lblPasswordStatus = new JLabel();
        lblPasswordStatus2 = new JLabel();
        lblDobStatus = new JLabel();
        lblEmailStatus = new JLabel();
        lblNhapMaStatus = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        var contentPane = getContentPane();

        //======== panelBorder1 ========
        {
            panelBorder1.setBackground(new Color(0x191b20));

            //======== oneRoundedPanel1 ========
            {

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/icon/Steambig.png")));
                label1.setBackground(Color.black);

                //---- label2 ----
                label2.setText("Register");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 62));
                label2.setForeground(Color.white);

                GroupLayout oneRoundedPanel1Layout = new GroupLayout(oneRoundedPanel1);
                oneRoundedPanel1.setLayout(oneRoundedPanel1Layout);
                oneRoundedPanel1Layout.setHorizontalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGroup(oneRoundedPanel1Layout.createParallelGroup()
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(label2))
                                .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(42, Short.MAX_VALUE))
                );
                oneRoundedPanel1Layout.setVerticalGroup(
                    oneRoundedPanel1Layout.createParallelGroup()
                        .addGroup(oneRoundedPanel1Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //---- label3 ----
            label3.setText("Register Account");
            label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));

            //---- label4 ----
            label4.setText("T\u00e0i kho\u1ea3n:");
            label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label5 ----
            label5.setText("H\u1ecd t\u00ean:");
            label5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label6 ----
            label6.setText("M\u1eadt kh\u1ea9u:");
            label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label7 ----
            label7.setText("Nh\u1eadp l\u1ea1i m\u1eadt kh\u1ea9u:");
            label7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label8 ----
            label8.setText("Ng\u00e0y sinh:");
            label8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label9 ----
            label9.setText("Email:");
            label9.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label10 ----
            label10.setText("Nh\u1eadp m\u00e3:");
            label10.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- btnDangKy ----
            btnDangKy.setText("\u0110\u0103ng k\u00fd");
            btnDangKy.setColor1(new Color(0x8a8a8a));
            btnDangKy.setColor2(new Color(0x393939));
            btnDangKy.setSizeSpeed(20.0F);
            btnDangKy.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            btnDangKy.setForeground(new Color(0x191b20));

            //---- lbQuayLai ----
            lbQuayLai.setText("Quay l\u1ea1i");
            lbQuayLai.setForeground(new Color(0x6f6f6f));
            lbQuayLai.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    lbQuayLaiMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    lbQuayLaiMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    lbQuayLaiMouseExited(e);
                }
            });

            //---- btnGui ----
            btnGui.setText("G\u1eedi");

            //---- lblUsernameStatus ----
            lblUsernameStatus.setText("T\u00ean d\u00f9ng \u0111\u1ec3 \u0111\u0103ng nh\u1eadp");

            //---- label11 ----
            label11.setText("H\u1ecd t\u00ean hi\u1ec3n th\u1ecb");

            //---- lblPasswordStatus ----
            lblPasswordStatus.setText("M\u1eadt kh\u1ea9u \u0111\u0103ng nh\u1eadp");

            //---- lblPasswordStatus2 ----
            lblPasswordStatus2.setText("Nh\u1eadp l\u1ea1i y chang \u1edf tr\u00ean");

            //---- lblDobStatus ----
            lblDobStatus.setText("Nh\u1eadp \u0111i t\u00f4i coi b\u00f3i cho b\u1ea1n");

            //---- lblEmailStatus ----
            lblEmailStatus.setText("Email kh\u00f4i ph\u1ee5c t\u00e0i kho\u1ea3n");

            //---- lblNhapMaStatus ----
            lblNhapMaStatus.setText("\u1ea4n g\u1eedi \u0111\u1ec3 nh\u1eadn m\u00e3 x\u00e1c th\u1ef1c");

            GroupLayout panelBorder1Layout = new GroupLayout(panelBorder1);
            panelBorder1.setLayout(panelBorder1Layout);
            panelBorder1Layout.setHorizontalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(oneRoundedPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                        .addComponent(label10)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(lblNhapMaStatus))
                                    .addGroup(panelBorder1Layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(label4)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblUsernameStatus))
                                            .addComponent(txtTaiKhoan)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(label5)
                                                .addGap(40, 40, 40)
                                                .addComponent(label11))
                                            .addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(label6)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPasswordStatus))
                                            .addComponent(txtMk)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(label7)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPasswordStatus2))
                                            .addComponent(txtNhapLaiMk, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label8))
                                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                            .addComponent(label9)
                                            .addGap(47, 47, 47)
                                            .addComponent(lblEmailStatus))
                                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                            .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbQuayLai)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblDobStatus)
                                .addContainerGap())
                            .addGroup(GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(150, 150, 150))))
            );
            panelBorder1Layout.setVerticalGroup(
                panelBorder1Layout.createParallelGroup()
                    .addComponent(oneRoundedPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(lblUsernameStatus))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label11))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(lblPasswordStatus))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(lblPasswordStatus2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhapLaiMk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label8)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDobStatus))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(lblEmailStatus))
                        .addGap(5, 5, 5)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGui, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10)
                            .addComponent(lblNhapMaStatus)
                            .addComponent(txtNhapMa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup()
                            .addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuayLai))
                        .addGap(60, 60, 60))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panelBorder1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panelBorder1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private PanelBorder panelBorder1;
    private OneRoundedPanel oneRoundedPanel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField txtTaiKhoan;
    private JLabel label5;
    private JTextField txtHoTen;
    private JLabel label6;
    private JPasswordField txtMk;
    private JLabel label7;
    private JPasswordField txtNhapLaiMk;
    private JLabel label8;
    private DateTimeTextField txtNgaySinh;
    private JLabel label9;
    private JTextField txtEmail;
    private JLabel label10;
    private JTextField txtNhapMa;
    private ButtonGradient btnDangKy;
    private JLabel lbQuayLai;
    private JButton btnGui;
    private JLabel lblUsernameStatus;
    private JLabel label11;
    private JLabel lblPasswordStatus;
    private JLabel lblPasswordStatus2;
    private JLabel lblDobStatus;
    private JLabel lblEmailStatus;
    private JLabel lblNhapMaStatus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on




    private String verifyCode;
    private String verifyEmail;
    private long lastSendTime;

    private void initialize() {
        autoCheckForm();
        btnDangKy.addActionListener(e -> registerAction());
        btnGui.addActionListener(e -> sendCode());
    }

    private void registerAction() {
        String username = txtTaiKhoan.getText();
        String password = new String(txtMk.getPassword());
        String hoTen = txtHoTen.getText();
        String email = txtEmail.getText();
        LocalDate dob = txtNgaySinh.getDatePicker().getSelectedDate();
        String code = txtNhapMa.getText();
        if(verifyCode != null) {
            if(!code.equals(verifyCode)) {
                JOptionPane.showMessageDialog(this,"Mã xác thực không đúng");
                return;
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Vui lòng gửi mã xác thực");
            return;
        }
        if(!verifyEmail.equals(email)) {
            JOptionPane.showMessageDialog(this,"Email không khớp, bịp à =))");
            return;
        }
        if(txtTaiKhoan.getText().isBlank() || txtHoTen.getText().isBlank() || txtMk.getPassword().length == 0
                || txtNhapLaiMk.getPassword().length == 0 || txtNgaySinh.getDatePicker().getSelectedDate() == null
                || txtEmail.getText().isBlank() || txtNhapMa.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,"Vui lòng điền đầy đủ thông tin");
            return;
        }
        if(lblUsernameStatus.getText().isBlank() && lblPasswordStatus.getForeground() != Color.RED
                && lblPasswordStatus2.getText().isBlank() && lblDobStatus.getText().isBlank()
                && lblEmailStatus.getText().isBlank() && lblNhapMaStatus.getText().isBlank()) {
            Account account = new Account(username, XSecurity.hashPassword(password));
            account.setId(UUID.randomUUID());
            account.setHoTen(hoTen);
            account.setEmail(email);
            account.setDob(Date.valueOf(dob));
            account.setGioiTinh(Account.OTHER);
            account.setNgayTao(new Date(System.currentTimeMillis()));
            if(AccountDAO.gI().isExistUsername(txtTaiKhoan.getText())) {
                lblUsernameStatus.setText("Username đã tồn tại");
                lblUsernameStatus.setForeground(Color.RED);
                return;
            }
            int result = AccountDAO.gI().register(account);
            if (result > 0) {
                JOptionPane.showMessageDialog(this,"Đăng ký thành công");
                RegisterDialog.this.dispose();
                SessionManager.user = account;
                HeaderPanel.gI().updateAccount();
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Vui lòng kiểm tra lại thông tin");
        }
    }

    private void sendCode() {
        if (System.currentTimeMillis() - lastSendTime > 180000){
            String email = txtEmail.getText();
            if(email.isBlank() && !XRegex.isEmail(email)) {
                XMessage.notificate(this,"Email không hợp lệ");
                return;
            }
            String code = new Random().nextInt(899999) + 100000 + "";
            XEmail.sendEmail(email,"SteaK Verification","Mã xác thực để đăng ký tài khoản của bạn là: " + "<b>" + code + "</b>");
            XMessage.notificate(this,"Đã gửi mã xác thực đến email của bạn");
            verifyCode = code;
            verifyEmail = email;
            lastSendTime = System.currentTimeMillis();
        }
        else {
            XMessage.notificate(this,"Vui lòng đợi 3 phút trước khi gửi lại");
        }
    }

    private void autoCheckForm() {
        txtTaiKhoan.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkUsername();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkUsername();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkUsername();
            }

            private void checkUsername() {
                if(txtTaiKhoan.getText().length() < 5) {
                    lblUsernameStatus.setText("Username phải >=5 ký tự");
                    lblUsernameStatus.setForeground(Color.RED);
                }
                else if(txtTaiKhoan.getText().length() > 32) {
                    lblUsernameStatus.setText("Username phải <=32 ký tự");
                    lblUsernameStatus.setForeground(Color.RED);
                }
                else {
                    lblUsernameStatus.setText("");
                }
            }

        });

        txtMk.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPassword();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPassword();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkPassword();
            }

            private void checkPassword() {
                String password = new String(txtMk.getPassword());
                int power = XRegex.checkPassword(password);
                if(power == XRegex.CANT_USE) {
                    lblPasswordStatus.setText("Mật khẩu không hợp lệ");
                    lblPasswordStatus.setForeground(Color.RED);
                }
                else if(power == XRegex.EASY) {
                    lblPasswordStatus.setText("Mật khẩu yếu");
                    lblPasswordStatus.setForeground(Color.ORANGE);
                }
                else if(power == XRegex.MEDIUM) {
                    lblPasswordStatus.setText("Mật khẩu trung bình");
                    lblPasswordStatus.setForeground(Color.YELLOW);
                }
                else if(power == XRegex.HARD) {
                    lblPasswordStatus.setText("Mật khẩu mạnh");
                    lblPasswordStatus.setForeground(Color.GREEN);
                }
            }
        });

        txtNhapLaiMk.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkSamePassword();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkSamePassword();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkSamePassword();
            }

            private void checkSamePassword() {
                String pass1 = Arrays.toString(txtMk.getPassword());
                String pass2 = Arrays.toString(txtNhapLaiMk.getPassword());
                if(!pass1.equals(pass2)) {
                    lblPasswordStatus2.setText("Mật khẩu không khớp");
                    lblPasswordStatus2.setForeground(Color.RED);
                }
                else {
                    lblPasswordStatus2.setText("");
                }
            }

        });

        txtEmail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkMail();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkMail();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkMail();
            }

            private void checkMail() {
                if(!XRegex.isEmail(txtEmail.getText())) {
                    lblEmailStatus.setText("Email không hợp lệ");
                    lblEmailStatus.setForeground(Color.RED);
                }
                else {
                    lblEmailStatus.setText("");
                }
            }

        });

        txtHoTen.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkName();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkName();
            }

            private void checkName() {
                if(txtHoTen.getText().isBlank()) {
                    label11.setText("Họ tên không được để trống");
                    label11.setForeground(Color.RED);
                }
                else {
                    label11.setText("");
                }
            }

        });

        txtNgaySinh.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkDob();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkDob();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkDob();
            }

            private void checkDob() {
                if(txtNgaySinh.getDatePicker().getSelectedDate() == null) {
                    lblDobStatus.setText("Ngày sinh không không hợp lệ");
                    lblDobStatus.setForeground(Color.RED);
                }
                else {
                    lblDobStatus.setText("");
                }
            }

        });

        txtNhapMa.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkCode();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkCode();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkCode();
            }

            private void checkCode() {
                if(txtNhapMa.getText().length() != 6) {
                    lblNhapMaStatus.setText("Mã gồm 6 ký tự");
                    lblNhapMaStatus.setForeground(Color.RED);
                }
                else {
                    lblNhapMaStatus.setText("");
                }
            }

        });

    }
}
