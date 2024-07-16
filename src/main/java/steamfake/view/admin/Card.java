/*
 * Created by JFormDesigner on Mon Jul 15 20:45:46 ICT 2024
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
public class Card extends JDialog {
    public Card(Window owner) {
        super(owner);
        initComponents();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0 ; i <6;i++){
            table1.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        this.getContentPane().setBackground(Color.decode("#191B20") );
        table1.getTableHeader().setPreferredSize(new Dimension(1400,30));
        table1.getTableHeader().setFont(new Font("SansSerif", Font.PLAIN, 16));
        table1.getTableHeader().setBackground(new Color(32,136,203));
        table1.getTableHeader().setEnabled(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        btnUpload = new RadiusButton();
        btnCancel = new RadiusButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {"1", "2", "3", "4", "5", "6"},
                },
                new String[] {
                    "ID", "ID Account", "M\u00e3 th\u1ebb", "S\u1ed1 Seri", "Nh\u00e0 m\u1ea1ng", "S\u1ed1 ti\u1ec1n"
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
                TableColumnModel cm = table1.getColumnModel();
                cm.getColumn(0).setResizable(false);
                cm.getColumn(0).setPreferredWidth(200);
                cm.getColumn(1).setResizable(false);
                cm.getColumn(1).setPreferredWidth(200);
                cm.getColumn(2).setResizable(false);
                cm.getColumn(2).setPreferredWidth(200);
                cm.getColumn(3).setResizable(false);
                cm.getColumn(3).setPreferredWidth(200);
                cm.getColumn(4).setResizable(false);
                cm.getColumn(5).setResizable(false);
                cm.getColumn(5).setPreferredWidth(150);
            }
            table1.setRowHeight(30);
            table1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
            table1.setBackground(new Color(0x252730));
            scrollPane1.setViewportView(table1);
        }

        //---- btnUpload ----
        btnUpload.setText("Duy\u1ec7t");
        btnUpload.setHorizontalAlignment(SwingConstants.CENTER);
        btnUpload.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnUpload.setBackground(new Color(0x35452a));
        btnUpload.setHoverColor(new Color(0x429509));
        btnUpload.setOriginColor(new Color(0x35452a));
        btnUpload.setRadius(5);

        //---- btnCancel ----
        btnCancel.setText("T\u1eeb ch\u1ed1i");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(new Color(0x9d2424));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1398, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(1177, Short.MAX_VALUE)
                    .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 9, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JTable table1;
    private RadiusButton btnUpload;
    private RadiusButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
