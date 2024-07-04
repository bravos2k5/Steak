/*
 * Created by JFormDesigner on Wed Jul 03 09:28:09 ICT 2024
 */

package steamfake.view;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.specialized.BlobInputStream;
import utils.azure.AzureBlobService;

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
        // Generated using JFormDesigner Evaluation license - baonqps41272
        lblGameName = new JLabel();
        prbProgress = new JProgressBar();
        lblProgress = new JLabel();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
        javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax
        .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
        .awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt
        .Color.red), getBorder())); addPropertyChangeListener(new java.beans.
        PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".
        equals(e.getPropertyName()))throw new RuntimeException();}});

        //---- lblGameName ----
        lblGameName.setText("Title");
        lblGameName.setFont(new Font("Inter", Font.PLAIN, 13));

        //---- lblProgress ----
        lblProgress.setText("100%");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(prbProgress, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(lblProgress)))
                    .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(lblProgress)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblGameName)
                            .addGap(18, 18, 18)
                            .addComponent(prbProgress, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - baonqps41272
    private JLabel lblGameName;
    private JProgressBar prbProgress;
    private JLabel lblProgress;
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

    private void cancelAction() {

    }

    private void playAction() {

    }

    private void download() {
        System.out.println("Init");
        BlobClient blobClient = containerClient.getBlobClient(blobName);
        final long totalSize = AzureBlobService.getBlobSize(blobClient);
        String path = "./Games/" + lblGameName.getText();
        new File(path).mkdirs();
        path += "/" + lblGameName.getText() + ".zip";
        if(totalSize == -1) {
            status = Status.FAILED;
            return;
        }
        try(BlobInputStream bis= blobClient.openInputStream()) {
            try(FileOutputStream fos = new FileOutputStream(path)) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                long downloadedSize = 0;
                int progressTmp = -1;
                System.out.println("Start download");
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
                        lblProgress.setText("Xong");
//                        btnCancel.setText("Play");
//                        btnCancel.setBackground(Color.GREEN);
                        status = Status.COMPLETE;
                    });
                }
                else status = Status.FAILED;
            } catch (IOException e) {
                status = Status.FAILED;
                System.err.println(e.getMessage());
            } finally {
                if(status == Status.FAILED) {
                    new File(path).delete();
                }
            }
        }
    }

}