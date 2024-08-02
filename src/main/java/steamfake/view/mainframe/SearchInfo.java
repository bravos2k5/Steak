/*
 * Created by JFormDesigner on Fri Aug 02 17:29:49 ICT 2024
 */

package steamfake.view.mainframe;

import javax.swing.*;
import java.awt.*;

/**
 * @author BRAVOS
 */
public class SearchInfo extends JPanel {

    public SearchInfo(int count, String keyword) {
        initComponents();
        lblInfo.setText("Found " + count + " results for \"" + keyword + "\"");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblInfo = new JLabel();

        //======== this ========
        setOpaque(false);
        setMaximumSize(new Dimension(1200, 40));

        //---- lblInfo ----
        lblInfo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblInfo.setText("Co");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(lblInfo, GroupLayout.PREFERRED_SIZE, 1136, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblInfo)
                    .addContainerGap(9, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblInfo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



}
