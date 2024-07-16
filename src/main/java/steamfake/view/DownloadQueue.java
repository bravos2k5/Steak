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
        scrollPane1.setBorder(null);
        panel1.add(new DownloadPanel("name","name"));  panel1.add(new DownloadPanel("name","name"));
//        downloadThread();
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        panel2 = new JPanel();
        separator1 = new JSeparator();

        //======== this ========
        setResizable(false);
        setModal(true);
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //======== panel1 ========
            {
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
            }
            scrollPane1.setViewportView(panel1);
        }

        //---- label1 ----
        label1.setText("Download");
        label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));

        //======== scrollPane2 ========
        {

            //======== panel2 ========
            {
                panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
            }
            scrollPane2.setViewportView(panel2);
        }

        //---- separator1 ----
        separator1.setBackground(Color.white);
        separator1.setForeground(Color.white);
        separator1.setOpaque(true);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(separator1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                        .addComponent(label1)
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                    .addContainerGap(49, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JPanel panel2;
    private JSeparator separator1;
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
                        panel1.remove(dp);
                        panel1.revalidate();
                        panel1.repaint();
                        if (status == DownloadPanel.Status.COMPLETE) {
                            downloadedStack.addFirst(dp);
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
