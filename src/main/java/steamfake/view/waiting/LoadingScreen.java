/*
 * Created by JFormDesigner on Mon Jul 08 17:25:00 ICT 2024
 */

package steamfake.view.waiting;

import steamfake.graphics.CurvesPanel;
import steamfake.graphics.ProgressBarCustom;
import steamfake.utils.database.DatabaseConnector;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ADMIN
 */
public class LoadingScreen extends JDialog {

    private final MFrame owner;

    public LoadingScreen(MFrame owner) {
        super(owner);
        this.owner = owner;
        initComponents();
        initialize();
        getContentPane().setBackground(new Color(221, 221, 221));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    private void thisWindowOpened(WindowEvent e) {
        new Thread(() -> {
            try {
                for(int i = 0; i < 100; i++) {
                    doTask("Loading " + i + "%...", i);
                    if(i == 10) {
                        DatabaseConnector.getInstance().getConnection();
                    }
                    if(i == 77) {
                        owner.initHomePage();
                    }
                }
                curvesPanel1.stop();
                dispose();
                owner.setVisible(true);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }).start();
    }
    private void doTask(String taskName, int progress) throws Exception {
        lbStatus.setText(taskName);
        Thread.sleep(50);
        if(progress == 100) Thread.sleep(500);
        pro.setValue(progress);
    }

    private void initialize() {
        lblExit.setOpaque(false);
        lblExit.setBackground(new Color(221,221,221));
        lblExit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblExit.setOpaque(true);
                lblExit.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblExit.setOpaque(false);
                lblExit.repaint();
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        curvesPanel1 = new CurvesPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        pro = new ProgressBarCustom();
        lbStatus = new JLabel();
        lblExit = new JLabel();

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
            label1.setIcon(new ImageIcon(getClass().getResource("/icon/Steambig.png")));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("SteaK");
            label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 64));
            label2.setForeground(new Color(0xc8c8c8));

            //---- lbStatus ----
            lbStatus.setText("Status");
            lbStatus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

            //---- lblExit ----
            lblExit.setIcon(new ImageIcon(getClass().getResource("/icon/Multiply.png")));
            lblExit.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout curvesPanel1Layout = new GroupLayout(curvesPanel1);
            curvesPanel1.setLayout(curvesPanel1Layout);
            curvesPanel1Layout.setHorizontalGroup(
                curvesPanel1Layout.createParallelGroup()
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addContainerGap(410, Short.MAX_VALUE)
                        .addGroup(curvesPanel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(pro, GroupLayout.PREFERRED_SIZE, 783, GroupLayout.PREFERRED_SIZE)
                                .addGap(405, 405, 405))
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(lbStatus)
                                .addGap(753, 753, 753))
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(744, 744, 744))
                            .addComponent(lblExit, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, curvesPanel1Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(701, 701, 701))))
            );
            curvesPanel1Layout.setVerticalGroup(
                curvesPanel1Layout.createParallelGroup()
                    .addGroup(curvesPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(lblExit, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(pro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbStatus)
                        .addContainerGap(419, Short.MAX_VALUE))
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
    private JLabel lblExit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
