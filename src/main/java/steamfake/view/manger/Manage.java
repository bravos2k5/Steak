/*
 * Created by JFormDesigner on Sun Jul 14 12:08:56 ICT 2024
 */

package steamfake.view.manger;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author ACER
 */
public class Manage extends JPanel {
    public Manage() {
        initComponents();

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 2; i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        table1.getColumnModel().getColumn(1).setCellRenderer(new TabelActionCellRender());
        table1.getColumnModel().getColumn(1).setCellEditor(new TabelActionCellEditor());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setRowHeight(30);
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {"123", null},
                    {"123", null},
                },
                new String[] {
                    "ID", "Action"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, true
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
            }
            table1.setBackground(new Color(0x252730));
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 685, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

}
