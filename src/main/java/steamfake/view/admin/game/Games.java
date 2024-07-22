/*
 * Created by JFormDesigner on Fri Jul 19 21:08:14 ICT 2024
 */

package steamfake.view.admin.game;

import steamfake.dao.KiemDuyetDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusTextField;
import steamfake.model.PendingGame;
import steamfake.model.PhieuKiemDuyet;

import javax.swing.*;
import java.awt.*;

/**
 * @author ACER
 */
public class Games extends JDialog {

    private final PhieuKiemDuyet phieuKiemDuyet;
    private final PendingGame pendingGame;

    public Games(Window owner, PhieuKiemDuyet phieuKiemDuyet) {
        super(owner);
        this.phieuKiemDuyet = phieuKiemDuyet;
        pendingGame = KiemDuyetDAO.getInstance().selectPendingGameById(phieuKiemDuyet);
        initComponents();
        this.getContentPane().setBackground(Color.decode("#191b20"));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        txtName = new RadiusTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        txtCost = new RadiusTextField();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        txtDescriptsion = new JTextArea();
        label4 = new JLabel();
        lblAvatar = new JLabel();
        label6 = new JLabel();
        btnUpload = new RadiusButton();
        btnCancel = new RadiusButton();
        txtFolderPath = new JTextField();
        label7 = new JLabel();
        txtExecFilePath = new JTextField();
        label8 = new JLabel();
        cboImages = new JComboBox<>();
        label10 = new JLabel();
        label11 = new JLabel();
        txtRam = new RadiusTextField();
        label12 = new JLabel();
        txtRom = new RadiusTextField();
        lblVersion = new JLabel();
        txtVersion = new RadiusTextField();
        btnCancel2 = new RadiusButton();
        cboAge = new JComboBox<>();
        button1 = new JButton();
        button2 = new JButton();

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

        //---- btnUpload ----
        btnUpload.setText("Duy\u1ec7t");
        btnUpload.setHorizontalAlignment(SwingConstants.CENTER);
        btnUpload.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnUpload.setBackground(new Color(0x35452a));
        btnUpload.setHoverColor(new Color(0x429509));
        btnUpload.setOriginColor(new Color(0x35452a));
        btnUpload.setRadius(5);

        //---- btnCancel ----
        btnCancel.setText("T\u1eeb ch\u1ed1i");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(new Color(0x9d2424));

        //---- txtFolderPath ----
        txtFolderPath.setBackground(new Color(0x252730));

        //---- label7 ----
        label7.setText("File th\u1ef1c thi game");
        label7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- txtExecFilePath ----
        txtExecFilePath.setBackground(new Color(0x252730));

        //---- label8 ----
        label8.setText("H\u00ecnh \u1ea3nh");
        label8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- cboImages ----
        cboImages.setBackground(new Color(0x252730));

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

        //---- btnCancel2 ----
        btnCancel2.setText("Cancel");
        btnCancel2.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel2.setBackground(new Color(0x3e3737));
        btnCancel2.setOriginColor(new Color(0x3e3737));
        btnCancel2.setRadius(5);
        btnCancel2.setHoverColor(Color.gray);

        //---- cboAge ----
        cboAge.setBackground(new Color(0x252730));

        //---- button1 ----
        button1.setText("Preview");

        //---- button2 ----
        button2.setText("Preview");

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
                            .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button1)
                            .addContainerGap(444, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnCancel2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                    .addGap(208, 208, 208))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
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
                                    .addComponent(txtVersion, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
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
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label4)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(button2))
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCost, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboAge, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label10)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFolderPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(38, 38, 38)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label11)
                        .addComponent(txtRam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label12)
                        .addComponent(txtRom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVersion)
                        .addComponent(txtVersion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpload, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
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
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTextArea txtDescriptsion;
    private JLabel label4;
    private JLabel lblAvatar;
    private JLabel label6;
    private RadiusButton btnUpload;
    private RadiusButton btnCancel;
    private JTextField txtFolderPath;
    private JLabel label7;
    private JTextField txtExecFilePath;
    private JLabel label8;
    private JComboBox<String> cboImages;
    private JLabel label10;
    private JLabel label11;
    private RadiusTextField txtRam;
    private JLabel label12;
    private RadiusTextField txtRom;
    private JLabel lblVersion;
    private RadiusTextField txtVersion;
    private RadiusButton btnCancel2;
    private JComboBox<Integer> cboAge;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        loadGameData();
    }

    private void loadGameData() {

    }

}
