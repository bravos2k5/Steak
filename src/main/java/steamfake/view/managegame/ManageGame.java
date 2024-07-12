/*
 * Created by JFormDesigner on Thu Jul 11 20:15:22 ICT 2024
 */

package steamfake.view.managegame;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import steamfake.graphics.*;


/**
 * @author ACER
 */
public class ManageGame extends JPanel {
    public ManageGame() {
        initComponents();
        table1.setBorder(null);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0 ; i <4;i++){
            table1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        table1.getTableHeader().setBackground(new Color(32,136,203));
        table1.getTableHeader().setPreferredSize(new Dimension(800,30));
        table2.getTableHeader().setBackground(new Color(32,136,203));
        table2.getTableHeader().setPreferredSize(new Dimension(800,30));
        radiusButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new SettingGame(null).setVisible(true);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel2 = new RadiusPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        comboBox1 = new JComboBox();
        radiusButton1 = new RadiusButton();
        panel3 = new RadiusPanel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //======== tabbedPane1 ========
            {
                tabbedPane1.setBackground(new Color(0x191b20));
                tabbedPane1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

                //======== panel2 ========
                {
                    panel2.setBorderColor(Color.white);
                    panel2.setBorderWidth(1);
                    panel2.setRadius(0);
                    panel2.setBackground(new Color(0x191b20));

                    //======== scrollPane1 ========
                    {

                        //---- table1 ----
                        table1.setRowHeight(30);
                        table1.setModel(new DefaultTableModel(
                            new Object[][] {
                                {"1", "2", "3", "4"},
                                {"3", "2", "1", "1"},
                            },
                            new String[] {
                                null, null, null, null
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
                            cm.getColumn(0).setPreferredWidth(150);
                            cm.getColumn(1).setResizable(false);
                            cm.getColumn(1).setPreferredWidth(300);
                            cm.getColumn(2).setResizable(false);
                            cm.getColumn(2).setPreferredWidth(200);
                            cm.getColumn(3).setResizable(false);
                            cm.getColumn(3).setPreferredWidth(150);
                        }
                        table1.setBackground(new Color(0x252730));
                        table1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                        table1.setOpaque(false);
                        table1.setSelectionBackground(new Color(0x191b20));
                        scrollPane1.setViewportView(table1);
                    }

                    //---- comboBox1 ----
                    comboBox1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

                    //---- radiusButton1 ----
                    radiusButton1.setText("+");
                    radiusButton1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap(72, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap(45, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiusButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                    );
                }
                tabbedPane1.addTab("Game", panel2);

                //======== panel3 ========
                {
                    panel3.setBackground(new Color(0x191b20));
                    panel3.setBorderColor(Color.white);
                    panel3.setBorderWidth(1);
                    panel3.setRadius(0);

                    //======== scrollPane2 ========
                    {

                        //---- table2 ----
                        table2.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                            },
                            new String[] {
                                "ID", "T\u00ean Game", "Ng\u00e0y \u0111\u0103ng", "Tr\u1ea1ng Th\u00e1i", "Ng\u00e0y duy\u1ec7t"
                            }
                        ));
                        table2.setBackground(new Color(0x252730));
                        table2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                        table2.setRowHeight(30);
                        scrollPane2.setViewportView(table2);
                    }

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 850, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(75, Short.MAX_VALUE))
                    );
                    panel3Layout.setVerticalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                    );
                }
                tabbedPane1.addTab("Duy\u1ec7t", panel3);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private RadiusPanel panel2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JComboBox comboBox1;
    private RadiusButton radiusButton1;
    private RadiusPanel panel3;
    private JScrollPane scrollPane2;
    private JTable table2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
