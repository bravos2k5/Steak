/*
 * Created by JFormDesigner on Fri Jul 19 21:08:14 ICT 2024
 */

package steamfake.view.admin.game;

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
import steamfake.utils.ResourceManager;
import steamfake.utils.XImage;
import steamfake.utils.XJson;
import steamfake.utils.XMessage;
import steamfake.utils.azure.AzureBlobConnector;
import steamfake.utils.azure.AzureBlobService;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ACER
 */
public class PreviewDetail extends JDialog {

    private final PhieuKiemDuyet phieuKiemDuyet;
    private final PendingGame pendingGame;
    private final KiemDuyet kiemDuyet;
    private final List<String> imagesPath;
    private Game currentVersion;

    public PreviewDetail(Window owner, PhieuKiemDuyet phieuKiemDuyet, KiemDuyet kiemDuyet) {
        super(owner);
        this.phieuKiemDuyet = phieuKiemDuyet;
        pendingGame = KiemDuyetDAO.getInstance().selectPendingGameById(phieuKiemDuyet);
        this.kiemDuyet = kiemDuyet;
        imagesPath = XJson.fromJson(pendingGame.getImages(), new TypeReference<>() {});
        if(phieuKiemDuyet.getMoTa().contains("Update")) {
            currentVersion = GameDAO.gI().selectByID(new Game(pendingGame.getGameID()));
        }
        this.setTitle("Preview: " + pendingGame.getGameID());
        initComponents();
        this.getContentPane().setBackground(Color.decode("#191b20"));
        initialize();
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
        btnAccept = new RadiusButton();
        btnReject = new RadiusButton();
        txtLink = new JTextField();
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
        btnCancel = new RadiusButton();
        btnImgPreview = new JButton();
        txtAge = new RadiusTextField();
        btnCopy = new JButton();

        //======== this ========
        setModal(true);
        setResizable(false);
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
        txtName.setEditable(false);

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
        txtCost.setEditable(false);

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
            txtDescriptsion.setEditable(false);
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
        label6.setText("Link source:");
        label6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- btnAccept ----
        btnAccept.setText("Duy\u1ec7t");
        btnAccept.setHorizontalAlignment(SwingConstants.CENTER);
        btnAccept.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnAccept.setBackground(new Color(0x35452a));
        btnAccept.setHoverColor(new Color(0x429509));
        btnAccept.setOriginColor(new Color(0x35452a));
        btnAccept.setRadius(5);

        //---- btnReject ----
        btnReject.setText("T\u1eeb ch\u1ed1i");
        btnReject.setHorizontalAlignment(SwingConstants.CENTER);
        btnReject.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnReject.setBackground(new Color(0x3e3737));
        btnReject.setOriginColor(new Color(0x3e3737));
        btnReject.setRadius(5);
        btnReject.setHoverColor(new Color(0x9d2424));

        //---- txtLink ----
        txtLink.setBackground(new Color(0x252730));
        txtLink.setEditable(false);

        //---- label7 ----
        label7.setText("File th\u1ef1c thi game");
        label7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        //---- txtExecFilePath ----
        txtExecFilePath.setBackground(new Color(0x252730));
        txtExecFilePath.setEditable(false);

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
        txtRam.setEditable(false);

        //---- label12 ----
        label12.setText("Rom y\u00eau c\u1ea7u:");

        //---- txtRom ----
        txtRom.setPlaceholder("Megabyte");
        txtRom.setBackground(new Color(0x252730));
        txtRom.setEndGradientColor(new Color(0x252730));
        txtRom.setStartGradientColor(new Color(0x252730));
        txtRom.setEditable(false);

        //---- lblVersion ----
        lblVersion.setText("Phi\u00ean b\u1ea3n:");
        lblVersion.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        //---- txtVersion ----
        txtVersion.setBackground(new Color(0x252730));
        txtVersion.setEndGradientColor(new Color(0x252730));
        txtVersion.setStartGradientColor(new Color(0x252730));
        txtVersion.setEditable(false);

        //---- btnCancel ----
        btnCancel.setText("Cancel");
        btnCancel.setHorizontalAlignment(SwingConstants.CENTER);
        btnCancel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        btnCancel.setBackground(new Color(0x3e3737));
        btnCancel.setOriginColor(new Color(0x3e3737));
        btnCancel.setRadius(5);
        btnCancel.setHoverColor(Color.gray);

        //---- btnImgPreview ----
        btnImgPreview.setText("Preview");

        //---- txtAge ----
        txtAge.setRadius(0);
        txtAge.setForcusColor(new Color(0x0c8ce9));
        txtAge.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        txtAge.setEndGradientColor(new Color(0x252730));
        txtAge.setNoForcusColor(new Color(0x191b20));
        txtAge.setBackground(new Color(0x252730));
        txtAge.setStartGradientColor(new Color(0x252730));
        txtAge.setEditable(false);

        //---- btnCopy ----
        btnCopy.setText("Copy");

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
                            .addComponent(btnImgPreview)
                            .addContainerGap(444, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReject, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))
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
                                                .addComponent(txtAge, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE))
                                    .addGap(108, 108, 108)
                                    .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 798, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label11)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtRam, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(label12)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtRom, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(txtLink, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCopy)))
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(lblVersion)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtVersion, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))))
                            .addGap(99, 99, 99))))
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
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCost, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label10)
                    .addGap(18, 18, 18)
                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCopy)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtExecFilePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(41, 41, 41)
                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cboImages, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImgPreview, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(btnAccept, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReject, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
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
    private RadiusButton btnAccept;
    private RadiusButton btnReject;
    private JTextField txtLink;
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
    private RadiusButton btnCancel;
    private JButton btnImgPreview;
    private RadiusTextField txtAge;
    private JButton btnCopy;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        loadGameData();
        btnImgPreview.addActionListener(e -> showImagePreview());
        btnCopy.addActionListener(e -> copy());
        btnCancel.addActionListener(e -> dispose());
        btnAccept.addActionListener(e -> accept());
        btnReject.addActionListener(e -> reject());
    }

    private void loadGameData() {
        txtName.setText(pendingGame.getName());
        txtCost.setText(pendingGame.getGiaTien() + "");
        txtDescriptsion.setText(pendingGame.getMoTa());
        txtLink.setText(getLink());
        txtExecFilePath.setText(pendingGame.getExecPath());
        txtRam.setText(pendingGame.getRam() + "");
        txtRom.setText(pendingGame.getRom() + "");
        txtVersion.setText(pendingGame.getVersion());
        txtAge.setText(pendingGame.getAge() + "");
        ResourceManager.downloadGameResource(pendingGame);
        lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(pendingGame.getAvatarPath()), lblAvatar));
        imagesPath.forEach(cboImages::addItem);
    }

    private void showImagePreview() {
        List<PictureBox> pictureBoxes = new ArrayList<>();
        JDialog dialog = new JDialog(this);
        SlideShow slideShow = new SlideShow();
        for(String image : imagesPath) {
            PictureBox pictureBox = new PictureBox();
            pictureBox.setImage(new ImageIcon("data/games/" + pendingGame.getGameID() + "/" + pendingGame.getVersion() + "/images/" + image));
            pictureBoxes.add(pictureBox);
        }
        dialog.setLayout(new BoxLayout(dialog.getContentPane(), BoxLayout.Y_AXIS));
        slideShow.initSlideShow(pictureBoxes);
        dialog.add(slideShow);
        dialog.setSize(new Dimension(1400, 800));
        dialog.validate();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    private void accept() {
        String notification = XMessage.prompt(this,"Nhập thông điệp gửi đến người dùng:");
        phieuKiemDuyet.setThongBao(notification);
        phieuKiemDuyet.setStatus(PhieuKiemDuyet.ACCEPTED);
        int result = KiemDuyetDAO.getInstance().acceptGame(phieuKiemDuyet);
        if(result > 0) {
            kiemDuyet.fillTable();
            deleteOldVersion();
            XMessage.notificate(this, "Duyệt game thành công");
            dispose();
        } else {
            XMessage.alert(this, "Duyệt game thất bại");
        }
    }

    private void deleteOldVersion() {
        if(phieuKiemDuyet.getMoTa().contains("Update")) {
            AzureBlobService.deleteManyFile(currentVersion.getId() + "/" + currentVersion.getVersion(),"games");
        }
    }

    private void reject() {
        String notification = XMessage.prompt(this,"Nhập thông điệp gửi đến người dùng:");
        phieuKiemDuyet.setThongBao(notification);
        int result = KiemDuyetDAO.getInstance().rejectGame(phieuKiemDuyet);
        if(result > 0) {
            phieuKiemDuyet.setStatus(PhieuKiemDuyet.REJECTED);
            XMessage.notificate(this,"Đã từ chối");
            AzureBlobService.deleteManyFile(pendingGame.getGameID() + "/" + pendingGame.getVersion(),"games");
            kiemDuyet.fillTable();
            dispose();
        }
        else {
            XMessage.alert(this,"Lỗi");
        }
    }

    private void copy() {
        String link = txtLink.getText();
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(link), null);
        XMessage.notificate(this, "Link đã được copy vào clipboard");
    }

    private String getLink() {
        String link = AzureBlobConnector.gI().endPoint + "games/";
        return link + pendingGame.getGameID() + "/" + pendingGame.getVersion() + "/game.zip";
    }

}
