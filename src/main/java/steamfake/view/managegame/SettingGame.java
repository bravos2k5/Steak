/*
 * Created by JFormDesigner on Thu Jul 11 23:38:39 ICT 2024
 */

package steamfake.view.managegame;

import steamfake.dao.KiemDuyetDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusTextField;
import steamfake.model.PendingGame;
import steamfake.model.PhieuKiemDuyet;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;
import steamfake.utils.XJson;
import steamfake.utils.XMessage;
import steamfake.view.waiting.UploadGameDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author ACER
 */
public class SettingGame extends JDialog {
    public SettingGame(Window owner) {
        super(owner);
        initComponents();
        this.getContentPane().setBackground(new Color(25,27,32));
        lblAvatar.setToolTipText("");
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        txtName = new RadiusTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        txtCost = new RadiusTextField();
        cboAge = new JComboBox<>();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        txtDescriptsion = new JTextArea();
        label4 = new JLabel();
        lblAvatar = new JLabel();
        label6 = new JLabel();
        checkBox1 = new JCheckBox();
        label15 = new JLabel();
        btnUpload = new RadiusButton();
        btnCancel = new RadiusButton();
        txtFolderPath = new JTextField();
        btnInfoFolder = new RadiusButton();
        btnSelectFolder = new RadiusButton();
        label7 = new JLabel();
        txtExecFilePath = new JTextField();
        btnInfoExec = new RadiusButton();
        btnSelectExecFile = new RadiusButton();
        label8 = new JLabel();
        cboImages = new JComboBox<>();
        btnAddImage = new RadiusButton();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        txtRam = new RadiusTextField();
        label12 = new JLabel();
        txtRom = new RadiusTextField();
        lblVersion = new JLabel();
        txtVersion = new RadiusTextField();

        //======== this ========
        var contentPane = getContentPane();

        //---- txtName ----
        txtName.setRadius(0);
        txtName.setForcusColor(new Color(0x0c8ce9));
        txtName.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        txtName.setEndGradientColor(new Color(0x252730));
        txtName.setBackground(new Color(0x252730));
        txtName.setNoForcusColor(new Color(0x191b20));
        txtName.setStartGradientColor(new Color(0x252730));

        //---- label1 ----
        label1.setText("T\u00ean game");
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label2 ----
        label2.setText("Gi\u00e1 game");
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- txtCost ----
        txtCost.setRadius(0);
        txtCost.setForcusColor(new Color(0x0c8ce9));
        txtCost.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        txtCost.setEndGradientColor(new Color(0x252730));
        txtCost.setNoForcusColor(new Color(0x191b20));
        txtCost.setBackground(new Color(0x252730));
        txtCost.setStartGradientColor(new Color(0x252730));
        txtCost.setPlaceholder("VND");

        //---- cboAge ----
        cboAge.setBackground(new Color(0x252730));

        //---- label3 ----
        label3.setText("\u0110\u1ed9 tu\u1ed5i");
        label3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //======== scrollPane1 ========
        {

            //---- txtDescriptsion ----
            txtDescriptsion.setBackground(new Color(0x252730));
            txtDescriptsion.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
            txtDescriptsion.setLineWrap(true);
            txtDescriptsion.setWrapStyleWord(true);
            scrollPane1.setViewportView(txtDescriptsion);
        }

        //---- label4 ----
        label4.setText("M\u00f4 t\u1ea3");
        label4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- lblAvatar ----
        lblAvatar.setBackground(Color.white);
        lblAvatar.setIcon(new ImageIcon(getClass().getResource("/icon/plus-sign.png")));
        lblAvatar.setHorizontalAlignment(SwingConstants.CENTER);
        lblAvatar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //---- label6 ----
        label6.setText("Upload folder game");
        label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- checkBox1 ----
        checkBox1.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- label15 ----
        label15.setText("B\u1ea1n c\u00f3 \u0111\u1ed3ng \u00fd \u0111i\u1ec1u kho\u1ea3n vv...");
        label15.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        label15.setBackground(new Color(0x505051));

        //---- btnUpload ----
        btnUpload.setText("\u0110\u0103ng l\u00ean");
        btnUpload.setHorizontalAlignment(SwingConstants.CENTER);
        btnUpload.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnUpload.setBackground(new Color(0x35452a));
        btnUpload.setHoverColor(new Color(0x429509));
        btnUpload.setOriginColor(new Color(0x35452a));
        btnUpload.setRadius(5);

        //---- btnCancel ----
        btnCancel.setText("H\u1ee7y b\u1ecf");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(new Color(0x9d2424));

        //---- txtFolderPath ----
        txtFolderPath.setBackground(new Color(0x252730));

        //---- btnInfoFolder ----
        btnInfoFolder.setText("?");
        btnInfoFolder.setHoverColor(Color.gray);

        //---- btnSelectFolder ----
        btnSelectFolder.setText("Ch\u1ecdn folder");
        btnSelectFolder.setHoverColor(Color.gray);

        //---- label7 ----
        label7.setText("File th\u1ef1c thi game");
        label7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- txtExecFilePath ----
        txtExecFilePath.setBackground(new Color(0x252730));

        //---- btnInfoExec ----
        btnInfoExec.setText("?");
        btnInfoExec.setHoverColor(Color.gray);

        //---- btnSelectExecFile ----
        btnSelectExecFile.setText("Ch\u1ecdn file");
        btnSelectExecFile.setHoverColor(Color.gray);

        //---- label8 ----
        label8.setText("Upload \u1ea3nh gi\u1edbi thi\u1ec7u (t\u1ed1i \u0111a 10 \u1ea3nh)");
        label8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- cboImages ----
        cboImages.setBackground(new Color(0x252730));

        //---- btnAddImage ----
        btnAddImage.setText("Th\u00eam \u1ea3nh");
        btnAddImage.setHoverColor(Color.gray);

        //---- label9 ----
        label9.setText("Kh\u00f4ng ch\u1ecdn tr\u00f9ng \u1ea3nh v\u00e0 n\u00ean ch\u1ecdn \u1ea3nh \u0111\u1ed9 ph\u00e2n gi\u1ea3i cao");
        label9.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //---- label10 ----
        label10.setText("Avatar");

        //---- label11 ----
        label11.setText("Ram y\u00eau c\u1ea7u:");
        label11.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //---- txtRam ----
        txtRam.setPlaceholder("Megabyte");
        txtRam.setBackground(new Color(0x252730));
        txtRam.setEndGradientColor(new Color(0x252730));
        txtRam.setStartGradientColor(new Color(0x252730));

        //---- label12 ----
        label12.setText("Rom y\u00eau c\u1ea7u:");

        //---- txtRom ----
        txtRom.setPlaceholder("Megabyte");
        txtRom.setBackground(new Color(0x252730));
        txtRom.setEndGradientColor(new Color(0x252730));
        txtRom.setStartGradientColor(new Color(0x252730));

        //---- lblVersion ----
        lblVersion.setText("Phi\u00ean b\u1ea3n:");
        lblVersion.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //---- txtVersion ----
        txtVersion.setBackground(new Color(0x252730));
        txtVersion.setEndGradientColor(new Color(0x252730));
        txtVersion.setStartGradientColor(new Color(0x252730));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(759, Short.MAX_VALUE)
                    .addComponent(label10)
                    .addGap(105, 105, 105))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label11)
                            .addGap(18, 18, 18)
                            .addComponent(txtRam, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(label12)
                            .addGap(18, 18, 18)
                            .addComponent(txtRom, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(lblVersion)
                            .addGap(18, 18, 18)
                            .addComponent(txtVersion, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(btnAddImage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(checkBox1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label15, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                                    .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label1)
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                    .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(label2)
                                                        .addComponent(txtCost, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(50, 50, 50)
                                                    .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(label3)
                                                        .addComponent(cboAge, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE))
                                            .addGap(108, 108, 108)
                                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                            .addComponent(label4)
                                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(btnInfoFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSelectFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(btnInfoExec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnSelectExecFile, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                            .addGap(182, 182, 182))
                                        .addComponent(label9))))
                            .addGap(26, 26, 26))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(cboAge, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCost, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label10)
                    .addGap(18, 18, 18)
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInfoFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInfoExec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelectExecFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddImage, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label9))
                    .addGap(38, 38, 38)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label11)
                        .addComponent(txtRam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label12)
                        .addComponent(txtRom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVersion)
                        .addComponent(txtVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup()
                            .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                    .addGap(47, 47, 47))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusTextField txtName;
    private JLabel label1;
    private JLabel label2;
    private RadiusTextField txtCost;
    private JComboBox<Integer> cboAge;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTextArea txtDescriptsion;
    private JLabel label4;
    private JLabel lblAvatar;
    private JLabel label6;
    private JCheckBox checkBox1;
    private JLabel label15;
    private RadiusButton btnUpload;
    private RadiusButton btnCancel;
    private JTextField txtFolderPath;
    private RadiusButton btnInfoFolder;
    private RadiusButton btnSelectFolder;
    private JLabel label7;
    private JTextField txtExecFilePath;
    private RadiusButton btnInfoExec;
    private RadiusButton btnSelectExecFile;
    private JLabel label8;
    private JComboBox<String> cboImages;
    private RadiusButton btnAddImage;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private RadiusTextField txtRam;
    private JLabel label12;
    private RadiusTextField txtRom;
    private JLabel lblVersion;
    private RadiusTextField txtVersion;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        fillAgeBox();
        initEvent();
    }

    private void fillAgeBox() {
        SwingUtilities.invokeLater(() -> {
            for (int i = 3; i <= 18; i+=3) {
                cboAge.addItem(i);
            }
        });
    }

    private void initEvent() {
        btnInfoFolder.addActionListener(e -> {
            XMessage.notificate(this,"Chọn folder chứa toàn bộ tài nguyên game");
        });

        btnInfoExec.addActionListener(e -> {
            XMessage.notificate(this, "Chọn file thực thi game (chỉ chấp nhận .exe)");
        });

        btnCancel.addActionListener(e -> {
            this.dispose();
        });

        addImageEvent();
        addSelectExecFileEvent();
        addSelectFolderEvent();
        addRemoveImageEvent();
        addSelectAvatarEvent();
        addConfirmEvent();
    }


    private void addSelectFolderEvent() {
        btnSelectFolder.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                txtFolderPath.setText(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });
    }

    private void addSelectExecFileEvent() {
        btnSelectExecFile.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                @Override
                public boolean accept(java.io.File f) {
                    return f.isDirectory() || f.getName().endsWith(".exe");
                }

                @Override
                public String getDescription() {
                    return "Executable file (*.exe)";
                }
            });
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                String path = fileChooser.getSelectedFile().getAbsolutePath();
                if(!path.startsWith(txtFolderPath.getText())) {
                    XMessage.alert(this, "File thực thi game phải nằm trong folder game");
                } else {
                    txtExecFilePath.setText(path);
                }
            }
        });
    }

    private void addImageEvent() {
        btnAddImage.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setMultiSelectionEnabled(true);
            ImageFileFilter(fileChooser);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                for (java.io.File file : fileChooser.getSelectedFiles()) {
                    SwingUtilities.invokeLater(() -> {
                        cboImages.addItem(file.getAbsolutePath());
                    });
                }
            }
        });
    }

    private void addRemoveImageEvent() {
        cboImages.addItemListener(e -> {
            if(e.getStateChange() == ItemEvent.DESELECTED) {
                int choice = XMessage.confirm(SettingGame.this, "Bạn có chắc chắn muốn xóa ảnh này không?");
                if(choice == JOptionPane.YES_OPTION) {
                    cboImages.removeItemAt(cboImages.getSelectedIndex());
                }
            }
        });
    }

    private void addSelectAvatarEvent() {
        lblAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                ImageFileFilter(fileChooser);
                int result = fileChooser.showOpenDialog(SettingGame.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath()), lblAvatar));
                    lblAvatar.setToolTipText(fileChooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
    }

    private void ImageFileFilter(JFileChooser fileChooser) {
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(java.io.File f) {
                return f.isDirectory() || f.getName().endsWith(".jpg") || f.getName().endsWith(".png");
            }

            @Override
            public String getDescription() {
                return "Image file (*.jpg, *.png)";
            }
        });
    }

    private void addConfirmEvent() {
        btnUpload.addActionListener(e -> {
            int choice = XMessage.confirm(this, "Bạn có chắc chắn muốn upload game này không?");
            if(choice == JOptionPane.YES_OPTION) {
                PendingGame pendingGame = isValidInfo();
                if(pendingGame != null) {
                    PhieuKiemDuyet phieuKiemDuyet = createRequest();
                    List<String> images = new ArrayList<>();
                    for (int i = 0; i < cboImages.getItemCount(); i++) {
                        images.add(cboImages.getItemAt(i));
                    }
                    images.add(lblAvatar.getToolTipText());
                    int result = KiemDuyetDAO.getInstance().createGame(phieuKiemDuyet,pendingGame);
                    if(result > 0) {
                        images.add(lblAvatar.getToolTipText());
                        new UploadGameDialog(this, txtFolderPath.getText(),pendingGame.getGameID(), txtVersion.getText(), images).setVisible(true);
                        this.dispose();
                    } else {
                        XMessage.alert(this, "Upload game thất bại");
                    }
                }
            }
        });
    }

    private PhieuKiemDuyet createRequest() {
        PhieuKiemDuyet phieuKiemDuyet = new PhieuKiemDuyet(UUID.randomUUID());
        phieuKiemDuyet.setMoTa("Upload game mới");
        phieuKiemDuyet.setPublisherID(SessionManager.user.getId());
        phieuKiemDuyet.setThongBao("");
        return phieuKiemDuyet;
    }

    private PendingGame isValidInfo() {
        if(!txtExecFilePath.getText().startsWith(txtFolderPath.getText())) {
            XMessage.alert(this, "File thực thi game phải nằm trong folder game");
            return null;
        }
        String name = txtName.getText();
        String description = txtDescriptsion.getText();
        String folderPath = txtFolderPath.getText();
        String execFilePath = txtExecFilePath.getText().replace(folderPath + "\\", "");
        String version = txtVersion.getText();
        String avatarPath = lblAvatar.getToolTipText().substring(lblAvatar.getToolTipText().lastIndexOf("\\") + 1);
        String ram = txtRam.getText();
        String rom = txtRom.getText();
        String cost = txtCost.getText();
        int age = cboAge.getItemAt(cboAge.getSelectedIndex());
        List<String> imagesPath = new ArrayList<>();
        try {
            int ramInt = Integer.parseInt(ram);
            int romInt = Integer.parseInt(rom);
            float costFloat = Float.parseFloat(cost);
        } catch (NumberFormatException e) {
            XMessage.alert(this, "Dữ liệu nhập vào không hợp lệ");
            return null;
        }

        for (int i = 0; i < cboImages.getItemCount(); i++) {
            imagesPath.add(cboImages.getItemAt(i).substring(cboImages.getItemAt(i).lastIndexOf("\\") + 1));
        }
        String imageJson = XJson.toJson(imagesPath);
        boolean isValidate = true;
        if(name.isEmpty() || cost.isEmpty() || description.isEmpty() || folderPath.isEmpty() ||
                execFilePath.isEmpty() || version.isEmpty() || ram.isEmpty() || rom.isEmpty() || avatarPath.isEmpty()) {
            XMessage.alert(this, "Vui lòng điền đầy đủ thông tin");
            isValidate = false;
        }
        if(cboImages.getItemCount() < 2) {
            XMessage.alert(this, "Vui lòng chọn ít nhất 2 ảnh");
            isValidate = false;
        }
        if(isValidate) {
            PendingGame pendingGame = new PendingGame();
            pendingGame.setGameID(UUID.randomUUID());
            pendingGame.setName(name);
            pendingGame.setGiaTien(Integer.parseInt(cost));
            pendingGame.setAge(age);
            pendingGame.setMoTa(description);
            pendingGame.setImages(imageJson);
            pendingGame.setExecPath(execFilePath);
            pendingGame.setAvatar(avatarPath);
            pendingGame.setVersion(version);
            pendingGame.setRam(Integer.parseInt(ram));
            pendingGame.setRom(Integer.parseInt(rom));
            return pendingGame;
        }
        return null;
    }


}