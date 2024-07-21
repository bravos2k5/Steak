/*
 * Created by JFormDesigner on Fri Jul 19 21:03:08 ICT 2024
 */

package steamfake.view.admin.game;

import steamfake.dao.KiemDuyetDAO;
import steamfake.model.PhieuKiemDuyet;
import steamfake.utils.MonthYear;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;

/**
 * @author ACER
 */
public class BrowseGames extends JDialog {

    private final HashMap<MonthYear,List<PhieuKiemDuyet>> pkdMap = new HashMap<>();

    public BrowseGames(Window owner) {
        super(owner);
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel3 = new JPanel();
        label1 = new JLabel();
        cboMonths = new JComboBox<>();
        label2 = new JLabel();
        cboYears = new JComboBox<>();
        label3 = new JLabel();
        comboBox3 = new JComboBox<>();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel4 = new JPanel();

        //======== this ========
        var contentPane = getContentPane();

        //======== tabbedPane1 ========
        {
            tabbedPane1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
            tabbedPane1.setBackground(new Color(0x252730));

            //======== panel3 ========
            {
                panel3.setBackground(new Color(0x191b20));

                //---- label1 ----
                label1.setText("Th\u00e1ng  :");
                label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cboMonths ----
                cboMonths.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- label2 ----
                label2.setText("N\u0103m  :");
                label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cboYears ----
                cboYears.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- label3 ----
                label3.setText("Tr\u1ea1ng Th\u00e1i :");
                label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- comboBox3 ----
                comboBox3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Ch\u01b0a duy\u1ec7t"
                }));

                //======== scrollPane1 ========
                {

                    //---- table1 ----
                    table1.setModel(new DefaultTableModel(
                        new Object[][] {
                            {"1", "2", "3", "4"},
                            {null, null, null, null},
                        },
                        new String[] {
                            "ID", "Publisher_id", "Ng\u00e0y t\u1ea1o", "Tr\u1ea1ng th\u00e1i"
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
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(3).setResizable(false);
                    }
                    table1.setBackground(new Color(0x191b20));
                    table1.setSelectionBackground(new Color(0x4e4e4e));
                    table1.setRowHeight(30);
                    table1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                    scrollPane1.setViewportView(table1);
                }

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox3))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboMonths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboYears, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(852, Short.MAX_VALUE))
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboYears, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboMonths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1)))
                            .addGap(18, 18, 18)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Phi\u1ebfu ki\u1ec3m duy\u1ec7t", panel3);

            //======== panel4 ========
            {

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 1203, Short.MAX_VALUE)
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 791, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("Th\u1ed1ng k\u00ea", panel4);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabbedPane1)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane1;
    private JPanel panel3;
    private JLabel label1;
    private JComboBox<String> cboMonths;
    private JLabel label2;
    private JComboBox<String> cboYears;
    private JLabel label3;
    private JComboBox<String> comboBox3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#191B20"));
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 4; i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        table1.getTableHeader().setBackground(new Color(32, 136, 203));
        table1.getTableHeader().setPreferredSize(new Dimension(1200, 30));
        table1.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Games(null).setVisible(true);
            }
        });
        fillMonthComboBox();
        fillYearComboBox();
        loadData();
        fillTable();
    }

    private void loadData() {
        int month = cboMonths.getSelectedIndex();
        int year = cboYears.getSelectedIndex();
        MonthYear monthYear = new MonthYear(month, year);
        List<PhieuKiemDuyet> phieuKiemDuyetList = KiemDuyetDAO.getInstance().selectByMonthAndYear(monthYear);

    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        List<PhieuKiemDuyet> list = pkdMap.get(new MonthYear(cboMonths.getSelectedIndex(),
                Integer.parseInt((String) cboYears.getSelectedItem())));
        for (PhieuKiemDuyet phieuKiemDuyet : list) {
            String status = switch (phieuKiemDuyet.getStatus()) {
                case PhieuKiemDuyet.PENDING -> "Chờ duyệt";
                case PhieuKiemDuyet.ACCEPTED -> "Đã duyệt";
                case PhieuKiemDuyet.REJECTED -> "Từ chối";
                default -> "";
            };
            model.addRow(new Object[]{
                    phieuKiemDuyet.getId(),
                    phieuKiemDuyet.getPublisherID(),
                    phieuKiemDuyet.getNgayTao(),
                    status
            });
        }
    }

    private void fillMonthComboBox() {
        cboMonths.addItem("Tất cả");
        for(int i = 1; i <= 12; i++) {
            cboMonths.addItem(i + "");
        }
    }

    private void fillYearComboBox() {
        List<Integer> listYear = KiemDuyetDAO.getInstance().selectListYear();
        cboYears.addItem("Tất cả");
        for (Integer year : listYear) {
            cboYears.addItem(year + "");
        }
    }

}
