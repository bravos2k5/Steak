/*
 * Created by JFormDesigner on Fri Jul 05 14:48:27 ICT 2024
 */

package steamfake.view.MainFrame;

import com.formdev.flatlaf.FlatDarkLaf;
import steamfake.view.LibraryFrame.HeaderLibraryPanel;
import steamfake.view.LibraryFrame.ListGameLibraryPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author ACER
 */
public class MainFrame extends JDialog {
    public MainFrame(Window owner) {
        super(owner);

        this.setUndecorated(true);

        initComponents();

        panelHeader.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
        JLabel[] labels = {lblHome, lblLibrary};
        sclMain.getVerticalScrollBar().setUnitIncrement(16);
        lblHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseClickedBorder(lblHome, labels);
                panelMain.removeAll();
                HeaderPanel headerPanel = new HeaderPanel();
                headerPanel.setVisible(true);
                panelMain.add(headerPanel);
                HotGamePanel hotGamePanel = new HotGamePanel();
                hotGamePanel.setVisible(true);
                panelMain.add(hotGamePanel);
                for (int i = 0; i < 5; i++) {
                    ListGamePanel listGamePanel = new ListGamePanel();
                    listGamePanel.setVisible(true);
                    panelMain.add(listGamePanel);
                }
                panelMain.repaint();
                panelMain.validate();
            }
        });
        lblLibrary.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseClickedBorder(lblLibrary, labels);
                panelMain.removeAll();
                HeaderLibraryPanel headerLibraryPanel = new HeaderLibraryPanel();
                headerLibraryPanel.setVisible(true);
                panelMain.add(headerLibraryPanel);
                for (int i = 0; i < 20; i++) {
                    ListGameLibraryPanel listGameLibraryPanel = new ListGameLibraryPanel();
                    listGameLibraryPanel.setVisible(true);
                    panelMain.add(listGameLibraryPanel);
                }
                panelMain.repaint();
                panelMain.validate();
            }
        });

    }

    private void mouseClickedBorder(JLabel labelBorder, JLabel[] labelAll) {
        for (JLabel lbl : arrayJLabel(labelAll)) {
            if (lbl != labelBorder) {
                lbl.setBorder(null);
            }
            labelBorder.setBorder(borderLabel(Color.WHITE,2));
        }
    }

    private Border borderLabel(Color color, int thickness) {
        return BorderFactory.createLineBorder(color, thickness);
    }

    private JLabel[] arrayJLabel(JLabel[] value) {
        JLabel[] arrayJlabel = new JLabel[value.length];
        for (int i = 0; i < arrayJlabel.length; i++) {
            arrayJlabel[i] =value[i];
        }
        return arrayJlabel;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelHeader = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        panelSelectFunction = new JPanel();
        lblLogo = new JLabel();
        lblHome = new JLabel();
        lblLibrary = new JLabel();
        lblAddMoney = new JLabel();
        lblManage = new JLabel();
        lblOut = new JLabel();
        lblDownload = new JLabel();
        sclMain = new JScrollPane();
        panelMain = new JPanel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        var contentPane = getContentPane();

        //======== panelHeader ========
        {
            panelHeader.setBackground(new Color(0x191b20));

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/icon/Multiply.png")));
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/icon/-.png")));
            label2.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label3 ----
            label3.setText("SteaK");
            label3.setFont(new Font(Font.SANS_SERIF, label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 12));
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/icon/Steam.png")));

            GroupLayout panelHeaderLayout = new GroupLayout(panelHeader);
            panelHeader.setLayout(panelHeaderLayout);
            panelHeaderLayout.setHorizontalGroup(
                panelHeaderLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                        .addContainerGap(775, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(623, 623, 623)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
            );
            panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup()
                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            );
        }

        //======== panelSelectFunction ========
        {
            panelSelectFunction.setBackground(new Color(0x252730));

            //---- lblLogo ----
            lblLogo.setIcon(new ImageIcon(getClass().getResource("/icon/Steambig.png")));

            //---- lblHome ----
            lblHome.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblHome.setHorizontalAlignment(SwingConstants.CENTER);
            lblHome.setText(" Trang ch\u1ee7");
            lblHome.setIcon(new ImageIcon(getClass().getResource("/icon/Home.png")));
            lblHome.setBackground(new Color(0x191b20));
            lblHome.setOpaque(true);

            //---- lblLibrary ----
            lblLibrary.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblLibrary.setHorizontalAlignment(SwingConstants.TRAILING);
            lblLibrary.setText(" Th\u01b0 vi\u1ec7n      ");
            lblLibrary.setIcon(new ImageIcon(getClass().getResource("/icon/Book Shelf.png")));
            lblLibrary.setBackground(new Color(0x191b20));
            lblLibrary.setOpaque(true);

            //---- lblAddMoney ----
            lblAddMoney.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblAddMoney.setText(" N\u1ea1p ti\u1ec1n       ");
            lblAddMoney.setIcon(new ImageIcon(getClass().getResource("/icon/Book Shelf.png")));
            lblAddMoney.setBackground(new Color(0x191b20));
            lblAddMoney.setOpaque(true);
            lblAddMoney.setHorizontalAlignment(SwingConstants.TRAILING);

            //---- lblManage ----
            lblManage.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblManage.setHorizontalAlignment(SwingConstants.TRAILING);
            lblManage.setText(" Qu\u1ea3n l\u00fd        ");
            lblManage.setIcon(new ImageIcon(getClass().getResource("/icon/Book Shelf.png")));
            lblManage.setBackground(new Color(0x191b20));
            lblManage.setOpaque(true);

            //---- lblOut ----
            lblOut.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblOut.setHorizontalAlignment(SwingConstants.CENTER);
            lblOut.setText(" Tho\u00e1t       ");
            lblOut.setIcon(new ImageIcon(getClass().getResource("/icon/Book Shelf.png")));
            lblOut.setBackground(new Color(0x191b20));
            lblOut.setOpaque(true);

            //---- lblDownload ----
            lblDownload.setText("    Download");
            lblDownload.setIcon(new ImageIcon(getClass().getResource("/icon/Download.png")));
            lblDownload.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));

            GroupLayout panelSelectFunctionLayout = new GroupLayout(panelSelectFunction);
            panelSelectFunction.setLayout(panelSelectFunctionLayout);
            panelSelectFunctionLayout.setHorizontalGroup(
                panelSelectFunctionLayout.createParallelGroup()
                    .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                        .addGroup(panelSelectFunctionLayout.createParallelGroup()
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(panelSelectFunctionLayout.createParallelGroup()
                                    .addComponent(lblHome, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLibrary, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddMoney, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblManage, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOut, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(59, Short.MAX_VALUE))
            );
            panelSelectFunctionLayout.setVerticalGroup(
                panelSelectFunctionLayout.createParallelGroup()
                    .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblHome, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblLibrary, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblAddMoney, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblManage, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblOut, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
            );
        }

        //======== sclMain ========
        {
            sclMain.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //======== panelMain ========
            {
                panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
            }
            sclMain.setViewportView(panelMain);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panelHeader, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panelSelectFunction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(sclMain, GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panelHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panelSelectFunction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sclMain)))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panelHeader;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JPanel panelSelectFunction;
    private JLabel lblLogo;
    private JLabel lblHome;
    private JLabel lblLibrary;
    private JLabel lblAddMoney;
    private JLabel lblManage;
    private JLabel lblOut;
    private JLabel lblDownload;
    private JScrollPane sclMain;
    private JPanel panelMain;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        new MainFrame(null).setVisible(true);
    }
}
