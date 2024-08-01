/*
 * Created by JFormDesigner on Wed Jul 24 16:20:49 ICT 2024
 */

package steamfake.view.admin;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.view.admin.account.AccountManagement;
import steamfake.view.admin.addmoney.AddMoneyManagement;
import steamfake.view.admin.game.KiemDuyet;
import steamfake.view.admin.withdrawmoney.WithdrawManagement;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class MainAdmin extends JDialog {
    public MainAdmin(Window owner) {
        super(owner);
        initComponents();
        initialize();
        this.getContentPane().setBackground(new Color(0x191b20));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        btnAccount = new JButton();
        btnGame = new JButton();
        btnWithdraw = new JButton();
        btnAddMoney = new JButton();
        btnAddMoney2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- btnAccount ----
        btnAccount.setText("T\u00e0i kho\u1ea3n");
        btnAccount.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnAccount.setBackground(new Color(0x252730));

        //---- btnGame ----
        btnGame.setText("Game");
        btnGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnGame.setBackground(new Color(0x252730));

        //---- btnWithdraw ----
        btnWithdraw.setText("R\u00fat ti\u1ec1n");
        btnWithdraw.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnWithdraw.setBackground(new Color(0x252730));

        //---- btnAddMoney ----
        btnAddMoney.setText("N\u1ea1p ti\u1ec1n");
        btnAddMoney.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnAddMoney.setBackground(new Color(0x252730));

        //---- btnAddMoney2 ----
        btnAddMoney2.setText("Th\u1ed1ng k\u00ea");
        btnAddMoney2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnAddMoney2.setBackground(new Color(0x252730));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnAddMoney2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddMoney, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnWithdraw, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGame, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAccount, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btnAccount, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnGame, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnWithdraw, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnAddMoney, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnAddMoney2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton btnAccount;
    private JButton btnGame;
    private JButton btnWithdraw;
    private JButton btnAddMoney;
    private JButton btnAddMoney2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        btnGame.addActionListener(e -> new KiemDuyet(this).setVisible(true));
        btnAddMoney.addActionListener(e -> new AddMoneyManagement(this).setVisible(true));
        btnAccount.addActionListener(e -> new AccountManagement(this).setVisible(true));
        btnWithdraw.addActionListener(e -> new WithdrawManagement(this).setVisible(true));
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new MainAdmin(null).setVisible(true);

    }
}
