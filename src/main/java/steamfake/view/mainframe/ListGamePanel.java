/*
 * Created by JFormDesigner on Fri Jul 05 23:06:40 ICT 2024
 */

package steamfake.view.mainframe;

import steamfake.dao.GameDAO;
import steamfake.graphics.RadiusLabel;
import steamfake.graphics.RadiusPanel;
import steamfake.model.Game;
import steamfake.utils.XImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author ACER
 */
public class ListGamePanel extends JPanel {

    private final Game game;

    public ListGamePanel(Game game) {
        this.game = game;
        initComponents();
        loadInfo();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        radiusPanel1 = new RadiusPanel();
        lblImageGame = new JLabel();
        lblNameGame = new JLabel();
        lblReviews = new JLabel();
        label4 = new JLabel();
        lblDownload = new RadiusLabel();
        lblPrice = new RadiusLabel();
        lblPublisher = new RadiusLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== radiusPanel1 ========
        {
            radiusPanel1.setBackground(new Color(0x252730));
            radiusPanel1.setRadius(22);
            radiusPanel1.setBorderColor(new Color(0x252730));

            //---- lblImageGame ----
            lblImageGame.setIcon(new ImageIcon(getClass().getResource("/icon/DownloadHotgame.png")));
            lblImageGame.setHorizontalAlignment(SwingConstants.CENTER);

            //---- lblNameGame ----
            lblNameGame.setText("Zenless Zone Zero");
            lblNameGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));

            //---- lblReviews ----
            lblReviews.setText("100/100");
            lblReviews.setFont(new Font("Inter", Font.BOLD, 24));
            lblReviews.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/icon/Star.png")));
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- lblDownload ----
            lblDownload.setText("110k");
            lblDownload.setIcon(new ImageIcon(getClass().getResource("/icon/Downloadsmall.png")));
            lblDownload.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            lblDownload.setFont(new Font("Inter", Font.BOLD, 22));
            lblDownload.setRadius(0);
            lblDownload.setBorderColor(Color.white);

            //---- lblPrice ----
            lblPrice.setText("9.990$");
            lblPrice.setBackground(new Color(0x191b20));
            lblPrice.setFont(new Font("Inter", Font.BOLD, 24));

            //---- lblPublisher ----
            lblPublisher.setText("Publisher by Admin");
            lblPublisher.setBackground(new Color(0x252730));
            lblPublisher.setFont(new Font("Inter", Font.BOLD, 22));
            lblPublisher.setBorderColor(new Color(0x252730));
            lblPublisher.setHorizontalAlignment(SwingConstants.RIGHT);

            GroupLayout radiusPanel1Layout = new GroupLayout(radiusPanel1);
            radiusPanel1.setLayout(radiusPanel1Layout);
            radiusPanel1Layout.setHorizontalGroup(
                radiusPanel1Layout.createParallelGroup()
                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblImageGame, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(radiusPanel1Layout.createParallelGroup()
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addComponent(lblReviews, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(lblPublisher, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE))
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addComponent(lblNameGame, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
            );
            radiusPanel1Layout.setVerticalGroup(
                radiusPanel1Layout.createParallelGroup()
                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(radiusPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImageGame, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addGroup(radiusPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNameGame, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(radiusPanel1Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, radiusPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPublisher, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label4, GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblReviews, GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(27, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusPanel radiusPanel1;
    private JLabel lblImageGame;
    private JLabel lblNameGame;
    private JLabel lblReviews;
    private JLabel label4;
    private RadiusLabel lblDownload;
    private RadiusLabel lblPrice;
    private RadiusLabel lblPublisher;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        loadInfo();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MFrame.getInstance().showGameDetail(game);
            }
        });
    }

    private void loadInfo() {
        lblDownload.setText(GameDAO.gI().selectLuotTai(game) + "");
        lblNameGame.setText(game.getName());
        lblPrice.setText(game.getGiaTien() + " VND");
        lblReviews.setText(GameDAO.gI().selectAvgRate(game) + "");
        lblPublisher.setText("Publisher by " + GameDAO.gI().selectUsernamePublisher(game));
        lblImageGame.setSize(new Dimension(200, 100));
        lblImageGame.setIcon(XImage.scaleImageForLabel(new ImageIcon("data/games/" + game.getId() + "/" + game.getVersion() +  "/images/" + game.getAvatar()), lblImageGame));
    }



}
