/*
 * Created by JFormDesigner on Fri Jul 19 21:03:08 ICT 2024
 */

package steamfake.view.admin.game;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
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
import java.util.UUID;

/**
 * @author ACER
 */
public class KiemDuyet extends JDialog {

    private final HashMap<MonthYear,List<PhieuKiemDuyet>> pkdMap = new HashMap<>();
    private List<PhieuKiemDuyet> currentList;
    private int[] years;

    public KiemDuyet(Window owner) {
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
        cboStatus = new JComboBox<>();
        scrollPane1 = new JScrollPane();
        tblPhieuKD = new JTable();
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

                //---- cboStatus ----
                cboStatus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                cboStatus.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Ch\u01b0a duy\u1ec7t",
                    "\u0110\u00e3 duy\u1ec7t",
                    "T\u1eeb ch\u1ed1i"
                }));

                //======== scrollPane1 ========
                {

                    //---- tblPhieuKD ----
                    tblPhieuKD.setModel(new DefaultTableModel(
                        new Object[][] {
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
                        TableColumnModel cm = tblPhieuKD.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(0).setPreferredWidth(150);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(1).setPreferredWidth(150);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(3).setResizable(false);
                    }
                    tblPhieuKD.setBackground(new Color(0x191b20));
                    tblPhieuKD.setSelectionBackground(new Color(0x4e4e4e));
                    tblPhieuKD.setRowHeight(30);
                    tblPhieuKD.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                    scrollPane1.setViewportView(tblPhieuKD);
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
                                    .addComponent(cboStatus))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboMonths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboYears, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(848, Short.MAX_VALUE))
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
                                .addComponent(cboStatus, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
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
    private JComboBox<String> cboStatus;
    private JScrollPane scrollPane1;
    private JTable tblPhieuKD;
    private JPanel panel4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#191B20"));
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 4; i++) {
            tblPhieuKD.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        tblPhieuKD.getTableHeader().setBackground(new Color(32, 136, 203));
        tblPhieuKD.getTableHeader().setPreferredSize(new Dimension(1200, 30));
        tblPhieuKD.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        fillMonthComboBox();
        fillYearComboBox();
        cboYears.setSelectedIndex(cboYears.getItemCount() - 1);
        fillTable();
        initEvent();
    }

    private void initEvent() {
        cboYears.addItemListener(e -> fillTable());
        cboMonths.addItemListener(e -> fillTable());
        cboStatus.addItemListener(e -> fillTable());
        tblPhieuKD.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2) {
                    int row = tblPhieuKD.getSelectedRow();
                    if(row != -1) {
                        PhieuKiemDuyet phieuKiemDuyet = null;
                        UUID id = UUID.fromString(tblPhieuKD.getValueAt(row,0).toString());
                        for (PhieuKiemDuyet pkd : currentList) {
                            if(pkd.getId().equals(id)) {
                                phieuKiemDuyet = pkd;
                                break;
                            }
                        }
                        new PreviewDetail(KiemDuyet.this,phieuKiemDuyet,KiemDuyet.this).setVisible(true);
                    }
                }
            }
        });
    }

    private List<PhieuKiemDuyet> getPkdList() {
        int month = cboMonths.getSelectedIndex();
        int year = years[cboYears.getSelectedIndex()];
        MonthYear monthYear = new MonthYear(month, year);
        if (!pkdMap.containsKey(monthYear)) {
            List<PhieuKiemDuyet> phieuKiemDuyetList = KiemDuyetDAO.getInstance().selectByMonthAndYear(monthYear);
            pkdMap.put(monthYear, phieuKiemDuyetList);
            return phieuKiemDuyetList;
        }
        return pkdMap.get(monthYear);
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblPhieuKD.getModel();
        model.setRowCount(0);
        int trangThai = cboStatus.getSelectedIndex();
        currentList = getPkdList();
        for (PhieuKiemDuyet phieuKiemDuyet : currentList) {
            if(phieuKiemDuyet.getStatus() != trangThai) {
                continue;
            }
            String status = switch (phieuKiemDuyet.getStatus()) {
                case PhieuKiemDuyet.PENDING -> "Chờ duyệt";
                case PhieuKiemDuyet.ACCEPTED -> "Đã duyệt";
                case PhieuKiemDuyet.REJECTED -> "Từ chối";
                default -> "";
            };
            model.addRow(new Object[]{
                    phieuKiemDuyet.getId(),
                    phieuKiemDuyet.getPublisherID(),
                    phieuKiemDuyet.getNgayTao().toLocalDate().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    status
            });
        }
    }

    private void fillMonthComboBox() {
        cboMonths.removeAllItems();
        cboMonths.addItem("Tất cả");
        for(int i = 1; i <= 12; i++) {
            cboMonths.addItem(i + "");
        }
    }

    private void fillYearComboBox() {
        cboYears.removeAllItems();
        List<Integer> listYear = KiemDuyetDAO.getInstance().selectListYear();
        cboYears.addItem("Tất cả");
        years = new int[listYear.size() + 1];
        years[0] = 0;
        for (Integer year : listYear) {
            cboYears.addItem(year + "");
            years[listYear.indexOf(year) + 1] = year;
        }
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new KiemDuyet(null).setVisible(true);
    }

}
