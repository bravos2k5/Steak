/*
 * Created by JFormDesigner on Thu Jul 11 23:38:39 ICT 2024
 */

package steamfake.view.managegame;

import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusTextField;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class UpdatePanel extends JDialog {
    public UpdatePanel(Window owner) {
        super(owner);
        initComponents();
        this.getContentPane().setBackground(new Color(25,27,32));
        lblAvatar.setToolTipText("");

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

        //---- rdoInfoOnly ----
        rdoInfoOnly.setText("Ch\u1ec9 c\u1eadp nh\u1eadt th\u00f4ng tin");

        //---- rdoNewVersion ----
        rdoNewVersion.setText("C\u1eadp nh\u1eadt phi\u00ean b\u1ea3n game m\u1edbi");

        //======== pnlNewVersion ========
        {

            //---- label6 ----
            label6.setText("Upload folder game");
            label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

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
                        .addGroup(pnlNewVersionLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnInfoFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnSelectFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnInfoExec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnSelectExecFile, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNewVersionLayout.createSequentialGroup()
                                .addComponent(label13, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNewVersion, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                .addGap(485, 485, 485))))
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
                            .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoExec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectExecFile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlNewVersionLayout.createParallelGroup()
                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(8, Short.MAX_VALUE))
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
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddImage, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label9))
                    .addGap(47, 47, 47)
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void loadData() {

    }



}