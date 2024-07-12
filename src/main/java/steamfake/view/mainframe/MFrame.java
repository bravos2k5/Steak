/*
 * Created by JFormDesigner on Sun Jul 07 15:32:27 ICT 2024
 */

package steamfake.view.mainframe;

import steamfake.dao.GameDAO;
import steamfake.model.Game;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;
import steamfake.view.HotGamePanel2;
import steamfake.view.LibraryPanel;
import steamfake.view.LoadingScreen;
import steamfake.view.LoginDialog;
import steamfake.view.factory.GamePanelFactory;
import steamfake.view.withdrawmoney.WithdrawMoneyPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @author BRAVOS
 */
public class MFrame extends JFrame {

    private static MFrame instance;

    public static MFrame getInstance() {
        if (instance == null) {
            instance = new MFrame();
        }
        return instance;
    }

    private MFrame() {
        setUndecorated(true);
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelSelectFunction = new JPanel();
        lblLogo = new JLabel();
        lblHome = new JLabel();
        lblLibrary = new JLabel();
        lblAddMoney = new JLabel();
        lblManage = new JLabel();
        lblOut = new JLabel();
        lblDownload = new JLabel();
        headerPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        mainPanel = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

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
                                .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelSelectFunctionLayout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
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
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
            );
        }

        //======== headerPanel ========
        {
            headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        }

        //======== scrollPane1 ========
        {

            //======== mainPanel ========
            {
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            }
            scrollPane1.setViewportView(mainPanel);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panelSelectFunction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE))
                .addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, 1598, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(panelSelectFunction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, 0))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panelSelectFunction;
    private JLabel lblLogo;
    private JLabel lblHome;
    private JLabel lblLibrary;
    private JLabel lblAddMoney;
    private JLabel lblManage;
    private JLabel lblOut;
    private JLabel lblDownload;
    private JPanel headerPanel;
    private JScrollPane scrollPane1;
    private JPanel mainPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private Game theMostDownloadedGame;
    private List<Game> gameList;

    private void initialize() {
        this.setVisible(true);
        new LoadingScreen(this).setVisible(true);
        headerPanel.add(new LogoPanel());
        headerPanel.add(HeaderPanel.getInstance());
        scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
        initEventMenu();
    }

    private void initEventMenu() {
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanel.removeAll();
                initHomePage();
                mainPanel.repaint();
                mainPanel.revalidate();
                setEffectMenu(lblHome);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHome.setBackground(Color.GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHome.setBackground(new Color(0x191b20));
            }
        });

        lblLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SessionManager.isLogin()) {
                    mainPanel.removeAll();
                    initLibraryPage();
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    setEffectMenu(lblLibrary);
                }
                else {
                    XMessage.notificate(MFrame.this, "Bạn cần đăng nhập để sử dụng chức năng này");
                    new LoginDialog(MFrame.this).setVisible(true);
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLibrary.setBackground(Color.GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLibrary.setBackground(new Color(0x191b20));
            }
        });

        lblAddMoney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SessionManager.isLogin()) {
                    mainPanel.removeAll();
                    initAddMoneyPage();
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    setEffectMenu(lblAddMoney);
                }
                else {
                    XMessage.notificate(MFrame.this, "Bạn cần đăng nhập để sử dụng chức năng này");
                    new LoginDialog(MFrame.this).setVisible(true);
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMoney.setBackground(Color.GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMoney.setBackground(new Color(0x191b20));
            }
        });

        lblManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SessionManager.isLogin()) {
                    mainPanel.removeAll();
                    initManagePage();
                    mainPanel.repaint();
                    mainPanel.revalidate();
                    setEffectMenu(lblManage);
                }
                else {
                    XMessage.notificate(MFrame.this, "Bạn cần đăng nhập để sử dụng chức năng này");
                    new LoginDialog(MFrame.this).setVisible(true);
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManage.setBackground(Color.GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManage.setBackground(new Color(0x191b20));
            }
        });

        lblOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.exit(0);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOut.setBackground(Color.GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOut.setBackground(new Color(0x191b20));
            }
        });

        lblDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (SessionManager.isLogin()) {
                    mainPanel.removeAll();
                    initDownloadPage();
                    mainPanel.repaint();
                    mainPanel.revalidate();
                }
                else {
                    XMessage.notificate(MFrame.this, "Bạn cần đăng nhập để sử dụng chức năng này");
                    new LoginDialog(MFrame.this).setVisible(true);
                }
            }
        });
    }

    private void setEffectMenu(JLabel label) {
        lblHome.setBorder(null);
        lblLibrary.setBorder(null);
        lblManage.setBorder(null);
        lblAddMoney.setBorder(null);
        label.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.WHITE));
        panelSelectFunction.repaint();
    }

    public void initHomePage() {
        if (gameList == null) {
            gameList = GameDAO.gI().selectTop10Game();
            theMostDownloadedGame = gameList.getFirst();
        }
        HotGamePanel2 hotGamePanel = GamePanelFactory.createHotGamePanel2(theMostDownloadedGame);
        mainPanel.add(hotGamePanel);
        for (Game game : gameList) {
            if (!game.equals(theMostDownloadedGame)) {
                ListGamePanel listGamePanel = GamePanelFactory.createListGamePanel(game);
                mainPanel.add(listGamePanel);
            }
        }
        mainPanel.repaint();
        mainPanel.validate();
    }

    private void initLibraryPage() {
        LibraryPanel libraryPanel = new LibraryPanel();
        mainPanel.add(libraryPanel);
    }

    private void initAddMoneyPage() {
        WithdrawMoneyPanel panel = new WithdrawMoneyPanel();
        mainPanel.add(panel);
    }

    private void initManagePage() {

    }

    private void initDownloadPage() {

    }





}
