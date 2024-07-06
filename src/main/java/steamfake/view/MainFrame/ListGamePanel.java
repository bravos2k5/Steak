/*
 * Created by JFormDesigner on Fri Jul 05 23:06:40 ICT 2024
 */

package steamfake.view.MainFrame;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.graphics.*;


/**
 * @author ACER
 */
public class ListGamePanel extends JPanel {
    public ListGamePanel() {
        initComponents();

        lblNameCreator.setText("<html><p style=\\\"max-width:180px;text-align:center\\\">COGNOSPHERE PTE. LTD.");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        radiusPanel1 = new RadiusPanel();
        lblImageGame = new JLabel();
        lblNameGame = new JLabel();
        lblReviews = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        lblDownload = new RadiusLabel();
        lblPrice = new RadiusLabel();
        lblNameCreator = new RadiusLabel();

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
            lblReviews.setText("95/100");
            lblReviews.setFont(new Font("Inter", Font.BOLD, 24));
            lblReviews.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/icon/Star.png")));
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label6 ----
            label6.setIcon(new ImageIcon(getClass().getResource("/icon/Windows 12.png")));
            label6.setHorizontalAlignment(SwingConstants.CENTER);

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

            //---- lblNameCreator ----
            lblNameCreator.setBackground(new Color(0x191b20));
            lblNameCreator.setRadius(11);
            lblNameCreator.setFont(new Font("Inter", Font.BOLD, 24));

            GroupLayout radiusPanel1Layout = new GroupLayout(radiusPanel1);
            radiusPanel1.setLayout(radiusPanel1Layout);
            radiusPanel1Layout.setHorizontalGroup(
                radiusPanel1Layout.createParallelGroup()
                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblImageGame, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(radiusPanel1Layout.createParallelGroup()
                            .addComponent(lblNameGame, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addComponent(lblReviews, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNameCreator, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
            );
            radiusPanel1Layout.setVerticalGroup(
                radiusPanel1Layout.createParallelGroup()
                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                        .addGroup(radiusPanel1Layout.createParallelGroup()
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(radiusPanel1Layout.createParallelGroup()
                                    .addComponent(lblImageGame, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(radiusPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNameGame, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(radiusPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblReviews, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDownload, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblNameCreator, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(radiusPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67))
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
    private JLabel label6;
    private RadiusLabel lblDownload;
    private RadiusLabel lblPrice;
    private RadiusLabel lblNameCreator;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
