/*
 * Created by JFormDesigner on Wed Jul 03 09:28:09 ICT 2024
 */

package steamfake.view.download;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.specialized.BlobInputStream;
import steamfake.graphics.RadiusLabel;
import steamfake.model.Game;
import steamfake.utils.XFile;
import steamfake.utils.XMessage;
import steamfake.utils.azure.AzureBlobConnector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author BRAVOS
 */
public class DownloadPanel extends JPanel {

    private final Game game;

    public DownloadPanel(Game game) {
        this.game = game;
        initComponents();
        lblGameName.setText(game.getName());
        lblProgress.setText("Pending...");
        initEvent();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblIcon = new RadiusLabel();
        lblGameName = new JLabel();
        prbProgress = new JProgressBar();
        lblProgress = new JLabel();
        lblAction = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));
        setMaximumSize(new Dimension(995, 70));

        //---- lblIcon ----
        lblIcon.setText("text");

        //---- lblGameName ----
        lblGameName.setText("Title");
        lblGameName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));

        //---- lblProgress ----
        lblProgress.setText("100%");
        lblProgress.setHorizontalAlignment(SwingConstants.CENTER);
        lblProgress.setFont(new Font("Inter", Font.BOLD, 14));

        //---- lblAction ----
        lblAction.setIcon(new ImageIcon(getClass().getResource("/icon/delete-mini.png")));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(prbProgress, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblProgress, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(lblAction, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblAction, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(prbProgress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblProgress, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(10, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusLabel lblIcon;
    private JLabel lblGameName;
    private JProgressBar prbProgress;
    private JLabel lblProgress;
    private JLabel lblAction;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public enum Status {
        WAITING,
        DOWNLOADING,
        COMPLETE,
        CANCELED,
        FAILED
    }

    private volatile Status status = Status.WAITING;

    public void start() {
        if(status == Status.WAITING) {
            status = Status.DOWNLOADING;
            new Thread(this::download).start();
        }
    }

    public synchronized Status getStatus() {
        return status;
    }

    public Game getGame() {
        return game;
    }

    private void initEvent() {
        lblAction.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(status == Status.COMPLETE) {
                    playAction();
                }
                else if(status == Status.DOWNLOADING || status == Status.WAITING) {
                    cancelAction();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }
        });
    }

    public void cancelAction() {
        status = Status.CANCELED;
        lblProgress.setText("Đã hủy");
        lblAction.setVisible(false);
        prbProgress.setVisible(false);
    }

    private void playAction() {
        try {
            XFile.runExeFile("games/" + game.getId() + "/" + game.getVersion() + "/game/" + game.getExecPath());
        } catch (IOException e) {
            XMessage.alert(DownloadQueue.gI(), "Lỗi: " + e.getMessage());
        }
    }

    private void download() {
        String blobName = game.getId() + "/" + game.getVersion() + "/" + "game.zip";
        BlobContainerClient containerClient = AzureBlobConnector.gI().getClient().getBlobContainerClient("games");
        BlobClient blobClient = containerClient.getBlobClient(blobName);
        final long totalSize = blobClient.getProperties().getBlobSize();
        final String path = "games/" + game.getId() + "/" + game.getVersion();
        File pathFile = new File(path);
        pathFile.mkdirs();
        File file = new File(path + "/game.zip");
        try(BlobInputStream bis= blobClient.openInputStream()) {
            try(FileOutputStream fos = new FileOutputStream(file)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                long downloadedSize = 0;
                int progressTmp = -1;
                System.out.println("Start download " + lblGameName.getText());
                lblProgress.setText("0%");
                while ((bytesRead = bis.read(buffer)) != -1 && status != Status.CANCELED) {
                    fos.write(buffer,0,bytesRead);
                    downloadedSize += bytesRead;
                    final int progress = (int) ((downloadedSize * 100) / totalSize);
                    if (progressTmp < progress) {
                        progressTmp = progress;
                        prbProgress.setValue(progress);
                        lblProgress.setText(progress + "%");
                    }
                }
                fos.flush();
                if(status == Status.CANCELED) {
                    file.delete();
                    return;
                }
                if(totalSize == downloadedSize) {
                    SwingUtilities.invokeLater(() -> {
                        lblProgress.setText("Đang giải nén...");
                        lblAction.setIcon(null);
                    });
                    XFile.unzip(file.getAbsolutePath(), file.getParent());
                    SwingUtilities.invokeLater(() -> {
                        lblAction.setIcon(new ImageIcon(getClass().getResource("/icon/play-button.png")));
                        prbProgress.setVisible(false);
                        lblProgress.setText("Xong");
                    });
                    status = Status.COMPLETE;
                }
                else status = Status.FAILED;
            } catch (IOException e) {
                status = Status.FAILED;
                System.err.println(e.getMessage());
            } finally {
                file.delete();
            }
        }
    }

}
