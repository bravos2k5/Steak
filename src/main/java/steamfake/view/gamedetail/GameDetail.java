package steamfake.view.gamedetail;

import steamfake.dao.AccountDAO;
import steamfake.dao.GameDAO;
import steamfake.dao.GameLibraryDAO;
import steamfake.graphics.CustomTextBox;
import steamfake.graphics.slider.SlideShow;
import steamfake.graphics.swing.PictureBox;
import steamfake.model.Game;
import steamfake.utils.*;
import steamfake.view.addmoney.AddMoney;
import steamfake.view.download.DownloadQueue;
import steamfake.view.gamelib.LibraryPanel;
import steamfake.view.login.LoginDialog;
import steamfake.view.mainframe.HeaderPanel;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class GameDetail extends JPanel {
    private final Game game;
    private final GameDetailPanel parentPanel;
    private static GameDetail instance;

    public GameDetail(Game game, GameDetailPanel parentPanel) {
        this.game = game;
        this.parentPanel = parentPanel;
        initComponents();
        initialize();
    }

    public static GameDetail getInstance(Game game, GameDetailPanel parentPanel) {
        if (instance == null) {
            instance = new GameDetail(game, parentPanel);
        }
        return instance;
    }


    private void btnBack(ActionEvent e) {
        slideImages.back();
    }

    private void btnNext(ActionEvent e) {
        slideImages.next();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        slideImages = new SlideShow();
        btnBack = new JButton();
        btnNext = new JButton();
        lblGameName = new JLabel();
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
        lblAge = new JLabel();
        lblLatestUpdate = new JLabel();
        panel4 = new JPanel();
        lblAvatar = new JLabel();
        label2 = new JLabel();
        subPanel = new JPanel();
        label3 = new JLabel();
        txtContent = new CustomTextBox();

        //======== this ========
        setBackground(new Color(0x191919));
        setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        setOpaque(false);

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
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

            //---- label2 ----
            label2.setText("\u0110\u00e3 \u0111\u01b0\u1ee3c ki\u1ec3m duy\u1ec7t");
            label2.setIcon(new ImageIcon(getClass().getResource("/icon/shield.png")));
            label2.setFont(new Font("Segoe UI", Font.PLAIN, 14));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(139, 139, 139)
                                    .addComponent(lblAge)
                                    .addGap(94, 94, 94))
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label2)
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
                                        .addComponent(label52))))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAge)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
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
                        .addGap(18, 18, 18)
                        .addComponent(label2)
                        .addGap(19, 19, 19))
            );
        }

        //======== subPanel ========
        {
            subPanel.setOpaque(false);
            subPanel.setMaximumSize(new Dimension(1102, 12000));
            subPanel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
            subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.Y_AXIS));

            //---- label3 ----
            label3.setText("B\u00ecnh lu\u1eadn");
            label3.setFont(new Font("Segoe UI", Font.PLAIN, 26));
            subPanel.add(label3);
        }

        //---- txtContent ----
        txtContent.setFont(new Font("Segoe UI", Font.PLAIN, 14));

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
                            .addComponent(lblGameName, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(panel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(slideImages, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(12, 12, 12)
                                    .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtContent, GroupLayout.PREFERRED_SIZE, 1102, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(subPanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(39, 39, 39))))
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
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(slideImages, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(174, 174, 174)
                                            .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(90, 90, 90)
                                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                    .addGap(42, 42, 42)
                    .addComponent(txtContent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(subPanel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private SlideShow slideImages;
    private JButton btnBack;
    private JButton btnNext;
    private JLabel lblGameName;
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
    private JLabel lblAge;
    private JLabel lblLatestUpdate;
    private JPanel panel4;
    private JLabel lblAvatar;
    private JLabel label2;
    private JPanel subPanel;
    private JLabel label3;
    private CustomTextBox txtContent;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        downloadResource();
        loadInfo();
        btnBuy.addActionListener(e -> {
            if (parentPanel.getGameLibrary() == null) {
                buyEvent();
            } else {
                playEvent();
            }
        });
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
        lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(game.getAvatarPath()), lblAvatar));
        lblAvatar.setText("");
        txtContent.setText("<br></br>" + game.getMoTa());
        lblAge.setText(game.getAge() + "+");
        btnBuy.setText(parentPanel.getGameLibrary() == null ? "Mua" : "Chơi");
        addImage();
    }

    private void addImage() {
        List<String> images = XJson.fromJson(game.getImages(), List.class);
        List<PictureBox> boxList = new ArrayList<>();
        if (images != null) {
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
        ResourceManager.downloadGameResource(game);
    }

    private void buyEvent() {
        if (SessionManager.user == null) {
            XMessage.alert(MFrame.getInstance(), "Vui lòng đăng nhập để mua game");
            new LoginDialog(MFrame.getInstance()).setVisible(true);
            if (SessionManager.isLogin()) {
                parentPanel.setGameLibrary(GameLibraryDAO.gI().selectByGameIdAndAccountId(game.getId(), SessionManager.user.getId()));
                loadInfo();
                parentPanel.loadComment();
                parentPanel.loadMyComment();
            }
            return;
        }
        if (parentPanel.getGameLibrary() == null) {
            if (SessionManager.user.getSoDuGame() >= game.getGiaTien()) {
                BillGame billGame = new BillGame(MFrame.getInstance(), game);
                billGame.setVisible(true);
                billGame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        if (BillGame.getIsOpen()) {
                            loadBuy();
                        }
                    }
                });

            } else {
                XMessage.alert(MFrame.getInstance(), "Số dư không đủ");
                if (XMessage.confirm(MFrame.getInstance(), "Bạn có muốn nạp tiền không") == JOptionPane.YES_OPTION) {
                    MFrame.getInstance().getMainPanel().removeAll();
                    MFrame.getInstance().getMainPanel().add(new AddMoney());
                    MFrame.getInstance().getMainPanel().revalidate();
                    MFrame.getInstance().getMainPanel().repaint();
                }
            }
        }
    }

    public void loadBuy() {
        if (BillGame.getInstance(MFrame.getInstance(), game).payGame()) {
            parentPanel.setGameLibrary(GameLibraryDAO.gI().selectByGameIdAndAccountId(game.getId(), SessionManager.user.getId()));
            SessionManager.updateMoneyAccount();
            HeaderPanel.getInstance().updateMoney();
            btnBuy.setText("Chơi");
            parentPanel.loadMyComment();
            LibraryPanel.gI().getLibraryMap().put(parentPanel.getGameLibrary(), game);
        }

    }


    private void playEvent() {
        String path = "games/" + game.getId() + "/" + game.getVersion() + "/" + game.getExecPath();
        if (new File(path).exists() && !DownloadQueue.gI().getDownloadingGames().contains(game)) {
            try {
                XFile.runExeFile(path);
            } catch (IOException e) {
                XMessage.alert(MFrame.getInstance(), "Lỗi: " + e.getMessage());
            }
            return;
        }
        if (!DownloadQueue.gI().getDownloadingGames().contains(game)) {
            DownloadQueue.gI().addNewDownload(game);
            DownloadQueue.gI().setVisible(true);
        } else {
            XMessage.alert(MFrame.getInstance(), "Game đang được tải xuống");
        }

    }

    public JButton getBtnBuy() {
        return btnBuy;
    }

    public GameDetailPanel getParentPanel() {
        return parentPanel;
    }
}
