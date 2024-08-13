/*
 * Created by JFormDesigner on Sun Jul 07 12:08:40 ICT 2024
 */

package steamfake.view.gamelib;

import steamfake.graphics.RadiusLabel;
import steamfake.model.Game;
import steamfake.model.GameLibrary;
import steamfake.utils.GameChecker;
import steamfake.utils.ResourceManager;
import steamfake.utils.XImage;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * @author ACER
 */
public class GameLibraryItem extends JPanel {

    private final GameLibrary gameLibrary;
    private final Game game;

    public GameLibraryItem(GameLibrary gameLibrary, Game game) {
        initComponents();
        this.game = game;
        this.gameLibrary = gameLibrary;
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        separator2 = new JSeparator();
        txtName = new JLabel();
        lblPlay = new RadiusLabel();
        lblInfo = new JLabel();
        lblIcon = new JLabel();
        btnUninstall = new JButton();

        //======== this ========
        setBackground(new Color(0x191b20));

        //---- separator2 ----
        separator2.setOpaque(true);
        separator2.setBackground(new Color(0x818181));
        separator2.setForeground(new Color(0x818181));

        //---- txtName ----
        txtName.setText("text");
        txtName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        txtName.setHorizontalAlignment(SwingConstants.LEFT);
        txtName.setForeground(Color.white);

        //---- lblPlay ----
        lblPlay.setText("Play");
        lblPlay.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        lblPlay.setBackground(new Color(0x3d8a00));
        lblPlay.setForeground(Color.white);
        lblPlay.setRadius(20);

        //---- lblInfo ----
        lblInfo.setIcon(new ImageIcon(getClass().getResource("/icon/info.png")));
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lblInfo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //---- btnUninstall ----
        btnUninstall.setText("Uninstall");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, GroupLayout.PREFERRED_SIZE, 681, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUninstall)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInfo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblPlay, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                        .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 1093, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPlay, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblInfo, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(txtName)
                                .addComponent(btnUninstall))
                            .addGap(11, 11, 11)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JSeparator separator2;
    private JLabel txtName;
    private RadiusLabel lblPlay;
    private JLabel lblInfo;
    private JLabel lblIcon;
    private JButton btnUninstall;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        txtName.setText(game.getName());
        lblIcon.setText("");
        lblIcon.setSize(new Dimension(100,60));
        if(!new File("data/games/" + game.getId() + "/images/" + game.getAvatar()).exists()) {
            ResourceManager.downloadAvatarGameOnly(game);
        }
        lblIcon.setIcon(XImage.scaleImageForLabel(new ImageIcon(game.getAvatarPath()),lblIcon));
        initEvent();
        lblPlay.setText(isDownloaded() ? "Chơi" : "Tải");
        btnUninstall.setVisible(isDownloaded());
        btnUninstall.addActionListener(e -> uninstall());
        lblPlay.repaint();
    }

    private void uninstall() {
        if (XMessage.confirm(MFrame.gI(),"Ban co chac muon go cai dat?") == JOptionPane.YES_OPTION) {
            new File("games/" + game.getId() + "/" + game.getVersion() + "/" + game.getExecPath()).delete();
            btnUninstall.setVisible(false);
            lblPlay.setText("Tải");
            LibraryPanel.gI().handleUninstall(this);
        }
    }

    private void initEvent() {
        lblPlay.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playAction();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblPlay.setBackground(new Color(0x3d8a00).brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblPlay.setBackground(new Color(0x3d8a00));
            }
        });
        lblInfo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showInfoAction();
            }
        });
    }

    private void showInfoAction() {
        XMessage.notificate(MFrame.gI(),"ID game: " + game.getId() + "\n" +
                "Ngày mua: " + gameLibrary.getNgayMua() + "\n" +
                "Giá mua: " + gameLibrary.getGiaMua());
    }

    private void playAction() {
        GameChecker.decide(game);
    }

    public boolean isDownloaded() {
        return new File("games/" + game.getId() + "/" + game.getVersion() + "/" + game.getExecPath()).exists();
    }

}
