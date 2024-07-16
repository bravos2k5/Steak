/*
 * Created by JFormDesigner on Mon Jul 15 17:58:26 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.AccountDAO;
import steamfake.graphics.CustomTextBox;
import steamfake.model.GameLibrary;
import steamfake.utils.XImage;
import steamfake.utils.azure.AzureBlobService;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * @author BRAVOS
 */
public class CommentPanel extends JPanel {

    private final GameLibrary gameLibrary;

    public CommentPanel(GameLibrary gameLibrary) {
        this.gameLibrary = gameLibrary;
        initComponents();
        initialize();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvatar = new JLabel();
        lblName = new JLabel();
        label5 = new JLabel();
        lblRate = new JLabel();
        panel1 = new JPanel();
        txtComment = new CustomTextBox();

        //======== this ========
        setOpaque(false);

        //---- lblName ----
        lblName.setText("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- label5 ----
        label5.setText("Ch\u1ea5m \u0111i\u1ec3m:");
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- lblRate ----
        lblRate.setText("100/100");
        lblRate.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
            panel1.add(txtComment);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 950, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblRate))
                                .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 801, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName)
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(lblRate))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblAvatar;
    private JLabel lblName;
    private JLabel label5;
    private JLabel lblRate;
    private JPanel panel1;
    private CustomTextBox txtComment;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        loadInfo();
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

    private void loadInfo() {
        String[] nameAndAvatar = AccountDAO.gI().selectNameAndAvatarByID(gameLibrary.getAccountId());
        lblName.setText(nameAndAvatar[0]);
        if(nameAndAvatar[1] != null && !nameAndAvatar[1].isBlank()) {
            String path = "data/avatars/" + gameLibrary.getAccountId() + "/" + nameAndAvatar[1];
            if(!new File(path).exists()) {
                AzureBlobService.download(path,"avatars/" + gameLibrary.getAccountId() + "/" + nameAndAvatar[1],"images");
            }
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(path),lblAvatar));
        }
        else {
            lblAvatar.setSize(new Dimension(81,81));
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")),lblAvatar));
        }

        lblRate.setText(gameLibrary.getRate() + "");
        txtComment.setText(gameLibrary.getComment());
        txtComment.setText(text);
        revalidate();
        repaint();
    }

//    private void adjustPanelSize() {
//        Dimension preferredSize = new Dimension();
//        for (Component component : this.getComponents()) {
//            Dimension componentSize = component.getPreferredSize();
//            preferredSize.width = Math.max(preferredSize.width, componentSize.width);
//            preferredSize.height += componentSize.height;
//        }
//        this.setPreferredSize(preferredSize);
//        this.revalidate(); // Apply the changes
//    }

}
