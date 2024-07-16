/*
 * Created by JFormDesigner on Wed Jul 03 09:28:09 ICT 2024
 */

package steamfake.view;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.specialized.BlobInputStream;
import components.*;
import steamfake.graphics.*;
import steamfake.utils.azure.AzureBlobService;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author BRAVOS
 */
public class DownloadPanel extends JPanel {

    public DownloadPanel(String gameName, String blobName) {
        initComponents();
        lblGameName.setText(gameName);
        lblProgress.setText("Pending...");
        this.blobName = blobName;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        prbProgress = new JProgressBar();
        radiusLabel1 = new RadiusLabel();
        lblGameName = new JLabel();
        lblProgress = new JLabel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //---- radiusLabel1 ----
        radiusLabel1.setText("text");

        //---- lblGameName ----
        lblGameName.setText("Title");
        lblGameName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

        //---- lblProgress ----
        lblProgress.setText("100%");
        lblProgress.setHorizontalAlignment(SwingConstants.CENTER);
        lblProgress.setFont(new Font("Inter", Font.BOLD, 16));

        //---- label1 ----
        label1.setText("text");
        label1.setIcon(new ImageIcon(getClass().getResource("/icon/X.png")));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(radiusLabel1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(prbProgress, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblProgress, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblGameName, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addComponent(radiusLabel1, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProgress, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(prbProgress, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JProgressBar prbProgress;
    private RadiusLabel radiusLabel1;
    private JLabel lblGameName;
    private JLabel lblProgress;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private static final BlobContainerClient containerClient = AzureBlobService.getContainerClient("games");

    private final String blobName;

    public static enum Status {
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

    private void initEvent() {
        
    }

    private void cancelAction() {

    }

    private void playAction() {

    }

    private void download() {
        BlobClient blobClient = containerClient.getBlobClient(blobName);
        final long totalSize = AzureBlobService.getBlobSize(blobClient);
        String path = "./Games/" + lblGameName.getText();
        new File(path).mkdirs();
        path += "/" + lblGameName.getText() + ".zip";
        File file = new File(path);
        if(totalSize == -1) {
            status = Status.FAILED;
            return;
        }
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
                        SwingUtilities.invokeLater(() -> {
                            prbProgress.setValue(progress);
                            lblProgress.setText(progress + "%");
                        });
                    }
                }
                fos.flush();
                if(status == Status.CANCELED) {
                    return;
                }
                if(totalSize == downloadedSize) {
                    SwingUtilities.invokeLater(() -> {
                        lblProgress.setText("Đang giải nén");
                        // Cho btn mở đi
                        status = Status.COMPLETE;
                    });

                }
                else status = Status.FAILED;
            } catch (IOException e) {
                status = Status.FAILED;
                System.err.println(e.getMessage());
            } finally {
                if(status == Status.FAILED || status == Status.CANCELED) {
                    file.delete();
                }
            }
        }
    }

}
