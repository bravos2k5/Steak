/*
 * Created by JFormDesigner on Wed Jul 03 10:00:17 ICT 2024
 */

package steamfake.view;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author BRAVOS
 */
public class DownloadQueue extends JDialog {

    private static DownloadQueue instance;

    public static DownloadQueue gI() {
        if(instance == null) {
            instance = new DownloadQueue(null);
        }
        return instance;
    }

    private DownloadQueue(Window owner) {
        super(owner);
        initComponents();
        downloadThread();
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - TRỊNH THUẬT
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        panel2 = new JPanel();

        //======== this ========
        setResizable(false);
        setModal(true);
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //======== panel1 ========
            {
                panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
                .border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder
                .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog",java.
                awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
                ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
                ){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}})
                ;
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
            }
            scrollPane1.setViewportView(panel1);
        }

        //---- label1 ----
        label1.setText("H\u00e0ng \u0111\u1ee3i t\u1ea3i xu\u1ed1ng");
        label1.setFont(new Font("Inter", Font.PLAIN, 16));

        //---- label2 ----
        label2.setText("T\u1ea3i xu\u1ed1ng ho\u00e0n t\u1ea5t");
        label2.setFont(new Font("Inter", Font.PLAIN, 16));

        //======== scrollPane2 ========
        {

            //======== panel2 ========
            {
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
            }
            scrollPane2.setViewportView(panel2);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(label1)
                                    .addGap(0, 690, Short.MAX_VALUE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(label2)
                                    .addGap(0, 687, Short.MAX_VALUE)))))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label2)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - TRỊNH THUẬT
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JPanel panel2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private final List<DownloadPanel> downloadedStack = new ArrayList<>();
    private final Queue<DownloadPanel> downloadQueue = new ArrayDeque<>();

    public void addNewDownload(String gameName, String blobName) {
        DownloadPanel panel = new DownloadPanel(gameName,blobName);
        panel1.add(panel);
        downloadQueue.offer(panel);
    }

    private void downloadThread() {
        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!downloadQueue.isEmpty()) {
                    DownloadPanel.Status status = downloadQueue.peek().getStatus();
                    if(status == DownloadPanel.Status.COMPLETE || status == DownloadPanel.Status.CANCELED) {
                        DownloadPanel dp = downloadQueue.poll();
                        downloadedStack.addFirst(dp);
                        panel1.remove(dp);
                        panel1.revalidate();
                        panel1.repaint();
                        if (status == DownloadPanel.Status.COMPLETE) {
                            panel2.removeAll();
                            for(DownloadPanel dpp : downloadedStack) {
                                panel2.add(dpp);
                            }
                            panel2.revalidate();
                            panel2.repaint();
                        }
                    }
                    else if(downloadQueue.peek() != null)
                        downloadQueue.peek().start();
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new DownloadQueue(null);
    }
}
