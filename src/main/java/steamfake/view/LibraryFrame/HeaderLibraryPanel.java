/*
 * Created by JFormDesigner on Sun Jul 07 12:01:39 ICT 2024
 */

package steamfake.view.LibraryFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author ACER
 */
public class HeaderLibraryPanel extends JPanel {
    public HeaderLibraryPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        txtSearch = new JTextField();
        lblAvata = new JLabel();
        lblRole = new JLabel();
        lblName = new JLabel();
        lblSearch = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //---- txtSearch ----
        txtSearch.setForeground(new Color(0x676d83));
        txtSearch.setBorder(null);
        txtSearch.setOpaque(true);
        txtSearch.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        txtSearch.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        txtSearch.setText("Search");
        txtSearch.setCaretPosition(6);
        txtSearch.setMargin(new Insets(3, 6, 2, 6));
        txtSearch.setBackground(new Color(0x30333d));

        //---- lblAvata ----
        lblAvata.setText("Icon");
        lblAvata.setOpaque(true);
        lblAvata.setHorizontalTextPosition(SwingConstants.CENTER);
        lblAvata.setHorizontalAlignment(SwingConstants.CENTER);

        //---- lblRole ----
        lblRole.setText("Th\u00e0nh vi\u00ean");
        lblRole.setIcon(new ImageIcon(getClass().getResource("/icon/User.png")));
        lblRole.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        lblRole.setForeground(new Color(0x70ff00));

        //---- lblName ----
        lblName.setText("Tr\u1ecbnh V\u0103n Thu\u1eadt");
        lblName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

        //---- lblSearch ----
        lblSearch.setIcon(new ImageIcon(getClass().getResource("/icon/Search.png")));
        lblSearch.setBackground(new Color(0x30333d));
        lblSearch.setOpaque(true);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblSearch)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                    .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRole, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblAvata, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addGap(6, 6, 6)
                                    .addComponent(lblRole))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(8, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField txtSearch;
    private JLabel lblAvata;
    private JLabel lblRole;
    private JLabel lblName;
    private JLabel lblSearch;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
