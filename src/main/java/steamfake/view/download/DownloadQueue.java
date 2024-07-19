/*
 * Created by JFormDesigner on Wed Jul 03 10:00:17 ICT 2024
 */

package steamfake.view.download;

import steamfake.model.Game;
import steamfake.view.gamelib.LibraryPanel;
import steamfake.view.mainframe.MFrame;

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
            instance = new DownloadQueue(MFrame.getInstance());
        }
        return instance;
    }

    private DownloadQueue(Window owner) {
        super(owner);
        initComponents();
        scrollPane1.setBorder(null);
        downloadThread();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        pnlQueue = new JPanel();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        pnlDownloaded = new JPanel();
        separator1 = new JSeparator();

        //======== this ========
        setResizable(false);
        setModal(true);
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //======== pnlQueue ========
            {
                pnlQueue.setLayout(new BoxLayout(pnlQueue, BoxLayout.Y_AXIS));
            }
            scrollPane1.setViewportView(pnlQueue);
        }

        //---- label1 ----
        label1.setText("Download");
        label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));

        //======== scrollPane2 ========
        {

            //======== pnlDownloaded ========
            {
                pnlDownloaded.setLayout(new BoxLayout(pnlDownloaded, BoxLayout.Y_AXIS));
            }
            scrollPane2.setViewportView(pnlDownloaded);
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
                        .addComponent(label1)
                        .addComponent(scrollPane2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                        .addComponent(separator1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                        .addComponent(scrollPane1))
                    .addContainerGap(49, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JPanel pnlQueue;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JPanel pnlDownloaded;
    private JSeparator separator1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private final List<DownloadPanel> downloadedStack = new ArrayList<>();
    private final Queue<DownloadPanel> downloadQueue = new ArrayDeque<>();
    private final List<Game> downloadingGames = new ArrayList<>();

    public List<Game> getDownloadingGames() {
        return downloadingGames;
    }

    public void addNewDownload(Game game) {
        if (!downloadingGames.contains(game)) {
            DownloadPanel panel = new DownloadPanel(game);
            pnlQueue.add(panel);
            pnlQueue.revalidate();
            downloadQueue.offer(panel);
            downloadingGames.add(game);
        }
    }

    private void downloadThread() {
        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!downloadQueue.isEmpty()) {
                    DownloadPanel.Status status = downloadQueue.peek().getStatus();
                    if(status == DownloadPanel.Status.COMPLETE || status == DownloadPanel.Status.CANCELED) {
                        DownloadPanel dp = downloadQueue.poll();
                        pnlQueue.remove(dp);
                        pnlQueue.revalidate();
                        pnlQueue.repaint();
                        downloadedStack.addFirst(dp);
                        pnlDownloaded.removeAll();
                        for(DownloadPanel dpp : downloadedStack) {
                            pnlDownloaded.add(dpp);
                        }
                        pnlDownloaded.revalidate();
                        pnlDownloaded.repaint();
                        downloadingGames.remove(dp.getGame());
                        if (status == DownloadPanel.Status.COMPLETE) {
                            LibraryPanel.gI().reload();
                        }
                    }
                    else if(downloadQueue.peek() != null)
                        downloadQueue.peek().start();
                }
            }
        });
        timer.start();
    }

    public void cancelAllDownload() {
        for(DownloadPanel dp : downloadQueue) {
            if(dp.getStatus() == DownloadPanel.Status.DOWNLOADING || dp.getStatus() == DownloadPanel.Status.WAITING) {
                dp.cancelAction();
            }
        }
    }

}
