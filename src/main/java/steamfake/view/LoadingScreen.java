/*
 * Created by JFormDesigner on Mon Jul 08 17:25:00 ICT 2024
 */

package steamfake.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import steamfake.graphics.*;

/**
 * @author ADMIN
 */
public class LoadingScreen extends JDialog {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new LoadingScreen(null).setVisible(true);
    }
    public LoadingScreen(Window owner) {
        super(owner);
        initComponents();
        getContentPane().setBackground(new Color(221, 221, 221));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    private void thisWindowOpened(WindowEvent e) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doTask("Loading...", 10);
                    doTask("Loading 10%...", 20);
                    doTask("Loading 20%...", 30);
                    doTask("Loading 27%...", 40);
                    doTask("Loading 36%...", 50);
                    doTask("Loading 50%...", 60);
                    doTask("Loading 63%...", 70);
                    doTask("Loading 77%...", 80);
                    doTask("Loading 86%...", 99);
                    doTask("Loading 99%...", 100);
                    doTask("Done!", 100);
                    dispose();
                    curvesPanel1.stop();    //  tắt animation
//                    new LoginDialog(null).setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    private void doTask(String taskName, int progress) throws Exception {
        lbStatus.setText(taskName);
        Thread.sleep(1000);
        pro.setValue(progress);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        curvesPanel1 = new CurvesPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        pro = new ProgressBarCustom();
        lbStatus = new JLabel();

        //======== this ========
        setUndecorated(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                thisWindowOpened(e);
            }
        });
        var contentPane = getContentPane();

        //======== curvesPanel1 ========
        {

            //---- label1 ----
            label1.setIcon(new ImageIcon("D:\\DA1\\SteamFake\\src\\main\\java\\Icon\\Steam.png"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("Steak");
            label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 64));
            label2.setForeground(new Color(0xc8c8c8));

            //---- lbStatus ----
            lbStatus.setText("Status");
            lbStatus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            GroupLayout curvesPanel1Layout = new GroupLayout(curvesPanel1);
            curvesPanel1.setLayout(curvesPanel1Layout);
            curvesPanel1Layout.setHorizontalGroup(
                curvesPanel1Layout.createParallelGroup()
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(738, 738, 738)
                        .addComponent(label1)
                        .addContainerGap(740, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                        .addContainerGap(410, Short.MAX_VALUE)
                        .addGroup(curvesPanel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(710, 710, 710))
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(pro, GroupLayout.PREFERRED_SIZE, 783, GroupLayout.PREFERRED_SIZE)
                                .addGap(405, 405, 405))
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(lbStatus)
                                .addGap(753, 753, 753))))
            );
            curvesPanel1Layout.setVerticalGroup(
                curvesPanel1Layout.createParallelGroup()
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbStatus)
                        .addContainerGap(393, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(curvesPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(curvesPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private CurvesPanel curvesPanel1;
    private JLabel label1;
    private JLabel label2;
    private ProgressBarCustom pro;
    private JLabel lbStatus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
