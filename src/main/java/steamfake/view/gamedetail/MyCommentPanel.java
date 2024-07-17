/*
 * Created by JFormDesigner on Mon Jul 15 16:21:30 ICT 2024
 */

package steamfake.view.gamedetail;

import steamfake.dao.GameLibraryDAO;
import steamfake.graphics.RadiusButton;
import steamfake.model.GameLibrary;
import steamfake.utils.SessionManager;
import steamfake.utils.XImage;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @author BRAVOS
 */
public class MyCommentPanel extends JPanel {

    private final GameLibrary gameLibrary;

    public MyCommentPanel(GameLibrary game) {
        this.gameLibrary = game;
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        lblAvatar = new JLabel();
        lblName = new JLabel();
        scrollPane1 = new JScrollPane();
        txtComment = new JTextArea();
        btnSend = new RadiusButton();
        label4 = new JLabel();
        label5 = new JLabel();
        slideRate = new JSlider();
        lblRate = new JLabel();
        lblLevel = new JLabel();
        hSpacer1 = new JPanel(null);

        //======== this ========
        setOpaque(false);

        //---- lblName ----
        lblName.setText("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
        lblName.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //======== scrollPane1 ========
        {

            //---- txtComment ----
            txtComment.setWrapStyleWord(true);
            txtComment.setLineWrap(true);
            txtComment.setOpaque(false);
            txtComment.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            scrollPane1.setViewportView(txtComment);
        }

        //---- btnSend ----
        btnSend.setText("G\u1eedi");

        //---- label4 ----
        label4.setText("B\u00ecnh lu\u1eadn");
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        //---- label5 ----
        label5.setText("Ch\u1ea5m \u0111i\u1ec3m:");
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        //---- lblRate ----
        lblRate.setText("100");
        lblRate.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        //---- lblLevel ----
        lblLevel.setText("Trung b\u00ecnh");
        lblLevel.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        //---- hSpacer1 ----
        hSpacer1.setBackground(Color.white);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 490, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label5)
                            .addGap(18, 18, 18)
                            .addComponent(slideRate, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblRate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblLevel, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(hSpacer1, GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup()
                            .addComponent(label4)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 940, GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName)
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(slideRate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRate)
                                .addComponent(lblLevel)))
                        .addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addComponent(label4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSend, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(hSpacer1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel lblAvatar;
    private JLabel lblName;
    private JScrollPane scrollPane1;
    private JTextArea txtComment;
    private RadiusButton btnSend;
    private JLabel label4;
    private JLabel label5;
    private JSlider slideRate;
    private JLabel lblRate;
    private JLabel lblLevel;
    private JPanel hSpacer1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        rateSlideEvent();
        btnSend.addActionListener(e -> sendAction());
        slideRate.setValue(50);
        lblLevel.setText("Trung bình");
    }

    private void rateSlideEvent() {
        loadData();
        slideRate.addChangeListener(e -> {
            lblRate.setText(String.valueOf(slideRate.getValue()));
            setLevel();
        });
    }

    private void setLevel() {
        if (slideRate.getValue() < 20) {
            lblLevel.setText("Rất dở");
        } else if (slideRate.getValue() < 40) {
            lblLevel.setText("Dở");
        } else if (slideRate.getValue() < 60) {
            lblLevel.setText("Trung bình");
        } else if (slideRate.getValue() < 80) {
            lblLevel.setText("Hay");
        } else {
            lblLevel.setText("Rất hay");
        }
    }

    private void loadData() {
        lblName.setText(SessionManager.user.getHoTen());
        if(gameLibrary.getRate() == null) {
            slideRate.setValue(50);
        } else {
            slideRate.setValue(gameLibrary.getRate());
        }
        setLevel();
        txtComment.setText(gameLibrary.getComment());
        lblAvatar.setSize(new Dimension(81, 81));
        if(SessionManager.user.getAvatar() != null && SessionManager.user.getAvatar().isBlank()) {
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon("data/avatars/" +
                    SessionManager.user.getId() + "/" + SessionManager.user.getAvatar()),lblAvatar));
        }
        else {
            lblAvatar.setSize(new Dimension(81, 81));
            lblAvatar.setIcon(XImage.scaleImageForLabel(new ImageIcon(getClass().getResource("/icon/default_avatar.png")),lblAvatar));
        }
    }

    private void sendAction() {
        gameLibrary.setComment(txtComment.getText());
        gameLibrary.setRate(slideRate.getValue());
        int result = GameLibraryDAO.gI().updateRateAndComment(gameLibrary);
        if(result > 0) {
            XMessage.notificate(MFrame.getInstance(),"Gửi thành công");
        }
        else {
            XMessage.alert(MFrame.getInstance(),"Gửi thất bại");
        }
    }

}
