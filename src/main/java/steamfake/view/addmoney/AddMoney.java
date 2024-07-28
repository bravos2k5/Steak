/*
 * Created by JFormDesigner on Wed Jul 10 21:20:27 ICT 2024
 */

package steamfake.view.addmoney;

import steamfake.dao.NapTienDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusLabel;
import steamfake.graphics.RadiusPanel;
import steamfake.graphics.RadiusTextField;
import steamfake.model.NapCK;
import steamfake.model.NapCard;
import steamfake.model.NapTien;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * @author ACER
 */
public class AddMoney extends JPanel {

    public AddMoney() {
        initComponents();
        scrollPane2.setBorder(null);
        scrollPane3.setBorder(null);
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        tabs = new JTabbedPane();
        panel2 = new JPanel();
        radiusPanel1 = new RadiusPanel();
        radiusPanel2 = new RadiusPanel();
        cbbMobieNetwork = new JComboBox<>();
        cbbPrice = new JComboBox<>();
        txtSeri = new RadiusTextField();
        txtID = new RadiusTextField();
        btnAddCard = new RadiusButton();
        radiusLabel1 = new RadiusLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        this3 = new JPanel();
        label17 = new JLabel();
        label18 = new JLabel();
        label19 = new JLabel();
        label20 = new JLabel();
        scrollPane3 = new JScrollPane();
        pnlCardHistory = new JPanel();
        label21 = new JLabel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        radiusPanel3 = new RadiusPanel();
        radiusPanel4 = new RadiusPanel();
        cbbBank = new JComboBox<>();
        btnAddBank = new RadiusButton();
        radiusLabel2 = new RadiusPanel();
        radiusLabel3 = new RadiusLabel();
        label15 = new JLabel();
        cbbPrice2 = new JComboBox<>();
        label16 = new JLabel();
        scrollPane2 = new JScrollPane();
        pnlBankHistory = new JPanel();
        label10 = new JLabel();
        this2 = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //======== tabs ========
            {
                tabs.setBackground(new Color(0x252730));
                tabs.setFont(new Font("Inter", Font.BOLD, 16));

                //======== panel2 ========
                {
                    panel2.setBackground(new Color(0x252730));

                    //======== radiusPanel1 ========
                    {
                        radiusPanel1.setBorderColor(Color.white);
                        radiusPanel1.setBorderWidth(1);
                        radiusPanel1.setBackground(new Color(0x191b20));

                        //======== radiusPanel2 ========
                        {
                            radiusPanel2.setBackground(new Color(0x252730));

                            //---- cbbMobieNetwork ----
                            cbbMobieNetwork.setBackground(new Color(0x191b20));
                            cbbMobieNetwork.setFont(new Font("Inter", Font.BOLD, 16));
                            cbbMobieNetwork.setPrototypeDisplayValue("Card");
                            cbbMobieNetwork.setModel(new DefaultComboBoxModel<>(new String[] {
                                "Viettel",
                                "Mobifone",
                                "Vinaphone",
                                "VietNamMobie"
                            }));
                            cbbMobieNetwork.setSelectedIndex(-1);

                            //---- cbbPrice ----
                            cbbPrice.setBackground(new Color(0x191b20));
                            cbbPrice.setFont(new Font("Inter", Font.PLAIN, 16));
                            cbbPrice.setModel(new DefaultComboBoxModel<>(new String[] {
                                "10.000",
                                "20.000",
                                "50.000",
                                "100.000",
                                "500.000"
                            }));

                            //---- txtSeri ----
                            txtSeri.setForcusColor(new Color(0x0c8ce9));
                            txtSeri.setEndGradientColor(new Color(0x191b20));
                            txtSeri.setStartGradientColor(new Color(0x191b20));
                            txtSeri.setRadius(7);
                            txtSeri.setNoForcusColor(new Color(0x191b20));
                            txtSeri.setFont(new Font("Inter", Font.BOLD, 16));
                            txtSeri.setBackground(new Color(0x191b20));

                            //---- txtID ----
                            txtID.setRadius(7);
                            txtID.setForcusColor(new Color(0x0c8ce9));
                            txtID.setNoForcusColor(new Color(0x191b20));
                            txtID.setEndGradientColor(new Color(0x191b20));
                            txtID.setStartGradientColor(new Color(0x191b20));
                            txtID.setFont(new Font("Inter", Font.BOLD, 16));
                            txtID.setBackground(new Color(0x191b20));

                            //---- btnAddCard ----
                            btnAddCard.setText("N\u1ea1p th\u1ebb");
                            btnAddCard.setOriginColor(new Color(0x35452a));
                            btnAddCard.setBackground(new Color(0x35452a));
                            btnAddCard.setRadius(7);
                            btnAddCard.setHoverColor(new Color(0x429509));
                            btnAddCard.setFont(new Font("Inter", Font.BOLD, 16));

                            //---- radiusLabel1 ----
                            radiusLabel1.setText("10.000 VN\u0110 = 8.000 VN\u0110");
                            radiusLabel1.setBackground(new Color(0x23304d));
                            radiusLabel1.setFont(new Font(Font.SANS_SERIF, radiusLabel1.getFont().getStyle() | Font.BOLD, radiusLabel1.getFont().getSize() + 4));
                            radiusLabel1.setBorderColor(new Color(0x416dd1));
                            radiusLabel1.setForeground(new Color(0x4ac26c));

                            //---- label11 ----
                            label11.setText("S\u1ed1 Seri");
                            label11.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                            //---- label12 ----
                            label12.setText("M\u00e3 th\u1ebb");
                            label12.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                            //---- label13 ----
                            label13.setText("M\u1ee9c gi\u00e1");
                            label13.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                            //---- label14 ----
                            label14.setText("Nh\u00e0 m\u1ea1ng");
                            label14.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                            GroupLayout radiusPanel2Layout = new GroupLayout(radiusPanel2);
                            radiusPanel2.setLayout(radiusPanel2Layout);
                            radiusPanel2Layout.setHorizontalGroup(
                                radiusPanel2Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, radiusPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(radiusPanel2Layout.createParallelGroup()
                                            .addGroup(radiusPanel2Layout.createSequentialGroup()
                                                .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cbbMobieNetwork, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                                    .addComponent(txtSeri, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnAddCard, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                                .addGap(100, 100, 100))
                                            .addGroup(radiusPanel2Layout.createSequentialGroup()
                                                .addGroup(radiusPanel2Layout.createParallelGroup()
                                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)))
                                        .addGroup(radiusPanel2Layout.createParallelGroup()
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cbbPrice, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                                .addComponent(txtID, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                                .addComponent(radiusLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                            );
                            radiusPanel2Layout.setVerticalGroup(
                                radiusPanel2Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, radiusPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbbMobieNetwork, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbPrice, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtSeri, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(radiusPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAddCard, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(radiusLabel1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                        .addGap(40, 40, 40))
                            );
                        }

                        GroupLayout radiusPanel1Layout = new GroupLayout(radiusPanel1);
                        radiusPanel1.setLayout(radiusPanel1Layout);
                        radiusPanel1Layout.setHorizontalGroup(
                            radiusPanel1Layout.createParallelGroup()
                                .addGroup(radiusPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(radiusPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        radiusPanel1Layout.setVerticalGroup(
                            radiusPanel1Layout.createParallelGroup()
                                .addGroup(radiusPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(radiusPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(25, Short.MAX_VALUE))
                        );
                    }

                    //======== this3 ========
                    {
                        this3.setBackground(new Color(0x191b20));
                        this3.setMaximumSize(new Dimension(1000, 50));

                        //---- label17 ----
                        label17.setText("ID");
                        label17.setFont(new Font("Inter", Font.BOLD, 14));
                        label17.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- label18 ----
                        label18.setText("Ng\u00e0y n\u1ea1p");
                        label18.setFont(new Font("Inter", Font.BOLD, 14));
                        label18.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- label19 ----
                        label19.setText("M\u1ec7nh gi\u00e1");
                        label19.setFont(new Font("Inter", Font.BOLD, 14));
                        label19.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- label20 ----
                        label20.setText("Tr\u1ea1ng th\u00e1i");
                        label20.setFont(new Font("Inter", Font.BOLD, 14));
                        label20.setHorizontalAlignment(SwingConstants.CENTER);
                        label20.setForeground(Color.white);

                        GroupLayout this3Layout = new GroupLayout(this3);
                        this3.setLayout(this3Layout);
                        this3Layout.setHorizontalGroup(
                            this3Layout.createParallelGroup()
                                .addGroup(this3Layout.createSequentialGroup()
                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(label18, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(label19, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(label20, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                        this3Layout.setVerticalGroup(
                            this3Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, this3Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(this3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label17, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label18, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label19, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label20, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                        );
                    }

                    //======== scrollPane3 ========
                    {
                        scrollPane3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                        //======== pnlCardHistory ========
                        {
                            pnlCardHistory.setBackground(new Color(0x252730));
                            pnlCardHistory.setLayout(new BoxLayout(pnlCardHistory, BoxLayout.Y_AXIS));
                        }
                        scrollPane3.setViewportView(pnlCardHistory);
                    }

                    //---- label21 ----
                    label21.setText("L\u1ecbch s\u1eed n\u1ea1p th\u1ebb ");
                    label21.setFont(new Font("Inter", Font.BOLD, 16));

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addComponent(radiusPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(this3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollPane3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label21, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(784, Short.MAX_VALUE))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(radiusPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(label21, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(this3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                }
                tabs.addTab("N\u1ea1p th\u1ebb c\u00e0o", panel2);

                //======== panel5 ========
                {
                    panel5.setBackground(new Color(0x252730));

                    //======== panel6 ========
                    {
                        panel6.setBackground(new Color(0x252730));

                        //======== radiusPanel3 ========
                        {
                            radiusPanel3.setBorderColor(Color.white);
                            radiusPanel3.setBorderWidth(1);
                            radiusPanel3.setBackground(new Color(0x191b20));

                            //======== radiusPanel4 ========
                            {
                                radiusPanel4.setBackground(new Color(0x252730));

                                //---- cbbBank ----
                                cbbBank.setBackground(new Color(0x191b20));
                                cbbBank.setFont(new Font("Inter", Font.BOLD, 16));
                                cbbBank.setModel(new DefaultComboBoxModel<>(new String[] {
                                    "Ng\u00e2n H\u00e0ng",
                                    "MoMo"
                                }));

                                //---- btnAddBank ----
                                btnAddBank.setText("N\u1ea1p ti\u1ec1n");
                                btnAddBank.setOriginColor(new Color(0x35452a));
                                btnAddBank.setBackground(new Color(0x35452a));
                                btnAddBank.setRadius(7);
                                btnAddBank.setHoverColor(new Color(0x429509));
                                btnAddBank.setFont(new Font("Inter", Font.BOLD, 16));

                                //======== radiusLabel2 ========
                                {
                                    radiusLabel2.setBackground(new Color(0x23304d));
                                    radiusLabel2.setFont(new Font(Font.SANS_SERIF, radiusLabel2.getFont().getStyle() | Font.BOLD, radiusLabel2.getFont().getSize() + 4));
                                    radiusLabel2.setBorderColor(new Color(0x416dd1));
                                    radiusLabel2.setForeground(new Color(0x4ac26c));

                                    GroupLayout radiusLabel2Layout = new GroupLayout(radiusLabel2);
                                    radiusLabel2.setLayout(radiusLabel2Layout);
                                    radiusLabel2Layout.setHorizontalGroup(
                                        radiusLabel2Layout.createParallelGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                    radiusLabel2Layout.setVerticalGroup(
                                        radiusLabel2Layout.createParallelGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                    );
                                }

                                //---- radiusLabel3 ----
                                radiusLabel3.setText("10.000 VN\u0110 = 10.000 coin");
                                radiusLabel3.setBackground(new Color(0x23304d));
                                radiusLabel3.setFont(new Font(Font.SANS_SERIF, radiusLabel3.getFont().getStyle() | Font.BOLD, radiusLabel3.getFont().getSize() + 4));
                                radiusLabel3.setBorderColor(new Color(0x416dd1));
                                radiusLabel3.setForeground(new Color(0x4ac26c));

                                //---- label15 ----
                                label15.setText("H\u00ecnh th\u1ee9c");
                                label15.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                                //---- cbbPrice2 ----
                                cbbPrice2.setBackground(new Color(0x191b20));
                                cbbPrice2.setFont(new Font("Inter", Font.PLAIN, 16));
                                cbbPrice2.setModel(new DefaultComboBoxModel<>(new String[] {
                                    "10.000",
                                    "20.000",
                                    "50.000",
                                    "100.000",
                                    "500.000"
                                }));

                                //---- label16 ----
                                label16.setText("M\u1ee9c gi\u00e1");
                                label16.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

                                GroupLayout radiusPanel4Layout = new GroupLayout(radiusPanel4);
                                radiusPanel4.setLayout(radiusPanel4Layout);
                                radiusPanel4Layout.setHorizontalGroup(
                                    radiusPanel4Layout.createParallelGroup()
                                        .addGroup(radiusPanel4Layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addGroup(radiusPanel4Layout.createParallelGroup()
                                                .addGroup(radiusPanel4Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(radiusPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(label15, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbbBank, GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                                                        .addComponent(label16, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbbPrice2))
                                                    .addGap(97, 97, 97)
                                                    .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(radiusPanel4Layout.createSequentialGroup()
                                                    .addComponent(btnAddBank, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                                    .addComponent(radiusLabel3, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(40, 40, 40))
                                );
                                radiusPanel4Layout.setVerticalGroup(
                                    radiusPanel4Layout.createParallelGroup()
                                        .addGroup(radiusPanel4Layout.createSequentialGroup()
                                            .addGroup(radiusPanel4Layout.createParallelGroup()
                                                .addGroup(radiusPanel4Layout.createSequentialGroup()
                                                    .addGap(49, 49, 49)
                                                    .addComponent(radiusLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(radiusPanel4Layout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(label15, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(cbbBank, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(cbbPrice2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                            .addGroup(radiusPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAddBank, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radiusLabel3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32))
                                );
                            }

                            GroupLayout radiusPanel3Layout = new GroupLayout(radiusPanel3);
                            radiusPanel3.setLayout(radiusPanel3Layout);
                            radiusPanel3Layout.setHorizontalGroup(
                                radiusPanel3Layout.createParallelGroup()
                                    .addGroup(radiusPanel3Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(radiusPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            );
                            radiusPanel3Layout.setVerticalGroup(
                                radiusPanel3Layout.createParallelGroup()
                                    .addGroup(radiusPanel3Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(radiusPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(25, Short.MAX_VALUE))
                            );
                        }

                        //======== scrollPane2 ========
                        {
                            scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                            //======== pnlBankHistory ========
                            {
                                pnlBankHistory.setBackground(new Color(0x252730));
                                pnlBankHistory.setLayout(new BoxLayout(pnlBankHistory, BoxLayout.Y_AXIS));
                            }
                            scrollPane2.setViewportView(pnlBankHistory);
                        }

                        //---- label10 ----
                        label10.setText("L\u1ecbch s\u1eed n\u1ea1p ng\u00e2n h\u00e0ng ");
                        label10.setFont(new Font("Inter", Font.BOLD, 16));

                        //======== this2 ========
                        {
                            this2.setBackground(new Color(0x191b20));
                            this2.setMaximumSize(new Dimension(1000, 50));

                            //---- label6 ----
                            label6.setText("ID");
                            label6.setFont(new Font("Inter", Font.BOLD, 14));
                            label6.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label7 ----
                            label7.setText("Ng\u00e0y n\u1ea1p");
                            label7.setFont(new Font("Inter", Font.BOLD, 14));
                            label7.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label8 ----
                            label8.setText("M\u1ec7nh gi\u00e1");
                            label8.setFont(new Font("Inter", Font.BOLD, 14));
                            label8.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label9 ----
                            label9.setText("Tr\u1ea1ng th\u00e1i");
                            label9.setFont(new Font("Inter", Font.BOLD, 14));
                            label9.setHorizontalAlignment(SwingConstants.CENTER);
                            label9.setForeground(Color.white);

                            GroupLayout this2Layout = new GroupLayout(this2);
                            this2.setLayout(this2Layout);
                            this2Layout.setHorizontalGroup(
                                this2Layout.createParallelGroup()
                                    .addGroup(this2Layout.createSequentialGroup()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label9, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                        .addContainerGap())
                            );
                            this2Layout.setVerticalGroup(
                                this2Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, this2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(this2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                            );
                        }

                        GroupLayout panel6Layout = new GroupLayout(panel6);
                        panel6.setLayout(panel6Layout);
                        panel6Layout.setHorizontalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                            .addGap(771, 771, 771))
                                        .addComponent(this2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                            .addComponent(radiusPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addContainerGap())
                                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)))
                        );
                        panel6Layout.setVerticalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(radiusPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(this2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addGap(16, 16, 16))
                        );
                    }

                    GroupLayout panel5Layout = new GroupLayout(panel5);
                    panel5.setLayout(panel5Layout);
                    panel5Layout.setHorizontalGroup(
                        panel5Layout.createParallelGroup()
                            .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                    panel5Layout.setVerticalGroup(
                        panel5Layout.createParallelGroup()
                            .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    );
                }
                tabs.addTab("Ng\u00e2n h\u00e0ng", panel5);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(tabs, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tabs, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JTabbedPane tabs;
    private JPanel panel2;
    private RadiusPanel radiusPanel1;
    private RadiusPanel radiusPanel2;
    private JComboBox<String> cbbMobieNetwork;
    private JComboBox<String> cbbPrice;
    private RadiusTextField txtSeri;
    private RadiusTextField txtID;
    private RadiusButton btnAddCard;
    private RadiusLabel radiusLabel1;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JPanel this3;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JScrollPane scrollPane3;
    private JPanel pnlCardHistory;
    private JLabel label21;
    private JPanel panel5;
    private JPanel panel6;
    private RadiusPanel radiusPanel3;
    private RadiusPanel radiusPanel4;
    private JComboBox<String> cbbBank;
    private RadiusButton btnAddBank;
    private RadiusPanel radiusLabel2;
    private RadiusLabel radiusLabel3;
    private JLabel label15;
    private JComboBox<String> cbbPrice2;
    private JLabel label16;
    private JScrollPane scrollPane2;
    private JPanel pnlBankHistory;
    private JLabel label10;
    private JPanel this2;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        btnAddCard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addCard();
            }
        });
        btnAddBank.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (cbbBank.getSelectedIndex()  == NapCK.NGAN_HANG) {
                    new BankMoney(MFrame.gI(),AddMoney.this).setVisible(true);
                }
                 else if  (cbbBank.getSelectedIndex()== NapCK.MOMO) {
                    new MomoBank(MFrame.gI(),AddMoney.this).setVisible(true);
                }
            }
        });
        tabs.addChangeListener(e -> {
            if (tabs.getSelectedIndex() == 1) {
                fillBankHistory();
            }
        });
        fillCardHistory();
    }


    private <T extends NapTien> T addNapTien(T napTien, int method) {
        napTien.setId(UUID.randomUUID());
        napTien.setAccountID(SessionManager.user.getId());
        napTien.setMethod(method);
        napTien.setStatus(NapTien.PENDING);
        napTien.setNgayNap(Date.valueOf(LocalDate.now()));
        if (method == NapCard.NAP_CARD) {
            napTien.setSoTien(formatMoney((String) cbbPrice.getSelectedItem()) * 0.8);
        } else if (method == NapCard.NAP_CK) {
            napTien.setSoTien(formatMoney((String) cbbPrice2.getSelectedItem()));
        }
        return napTien;
    }

    private void addCard() {
        NapCard card = addNapTien(new NapCard(), NapCard.NAP_CARD);
        card.setSecretKey(txtID.getText());
        card.setSeri(txtSeri.getText());
        card.setNhaMang(cbbMobieNetwork.getSelectedIndex() + 1);
        card.setNgayNap(Date.valueOf(LocalDate.now()));
        if (NapTienDAO.getInstance().insert(card) > 0) {
            fillCardHistory();
            XMessage.notificate(MFrame.gI(), "Thêm thành công");
        }else {
            XMessage.notificate(MFrame.gI(), "Thêm thất bại");
        }
    }

    public void addBank(int method) {
        NapCK ck = addNapTien(new NapCK(), NapCard.NAP_CK);
        ck.setHinhThuc(method);
        if (NapTienDAO.getInstance().insert(ck) > 0) {
            fillBankHistory();
            XMessage.notificate(MFrame.gI(), "Thêm thành công");
        }else {
            XMessage.notificate(MFrame.gI(), "Thêm thất bại");
        }
    }

    private double formatMoney(String money) {
        try {
            NumberFormat formatter = NumberFormat.getNumberInstance(Locale.GERMANY);
            return formatter.parse(money).doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getSoTienNapBank() {
        return (String) cbbPrice2.getSelectedItem();
    }

    private void fillCardHistory() {
        List<NapTien> napTienList = NapTienDAO.getInstance().selectByMethodAndAccount(NapTien.NAP_CARD, SessionManager.user.getId());
        pnlCardHistory.removeAll();
        for(NapTien napTien : napTienList) {
            pnlCardHistory.add(new HistoryItem(napTien));
        }
        pnlCardHistory.revalidate();
        pnlCardHistory.repaint();
    }

    private void fillBankHistory() {
        List<NapTien> napTienList = NapTienDAO.getInstance().selectByMethodAndAccount(NapTien.NAP_CK, SessionManager.user.getId());
        pnlBankHistory.removeAll();
        for(NapTien napTien : napTienList) {
            pnlBankHistory.add(new HistoryItem(napTien));
        }
        pnlBankHistory.revalidate();
        pnlBankHistory.repaint();
    }

}
