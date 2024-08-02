/*
 * Created by JFormDesigner on Fri Jul 19 20:55:13 ICT 2024
 */

package steamfake.view.admin.withdrawmoney;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.dao.AccountDAO;
import steamfake.dao.RutTienDAO;
import steamfake.model.Account;
import steamfake.model.PhieuRutTien;
import steamfake.utils.MonthYear;
import steamfake.view.admin.game.KiemDuyet;

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
public class WithdrawManagement extends JDialog {

    private List<PhieuRutTien> rutTienList;
    private int[] years;
    private final HashMap<MonthYear, List<PhieuRutTien>> yearListHashMap = new HashMap<>();

    public WithdrawManagement(Window owner) {
        super(owner);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        initialize();


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel3 = new JPanel();
        label1 = new JLabel();
        cbbMouth = new JComboBox<>();
        label2 = new JLabel();
        cbbYear = new JComboBox<>();
        label3 = new JLabel();
        cbbStatus = new JComboBox<>();
        scrollPane1 = new JScrollPane();
        tblWithdraw = new JTable();
        label4 = new JLabel();
        cbbMethod = new JComboBox<>();
        panel4 = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
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

                //---- cbbMouth ----
                cbbMouth.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                cbbMouth.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1"
                }));

                //---- label2 ----
                label2.setText("N\u0103m  :");
                label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cbbYear ----
                cbbYear.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                cbbYear.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2024"
                }));

                //---- label3 ----
                label3.setText("Tr\u1ea1ng Th\u00e1i :");
                label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cbbStatus ----
                cbbStatus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                cbbStatus.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Ch\u01b0a duy\u1ec7t",
                    "D\u00e3 duy\u1ec7t",
                    "T\u1eeb ch\u1ed1i"
                }));

                //======== scrollPane1 ========
                {

                    //---- tblWithdraw ----
                    tblWithdraw.setModel(new DefaultTableModel(
                        new Object[][] {
                            {"1", "2", "4", "3", "5"},
                            {null, null, null, null, null},
                        },
                        new String[] {
                            "ID", "ID Account", "S\u1ed1 ti\u1ec1n", "H\u00ecnh th\u1ee9c", "Ng\u00e0y R\u00fat"
                        }
                    ) {
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false
                        };
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = tblWithdraw.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(3).setResizable(false);
                        cm.getColumn(4).setResizable(false);
                    }
                    tblWithdraw.setBackground(new Color(0x191b20));
                    tblWithdraw.setSelectionBackground(new Color(0x4e4e4e));
                    tblWithdraw.setRowHeight(30);
                    tblWithdraw.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                    scrollPane1.setViewportView(tblWithdraw);
                }

                //---- label4 ----
                label4.setText("H\u00ecnh th\u1ee9c");
                label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cbbMethod ----
                cbbMethod.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                cbbMethod.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Ng\u00e2n h\u00e0ng",
                    "TK Game",
                    "T\u1ea5t c\u1ea3"
                }));

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbbStatus))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbbMouth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbbYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(cbbMethod, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(687, Short.MAX_VALUE))
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbMouth, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbYear, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbStatus, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbMethod, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Duy\u1ec7t", panel3);

            //======== panel4 ========
            {

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 1198, Short.MAX_VALUE)
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGap(0, 736, Short.MAX_VALUE)
                );
            }
            tabbedPane1.addTab("text", panel4);
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

    public void initialize() {
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#191B20"));
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 5; i++) {
            tblWithdraw.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        tblWithdraw.getTableHeader().setBackground(new Color(32, 136, 203));
        tblWithdraw.getTableHeader().setPreferredSize(new Dimension(1200, 30));
        tblWithdraw.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        cbbMethod.setSelectedIndex(2);
        fillYear();
        fillMoth();
        fillToWithdraw();
        cbbYear.setSelectedIndex(cbbYear.getItemCount() - 1);
        initEvent();
    }

    private void initEvent() {
        cbbStatus.addItemListener(e -> fillToWithdraw());
        cbbMethod.addItemListener(e -> fillToWithdraw());
        tblWithdraw.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = tblWithdraw.getSelectedRow();
                    if (row != -1) {
                        PhieuRutTien phieuRutTien = null;
                        UUID id = UUID.fromString(tblWithdraw.getValueAt(row, 0).toString());
                        Account account = null;
                        for (PhieuRutTien prt : rutTienList) {
                            if (prt.getId().equals(id)) {
                                phieuRutTien = prt;
                                account = AccountDAO.gI().selectByID(new Account(prt.getAccountID()));
                                break;
                            }
                        }
                        new PreviewWithdraw(WithdrawManagement.this, phieuRutTien, account, WithdrawManagement.this).setVisible(true);
                    }
                }
            }
        });
        cbbYear.addItemListener(e -> fillToWithdraw());
        cbbMouth.addItemListener(e -> fillToWithdraw());

    }

    private List<PhieuRutTien> fillMapPRT() {
        int month = cbbMouth.getSelectedIndex();
        int year = years[cbbYear.getSelectedIndex()];
        MonthYear monthYear = new MonthYear(month, year);
        if (!yearListHashMap.containsKey(monthYear)) {
            List<PhieuRutTien> phieuRutTienList = RutTienDAO.gI().selectByMonthAndYear(monthYear);
            yearListHashMap.put(monthYear, phieuRutTienList);
            return phieuRutTienList;
        }
        return yearListHashMap.get(monthYear);
    }

    public void fillYear() {
        List<Integer> yearList = RutTienDAO.gI().selectListYear();
        cbbYear.removeAllItems();
        cbbYear.addItem("Tất Cả");
        years = new int[yearList.size() + 1];
        years[0] = 0;
        for (Integer year : yearList) {
            cbbYear.addItem(year + "");
            years[yearList.indexOf(year) + 1] = year;
        }
    }

    public void fillMoth() {
        cbbMouth.removeAllItems();
        cbbMouth.addItem("Tất Cả");
        for (int i = 1; i <= 12; i++) {
            cbbMouth.addItem(i + "");
        }

    }

    public void fillToWithdraw() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblWithdraw.getModel();
        defaultTableModel.setRowCount(0);

        int status = cbbStatus.getSelectedIndex();
        int method = cbbMethod.getSelectedIndex();
        rutTienList = fillMapPRT();
        for (PhieuRutTien phieuRutTien : rutTienList) {

            if (status != phieuRutTien.getTrangThai() || method != phieuRutTien.getMethod() && method != 2) {
                continue;
            }
            String methods = switch (phieuRutTien.getMethod()) {
                case PhieuRutTien.METHOD_ATM -> "Ngân Hàng";
                case PhieuRutTien.METHOD_GAME -> "TK Game";
                default -> "";
            };
            defaultTableModel.addRow(new Object[]{phieuRutTien.getId(), phieuRutTien.getAccountID(), phieuRutTien.getSoTienRut(), methods, phieuRutTien.getNgayRut()});
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane1;
    private JPanel panel3;
    private JLabel label1;
    private JComboBox<String> cbbMouth;
    private JLabel label2;
    private JComboBox<String> cbbYear;
    private JLabel label3;
    private JComboBox<String> cbbStatus;
    private JScrollPane scrollPane1;
    private JTable tblWithdraw;
    private JLabel label4;
    private JComboBox<String> cbbMethod;
    private JPanel panel4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new WithdrawManagement(null).setVisible(true);
    }
}
