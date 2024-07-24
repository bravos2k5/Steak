/*
 * Created by JFormDesigner on Sat Jul 20 15:54:28 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.GameDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusLabel;
import steamfake.model.Game;
import steamfake.utils.SessionManager;
import steamfake.utils.XEmail;
import steamfake.utils.XImage;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ACER
 */
public class BillGame extends JDialog {

    private final Game game;
    private final GameDetail gameDetail;

    public BillGame(Window owner, GameDetail gameDetail, Game game) {
        super(owner);
        this.gameDetail = gameDetail;
        initComponents();
        this.game = game;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initialize();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvatar = new RadiusLabel();
        lblName = new JLabel();
        lblPublisher = new JLabel();
        lblPrice = new JLabel();
        label4 = new JLabel();
        lblNameAccount = new JLabel();
        separator1 = new JSeparator();
        label6 = new JLabel();
        lblAccountMoney = new JLabel();
        label8 = new JLabel();
        lblPurchasePrice = new JLabel();
        separator2 = new JSeparator();
        label10 = new JLabel();
        lblMoneyLeft = new JLabel();
        checkBox1 = new JCheckBox();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        separator3 = new JSeparator();
        btnPay = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- lblName ----
        lblName.setText("Dead By Daylight - Gold Edition");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        lblName.setForeground(Color.black);

        //---- lblPublisher ----
        lblPublisher.setText("publisher_id");
        lblPublisher.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        lblPublisher.setForeground(Color.black);

        //---- lblPrice ----
        lblPrice.setText("400,000 \u0111");
        lblPrice.setFont(new Font("Inter", Font.PLAIN, 12));
        lblPrice.setForeground(Color.black);

        //---- label4 ----
        label4.setText("ORDER SUMMARY");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        label4.setForeground(Color.black);

        //---- lblNameAccount ----
        lblNameAccount.setText("ACCOUNT");
        lblNameAccount.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNameAccount.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        lblNameAccount.setForeground(Color.black);
        lblNameAccount.setIcon(new ImageIcon(getClass().getResource("/icon/User_Bill.png")));

        //---- separator1 ----
        separator1.setOpaque(true);
        separator1.setBackground(Color.gray);
        separator1.setForeground(Color.gray);

        //---- label6 ----
        label6.setText("Ti\u1ec1n t\u00e0i kho\u1ea3n");
        label6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        label6.setForeground(Color.black);

        //---- lblAccountMoney ----
        lblAccountMoney.setText("1.000.000.000.000");
        lblAccountMoney.setFont(new Font("Inter", lblAccountMoney.getFont().getStyle(), lblAccountMoney.getFont().getSize()));
        lblAccountMoney.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAccountMoney.setForeground(Color.black);

        //---- label8 ----
        label8.setText("S\u1ed1 ti\u1ec1n mua");
        label8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        label8.setForeground(Color.black);

        //---- lblPurchasePrice ----
        lblPurchasePrice.setText("-400.000");
        lblPurchasePrice.setFont(new Font("Inter", lblPurchasePrice.getFont().getStyle(), lblPurchasePrice.getFont().getSize()));
        lblPurchasePrice.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPurchasePrice.setForeground(Color.black);

        //---- separator2 ----
        separator2.setOpaque(true);
        separator2.setBackground(Color.gray);
        separator2.setForeground(Color.gray);

        //---- label10 ----
        label10.setText("Ti\u1ec1n c\u00f2n l\u1ea1i");
        label10.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        label10.setForeground(Color.black);

        //---- lblMoneyLeft ----
        lblMoneyLeft.setText("100000");
        lblMoneyLeft.setFont(new Font("Inter", lblMoneyLeft.getFont().getStyle(), lblMoneyLeft.getFont().getSize()));
        lblMoneyLeft.setHorizontalAlignment(SwingConstants.RIGHT);
        lblMoneyLeft.setForeground(Color.black);

        //---- checkBox1 ----
        checkBox1.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setLineWrap(true);
            textArea1.setText("Click here to agree to share your email with Bethesda Softworks LLC. Bethesda Softworks LLC will use your email address for marketing and otherwise in accordance with its privacy policy, so we encourage you to read it.Click here to agree to share your email with Bethesda Softworks LLC. Bethesda Softworks LLC will use your email address for marketing and otherwise in accordance with its privacy policy, so we encourage you to read it.");
            textArea1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            textArea1.setBackground(Color.lightGray);
            textArea1.setForeground(Color.black);
            textArea1.setEditable(false);
            scrollPane1.setViewportView(textArea1);
        }

        //---- separator3 ----
        separator3.setOpaque(true);
        separator3.setBackground(Color.gray);
        separator3.setForeground(Color.gray);

        //---- btnPay ----
        btnPay.setText("Thanh To\u00e1n");
        btnPay.setFont(new Font("Microsoft YaHei", Font.BOLD, 30));
        btnPay.setBackground(new Color(0x79b5f2));
        btnPay.setOriginColor(new Color(0x79b5f2));
        btnPay.setHoverColor(new Color(0x0078f2));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(separator1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(lblAvatar, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(lblName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblAccountMoney, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                        .addComponent(lblPublisher, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                        .addComponent(lblPrice, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(separator2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
                                .addComponent(separator3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox1)
                                    .addGap(0, 0, 0)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNameAccount, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblPurchasePrice, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblMoneyLeft, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(btnPay, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNameAccount, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPublisher, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAccountMoney, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPurchasePrice, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMoneyLeft, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(checkBox1)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusLabel lblAvatar;
    private JLabel lblName;
    private JLabel lblPublisher;
    private JLabel lblPrice;
    private JLabel label4;
    private JLabel lblNameAccount;
    private JSeparator separator1;
    private JLabel label6;
    private JLabel lblAccountMoney;
    private JLabel label8;
    private JLabel lblPurchasePrice;
    private JSeparator separator2;
    private JLabel label10;
    private JLabel lblMoneyLeft;
    private JCheckBox checkBox1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JSeparator separator3;
    private RadiusButton btnPay;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        this.getContentPane().setBackground(Color.lightGray);
        lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(game.getAvatarPath()), lblAvatar));
        lblName.setText(game.getName());
        lblPublisher.setText(GameDAO.gI().selectUsernamePublisher(game));
        lblPrice.setText(game.getGiaTien() + " VND");
        lblNameAccount.setText(SessionManager.user.getHoTen());
        lblAccountMoney.setText(SessionManager.user.getSoDuGame() + " VND");
        lblPurchasePrice.setText(game.getGiaTien() + " VND");
        lblMoneyLeft.setText((SessionManager.user.getSoDuGame() - game.getGiaTien()) + " VND");
        initEvent();
    }

    private void initEvent() {
        btnPay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (checkBox1.isSelected()) {
                    if (!payGame()) {
                        XMessage.alert(MFrame.gI(), "Thanh toan khong thanh cong");
                        return;
                    }
                    XMessage.notificate(MFrame.gI(), "Thanh toan thanh cong");
                    gameDetail.loadBuy();
                    XEmail.sendInvoice2(SessionManager.user, SessionManager.user.getSoDuGame() + game.getGiaTien(),game);
                    dispose();
                } else {
                    XMessage.alert(MFrame.gI(), "Vui lòng xác nhận diều khoản mua");
                }
            }
        });
    }

    public boolean payGame() {
            int result = GameDAO.gI().muaGame(game, SessionManager.user);
            return result > 0;
    }

}
