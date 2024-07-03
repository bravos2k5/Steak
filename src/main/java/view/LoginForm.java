/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import controller.LoginController;
import rojerusan.*;

/**
 *
 * @author User
 */
public class LoginForm extends JFrame implements LoginController {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        Body = new JPanel();
        left = new JPanel();
        animationLogin = new JLabel();
        btnLogin = new RSMaterialButtonRectangle();
        jLabel1 = new JLabel();
        txtUsername = new JTextField();
        lms_icon = new JLabel();
        padding = new JLabel();
        txtPassword = new RSPasswordTextPlaceHolder();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel8 = new JLabel();
        jLabel7 = new JLabel();
        panel1 = new JPanel();
        lblForgot = new JLabel();
        lblRegister = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        var contentPane = getContentPane();

        //======== Body ========
        {
            Body.setBackground(new Color(0x1e1e1e));

            //======== left ========
            {
                left.setBackground(new Color(0xe54d42));
                left.setLayout(null);

                //---- animationLogin ----
                animationLogin.setIcon(new ImageIcon(getClass().getResource("/assets/red login form.gif")));
                left.add(animationLogin);
                animationLogin.setBounds(-170, 40, 620, 398);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < left.getComponentCount(); i++) {
                        Rectangle bounds = left.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = left.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    left.setMinimumSize(preferredSize);
                    left.setPreferredSize(preferredSize);
                }
            }

            //---- btnLogin ----
            btnLogin.setBackground(new Color(0xe54d42));
            btnLogin.setText("\u0110\u0103ng nh\u1eadp");
            btnLogin.addActionListener(e -> signInActionPerformed(e));

            //---- jLabel1 ----
            jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 48));
            jLabel1.setForeground(Color.white);
            jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel1.setText("Login");

            //---- txtUsername ----
            txtUsername.setBackground(new Color(0x1e1e1e));
            txtUsername.setFont(new Font("Segoe UI", Font.BOLD, 12));
            txtUsername.setForeground(new Color(0xa9a9a9));
            txtUsername.setBorder(new MatteBorder(1, 0, 1, 0, new Color(0xcccccc)));
            txtUsername.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    txtUsernameFocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    txtUsernameFocusLost(e);
                }
            });
            txtUsername.addActionListener(e -> txtUsernameActionPerformed(e));

            //---- lms_icon ----
            lms_icon.setBorder(new MatteBorder(1, 1, 1, 0, new Color(0xcccccc)));

            //---- padding ----
            padding.setBorder(new MatteBorder(1, 1, 1, 0, new Color(0xcccccc)));

            //---- txtPassword ----
            txtPassword.setBackground(new Color(0x1e1e1e));
            txtPassword.setBorder(new MatteBorder(1, 0, 1, 0, new Color(0xcccccc)));
            txtPassword.setForeground(new Color(0xcccccc));
            txtPassword.setText("Password");
            txtPassword.setFont(new Font("Segoe UI", Font.BOLD, 12));
            txtPassword.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    txtPasswordFocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    txtPasswordFocusLost(e);
                }
            });
            txtPassword.addActionListener(e -> txtPasswordActionPerformed(e));

            //---- jLabel2 ----
            jLabel2.setBackground(new Color(0x1e1e1e));
            jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel2.setIcon(new ImageIcon(getClass().getResource("/assets/pass.png")));
            jLabel2.setBorder(new MatteBorder(1, 0, 1, 1, new Color(0xcccccc)));
            jLabel2.setOpaque(true);

            //---- jLabel3 ----
            jLabel3.setBackground(new Color(0x1e1e1e));
            jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel3.setIcon(new ImageIcon(getClass().getResource("/assets/user.png")));
            jLabel3.setBorder(new MatteBorder(1, 0, 1, 1, new Color(0xcccccc)));
            jLabel3.setOpaque(true);

            //---- jLabel8 ----
            jLabel8.setFont(new Font("Tahoma", Font.BOLD, 30));
            jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel8.setText("-");
            jLabel8.setForeground(Color.white);
            jLabel8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jLabel8MouseClicked(e);
                }
            });

            //---- jLabel7 ----
            jLabel7.setFont(new Font("Tahoma", Font.BOLD, 17));
            jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel7.setText("X");
            jLabel7.setForeground(Color.white);
            jLabel7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    jLabel7MouseClicked(e);
                }
            });

            //======== panel1 ========
            {

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
            }

            //---- lblForgot ----
            lblForgot.setText("Qu\u00ean m\u1eadt kh\u1ea9u?");
            lblForgot.setForeground(Color.white);
            lblForgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- lblRegister ----
            lblRegister.setText("Ch\u01b0a c\u00f3 t\u00e0i kho\u1ea3n? \u0110\u0103ng k\u00fd ngay!");
            lblRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblRegister.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            lblRegister.setForeground(Color.white);

            GroupLayout BodyLayout = new GroupLayout(Body);
            Body.setLayout(BodyLayout);
            BodyLayout.setHorizontalGroup(
                BodyLayout.createParallelGroup()
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(left, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(BodyLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addGroup(BodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblForgot)
                                    .addGroup(BodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(BodyLayout.createSequentialGroup()
                                            .addComponent(padding, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(BodyLayout.createSequentialGroup()
                                            .addComponent(lms_icon, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addGroup(BodyLayout.createParallelGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(BodyLayout.createSequentialGroup()
                                                    .addGroup(BodyLayout.createParallelGroup()
                                                        .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGap(0, 0, 0)
                                                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(lblRegister))
                                .addGap(74, 74, 74))))
            );
            BodyLayout.setVerticalGroup(
                BodyLayout.createParallelGroup()
                    .addComponent(left, GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup()
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(BodyLayout.createParallelGroup()
                            .addComponent(lms_icon, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(BodyLayout.createParallelGroup()
                            .addComponent(padding, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(lblForgot)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lblRegister)
                        .addGap(26, 26, 26))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(Body, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(Body, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setSize(837, 480);
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        if(txtUsername.getText().equals("Username")) {
            txtUsername.setText("");
        }

        if (txtPassword.getText().equals("Password")) {
            txtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        if(txtUsername.getText().equals("")) {
            txtUsername.setText("Username");
        }

        if (txtPassword.getText().equals("Password")) {
            txtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equals("Password")){
            txtPassword.setText("");
            txtPassword.setEchoChar('•');
        }   // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().equals("") ){
            txtPassword.setText("Password");
            txtPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     //exit
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel Body;
    private JPanel left;
    private JLabel animationLogin;
    private RSMaterialButtonRectangle btnLogin;
    private JLabel jLabel1;
    public static JTextField txtUsername;
    private JLabel lms_icon;
    private JLabel padding;
    private RSPasswordTextPlaceHolder txtPassword;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel8;
    private JLabel jLabel7;
    private JPanel panel1;
    private JLabel lblForgot;
    private JLabel lblRegister;
    // End of variables declaration//GEN-END:variables


    @Override
    public void initialize() {

    }

    private void loginAction() {

    }

}