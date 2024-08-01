/*
 * Created by JFormDesigner on Wed Jul 31 20:53:28 ICT 2024
 */

package steamfake.view.admin.statistic;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;

/**
 * @author BRAVOS
 */
public class StatisticDialog extends JDialog {
    public StatisticDialog(Window owner) {
        super(owner);
        initComponents();
        showRevenueChart();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        tabbedPane1 = new JTabbedPane();
        revenueChartPanel = new JPanel();

        //======== this ========
        setMaximumSize(new Dimension(1105, 730));
        var contentPane = getContentPane();

        //======== tabbedPane1 ========
        {

            //======== revenueChartPanel ========
            {
                revenueChartPanel.setMaximumSize(new Dimension(3000, 3000));
                revenueChartPanel.setPreferredSize(new Dimension(1105, 600));
                revenueChartPanel.setLayout(new BoxLayout(revenueChartPanel, BoxLayout.Y_AXIS));
            }
            tabbedPane1.addTab("Doanh thu", revenueChartPanel);
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
    private JPanel revenueChartPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void showRevenueChart() {
        revenueChartPanel.removeAll();
        revenueChartPanel.add(new RevenueChart());
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        StatisticDialog dialog = new StatisticDialog(null);
        dialog.setVisible(true);
    }

}
