/*
 * Created by JFormDesigner on Mon Jul 15 21:07:27 ICT 2024
 */

package steamfake.view.admin;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

import steamfake.graphics.*;

/**
 * @author ACER
 */
public class Bank extends JDialog {
    public Bank(Window owner) {
        super(owner);
        initComponents();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < 3; i++) {
            table1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        this.getContentPane().setBackground(Color.decode("#191B20"));
        table1.getTableHeader().setPreferredSize(new Dimension(1000, 30));
        table1.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        table1.getTableHeader().setBackground(new Color(32, 136, 203));
        table1.getTableHeader().setEnabled(false);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        btnCancel = new RadiusButton();
        btnUpload = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {"1", "2", "3"},
                },
                new String[] {
                    "ID", "ID Account", "H\u00ecnh th\u1ee9c"
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
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(0).setResizable(false);
                cm.getColumn(0).setPreferredWidth(200);
                cm.getColumn(1).setResizable(false);
                cm.getColumn(1).setPreferredWidth(200);
                cm.getColumn(2).setResizable(false);
                cm.getColumn(2).setPreferredWidth(200);
            }
            table1.setRowHeight(30);
            table1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
            table1.setBackground(new Color(0x252730));
            scrollPane1.setViewportView(table1);
        }

        //---- btnCancel ----
        btnCancel.setText("T\u1eeb ch\u1ed1i");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(new Color(0x9d2424));

        //---- btnUpload ----
        btnUpload.setText("Duy\u1ec7t");
        btnUpload.setHorizontalAlignment(SwingConstants.CENTER);
        btnUpload.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnUpload.setBackground(new Color(0x35452a));
        btnUpload.setHoverColor(new Color(0x429509));
        btnUpload.setOriginColor(new Color(0x35452a));
        btnUpload.setRadius(5);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(777, Short.MAX_VALUE)
                    .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JTable table1;
    private RadiusButton btnCancel;
    private RadiusButton btnUpload;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
