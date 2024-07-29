/*
 * Created by JFormDesigner on Thu Jul 11 23:38:39 ICT 2024
 */

package steamfake.view.managegame;

import com.fasterxml.jackson.core.type.TypeReference;
import steamfake.dao.GameDAO;
import steamfake.dao.KiemDuyetDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusTextField;
import steamfake.graphics.slider.SlideShow;
import steamfake.graphics.swing.PictureBox;
import steamfake.model.Game;
import steamfake.model.PendingGame;
import steamfake.model.PhieuKiemDuyet;
import steamfake.utils.*;
import steamfake.utils.azure.AzureBlobService;
import steamfake.view.waiting.UploadGameDialog;
import steamfake.view.waiting.WaitingDialog;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @author ACER
 */
public class UpdatePanel extends JDialog {

    private final Game game;
    private final List<String> images;
    private final List<String> imagesToDelete = new ArrayList<>();
    private final List<String> imagesToAdd = new ArrayList<>();

    public UpdatePanel(Window owner, Game game) {
        super(owner);
        this.game = game;
        images = XJson.fromJson(game.getImages(), new TypeReference<>() {});
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
        btnUpload = new RadiusButton();
        btnCancel = new RadiusButton();
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
        rdoInfoOnly = new JRadioButton();
        rdoNewVersion = new JRadioButton();
        pnlNewVersion = new JPanel();
        label6 = new JLabel();
        txtFolderPath = new JTextField();
        btnInfoFolder = new RadiusButton();
        btnSelectFolder = new RadiusButton();
        label7 = new JLabel();
        txtExecFilePath = new JTextField();
        btnInfoExec = new RadiusButton();
        btnSelectExecFile = new RadiusButton();
        label13 = new JLabel();
        txtNewVersion = new RadiusTextField();
        btnClose = new RadiusButton();
        btnPreview = new JButton();
        btnDeleteImage = new JButton();

        //======== this ========
        setModal(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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

        //---- btnUpload ----
        btnUpload.setText("C\u1eadp nh\u1eadt");
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

        //---- label8 ----
        label8.setText("Upload \u1ea3nh gi\u1edbi thi\u1ec7u (t\u1ed1i \u0111a 10 \u1ea3nh)");
        label8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- cboImages ----
        cboImages.setBackground(new Color(0x252730));

        //---- btnAddImage ----
        btnAddImage.setText("Th\u00eam \u1ea3nh");
        btnAddImage.setHoverColor(Color.gray);

        //---- label9 ----
        label9.setText("Kh\u00f4ng n\u00ean ch\u1ecdn tr\u00f9ng \u1ea3nh v\u00e0 n\u00ean ch\u1ecdn \u1ea3nh \u0111\u1ed9 ph\u00e2n gi\u1ea3i cao");
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
        lblVersion.setText("Phi\u00ean b\u1ea3n hi\u1ec7n t\u1ea1i:");
        lblVersion.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //---- txtVersion ----
        txtVersion.setBackground(new Color(0x252730));
        txtVersion.setEndGradientColor(new Color(0x252730));
        txtVersion.setStartGradientColor(new Color(0x252730));
        txtVersion.setEnabled(false);

        //---- rdoInfoOnly ----
        rdoInfoOnly.setText("Ch\u1ec9 c\u1eadp nh\u1eadt th\u00f4ng tin");

        //---- rdoNewVersion ----
        rdoNewVersion.setText("C\u1eadp nh\u1eadt phi\u00ean b\u1ea3n game m\u1edbi");

        //======== pnlNewVersion ========
        {
            pnlNewVersion.setOpaque(false);

            //---- label6 ----
            label6.setText("Upload folder game");
            label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

            //---- txtFolderPath ----
            txtFolderPath.setBackground(new Color(0x252730));
            txtFolderPath.setEditable(false);

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
            txtExecFilePath.setEditable(false);

            //---- btnInfoExec ----
            btnInfoExec.setText("?");
            btnInfoExec.setHoverColor(Color.gray);

            //---- btnSelectExecFile ----
            btnSelectExecFile.setText("Ch\u1ecdn file");
            btnSelectExecFile.setHoverColor(Color.gray);

            //---- label13 ----
            label13.setText("Phi\u00ean b\u1ea3n m\u1edbi:");
            label13.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

            //---- txtNewVersion ----
            txtNewVersion.setBackground(new Color(0x252730));
            txtNewVersion.setEndGradientColor(new Color(0x252730));
            txtNewVersion.setStartGradientColor(new Color(0x252730));

            GroupLayout pnlNewVersionLayout = new GroupLayout(pnlNewVersion);
            pnlNewVersion.setLayout(pnlNewVersionLayout);
            pnlNewVersionLayout.setHorizontalGroup(
                pnlNewVersionLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, pnlNewVersionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlNewVersionLayout.createParallelGroup()
                            .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNewVersion, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                .addGroup(pnlNewVersionLayout.createParallelGroup()
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                        .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnInfoFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(btnSelectFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addGroup(pnlNewVersionLayout.createParallelGroup()
                                    .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                        .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnInfoExec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnSelectExecFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9))
            );
            pnlNewVersionLayout.setVerticalGroup(
                pnlNewVersionLayout.createParallelGroup()
                    .addGroup(pnlNewVersionLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlNewVersionLayout.createParallelGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNewVersionLayout.createParallelGroup()
                            .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoExec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectExecFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNewVersionLayout.createParallelGroup()
                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //---- btnClose ----
        btnClose.setText("\u0110\u00f3ng");
        btnClose.setHorizontalAlignment(SwingConstants.CENTER);
        btnClose.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnClose.setBackground(new Color(0x3e3737));
        btnClose.setOriginColor(new Color(0x3e3737));
        btnClose.setRadius(5);
        btnClose.setHoverColor(new Color(0x9d2424));

        //---- btnPreview ----
        btnPreview.setText("Preview");

        //---- btnDeleteImage ----
        btnDeleteImage.setText("X\u00f3a \u1ea3nh n\u00e0y");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(522, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label10)
                            .addGap(105, 105, 105))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(btnAddImage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label9))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPreview))
                                .addComponent(btnDeleteImage)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(rdoInfoOnly)
                            .addGap(55, 55, 55)
                            .addComponent(rdoNewVersion))
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
                            .addComponent(txtVersion, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(pnlNewVersion, GroupLayout.PREFERRED_SIZE, 809, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(39, Short.MAX_VALUE))
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
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPreview))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddImage, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label9))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDeleteImage)
                    .addGap(21, 21, 21)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label11)
                        .addComponent(txtRam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label12)
                        .addComponent(txtRom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVersion)
                        .addComponent(txtVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoInfoOnly)
                        .addComponent(rdoNewVersion))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(pnlNewVersion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rdoInfoOnly);
        buttonGroup1.add(rdoNewVersion);
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
    private RadiusButton btnUpload;
    private RadiusButton btnCancel;
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
    private JRadioButton rdoInfoOnly;
    private JRadioButton rdoNewVersion;
    private JPanel pnlNewVersion;
    private JLabel label6;
    private JTextField txtFolderPath;
    private RadiusButton btnInfoFolder;
    private RadiusButton btnSelectFolder;
    private JLabel label7;
    private JTextField txtExecFilePath;
    private RadiusButton btnInfoExec;
    private RadiusButton btnSelectExecFile;
    private JLabel label13;
    private RadiusTextField txtNewVersion;
    private RadiusButton btnClose;
    private JButton btnPreview;
    private JButton btnDeleteImage;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        fillAge();
        loadData();
        btnPreview.addActionListener(e -> showImagePreview());
        rdoInfoOnly.addActionListener(e -> pnlNewVersion.setVisible(false));
        rdoNewVersion.addActionListener(e -> pnlNewVersion.setVisible(true));
        rdoInfoOnly.setSelected(true);
        pnlNewVersion.setVisible(false);
        ((AbstractDocument) txtRam.getDocument()).setDocumentFilter(new NumberOnlyFilter());
        ((AbstractDocument) txtRom.getDocument()).setDocumentFilter(new NumberOnlyFilter());
        ((AbstractDocument) txtCost.getDocument()).setDocumentFilter(new NumberOnlyFilter());
        btnDeleteImage.addActionListener(e -> deleteImage());
        lblAvatar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeAvatar();
            }
        });
        btnAddImage.addActionListener(e -> addImage());
        btnUpload.addActionListener(e -> upload());
        btnClose.addActionListener(e -> closeGame());
        btnCancel.addActionListener(e -> dispose());
        btnSelectFolder.addActionListener(e -> selectFolderPath());
        btnSelectExecFile.addActionListener(e -> selectExecFile());
    }

    private void loadData() {
        txtName.setText(game.getName());
        txtCost.setText(String.valueOf(game.getGiaTien()));
        cboAge.setSelectedItem(game.getAge());
        txtDescriptsion.setText(game.getMoTa());
        txtRam.setText(String.valueOf(game.getRam()));
        txtRom.setText(String.valueOf(game.getRom()));
        txtVersion.setText(game.getVersion());
        images.forEach(cboImages::addItem);
        ResourceManager.downloadGameResource(game);
        lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(game.getAvatarPath()), lblAvatar));
    }

    private void deleteImage() {
        if(cboImages.getSelectedIndex() != -1) {
            if (XMessage.confirm(this, "Bạn có chắc chắn muốn xóa ảnh này không?") == JOptionPane.YES_OPTION) {
                images.remove(cboImages.getSelectedIndex());
                for(String image : imagesToAdd) {
                    if(image.contains(cboImages.getItemAt(cboImages.getSelectedIndex()))
                            && !image.contains(game.getAvatar())) {
                        imagesToAdd.remove(image);
                        imagesToDelete.add(cboImages.getItemAt(cboImages.getSelectedIndex()));
                        break;
                    }
                }
                cboImages.removeItemAt(cboImages.getSelectedIndex());
            }
        }
    }

    private void showImagePreview() {
        List<PictureBox> pictureBoxes = new ArrayList<>();
        JDialog dialog = new JDialog(this);
        SlideShow slideShow = new SlideShow();
        for(String image : images) {
            PictureBox pictureBox = new PictureBox();
            pictureBox.setImage(new ImageIcon("data/games/" + game.getId() + "/" + game.getVersion() + "/images/" + image));
            pictureBoxes.add(pictureBox);
        }
        dialog.setLayout(new BoxLayout(dialog.getContentPane(), BoxLayout.Y_AXIS));
        slideShow.initSlideShow(pictureBoxes);
        dialog.add(slideShow);
        dialog.setSize(new Dimension(1400, 800));
        dialog.validate();
        dialog.setLocationRelativeTo(this);
        dialog.setModal(true);
        dialog.setVisible(true);
    }

    private void fillAge() {
        for (int i = 3; i <= 18; i++) {
            cboAge.addItem(i);
        }
    }

    private void changeAvatar() {
        JFileChooser fileChooser = new JFileChooser();
        XImage.imageFileFilter(fileChooser);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getName();
            if (images.contains(fileName)) {
                XMessage.alert(this, "Ảnh đã tồn tại");
            } else {
                images.add(fileName);
                imagesToAdd.add(fileChooser.getSelectedFile().getAbsolutePath());
                lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath()), lblAvatar));
                if(!images.contains(game.getAvatar())) {
                    imagesToDelete.add(game.getAvatar());
                }
                game.setAvatar(fileName);
            }
        }
    }

    private void selectFolderPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            txtFolderPath.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }

    private void selectExecFile() {
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
    }

    private PendingGame isValidData() {
        StringBuilder alert = new StringBuilder();
        if (txtName.getText().isEmpty()) {
            alert.append("Tên game không được để trống\n");
        }
        if (txtCost.getText().isEmpty()) {
            alert.append("Giá game không được để trống\n");
        }
        if (txtRam.getText().isEmpty()) {
            alert.append("Ram yêu cầu không được để trống\n");
        }
        if (txtRom.getText().isEmpty()) {
            alert.append("Rom yêu cầu không được để trống\n");
        }
        if (txtDescriptsion.getText().isEmpty()) {
            alert.append("Mô tả không được để trống\n");
        }
        if (images.isEmpty()) {
            alert.append("Chưa có ảnh giới thiệu\n");
        }
        if(lblAvatar.getIcon().toString().equals(Objects.requireNonNull(getClass().getResource("/icon/plus-sign.png")).toString())) {
            alert.append("Chưa chọn ảnh đại diện\n");
        }
        if (rdoNewVersion.isSelected()) {
            if (txtFolderPath.getText().isEmpty()) {
                alert.append("Chưa chọn folder game\n");
            }
            if (txtExecFilePath.getText().isEmpty()) {
                alert.append("Chưa chọn file thực thi game\n");
            }
            if (txtNewVersion.getText().isEmpty()) {
                alert.append("Chưa nhập phiên bản mới\n");
            }
            else if(txtNewVersion.getText().equals(game.getVersion())) {
                alert.append("Phiên bản mới không được trùng với phiên bản hiện tại\n");
            }
        }
        if (!alert.toString().isEmpty()) {
            XMessage.alert(this, alert.toString());
            return null;
        }
        PendingGame g = new PendingGame();
        g.setGameID(game.getId());
        g.setName(txtName.getText());
        g.setGiaTien(Double.parseDouble(txtCost.getText()));
        g.setAge((Integer) cboAge.getSelectedItem());
        g.setMoTa(txtDescriptsion.getText());
        g.setRam(Integer.parseInt(txtRam.getText()));
        g.setRom(Integer.parseInt(txtRom.getText()));
        g.setImages(XJson.toJson(images));
        g.setVersion(txtNewVersion.getText());
        g.setAvatar(game.getAvatar());
        g.setImageToDelete(XJson.toJson(imagesToDelete));
        if(rdoNewVersion.isSelected()) {
            String parent = new File(txtExecFilePath.getText()).getParentFile().getAbsolutePath();
            String parentExec = parent.substring(parent.lastIndexOf("\\") + 1);
            String execFilePath = parentExec + "\\" + new File(txtExecFilePath.getText()).getName();
            g.setExecPath(execFilePath);
        }
        else {
            g.setExecPath(game.getExecPath());
        }
        return g;
    }

    private void addImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        XImage.imageFileFilter(fileChooser);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            for (var file : fileChooser.getSelectedFiles()) {
                String fileName = file.getName();
                if (images.contains(fileName)) {
                    XMessage.alert(this, "Ảnh đã tồn tại");
                } else {
                    images.add(fileName);
                    imagesToAdd.add(file.getAbsolutePath());
                    cboImages.addItem(fileName);
                }
            }
        }
    }

    private void upload() {
        PendingGame pg = isValidData();
        PhieuKiemDuyet pkd = phieuKiemDuyetGenerated();
        if (pg != null && pkd != null) {
            pg.setReviewID(pkd.getId());
            int result = KiemDuyetDAO.getInstance().createGame(pkd, pg);
            if (result > 0) {
                if(rdoNewVersion.isSelected()) {
                    uploadNewVersion();
                    XMessage.alert(this, "Đã tạo phiếu kiểm duyệt thành công");
                    dispose();
                }
                else {
                    WaitingDialog waitingDialog = new WaitingDialog(this);
                    waitingDialog.start();
                    Thread thread = new Thread(() -> {
                        for (String imagePath : imagesToAdd) {
                            AzureBlobService.upload(imagePath,game.getId() + "/" + game.getVersion() + "/images/" +
                                    imagePath.substring(imagePath.lastIndexOf("\\") + 1),"games");
                        }
                        waitingDialog.stop();
                        XMessage.alert(this, "Đã tạo phiếu kiểm duyệt thành công");
                        dispose();
                    });
                    thread.start();
                }
            } else {
                XMessage.alert(this, "Cập nhật game thất bại");
            }
        }
    }

    private void uploadNewVersion() {
        new UploadGameDialog(this,txtFolderPath.getText(),game.getId(),txtNewVersion.getText(),imagesToAdd,true).setVisible(true);
    }

    private PhieuKiemDuyet phieuKiemDuyetGenerated() {
        PendingGame pg = isValidData();
        if(pg != null) {
            PhieuKiemDuyet pkd = new PhieuKiemDuyet();
            pkd.setId(UUID.randomUUID());
            pkd.setMoTa("Cập nhật game ");
            pkd.setPublisherID(SessionManager.user.getId());
            pkd.setNgayTao(new Date(System.currentTimeMillis()));
            pkd.setStatus(PhieuKiemDuyet.PENDING);
            pkd.setThongBao("");
            return pkd;
        }
        return null;
    }

    private void closeGame() {
        int choice = XMessage.confirm(this, "Bạn có chắc chắn muốn đóng game không?\n" +
                "Sau khi đóng game sẽ không thể mở lại!\n" +
                "Những người đã mua game vẫn có thể chơi tiếp!");
        if (choice == JOptionPane.YES_OPTION) {
            int result = GameDAO.gI().closeGame(game);
            if (result > 0) {
                XMessage.alert(this, "Đã đóng game");
                dispose();
            } else {
                XMessage.alert(this, "Đóng game thất bại");
            }
        }
    }

}