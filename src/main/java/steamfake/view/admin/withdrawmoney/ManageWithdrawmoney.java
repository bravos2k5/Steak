/*
 * Created by JFormDesigner on Fri Jul 19 20:55:13 ICT 2024
 */

package steamfake.view.admin.withdrawmoney;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;

/**
 * @author ACER
 */
public class ManageWithdrawmoney extends JDialog {
    public ManageWithdrawmoney(Window owner) {
        super(owner);
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.decode("#191B20"));
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 7; i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        table1.getTableHeader().setBackground(new Color(32, 136, 203));
        table1.getTableHeader().setPreferredSize(new Dimension(1200, 30));
        table1.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        panel3 = new JPanel();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label2 = new JLabel();
        comboBox2 = new JComboBox<>();
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

                //---- comboBox1 ----
                comboBox1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- label2 ----
                label2.setText("N\u0103m  :");
                label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                //---- comboBox2 ----
                comboBox2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2024"
                }));

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
                        TableColumnModel cm = table1.getColumnModel();
                        cm.getColumn(0).setResizable(false);
                        cm.getColumn(1).setResizable(false);
                        cm.getColumn(2).setResizable(false);
                        cm.getColumn(3).setResizable(false);
                        cm.getColumn(4).setResizable(false);
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
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox3))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(858, Short.MAX_VALUE))
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBox3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTabbedPane tabbedPane1;
    private JPanel panel3;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label2;
    private JComboBox<String> comboBox2;
    private JLabel label3;
    private JComboBox<String> comboBox3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        new ManageWithdrawmoney(null).setVisible(true);
    }
}
