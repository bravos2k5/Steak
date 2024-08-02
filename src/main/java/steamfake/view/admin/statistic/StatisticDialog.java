/*
 * Created by JFormDesigner on Wed Jul 31 20:53:28 ICT 2024
 */

package steamfake.view.admin.statistic;

import steamfake.dao.StatisticDAO;
import steamfake.model.join.statistic.TopDoiTac;
import steamfake.model.join.statistic.TopNapTien;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.List;

/**
 * @author BRAVOS
 */
public class StatisticDialog extends JDialog {

    private List<TopDoiTac> topDoiTacList = null;
    private List<TopNapTien> topNapTienList = null;

    private boolean isLoadRevenueChart = false;
    private boolean isLoadTopDoiTacTable = false;
    private boolean isLoadTopNapTienTable = false;

    public StatisticDialog(Window owner) {
        super(owner);
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabs = new JTabbedPane();
        revenueChartPanel = new JPanel();
        pnlTopNapTien = new JPanel();
        scrollPane2 = new JScrollPane();
        tblNapTien = new JTable();
        pnlTopDoiTac = new JPanel();
        scrollPane1 = new JScrollPane();
        tblDoiTac = new JTable();

        //======== this ========
        setMaximumSize(new Dimension(1105, 730));
        setModal(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //======== tabs ========
        {

            //======== revenueChartPanel ========
            {
                revenueChartPanel.setMaximumSize(new Dimension(3000, 3000));
                revenueChartPanel.setPreferredSize(new Dimension(1105, 600));
                revenueChartPanel.setLayout(new BoxLayout(revenueChartPanel, BoxLayout.Y_AXIS));
            }
            tabs.addTab("Doanh thu", revenueChartPanel);

            //======== pnlTopNapTien ========
            {

                //======== scrollPane2 ========
                {

                    //---- tblNapTien ----
                    tblNapTien.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null},
                        },
                        new String[] {
                            "Username", "T\u1ed5ng ti\u1ec1n n\u1ea1p", "T\u1ed5ng n\u1ea1p th\u00e1ng", "T\u1ed5ng ti\u1ec1n \u0111\u00e3 chi"
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
                        TableColumnModel cm = tblNapTien.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(3).setResizable(false);
                    }
                    scrollPane2.setViewportView(tblNapTien);
                }

                GroupLayout pnlTopNapTienLayout = new GroupLayout(pnlTopNapTien);
                pnlTopNapTien.setLayout(pnlTopNapTienLayout);
                pnlTopNapTienLayout.setHorizontalGroup(
                    pnlTopNapTienLayout.createParallelGroup()
                        .addGroup(pnlTopNapTienLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                            .addContainerGap())
                );
                pnlTopNapTienLayout.setVerticalGroup(
                    pnlTopNapTienLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, pnlTopNapTienLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }
            tabs.addTab("Top n\u1ea1p ti\u1ec1n", pnlTopNapTien);

            //======== pnlTopDoiTac ========
            {

                //======== scrollPane1 ========
                {
                    scrollPane1.setBorder(null);

                    //---- tblDoiTac ----
                    tblDoiTac.setBorder(null);
                    tblDoiTac.setBackground(new Color(0x252730));
                    tblDoiTac.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null},
                        },
                        new String[] {
                            "T\u00ean ng\u01b0\u1eddi d\u00f9ng", "T\u1ed5ng doanh thu", "T\u1ed5ng doanh thu th\u00e1ng n\u00e0y"
                        }
                    ) {
                        boolean[] columnEditable = new boolean[] {
                            false, false, false
                        };
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return columnEditable[columnIndex];
                        }
                    });
                    {
                        TableColumnModel cm = tblDoiTac.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(2).setResizable(false);
                    }
                    scrollPane1.setViewportView(tblDoiTac);
                }

                GroupLayout pnlTopDoiTacLayout = new GroupLayout(pnlTopDoiTac);
                pnlTopDoiTac.setLayout(pnlTopDoiTacLayout);
                pnlTopDoiTacLayout.setHorizontalGroup(
                    pnlTopDoiTacLayout.createParallelGroup()
                        .addGroup(pnlTopDoiTacLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                            .addContainerGap())
                );
                pnlTopDoiTacLayout.setVerticalGroup(
                    pnlTopDoiTacLayout.createParallelGroup()
                        .addGroup(pnlTopDoiTacLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }
            tabs.addTab("Top \u0111\u1ed1i t\u00e1c", pnlTopDoiTac);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabs, GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(tabs)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabs;
    private JPanel revenueChartPanel;
    private JPanel pnlTopNapTien;
    private JScrollPane scrollPane2;
    private JTable tblNapTien;
    private JPanel pnlTopDoiTac;
    private JScrollPane scrollPane1;
    private JTable tblDoiTac;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



    private void initialize() {
        showRevenueChart();
        tabs.addChangeListener(e -> {
            if(tabs.getSelectedIndex() == 1) {
                showTopNapTienTable();
            } else if(tabs.getSelectedIndex() == 2) {
                showTopDoiTacTable();
            }
        });
    }

    private void showRevenueChart() {
        if (!isLoadRevenueChart) {
            revenueChartPanel.removeAll();
            revenueChartPanel.add(new CompanyRevenueChart());
            isLoadRevenueChart = true;
        }
    }

    private void showTopDoiTacTable() {
        if(!isLoadTopDoiTacTable) {
            fillTopDoiTacTable();
            isLoadTopDoiTacTable = true;
        }
    }

    private void showTopNapTienTable() {
        if(!isLoadTopNapTienTable) {
            fillTopNapTienTable();
            isLoadTopNapTienTable = true;
        }
    }

    private void fillTopDoiTacTable() {
        if(topDoiTacList == null) {
            tblDoiTac.setAutoCreateRowSorter(true);
            DefaultTableModel defaultTableModel = (DefaultTableModel) tblDoiTac.getModel();
            defaultTableModel.setRowCount(0);
            topDoiTacList = StatisticDAO.selectTopDoiTac();
            for(TopDoiTac topDoiTac : topDoiTacList) {
                defaultTableModel.addRow(new Object[] {
                        topDoiTac.getUsername(),
                        topDoiTac.getTongDoanhThu(),
                        topDoiTac.getTongDoanhThuThangNay()
                });
            }
        }
    }

    private void fillTopNapTienTable() {
        if(topNapTienList == null) {
            tblNapTien.setAutoCreateRowSorter(true);
            DefaultTableModel defaultTableModel = (DefaultTableModel) tblNapTien.getModel();
            defaultTableModel.setRowCount(0);
            topNapTienList = StatisticDAO.selectTopNapTien();
            for(TopNapTien topNapTien : topNapTienList) {
                defaultTableModel.addRow(new Object[] {
                        topNapTien.getUsername(),
                        topNapTien.getTongNapTien(),
                        topNapTien.getTongNapTienThangNay()
                });
            }
        }
    }

}
