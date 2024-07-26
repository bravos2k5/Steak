/*
 * Created by JFormDesigner on Wed Jul 17 18:47:27 ICT 2024
 */

package steamfake.view.admin.account;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author ADMIN
 */
public class ManagerAccountDialog extends JDialog {
    public static void main(String[] args) {
        FlatRobotoFont.install();
        UIManager.put("DefaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatIntelliJLaf.setup();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerAccountDialog().setVisible(true);
            }
        });
    }
    public ManagerAccountDialog() {
        initComponents();
        init();
    }

    private void init(){

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
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

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
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                    },
                    new String[] {
                        "ID", "NAME", "ADMIN", "PHONE", "EMAIL"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        Object.class, Object.class, Boolean.class, Object.class, Object.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                table1.setBackground(new Color(0x191b20));
                table1.setForeground(Color.white);
                scrollPane1.setViewportView(table1);
            }

            //---- lbAccount ----
            lbAccount.setText("ACCOUNT");
            lbAccount.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            lbAccount.setForeground(new Color(0x878787));

            //---- txtSearch ----
            txtSearch.setBackground(new Color(0x676d83));
            txtSearch.setForeground(Color.white);

            //---- btnSearch ----
            btnSearch.setText("Search");
            btnSearch.setBackground(new Color(0x878787));
            btnSearch.setForeground(Color.white);

            //---- button1 ----
            button1.setText("New");
            button1.setBackground(new Color(0x878787));
            button1.setForeground(Color.white);

            //---- button2 ----
            button2.setText("Edit");
            button2.setBackground(new Color(0x878787));
            button2.setForeground(Color.white);

            //---- button3 ----
            button3.setText("Ban!!");
            button3.setBackground(new Color(0x878787));
            button3.setForeground(Color.white);

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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                                .addComponent(button1)
                                .addGap(6, 6, 6)
                                .addComponent(button2)
                                .addGap(6, 6, 6)
                                .addComponent(button3)
                                .addGap(32, 32, 32))))
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
                            .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(button1)
                            .addComponent(button2)
                            .addComponent(button3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
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
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



}
