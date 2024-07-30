/*
 * Created by JFormDesigner on Wed Jul 17 18:47:27 ICT 2024
 */

package steamfake.view.admin.account;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.*;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import steamfake.dao.AccountDAO;
import steamfake.model.Account;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ADMIN
 */
public class ManagerAccountDialog extends JDialog {
    private static List<Account> accountList = AccountDAO.gI().selectAll();
    private List<Account> listAccountChange = accountList;

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        FlatRobotoFont.install();
        UIManager.put("DefaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        new ManagerAccountDialog().setVisible(true);
    }

    public ManagerAccountDialog() {
        initComponents();
        init();
        scrollPane1.setBorder(null);
        fillTableAccount();
        initEvent();
    }


    private void initEvent() {
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = table1.getSelectedRow();
                    if (!txtSearch.getText().isEmpty()) {
                        new ShowAccount(listAccountChange(account -> account.getUsername().contains(txtSearch.getText()), index), ManagerAccountDialog.this).setVisible(true);
                    } else {
                        if (cbbFindAccount.getSelectedIndex() == 1) {
                            new ShowAccount(listAccountChange(Account::isBan, index), ManagerAccountDialog.this).setVisible(true);
                        }
                        if (cbbFindAccount.getSelectedIndex() == 0) {
                            new ShowAccount(accountList.get(index), ManagerAccountDialog.this).setVisible(true);
                        }
                        if (cbbFindAccount.getSelectedIndex() == 2) {
                            new ShowAccount(listAccountChange(Account::isAdmin, index), ManagerAccountDialog.this).setVisible(true);
                        }
                    }
                }
            }
        });
        cbbFindAccount.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                cbbFill();
            }
        });
        btnSearch.addActionListener(e -> {
            listAccountChange = accountList;
            if (!txtSearch.getText().isEmpty()) {
                    fillTableChange(account -> account.getUsername().contains(txtSearch.getText()));
                    cbbFill();
            } else {
                if (cbbFindAccount.getSelectedIndex() != 0) {
                    cbbFill();
                } else {
                    fillTableAccount();
                }
            }

        });
        txtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnSearch.doClick();
                }
            }
        });
    }

    private void cbbFill() {
        if (!listAccountChange.isEmpty()) {
            if (cbbFindAccount.getSelectedIndex() == 0) {
                listAccountChange = accountList;
                fillTableChange(account -> account.getUsername().contains(txtSearch.getText()));
            }
            if (cbbFindAccount.getSelectedIndex() == 1) {
                fillTableChange(Account::isBan);
            }
            if (cbbFindAccount.getSelectedIndex() == 2) {
                fillTableChange(Account::isAdmin);
            }
        } else {
            listAccountChange = accountList;

        }

    }

    private Account listAccountChange(Predicate<Account> filter, int selectedIndex) {
        if (!txtSearch.getText().isEmpty()) {
            return listAccountChange.stream().filter(filter).toList().get(selectedIndex);
        }
        return accountList.stream().filter(filter).toList().get(selectedIndex);
    }

    private void init() {

        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search...");

        txtSearch.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:15;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0;"
                + "margin:5,20,5,20;");

        //chỉnh chiều cao, màu nền khi di chuột và nhấn, màu đường phân cách, và kiểu phông chữ của tiêu đề bảng
        table1.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "height:45;"
                + "hoverBackground:$TableHeader.hoverBackground;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background;"
                + "font:bold;");

        // chỉnh chiều cao hàng, hiển thị đường kẻ ngang, khoảng cách giữa các ô, màu viền ô, màu nền và màu chữ của ô được chọnnn
        table1.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:35;"
                + "showVerticalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:#4E4E4E;"
                + "selectionForeground:$Table.foreground;");

        //Chinh Font chu titel
        lbAccount.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +5;");

//        table1.setBackground(Color.BLACK); // Đổi màu nền của JTable
//        table1.setForeground(Color.WHITE); // Đổi màu chữ của JTable
        table1.getTableHeader().setBackground(Color.decode("#4E4E4E")); // Đổi màu nền của header JTable
        table1.getTableHeader().setForeground(Color.WHITE); // Đổi màu chữ của header JTable

//        // Lấy tất cả các cột và đặt chúng không thể kéo được
//        for (int i = 0; i < table1.getColumnCount(); i++) {
//            TableColumn column = table1.getColumnModel().getColumn(i);
//            column.setResizable(false);
//        }

        // Đặt các cột không thể di chuyển
        table1.getTableHeader().setReorderingAllowed(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        separator1 = new JSeparator();
        lbAccount = new JLabel();
        txtSearch = new JTextField();
        btnSearch = new JButton();
        cbbFindAccount = new JComboBox<>();

        //======== this ========
        setBackground(Color.darkGray);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x191b20));

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                    },
                    new String[] {
                        "ID", "UserName", "Email", "NgayTao"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                {
                    TableColumnModel cm = table1.getColumnModel();
                    cm.getColumn(0).setResizable(false);
                    cm.getColumn(0).setPreferredWidth(300);
                    cm.getColumn(1).setResizable(false);
                    cm.getColumn(1).setPreferredWidth(200);
                    cm.getColumn(2).setResizable(false);
                    cm.getColumn(2).setPreferredWidth(200);
                    cm.getColumn(3).setResizable(false);
                    cm.getColumn(3).setPreferredWidth(100);
                }
                table1.setBackground(new Color(0x191b20));
                table1.setForeground(Color.white);
                table1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                scrollPane1.setViewportView(table1);
            }

            //---- lbAccount ----
            lbAccount.setText("ACCOUNT");
            lbAccount.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            lbAccount.setForeground(new Color(0x878787));

            //---- txtSearch ----
            txtSearch.setBackground(new Color(0x676d83));
            txtSearch.setForeground(Color.white);
            txtSearch.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

            //---- btnSearch ----
            btnSearch.setText("Search");
            btnSearch.setBackground(new Color(0x878787));
            btnSearch.setForeground(Color.white);
            btnSearch.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

            //---- cbbFindAccount ----
            cbbFindAccount.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
            cbbFindAccount.setModel(new DefaultComboBoxModel<>(new String[] {
                "T\u1ea5t c\u1ea3",
                "Ban",
                "Admin"
            }));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(lbAccount)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnSearch)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                                .addComponent(cbbFindAccount, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addComponent(scrollPane1)
                    .addComponent(separator1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbAccount)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbFindAccount, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 586, GroupLayout.PREFERRED_SIZE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JSeparator separator1;
    private JLabel lbAccount;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JComboBox<String> cbbFindAccount;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void fillTableAccount() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) table1.getModel();
        defaultTableModel.setRowCount(0);
        for (Account account : accountList) {
            defaultTableModel.addRow(new Object[]{account.getId(), account.getUsername(), account.getEmail(), account.getNgayTao()});
        }
        for (int i = 0; i < table1.getColumnCount(); i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    Account account = accountList.get(row);
                    if (account.isBan()) {
                        c.setForeground(Color.RED);
                    } else if (account.isAdmin()) {
                        c.setForeground(Color.GREEN);
                    } else {
                        c.setForeground(Color.WHITE);
                    }
                    return c;
                }
            });
        }
    }


    private void fillTableChange(Predicate<Account> filter) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) table1.getModel();
        defaultTableModel.setRowCount(0);
        if (txtSearch.getText().isEmpty()) {
            listAccountChange = accountList.stream().filter(filter).toList();
        }
        listAccountChange = listAccountChange.stream().filter(filter).toList();
        listAccountChange.forEach(e -> {
            defaultTableModel.addRow(new Object[]{e.getId(), e.getUsername(), e.getEmail(), e.getNgayTao()});
        });

    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public void setBtnSearch(JButton btnSearch) {
        this.btnSearch = btnSearch;
    }
}
