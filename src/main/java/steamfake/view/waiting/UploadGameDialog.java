/*
 * Created by JFormDesigner on Fri Jul 12 18:34:01 ICT 2024
 */

package steamfake.view.waiting;

import steamfake.utils.XFile;
import steamfake.utils.azure.AzureBlobService;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @author BRAVOS
 */
public class UploadGameDialog extends JDialog {

    private String gamePath;
    private List<String> imagesPath;
    private UUID gameID;
    private String version;

    public UploadGameDialog(Window owner, String gamePath, UUID gameID, String version, List<String> imagesPath) {
        super(owner);
        this.gamePath = gamePath;
        this.gameID = gameID;
        this.version = version;
        this.imagesPath = imagesPath;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        progressBar1 = new JProgressBar();
        lblStatus = new JLabel();

        //======== this ========
        setModal(true);
        setResizable(false);
        var contentPane = getContentPane();

        //---- lblStatus ----
        lblStatus.setText("\u0110ang chu\u1ea9n b\u1ecb...");
        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
        lblStatus.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(lblStatus)
                        .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(128, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(lblStatus)
                    .addContainerGap(138, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JProgressBar progressBar1;
    private JLabel lblStatus;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void startUpload() {
        try {
            lblStatus.setText("Đang nén dữ liệu...");
            new File("data/temp/game.zip").delete();
            XFile.zipFolder(gamePath,"data/temp/game.zip");
            progressBar1.setValue(25);
            Thread.sleep(1000);
            lblStatus.setText("Đang tải lên game...");
            AzureBlobService.upload("data/temp/game.zip",gameID + "/" + version + "/game.zip","games");
            progressBar1.setValue(50);
            Thread.sleep(1000);
            lblStatus.setText("Đang tải lên ảnh...");
            for (String imagePath : imagesPath) {
                AzureBlobService.upload(imagePath,gameID + "/" + version + "/images/" +
                        imagePath.substring(imagePath.lastIndexOf("\\") + 1),"games");
            }
            progressBar1.setValue(75);
            Thread.sleep(1000);
            lblStatus.setText("Đang hoàn tất quá trình upload...");
            if(new File("data/temp/game.zip").delete()) {
                progressBar1.setValue(100);
                lblStatus.setText("Hoàn tất!");
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            lblStatus.setText("Lỗi: " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            gamePath = null;
            imagesPath = null;
            gameID = null;
            version = null;
            dispose();
        }
    }

    @Override
    public void setVisible(boolean b) {
        if (b) {
            progressBar1.setValue(0);
            lblStatus.setText("Đang chuẩn bị...");
            new Thread(this::startUpload).start();
        }
        super.setVisible(b);
    }

}
