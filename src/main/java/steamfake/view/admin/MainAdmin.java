/*
 * Created by JFormDesigner on Wed Jul 24 16:20:49 ICT 2024
 */

package steamfake.view.admin;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.view.admin.account.AccountManagement;
import steamfake.view.admin.addmoney.AddMoneyManagement;
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

        //======== this ========
        var contentPane = getContentPane();

        //---- btnAccount ----
        btnAccount.setText("Account");
        btnAccount.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnAccount.setBackground(new Color(0x252730));

        //---- btnGame ----
        btnGame.setText("Game");
        btnGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnGame.setBackground(new Color(0x252730));

        //---- btnWithdraw ----
        btnWithdraw.setText("Withdraw");
        btnWithdraw.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnWithdraw.setBackground(new Color(0x252730));

        //---- btnAddMoney ----
        btnAddMoney.setText("Add money");
        btnAddMoney.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        btnAddMoney.setBackground(new Color(0x252730));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup()
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
                    .addContainerGap(34, Short.MAX_VALUE))
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        btnAddMoney.addActionListener(e -> new AddMoneyManagement(this));
        btnAccount.addActionListener(e -> new AccountManagement(this));
        btnWithdraw.addActionListener(e -> new WithdrawManagement(this));
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new MainAdmin(null).setVisible(true);

    }
}
