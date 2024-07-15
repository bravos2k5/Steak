/*
 * Created by JFormDesigner on Fri Jul 05 21:47:12 ICT 2024
 */

package steamfake.view;

import steamfake.dao.GameDAO;
import steamfake.graphics.slider.SlideShow;
import steamfake.graphics.swing.PictureBox;
import steamfake.model.Game;
import steamfake.utils.XJson;
import steamfake.utils.azure.AzureBlobService;
import steamfake.view.mainframe.MFrame;
import steamfake.view.waiting.WaitingDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ACER
 */
public class HotGamePanel2 extends JPanel {

    private final Game game;

    public HotGamePanel2(Game game) {
        this.game = game;
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        pnlInfo = new JPanel();
        lblNameGame = new JLabel();
        separator1 = new JSeparator();
        lblDownloads = new JLabel();
        label3 = new JLabel();
        separator2 = new JSeparator();
        lblReviews = new JLabel();
        label5 = new JLabel();
        separator3 = new JSeparator();
        lblPrice = new JLabel();
        label7 = new JLabel();
        lblLeft = new JLabel();
        lblRight = new JLabel();
        panel1 = new JPanel();
        slsImages = new SlideShow();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== pnlInfo ========
        {
            pnlInfo.setBackground(new Color(0x252730));

            //---- lblNameGame ----
            lblNameGame.setText("Zenless Zone Zero");
            lblNameGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            lblNameGame.setHorizontalAlignment(SwingConstants.CENTER);

            //---- separator1 ----
            separator1.setOrientation(SwingConstants.VERTICAL);
            separator1.setBackground(Color.white);
            separator1.setForeground(Color.white);
            separator1.setOpaque(true);

            //---- lblDownloads ----
            lblDownloads.setText("110k");
            lblDownloads.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
            lblDownloads.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label3 ----
            label3.setIcon(new ImageIcon(getClass().getResource("/icon/DownloadHotgame.png")));

            //---- separator2 ----
            separator2.setOrientation(SwingConstants.VERTICAL);
            separator2.setBackground(Color.white);
            separator2.setForeground(Color.white);
            separator2.setOpaque(true);

            //---- lblReviews ----
            lblReviews.setText("95/100");
            lblReviews.setFont(new Font("Inter", Font.BOLD, 22));

            //---- label5 ----
            label5.setIcon(new ImageIcon(getClass().getResource("/icon/Star.png")));

            //---- separator3 ----
            separator3.setOrientation(SwingConstants.VERTICAL);
            separator3.setBackground(Color.white);
            separator3.setForeground(Color.white);
            separator3.setOpaque(true);

            //---- lblPrice ----
            lblPrice.setText("9.900 $");
            lblPrice.setFont(new Font("Inter", Font.BOLD, 16));
            lblPrice.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label7 ----
            label7.setIcon(new ImageIcon(getClass().getResource("/icon/Windows 12.png")));

            GroupLayout pnlInfoLayout = new GroupLayout(pnlInfo);
            pnlInfo.setLayout(pnlInfoLayout);
            pnlInfoLayout.setHorizontalGroup(
                pnlInfoLayout.createParallelGroup()
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNameGame, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblDownloads, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(separator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblReviews, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5)
                        .addGap(29, 29, 29)
                        .addComponent(separator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(7, Short.MAX_VALUE))
            );
            pnlInfoLayout.setVerticalGroup(
                pnlInfoLayout.createParallelGroup()
                    .addComponent(lblDownloads, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlInfoLayout.createParallelGroup()
                            .addComponent(separator1)
                            .addGroup(pnlInfoLayout.createSequentialGroup()
                                .addGroup(pnlInfoLayout.createParallelGroup()
                                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label5, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblReviews, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblPrice, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(label7, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNameGame, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }

        //---- lblLeft ----
        lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
        lblLeft.setIcon(new ImageIcon(getClass().getResource("/icon/Back.png")));

        //---- lblRight ----
        lblRight.setHorizontalAlignment(SwingConstants.CENTER);
        lblRight.setIcon(new ImageIcon(getClass().getResource("/icon/Next.png")));

        //======== panel1 ========
        {
            panel1.setOpaque(false);
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

            //======== slsImages ========
            {
                slsImages.setPreferredSize(new Dimension(960, 540));
                slsImages.setBackground(new Color(0x191b20));
                slsImages.setOpaque(true);
            }
            panel1.add(slsImages);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(lblLeft)
                    .addGap(18, 18, 18)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 1004, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblRight)
                    .addGap(28, 28, 28))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(503, 503, 503)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lblRight)
                                .addComponent(lblLeft))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(43, Short.MAX_VALUE)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62)))
                    .addComponent(pnlInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel pnlInfo;
    private JLabel lblNameGame;
    private JSeparator separator1;
    private JLabel lblDownloads;
    private JLabel label3;
    private JSeparator separator2;
    private JLabel lblReviews;
    private JLabel label5;
    private JSeparator separator3;
    private JLabel lblPrice;
    private JLabel label7;
    private JLabel lblLeft;
    private JLabel lblRight;
    private JPanel panel1;
    private SlideShow slsImages;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        lblLeft.setOpaque(true);
        lblRight.setOpaque(true);
        initEvent();
        downloadResource();
        loadInfo();
    }

    private void loadInfo() {
        lblNameGame.setText(game.getName());
        lblPrice.setText(game.getGiaTien() + " VND");
        lblReviews.setText(GameDAO.gI().selectAvgRate(game) + "");
        lblDownloads.setText(GameDAO.gI().selectLuotTai(game) + "");
        List<String> images = XJson.fromJson(game.getImages(), List.class);
        List<PictureBox> pictureBoxes = new ArrayList<>();
        if (images != null && !images.isEmpty()) {
            for(String image: images) {
                PictureBox pictureBox = new PictureBox();
                pictureBox.setImage(new ImageIcon("data/games/" + game.getId() + "/" + game.getVersion() + "/images/" + image));
                pictureBoxes.add(pictureBox);
            }
            slsImages.initSlideShow(pictureBoxes);
        }
    }

    private void downloadResource() {
        String folderResource = "data/games/" + game.getId() + "/" + game.getVersion() + "/images/";
        List<String> images = XJson.fromJson(game.getImages(), List.class);
        List<String> existedImages = new ArrayList<>();
        if (images != null && !images.isEmpty()) {
            images.add(game.getAvatar());
            for(String image: images ) {
                String path = folderResource + "/" + image;
                if(new File(path).exists()) {
                    existedImages.add(game.getId() + "/" + game.getVersion() + "/images/" + image);
                }
            }
            AzureBlobService.downloadManyFileExcept(folderResource, game.getId() + "/" + game.getVersion() + "/images", "games", existedImages);
        }
    }

    private void initEvent() {
        lblLeft.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slsImages.back();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblLeft.setBackground(Color.GRAY);
                lblLeft.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblLeft.setBackground(new Color(0x191B20));
                lblLeft.repaint();
            }
        });

        lblRight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                slsImages.next();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblRight.setBackground(Color.GRAY);
                lblRight.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblRight.setBackground(new Color(0x191B20));
                lblRight.repaint();
            }
        });

        pnlInfo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                WaitingDialog waitingDialog = new WaitingDialog(MFrame.getInstance());
                waitingDialog.start();
                Thread thread = new Thread(() -> {
                    MFrame.getInstance().showGameDetail(game);
                    waitingDialog.stop();
                });
                thread.start();
            }
        });
    }

}
