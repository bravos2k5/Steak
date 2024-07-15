package steamfake.view.gamedetail;

import steamfake.dao.AccountDAO;
import steamfake.dao.GameLibraryDAO;
import steamfake.graphics.CustomTextBox;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.slider.SlideShow;
import steamfake.graphics.swing.PictureBox;
import steamfake.model.Game;
import steamfake.model.GameLibrary;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;
import steamfake.utils.XJson;
import steamfake.utils.azure.AzureBlobService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class GameDetail extends JPanel {

    private Game game;

    public GameDetail(Game game) {
        initComponents();
        this.game = game;
        initialize();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        slideImages = new SlideShow();
        btnBack = new JButton();
        btnNext = new JButton();
        lblGameName = new JLabel();
        separator1 = new JSeparator();
        label1 = new JLabel();
        panel1 = new JPanel();
        lbWindows = new JLabel();
        label41 = new JLabel();
        lblRam = new JLabel();
        label42 = new JLabel();
        lblRom = new JLabel();
        label5 = new JLabel();
        panel2 = new JPanel();
        btnBuy = new JButton();
        lblCost = new JLabel();
        label52 = new JLabel();
        label55 = new JLabel();
        lblPublisher = new JLabel();
        separator4 = new JSeparator();
        lbl999 = new JLabel();
        lblRelease = new JLabel();
        separator6 = new JSeparator();
        label59 = new JLabel();
        separator7 = new JSeparator();
        btnComment = new RadiusButton();
        lblAge = new JLabel();
        lblLatestUpdate = new JLabel();
        panel4 = new JPanel();
        lblAvatar = new JLabel();
        lblGenres = new JLabel();
        panel3 = new JPanel();
        hSpacer2 = new JPanel(null);
        txtContent = new CustomTextBox();
        hSpacer1 = new JPanel(null);

        //======== this ========
        setBackground(new Color(0x191919));
        setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        //======== slideImages ========
        {
            slideImages.setBorder(null);
            slideImages.setOpaque(false);
        }

        //---- btnBack ----
        btnBack.setText("<");
        btnBack.addActionListener(e -> btnBack(e));

        //---- btnNext ----
        btnNext.setText(">");
        btnNext.addActionListener(e -> btnNext(e));

        //---- lblGameName ----
        lblGameName.setText("Zenless Zone Zero");
        lblGameName.setForeground(Color.white);
        lblGameName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 26));

        //---- separator1 ----
        separator1.setBackground(new Color(0x939393));
        separator1.setOrientation(SwingConstants.VERTICAL);
        separator1.setOpaque(true);
        separator1.setForeground(new Color(0x939393));

        //---- label1 ----
        label1.setText("Genres");
        label1.setForeground(new Color(0x939393));
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x444444));

            //---- lbWindows ----
            lbWindows.setText("Y\u00eau c\u1ea7u h\u1ec7 th\u1ed1ng");
            lbWindows.setForeground(Color.white);
            lbWindows.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label41 ----
            label41.setText("RAM t\u1ed1i thi\u1ec3u:");

            //---- lblRam ----
            lblRam.setText("1024 MB");
            lblRam.setForeground(Color.white);

            //---- label42 ----
            label42.setText("ROM t\u1ed1i thi\u1ec3u:");

            //---- lblRom ----
            lblRom.setText("2000 MB");

            //---- label5 ----
            label5.setText("H\u1ec7 \u0111i\u1ec1u h\u00e0nh Window 10 tr\u1edf l\u00ean");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(lbWindows)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(24, 24, 24)
                                .addComponent(label41)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRam, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label42)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRom)))
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbWindows)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(label42)
                            .addComponent(lblRom)
                            .addComponent(label41)
                            .addComponent(lblRam))
                        .addContainerGap(44, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setOpaque(false);

            //---- btnBuy ----
            btnBuy.setText("Mua");
            btnBuy.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            btnBuy.setBackground(new Color(0x007fff));
            btnBuy.setForeground(Color.white);

            //---- lblCost ----
            lblCost.setText("9.999$");
            lblCost.setForeground(Color.white);
            lblCost.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

            //---- label52 ----
            label52.setText("C\u00f3 th\u1ec3 ch\u1ee9a mua h\u00e0ng trong \u1ee9ng d\u1ee5ng");

            //---- label55 ----
            label55.setText("Publisher ");

            //---- lblPublisher ----
            lblPublisher.setForeground(Color.white);
            lblPublisher.setHorizontalAlignment(SwingConstants.RIGHT);
            lblPublisher.setText("aas");

            //---- lbl999 ----
            lbl999.setText("Release Date");

            //---- lblRelease ----
            lblRelease.setText("07/02/24");
            lblRelease.setForeground(Color.white);
            lblRelease.setHorizontalAlignment(SwingConstants.RIGHT);

            //---- label59 ----
            label59.setText("Latest Update");

            //---- btnComment ----
            btnComment.setText("\u0110\u00c1NH GI\u00c1");

            //---- lblAge ----
            lblAge.setText("12+");
            lblAge.setForeground(Color.white);
            lblAge.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 26));

            //---- lblLatestUpdate ----
            lblLatestUpdate.setText("07/02/24");
            lblLatestUpdate.setForeground(Color.white);
            lblLatestUpdate.setHorizontalAlignment(SwingConstants.RIGHT);

            //======== panel4 ========
            {
                panel4.setOpaque(false);

                //---- lblAvatar ----
                lblAvatar.setPreferredSize(new Dimension(219, 198));
                lblAvatar.setMaximumSize(new Dimension(219, 198));
                lblAvatar.setMinimumSize(new Dimension(219, 198));

                GroupLayout panel4Layout = new GroupLayout(panel4);
                panel4.setLayout(panel4Layout);
                panel4Layout.setHorizontalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblAvatar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
                panel4Layout.setVerticalGroup(
                    panel4Layout.createParallelGroup()
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblAvatar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
            }

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCost)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label55)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPublisher, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separator4)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(lbl999)
                                        .addGap(119, 119, 119)
                                        .addComponent(lblRelease))
                                    .addComponent(separator6)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label59, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLatestUpdate))
                                    .addComponent(separator7, GroupLayout.Alignment.TRAILING)
                                    .addComponent(label52))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addComponent(lblAge)
                                    .addGap(94, 94, 94)))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnComment, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addContainerGap(44, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAge)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblCost)
                        .addGap(12, 12, 12)
                        .addComponent(label52)
                        .addGap(12, 12, 12)
                        .addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label55)
                            .addComponent(lblPublisher))
                        .addGap(6, 6, 6)
                        .addComponent(separator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(lbl999)
                            .addComponent(lblRelease))
                        .addGap(6, 6, 6)
                        .addComponent(separator6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label59)
                            .addComponent(lblLatestUpdate))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnComment, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
            );
        }

        //---- lblGenres ----
        lblGenres.setText("text");

        //======== panel3 ========
        {
            panel3.setOpaque(false);
            panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

            //---- hSpacer2 ----
            hSpacer2.setBackground(Color.white);
            panel3.add(hSpacer2);

            //---- txtContent ----
            txtContent.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            panel3.add(txtContent);

            //---- hSpacer1 ----
            hSpacer1.setBackground(Color.white);
            hSpacer1.setForeground(Color.white);
            panel3.add(hSpacer1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(panel3, GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(slideImages, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup()
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup()
                                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblGenres, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 180, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(39, 39, 39))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(421, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addGap(318, 318, 318))
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup()
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(slideImages, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label1)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblGenres))
                                            .addComponent(separator1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)))
                    .addComponent(panel3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1211, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private SlideShow slideImages;
    private JButton btnBack;
    private JButton btnNext;
    private JLabel lblGameName;
    private JSeparator separator1;
    private JLabel label1;
    private JPanel panel1;
    private JLabel lbWindows;
    private JLabel label41;
    private JLabel lblRam;
    private JLabel label42;
    private JLabel lblRom;
    private JLabel label5;
    private JPanel panel2;
    private JButton btnBuy;
    private JLabel lblCost;
    private JLabel label52;
    private JLabel label55;
    private JLabel lblPublisher;
    private JSeparator separator4;
    private JLabel lbl999;
    private JLabel lblRelease;
    private JSeparator separator6;
    private JLabel label59;
    private JSeparator separator7;
    private RadiusButton btnComment;
    private JLabel lblAge;
    private JLabel lblLatestUpdate;
    private JPanel panel4;
    private JLabel lblAvatar;
    private JLabel lblGenres;
    private JPanel panel3;
    private JPanel hSpacer2;
    private CustomTextBox txtContent;
    private JPanel hSpacer1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        downloadResource();
        loadInfo();
    }


    private void loadInfo() {
        lblGameName.setText(game.getName());
        lblRam.setText(game.getRam() + " MB");
        lblRom.setText(game.getRom() + " MB");
        lblCost.setText(game.getGiaTien() + " VND");
        lblPublisher.setText(AccountDAO.gI().selectUsernameByID(game.getPublisherID()));
        lblRelease.setText(game.getReleaseDate().toString());
        lblLatestUpdate.setText(game.getUpdateDate().toString());
        lblAvatar.setSize(new Dimension(219, 198));
        lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon("data/games/" + game.getId() + "/" + game.getVersion() + "/images/" + game.getAvatar()), lblAvatar));
        lblAvatar.setText("");
        txtContent.setText("<br></br>" + game.getMoTa());
        lblAge.setText(game.getAge() + "+");
        addImage();
        buyEvent();
        loadComment();
    }

    private void addImage() {
        List<String> images = XJson.fromJson(game.getImages(), List.class);
        List<PictureBox> boxList = new ArrayList<>();
        if(images != null) {
            for (String image : images) {
                if (!image.equals(game.getAvatar())) {
                    PictureBox pictureBox = new PictureBox();
                    pictureBox.setImage(new ImageIcon("data/games/" + game.getId() + "/" + game.getVersion() + "/images/" + image));
                    boxList.add(pictureBox);
                }
            }
            slideImages.initSlideShow(boxList);
        }
    }

    private void downloadResource() {
        String folderResource = "data/games/" + game.getId() + "/images/";
        List<String> images = XJson.fromJson(game.getImages(), List.class);
        List<String> existImages = new ArrayList<>();
        if(images != null && !images.isEmpty()) {
            images.add(game.getAvatar());
            for(String image : images) {
                if(new File(folderResource + image).exists()) {
                    existImages.add(game.getId() + "/" + game.getVersion() + "/" + image);
                }
            }
            if(!existImages.isEmpty()) {
                AzureBlobService.downloadManyFileExcept(folderResource,
                        game.getId() + "/" + game.getVersion() + "/" + "/images", "games", existImages);
            }
            else {
                AzureBlobService.downloadManyFile(folderResource,game.getId() + "/images", "games");
            }
        }
    }

    private void buyEvent() {

    }

    private void loadComment() {

    }

    private void generalRole() {
        GameLibrary gameLibrary = GameLibraryDAO.gI().selectByGameIdAndAccountId(game.getId(), SessionManager.user.getId());
        if(gameLibrary != null) {
            btnBuy.setText("Play"); /// Tu tu xu ly
        }
    }

    private void btnBack(ActionEvent e) {
        slideImages.back();
    }

    private void btnNext(ActionEvent e) {
        slideImages.next();
    }



}
