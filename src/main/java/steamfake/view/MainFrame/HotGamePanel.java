/*
 * Created by JFormDesigner on Fri Jul 05 21:47:12 ICT 2024
 */

package steamfake.view.MainFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import steamfake.graphics.*;

/**
 * @author ACER
 */
public class HotGamePanel extends JPanel {
    public HotGamePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lbImage = new RadiusLabel();
        panel1 = new JPanel();
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

        //======== this ========
        setBackground(new Color(0x191b20));

        //---- lbImage ----
        lbImage.setBorderColor(null);
        lbImage.setBorderWidth(0);
        lbImage.setRadius(7);
        lbImage.setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //---- lblNameGame ----
            lblNameGame.setText("Zenless Zone Zero");
            lblNameGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));

            //---- separator1 ----
            separator1.setOrientation(SwingConstants.VERTICAL);
            separator1.setBackground(Color.white);
            separator1.setForeground(Color.white);
            separator1.setOpaque(true);

            //---- lblDownloads ----
            lblDownloads.setText("110k");
            lblDownloads.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 28));

            //---- label3 ----
            label3.setIcon(new ImageIcon(getClass().getResource("/icon/DownloadHotgame.png")));

            //---- separator2 ----
            separator2.setOrientation(SwingConstants.VERTICAL);
            separator2.setBackground(Color.white);
            separator2.setForeground(Color.white);
            separator2.setOpaque(true);

            //---- lblReviews ----
            lblReviews.setText("95/100");
            lblReviews.setFont(new Font("Inter", Font.BOLD, 24));

            //---- label5 ----
            label5.setIcon(new ImageIcon(getClass().getResource("/icon/Star.png")));

            //---- separator3 ----
            separator3.setOrientation(SwingConstants.VERTICAL);
            separator3.setBackground(Color.white);
            separator3.setForeground(Color.white);
            separator3.setOpaque(true);

            //---- lblPrice ----
            lblPrice.setText("9.900 $");
            lblPrice.setFont(new Font("Inter", Font.BOLD, 24));
            lblPrice.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label7 ----
            label7.setIcon(new ImageIcon(getClass().getResource("/icon/Windows 12.png")));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNameGame, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
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
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(lblNameGame, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDownloads, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(separator1)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label5, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblReviews, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblPrice, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(label7, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
            );
        }

        //---- lblLeft ----
        lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
        lblLeft.setIcon(new ImageIcon(getClass().getResource("/icon/Back.png")));

        //---- lblRight ----
        lblRight.setHorizontalAlignment(SwingConstants.CENTER);
        lblRight.setIcon(new ImageIcon(getClass().getResource("/icon/Next.png")));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lblLeft)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblRight)
                    .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(lbImage, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(lblLeft))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(181, 181, 181)
                            .addComponent(lblRight)))
                    .addGap(18, 18, 18)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private RadiusLabel lbImage;
    private JPanel panel1;
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
