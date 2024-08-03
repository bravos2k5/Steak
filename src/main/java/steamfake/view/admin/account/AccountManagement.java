/*
 * Created by JFormDesigner on Wed Jul 17 18:47:27 ICT 2024
 */

package steamfake.view.admin.account;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.dao.AccountDAO;
import steamfake.model.Account;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ADMIN
 */
public class AccountManagement extends JDialog {
    private final List<Account> accountList = AccountDAO.gI().selectAll();
    private List<Account> listAccountChange = accountList;

    public AccountManagement(Window window) {
        super(window);
        initComponents();
        init();
        scrollPane1.setBorder(null);
        centerTable();
        fillTableAccount();
        initEvent();
    }

    private void centerTable() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tblAccount.getColumnCount(); i++) {
            tblAccount.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }


    private void initEvent() {
        tblAccount.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    showDetail();
                }
            }
        });
        cboFilter.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                cbbFill();
                if (!txtSearch.getText().isEmpty()) {
                    btnSearch.doClick();
                }
            }
        });
        btnSearch.addActionListener(e -> {
            listAccountChange = accountList;
            if (!txtSearch.getText().isEmpty()) {
                fillTableChange(account -> account.getUsername().contains(txtSearch.getText()));
                cbbFill();
            } else {
                if (cboFilter.getSelectedIndex() != 0) {
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

    private void showDetail() {
        int index = tblAccount.getSelectedRow();
        if (!txtSearch.getText().isEmpty()) {
            new AccountDetail(listAccountChange(account -> account.getUsername().contains(txtSearch.getText()), index), AccountManagement.this).setVisible(true);
        } else {
            if (cboFilter.getSelectedIndex() == 1) {
                new AccountDetail(listAccountChange(Account::isBan, index), AccountManagement.this).setVisible(true);
            }
            if (cboFilter.getSelectedIndex() == 0) {
                new AccountDetail(accountList.get(index), AccountManagement.this).setVisible(true);
            }
            if (cboFilter.getSelectedIndex() == 2) {
                new AccountDetail(listAccountChange(Account::isAdmin, index), AccountManagement.this).setVisible(true);
            }
        }
    }

    private void cbbFill() {
        if (!listAccountChange.isEmpty()) {
            if (cboFilter.getSelectedIndex() == 0) {
                listAccountChange = accountList;
                fillTableChange(account -> account.getUsername().contains(txtSearch.getText()));
            }
            if (cboFilter.getSelectedIndex() == 1) {
                fillTableChange(Account::isBan);
            }
            if (cboFilter.getSelectedIndex() == 2) {
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
        tblAccount.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "height:45;"
                + "hoverBackground:$TableHeader.hoverBackground;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background;"
                + "font:bold;");

        // chỉnh chiều cao hàng, hiển thị đường kẻ ngang, khoảng cách giữa các ô, màu viền ô, màu nền và màu chữ của ô được chọnnn
        tblAccount.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:35;"
                + "showVerticalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:#4E4E4E;"
                + "selectionForeground:$Table.foreground;");

        //Chinh Font chu titel
        lbAccount.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +5;");

//        tblAccount.setBackground(Color.BLACK); // Đổi màu nền của JTable
//        tblAccount.setForeground(Color.WHITE); // Đổi màu chữ của JTable
        tblAccount.getTableHeader().setBackground(Color.decode("#4E4E4E")); // Đổi màu nền của header JTable
        tblAccount.getTableHeader().setForeground(Color.WHITE); // Đổi màu chữ của header JTable

//        // Lấy tất cả các cột và đặt chúng không thể kéo được
//        for (int i = 0; i < tblAccount.getColumnCount(); i++) {
//            TableColumn column = tblAccount.getColumnModel().getColumn(i);
//            column.setResizable(false);
//        }

        // Đặt các cột không thể di chuyển
        tblAccount.getTableHeader().setReorderingAllowed(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        tblAccount = new JTable();
        separator1 = new JSeparator();
        lbAccount = new JLabel();
        txtSearch = new JTextField();
        btnSearch = new JButton();
        cboFilter = new JComboBox<>();

        //======== this ========
        setBackground(Color.darkGray);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x191b20));

            //======== scrollPane1 ========
            {

                //---- tblAccount ----
                tblAccount.setModel(new DefaultTableModel(
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
                    TableColumnModel cm = tblAccount.getColumnModel();
                    cm.getColumn(0).setResizable(false);
                    cm.getColumn(0).setPreferredWidth(300);
                    cm.getColumn(1).setResizable(false);
                    cm.getColumn(1).setPreferredWidth(200);
                    cm.getColumn(2).setResizable(false);
                    cm.getColumn(2).setPreferredWidth(200);
                    cm.getColumn(3).setResizable(false);
                    cm.getColumn(3).setPreferredWidth(100);
                }
                tblAccount.setBackground(new Color(0x191b20));
                tblAccount.setForeground(Color.white);
                tblAccount.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                scrollPane1.setViewportView(tblAccount);
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

            //---- cboFilter ----
            cboFilter.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
            cboFilter.setModel(new DefaultComboBoxModel<>(new String[] {
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                                .addComponent(cboFilter, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(cboFilter, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
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
    private JTable tblAccount;
    private JSeparator separator1;
    private JLabel lbAccount;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JComboBox<String> cboFilter;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void fillTableAccount() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblAccount.getModel();
        defaultTableModel.setRowCount(0);
        for (Account account : accountList) {
            defaultTableModel.addRow(new Object[]{account.getId(), account.getUsername(), account.getEmail(), account.getNgayTao()});
        }
        renderTable(accountList, tblAccount);

    }

    private void renderTable(List<Account> list, JTable table) {
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    Account account = list.get(row);
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
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblAccount.getModel();
        defaultTableModel.setRowCount(0);
        if (txtSearch.getText().isEmpty()) {
            listAccountChange = accountList.stream().filter(filter).toList();
        }
        listAccountChange = listAccountChange.stream().filter(filter).toList();
        listAccountChange.forEach(e -> {
            defaultTableModel.addRow(new Object[]{e.getId(), e.getUsername(), e.getEmail(), e.getNgayTao()});
        });
        renderTable(listAccountChange, tblAccount);


    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new AccountManagement(null).setVisible(true);
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public void setBtnSearch(JButton btnSearch) {
        this.btnSearch = btnSearch;
    }
}
