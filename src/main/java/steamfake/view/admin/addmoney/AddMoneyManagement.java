/*
 * Created by JFormDesigner on Mon Jul 15 20:10:09 ICT 2024
 */

package steamfake.view.admin.addmoney;

import steamfake.dao.NapTienDAO;
import steamfake.model.NapCK;
import steamfake.model.NapCard;
import steamfake.model.NapTien;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.List;

/**
 * @author ACER
 */
public class AddMoneyManagement extends JDialog {

    private List<NapTien> napTienList;
    private List<Integer> yearList;

    public AddMoneyManagement(Window owner) {
        super(owner);
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#191B20"));
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel3 = new JPanel();
        label1 = new JLabel();
        cboMonth = new JComboBox<>();
        label2 = new JLabel();
        cboYear = new JComboBox<>();
        label3 = new JLabel();
        cboStatus = new JComboBox();
        scrollPane1 = new JScrollPane();
        tblPhieuNap = new JTable();

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

                //---- cboMonth ----
                cboMonth.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- label2 ----
                label2.setText("N\u0103m  :");
                label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cboYear ----
                cboYear.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                cboYear.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2024"
                }));

                //---- label3 ----
                label3.setText("Tr\u1ea1ng Th\u00e1i :");
                label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- cboStatus ----
                cboStatus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //======== scrollPane1 ========
                {

                    //---- tblPhieuNap ----
                    tblPhieuNap.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, null, null},
                        },
                        new String[] {
                            "ID", "ID account", "H\u00ecnh th\u1ee9c", "S\u1ed1 ti\u1ec1n", "Ng\u00e0y N\u1ea1p", "Tr\u1ea1ng th\u00e1i"
                        }
                    ) {
                        boolean[] columnEditable = new boolean[] {
                            false, false, false, false, false, false
                        };
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = tblPhieuNap.getColumnModel();
                        cm.getColumn(0).setPreferredWidth(100);
                        cm.getColumn(1).setPreferredWidth(100);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(3).setResizable(false);
                        cm.getColumn(4).setResizable(false);
                        cm.getColumn(5).setResizable(false);
                    }
                    tblPhieuNap.setBackground(new Color(0x191b20));
                    tblPhieuNap.setSelectionBackground(new Color(0x4e4e4e));
                    tblPhieuNap.setRowHeight(30);
                    tblPhieuNap.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                    scrollPane1.setViewportView(tblPhieuNap);
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
                                    .addComponent(cboMonth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(850, Short.MAX_VALUE))
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboMonth, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboYear, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(cboStatus, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                );
            }
            tabbedPane1.addTab("Duy\u1ec7t", panel3);
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
    private JComboBox<String> cboMonth;
    private JLabel label2;
    private JComboBox<String> cboYear;
    private JLabel label3;
    private JComboBox cboStatus;
    private JScrollPane scrollPane1;
    private JTable tblPhieuNap;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public void initialize() {
        napTienList = NapTienDAO.getInstance().selectAll();
        fillCbo();
        initEvent();
        centerTable();
        setListForFilter();
        fillTable();
    }

    private void centerTable() {
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 6; i++) {
            tblPhieuNap.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        tblPhieuNap.getTableHeader().setBackground(new Color(32, 136, 203));
        tblPhieuNap.getTableHeader().setPreferredSize(new Dimension(1200, 30));
        tblPhieuNap.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
    }

    private void initEvent() {
        tblPhieuNap.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    showDetail();
                }
            }
        });
        cboMonth.addActionListener(e -> {
            setListForFilter();
            fillTable();
        });
        cboYear.addActionListener(e -> {
            setListForFilter();
            fillTable();
        });
        cboStatus.addActionListener(e -> {
            setListForFilter();
            fillTable();
        });
    }

    private void fillCbo() {
        cboYear.removeAllItems();
        yearList = NapTienDAO.getInstance().selectYearList();
        for (Integer year : yearList) {
            cboYear.addItem(year + "");
        }
        for(int i = 1; i <= 12; i++) {
            cboMonth.addItem(i + "");
        }
        cboStatus.addItem("Chưa duyệt");
        cboStatus.addItem("Đã duyệt");
        cboStatus.addItem("Đã hủy");
        cboMonth.setSelectedItem(new Date(System.currentTimeMillis()).toLocalDate().getMonthValue() + "");
    }

    private void setListForFilter() {
        int month = cboMonth.getSelectedIndex() + 1;
        int year = Integer.parseInt((String) cboYear.getSelectedItem());
        int status = cboStatus.getSelectedIndex();
        Filter filter = new Filter(month, year, status);
        napTienList = NapTienDAO.getInstance().selectByFilter(filter);
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblPhieuNap.getModel();
        model.setRowCount(0);
        if (napTienList != null) {
            for (NapTien napTien : napTienList) {
                model.addRow(new Object[]{
                        napTien.getId(),
                        napTien.getAccountID(),
                        napTien.getMethod() == NapTien.NAP_CARD ? "Nạp thẻ" : "Nạp chuyển khoản",
                        napTien.getSoTien(),
                        napTien.getNgayNap(),
                        napTien.getStatus() == NapTien.PENDING ? "Chưa duyệt" : napTien.getStatus() == NapTien.ACCEPTED ? "Đã duyệt" : "Đã hủy"
                });
            }
        }
    }

    public void handleAfterWork(NapTien napTien) {
        int status = cboStatus.getSelectedIndex();
        if(napTien.getStatus() != status) {
            napTienList.remove(napTien);
            fillTable();
        }
    }

    private void showDetail() {
        int row = tblPhieuNap.getSelectedRow();
        if(row != -1) {
            NapTien napTien = napTienList.get(row);
            if(napTien instanceof NapCard napCard) {
                new CardDetail(this, napCard).setVisible(true);
            }
            if(napTien instanceof NapCK napCK) {
                new BankDetail(this, napCK).setVisible(true);
            }
        }
    }

    public static class Filter {
        public int month;
        public int year;
        public int status;
        public Filter(int month, int year, int status) {
            this.month = month;
            this.year = year;
            this.status = status;
        }
    }

}
