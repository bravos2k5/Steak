/*
 * Created by JFormDesigner on Wed Jul 10 17:40:04 ICT 2024
 */

package steamfake.view.gameDetalPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import steamfake.graphics.*;

import steamfake.graphics.slideShow.Slideshow;
import steamfake.view.gameDetalPanel.slide.*;

/**
 * @author ADMIN
 */
public class GameDetal extends JPanel {

    private boolean isExpanded = false;

    public GameDetal() {
        initComponents();
        LayerPanelSlide.initSlideshow(new slide1(), new slide2(), new slide3(), new silde4(), new slide5());
        lbNoidung.setText(text);
    }
    String text = "<html>Welcome to New Eridu — Where Humanity Rises Anew!<br><br>"
            + "Don't go into Hollows.<br>"
            + "I know, I know, there are Ether resources in the Hollows, bizarre creations, even ruins of the old civilization — all invaluable treasures.<br>"
            + "But don't forget about the spatial disorder, the monsters, and mutants running rampant. Ultimately, this is a disaster that could swallow the world. Hollows are not where ordinary people should go.<br>"
            + "So don't go into Hollows.<br>"
            + "Or at least, don't go in alone.<br>"
            + "If you insist on getting into danger, go to New Eridu first.<br>"
            + "This city full of people from all walks of life has many who need the Hollows: powerful and wealthy tycoons, gangs who rule the streets, schemers hiding in the shadows, and ruthless officials.<br>"
            + "Make your preparations there, find strong allies, and most importantly...<br>"
            + "Find a 'Proxy.'<br>"
            + "Only they can guide people out of labyrinthian Hollows.<br>"
            + "Good luck.<br>"
            + "<br>"
            + "Zenless Zone Zero is an all-new 3D action game from HoYoverse that takes place in a near future, with the world plagued by a mysterious disaster known as 'Hollows.'<br>"
            + "<br>"
            + "Dual Identities, a Singular Experience<br>"
            + "In the near future, a mysterious natural disaster known as 'Hollows' has occurred. A new kind of city has emerged in this disaster-ridden world — New Eridu. This last oasis has mastered the technology to co-exist with Hollows and is home to a whole host of chaotic, boisterous, dangerous, and very active factions. As a professional Proxy, you play a crucial role in linking the city and the Hollows. Your story awaits.<br>"
            + "<br>"
            + "Build Your Squad and Fight Fast-Paced Battles<br>"
            + "Zenless Zone Zero is an all-new 3D action game from HoYoverse, here to provide a thrilling combat experience. Build a squad of up to three and begin your assault with Basic and Special Attacks. Dodge and Parry to neutralize your opponents' counterattacks, and when they're Stunned, unleash a powerful combo of Chain Attacks to finish them off! Remember, different opponents have different traits, and it would be prudent to use their weaknesses to your advantage.<br>"
            + "<br>"
            + "Immerse Yourself in the Unique Style and Music<br>"
            + "Zenless Zone Zero has a unique visual style and design. With its carefully crafted character expressions and fluid movements, you'll easily feel immersed in the fascinating world as you embark on your own journey~ And of course, every VIP deserves their very own soundtrack, so you'll also have emotional beats full of drip to accompany you in each unforgettable moment~<br>"
            + "<br>"
            + "Various Factions and Stories Entwined<br>"
            + "Random Play can't operate without videotapes, and Proxies can't operate without Agents. In New Eridu, customers from all walks will come knocking. So don't be fooled by their innocent and cute appearances, don't be afraid of those who tower over you and look dangerous, and don't turn away the fluffy ones who might shed fur all over your spotless floor. Go and talk with them, learn about their unique experiences, and allow them to become your friends and allies. After all, this is a long path, and only with companions will you be able to walk far~</html>";

    private void btnBack(ActionEvent e) {
        LayerPanelSlide.back();
    }

    private void btnNext(ActionEvent e) {
        LayerPanelSlide.next();
    }

    private void PanelTuoiMouseEntered(MouseEvent e) {
        PanelTuoi.setBackground(Color.decode("#555555"));
    }

    private void PanelTuoiMouseExited(MouseEvent e) {
        PanelTuoi.setBackground(Color.decode("#191919"));
    }

    private void lbActionMouseEntered(MouseEvent e) {
        lbAction.setForeground(Color.decode("#555555"));
    }

    private void lbActionMouseExited(MouseEvent e) {
        lbAction.setForeground(Color.WHITE);
    }

    private void lbActionMousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void lbAdvetureMouseEntered(MouseEvent e) {
        lbAdveture.setForeground(Color.decode("#555555"));
    }

    private void PanelTuoiMousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void lbAdvetureMouseExited(MouseEvent e) {
        lbAdveture.setForeground(Color.WHITE);
    }

    private void lbRPGMouseEntered(MouseEvent e) {
        lbRPG.setForeground(Color.decode("#555555"));
    }

    private void lbRPGMouseExited(MouseEvent e) {
        lbRPG.setForeground(Color.WHITE);
    }

    private void lbSignlePlayerMouseEntered(MouseEvent e) {
        lbSignlePlayer.setForeground(Color.decode("#555555"));
    }

    private void lbSignlePlayerMouseExited(MouseEvent e) {
        lbSignlePlayer.setForeground(Color.WHITE);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        LayerPanelSlide = new Slideshow();
        btnBack = new JButton();
        btnNext = new JButton();
        lbNameGame = new JLabel();
        lbSalamGame = new JLabel();
        separator1 = new JSeparator();
        label1 = new JLabel();
        lbAction = new JLabel();
        lbAdveture = new JLabel();
        lbRPG = new JLabel();
        separator2 = new JSeparator();
        label5 = new JLabel();
        lbSignlePlayer = new JLabel();
        lbNoidung = new JLabel();
        panel1 = new JPanel();
        lbWindows = new JLabel();
        label33 = new JLabel();
        label34 = new JLabel();
        lbMinimum = new JLabel();
        lbRecommended = new JLabel();
        label37 = new JLabel();
        lbi5 = new JLabel();
        label39 = new JLabel();
        lbi7 = new JLabel();
        label41 = new JLabel();
        lb8gbv1 = new JLabel();
        label43 = new JLabel();
        lb8gbv2 = new JLabel();
        label45 = new JLabel();
        lbGTX970 = new JLabel();
        label47 = new JLabel();
        lbGTX1660 = new JLabel();
        label49 = new JLabel();
        lbAudio = new JLabel();
        lbText = new JLabel();
        button1 = new JButton();
        label51 = new JLabel();
        label52 = new JLabel();
        PanelTuoi = new RadiusPanel();
        label60 = new JLabel();
        label61 = new JLabel();
        label53 = new JLabel();
        label54 = new JLabel();
        label55 = new JLabel();
        label56 = new JLabel();
        separator3 = new JSeparator();
        separator4 = new JSeparator();
        label57 = new JLabel();
        label58 = new JLabel();
        separator6 = new JSeparator();
        label59 = new JLabel();
        separator7 = new JSeparator();
        label62 = new JLabel();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setBackground(new Color(0x191919));
        setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));

        //---- btnBack ----
        btnBack.setText("<");
        btnBack.addActionListener(e -> btnBack(e));

        //---- btnNext ----
        btnNext.setText(">");
        btnNext.addActionListener(e -> btnNext(e));

        //---- lbNameGame ----
        lbNameGame.setText("Zenless Zone Zero");
        lbNameGame.setForeground(Color.white);
        lbNameGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 26));

        //---- lbSalamGame ----
        lbSalamGame.setText("Welcome to New Eridu \u2014 Where Humanity Rises Anew!");
        lbSalamGame.setForeground(Color.white);
        lbSalamGame.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        //---- separator1 ----
        separator1.setBackground(new Color(0x939393));
        separator1.setOrientation(SwingConstants.VERTICAL);
        separator1.setOpaque(true);
        separator1.setForeground(new Color(0x939393));

        //---- label1 ----
        label1.setText("Genres");
        label1.setForeground(new Color(0x939393));
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        //---- lbAction ----
        lbAction.setText("Action,");
        lbAction.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        lbAction.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbActionMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lbActionMouseExited(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                lbActionMousePressed(e);
            }
        });

        //---- lbAdveture ----
        lbAdveture.setText("Adveture,");
        lbAdveture.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        lbAdveture.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbAdvetureMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lbAdvetureMouseExited(e);
            }
        });

        //---- lbRPG ----
        lbRPG.setText("RPG");
        lbRPG.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        lbRPG.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbRPGMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lbRPGMouseExited(e);
            }
        });

        //---- separator2 ----
        separator2.setBackground(new Color(0x939393));
        separator2.setOrientation(SwingConstants.VERTICAL);
        separator2.setOpaque(true);
        separator2.setForeground(new Color(0x939393));

        //---- label5 ----
        label5.setText("Features");
        label5.setForeground(new Color(0x939393));
        label5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        //---- lbSignlePlayer ----
        lbSignlePlayer.setText("Signle Player ");
        lbSignlePlayer.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        lbSignlePlayer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lbSignlePlayerMouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                lbSignlePlayerMouseExited(e);
            }
        });

        //---- lbNoidung ----
        lbNoidung.setVerticalAlignment(SwingConstants.TOP);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x444444));

            //---- lbWindows ----
            lbWindows.setText("WINDOWS");
            lbWindows.setForeground(Color.white);
            lbWindows.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));

            //---- label33 ----
            label33.setText("Minimum");

            //---- label34 ----
            label34.setText("Recommended");

            //---- lbMinimum ----
            lbMinimum.setText("Windows 10 or later versions");
            lbMinimum.setForeground(Color.white);

            //---- lbRecommended ----
            lbRecommended.setText("Windows 10 or later versions");
            lbRecommended.setForeground(Color.white);

            //---- label37 ----
            label37.setText("CPU");

            //---- lbi5 ----
            lbi5.setText("7th Gen Intel Core i5");
            lbi5.setForeground(Color.white);

            //---- label39 ----
            label39.setText("CPU ");

            //---- lbi7 ----
            lbi7.setText("10th Gen Intel Core i7");
            lbi7.setForeground(Color.white);

            //---- label41 ----
            label41.setText("Memory");

            //---- lb8gbv1 ----
            lb8gbv1.setText("8GB");
            lb8gbv1.setForeground(Color.white);

            //---- label43 ----
            label43.setText("Memory");

            //---- lb8gbv2 ----
            lb8gbv2.setText("8GB");
            lb8gbv2.setForeground(Color.white);

            //---- label45 ----
            label45.setText("GPU");

            //---- lbGTX970 ----
            lbGTX970.setText("Nvidia GeForce GTX970");
            lbGTX970.setForeground(Color.white);

            //---- label47 ----
            label47.setText("GPU");

            //---- lbGTX1660 ----
            lbGTX1660.setText("Nvidia GeForce GTX1660");
            lbGTX1660.setForeground(Color.white);

            //---- label49 ----
            label49.setText("Languages Supported");

            //---- lbAudio ----
            lbAudio.setText("Audio: English, Chinese (Simplified), Japanese, Korean");
            lbAudio.setForeground(Color.white);

            //---- lbText ----
            lbText.setText("Text: Chinese, English, Indonesian, Japanese, Korean");
            lbText.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(lbWindows)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label33)
                                    .addComponent(lbMinimum)
                                    .addComponent(label37)
                                    .addComponent(lbi5)
                                    .addComponent(label41)
                                    .addComponent(lb8gbv1)
                                    .addComponent(label45)
                                    .addComponent(lbGTX970))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(lbGTX1660)
                                    .addComponent(label47)
                                    .addComponent(lbi7)
                                    .addComponent(label39)
                                    .addComponent(lbRecommended)
                                    .addComponent(label34)
                                    .addComponent(label43)
                                    .addComponent(lb8gbv2))
                                .addGap(173, 173, 173))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(lbText)
                                    .addComponent(lbAudio)
                                    .addComponent(label49))
                                .addGap(0, 352, Short.MAX_VALUE))))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbWindows)
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label33)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMinimum)
                                .addGap(26, 26, 26)
                                .addComponent(label37)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbi5)
                                .addGap(29, 29, 29)
                                .addComponent(label41)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb8gbv1)
                                .addGap(25, 25, 25)
                                .addComponent(label45)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbGTX970))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label34)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRecommended)
                                .addGap(26, 26, 26)
                                .addComponent(label39)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbi7)
                                .addGap(29, 29, 29)
                                .addComponent(label43)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb8gbv2)
                                .addGap(25, 25, 25)
                                .addComponent(label47)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbGTX1660)))
                        .addGap(28, 28, 28)
                        .addComponent(label49)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAudio)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbText)
                        .addContainerGap(82, Short.MAX_VALUE))
            );
        }

        //---- button1 ----
        button1.setText("BUY");
        button1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        button1.setBackground(new Color(0x007fff));
        button1.setForeground(Color.white);

        //---- label51 ----
        label51.setText("9.999$");
        label51.setForeground(Color.white);
        label51.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

        //---- label52 ----
        label52.setText("May include in-app purchases");

        //======== PanelTuoi ========
        {
            PanelTuoi.setBackground(new Color(0x191919));
            PanelTuoi.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    PanelTuoiMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    PanelTuoiMouseExited(e);
                }
                @Override
                public void mousePressed(MouseEvent e) {
                    PanelTuoiMousePressed(e);
                }
            });

            //---- label60 ----
            label60.setText("12+");
            label60.setForeground(Color.white);
            label60.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

            //---- label61 ----
            label61.setText("Moderate Violence, Sexual Innuendo");
            label61.setFont(label61.getFont().deriveFont(label61.getFont().getSize() + 2f));

            GroupLayout PanelTuoiLayout = new GroupLayout(PanelTuoi);
            PanelTuoi.setLayout(PanelTuoiLayout);
            PanelTuoiLayout.setHorizontalGroup(
                PanelTuoiLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, PanelTuoiLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(PanelTuoiLayout.createParallelGroup()
                            .addComponent(label61)
                            .addComponent(label60))
                        .addGap(15, 15, 15))
            );
            PanelTuoiLayout.setVerticalGroup(
                PanelTuoiLayout.createParallelGroup()
                    .addGroup(PanelTuoiLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(label60)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label61)
                        .addContainerGap(21, Short.MAX_VALUE))
            );
        }

        //---- label53 ----
        label53.setText("Developer ");

        //---- label54 ----
        label54.setText("COGNOSPHERE PTE. LTD.");
        label54.setForeground(Color.white);

        //---- label55 ----
        label55.setText("Publisher ");

        //---- label56 ----
        label56.setText("COGNOSPHERE PTE. LTD.");
        label56.setForeground(Color.white);

        //---- label57 ----
        label57.setText("Release Date");

        //---- label58 ----
        label58.setText("07/02/24");
        label58.setForeground(Color.white);

        //---- label59 ----
        label59.setText("Platform ");

        //---- label62 ----
        label62.setIcon(new ImageIcon(getClass().getResource("/icon/Windows 10.png")));

        //---- button2 ----
        button2.setText("COMMENT");

        //---- button3 ----
        button3.setText("VOTE");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lbNoidung, GroupLayout.PREFERRED_SIZE, 718, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(398, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbSalamGame, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                                        .addComponent(lbNameGame, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                                        .addComponent(LayerPanelSlide, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbAction)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbAdveture)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbRPG)))
                                    .addGap(150, 150, 150)
                                    .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbSignlePlayer))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup()
                                                .addComponent(label53)
                                                .addComponent(label55))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup()
                                                .addComponent(label54, GroupLayout.Alignment.TRAILING)
                                                .addComponent(label56, GroupLayout.Alignment.TRAILING)))
                                        .addComponent(separator3, GroupLayout.Alignment.TRAILING)))
                                .addComponent(separator7)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label59)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label62))
                                .addComponent(separator6)
                                .addComponent(separator4, GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label57)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label58))
                                .addComponent(label51)
                                .addComponent(PanelTuoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label52, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)))
                            .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(lbNameGame, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LayerPanelSlide, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(178, 178, 178)
                                    .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(172, 172, 172)
                                    .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                            .addGap(46, 46, 46)
                            .addComponent(lbSalamGame, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbAction)
                                        .addComponent(lbAdveture)
                                        .addComponent(lbRPG)))
                                .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label5)
                                .addComponent(separator2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addComponent(lbNoidung, GroupLayout.PREFERRED_SIZE, 701, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(212, 212, 212)
                            .addComponent(PanelTuoi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label51)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label52)
                            .addGap(12, 12, 12)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label54)
                                .addComponent(label53))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label55)
                                .addComponent(label56))
                            .addGap(6, 6, 6)
                            .addComponent(separator4, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label57)
                                .addComponent(label58))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(separator6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label59)
                                .addComponent(label62))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(lbSignlePlayer)
                                .addComponent(separator7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button2)
                                .addComponent(button3))))
                    .addContainerGap(191, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private Slideshow LayerPanelSlide;
    private JButton btnBack;
    private JButton btnNext;
    private JLabel lbNameGame;
    private JLabel lbSalamGame;
    private JSeparator separator1;
    private JLabel label1;
    private JLabel lbAction;
    private JLabel lbAdveture;
    private JLabel lbRPG;
    private JSeparator separator2;
    private JLabel label5;
    private JLabel lbSignlePlayer;
    private JLabel lbNoidung;
    private JPanel panel1;
    private JLabel lbWindows;
    private JLabel label33;
    private JLabel label34;
    private JLabel lbMinimum;
    private JLabel lbRecommended;
    private JLabel label37;
    private JLabel lbi5;
    private JLabel label39;
    private JLabel lbi7;
    private JLabel label41;
    private JLabel lb8gbv1;
    private JLabel label43;
    private JLabel lb8gbv2;
    private JLabel label45;
    private JLabel lbGTX970;
    private JLabel label47;
    private JLabel lbGTX1660;
    private JLabel label49;
    private JLabel lbAudio;
    private JLabel lbText;
    private JButton button1;
    private JLabel label51;
    private JLabel label52;
    private RadiusPanel PanelTuoi;
    private JLabel label60;
    private JLabel label61;
    private JLabel label53;
    private JLabel label54;
    private JLabel label55;
    private JLabel label56;
    private JSeparator separator3;
    private JSeparator separator4;
    private JLabel label57;
    private JLabel label58;
    private JSeparator separator6;
    private JLabel label59;
    private JSeparator separator7;
    private JLabel label62;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
