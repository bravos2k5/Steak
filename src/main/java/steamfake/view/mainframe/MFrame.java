/*
 * Created by JFormDesigner on Sun Jul 07 15:32:27 ICT 2024
 */

package steamfake.view.mainframe;

import steamfake.dao.GameDAO;
import steamfake.model.Game;
import steamfake.model.join.GameDisplay;
import steamfake.utils.ResourceManager;
import steamfake.utils.SessionManager;
import steamfake.utils.XMessage;
import steamfake.view.account.AccountPanel;
import steamfake.view.addmoney.AddMoney;
import steamfake.view.download.DownloadQueue;
import steamfake.view.gamedetail.GameDetailPanel;
import steamfake.view.gamelib.LibraryPanel;
import steamfake.view.login.LoginDialog;
import steamfake.view.managegame.GameManagement;
import steamfake.view.waiting.LoadingScreen;
import steamfake.view.waiting.WaitingDialog;
import steamfake.view.withdrawmoney.WithdrawMoneyPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Stack;

/**
 * @author BRAVOS
 */
public class MFrame extends JFrame {

    private static MFrame instance;

    public static MFrame gI() {
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

    public JPanel getMainPanel() {
        return mainPanel;
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
        lblBack = new JLabel();
        headerPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        mainPanel = new JPanel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/icon/Steambig.png")).getImage());
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
            lblAddMoney.setText(" R\u00fat ti\u1ec1n       ");
            lblAddMoney.setIcon(new ImageIcon(getClass().getResource("/icon/Request Money.png")));
            lblAddMoney.setBackground(new Color(0x191b20));
            lblAddMoney.setOpaque(true);
            lblAddMoney.setHorizontalAlignment(SwingConstants.TRAILING);

            //---- lblManage ----
            lblManage.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblManage.setHorizontalAlignment(SwingConstants.TRAILING);
            lblManage.setText(" Qu\u1ea3n l\u00fd        ");
            lblManage.setIcon(new ImageIcon(getClass().getResource("/icon/Business.png")));
            lblManage.setBackground(new Color(0x191b20));
            lblManage.setOpaque(true);

            //---- lblOut ----
            lblOut.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 32));
            lblOut.setHorizontalAlignment(SwingConstants.CENTER);
            lblOut.setText(" Tho\u00e1t       ");
            lblOut.setIcon(new ImageIcon(getClass().getResource("/icon/Export.png")));
            lblOut.setBackground(new Color(0x191b20));
            lblOut.setOpaque(true);

            //---- lblDownload ----
            lblDownload.setText("T\u1ea3i xu\u1ed1ng");
            lblDownload.setIcon(new ImageIcon(getClass().getResource("/icon/Download.png")));
            lblDownload.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));

            //---- lblBack ----
            lblBack.setIcon(new ImageIcon(getClass().getResource("/icon/Left.png")));
            lblBack.setHorizontalAlignment(SwingConstants.CENTER);
            lblBack.setOpaque(true);
            lblBack.setBackground(new Color(0x252730));

            GroupLayout panelSelectFunctionLayout = new GroupLayout(panelSelectFunction);
            panelSelectFunction.setLayout(panelSelectFunctionLayout);
            panelSelectFunctionLayout.setHorizontalGroup(
                panelSelectFunctionLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelSelectFunctionLayout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addComponent(lblDownload, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                        .addGroup(panelSelectFunctionLayout.createParallelGroup()
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(lblBack, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(panelSelectFunctionLayout.createParallelGroup()
                                    .addComponent(lblHome, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLibrary, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddMoney, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblManage, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOut, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panelSelectFunctionLayout.setVerticalGroup(
                panelSelectFunctionLayout.createParallelGroup()
                    .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                        .addGroup(panelSelectFunctionLayout.createParallelGroup()
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSelectFunctionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblBack, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
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
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPane1.setBorder(null);

            //======== mainPanel ========
            {
                mainPanel.setBackground(new Color(0x191b20));
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
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(panelSelectFunction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING)))
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
    private JLabel lblBack;
    private JPanel headerPanel;
    private JScrollPane scrollPane1;
    private JPanel mainPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private GameDisplay theMostDownloadedGame;
    private List<GameDisplay> gameList;
    private final Stack<Component[]> stack = new Stack<>();


    private void initialize() {
        new LoadingScreen(this).setVisible(true);
        headerPanel.add(new LogoPanel());
        headerPanel.add(HeaderPanel.gI());
        scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
        initEventMenu();
    }

    private void initEventMenu() {

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back();
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBack.setBackground(Color.GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBack.setBackground(new Color(0x252730));
            }
        });
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showHomePage();
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
                    showLibrary();
                }
                else {
                    requestLogin();
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
                    showWithdrawMoney();
                }
                else {
                    requestLogin();
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
                    showGameManagement();
                }
                else {
                    requestLogin();
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
                    showDownloadPage();
                }
                else {
                    requestLogin();
                }
            }
        });
    }

    private void requestLogin() {
        XMessage.notificate(MFrame.this, "Bạn cần đăng nhập để sử dụng chức năng này");
        new LoginDialog(MFrame.this).setVisible(true);
    }


    private void downloadResource() {
        ResourceManager.downloadGameResource(theMostDownloadedGame);
        for(Game game : gameList) {
            if(!game.equals(theMostDownloadedGame)) {
                ResourceManager.downloadAvatarGameOnly(game);
            }
        }
    }

    private void refreshPanel() {
        SwingUtilities.invokeLater(() -> {
            scrollPane1.repaint();
            scrollPane1.validate();
            mainPanel.repaint();
            mainPanel.validate();
        });
    }

    public void showHomePage() {
        handleBeforeChange();
        gameList = GameDAO.gI().selectListGameDisplay();
        if(gameList == null || gameList.isEmpty()) {
            return;
        }
        theMostDownloadedGame = gameList.getFirst();
        downloadResource();
        HotGameItem hotGamePanel = new HotGameItem(theMostDownloadedGame);
        mainPanel.add(hotGamePanel);
        for (GameDisplay game : gameList) {
            if (game != null && !game.equals(theMostDownloadedGame)) {
                NormalGameItem normalGameItem = new NormalGameItem(game);
                mainPanel.add(normalGameItem);
            }
        }
        refreshPanel();
    }

    private void showLibrary() {
        handleBeforeChange();
        LibraryPanel libraryPanel = LibraryPanel.gI();
        mainPanel.add(libraryPanel);
        refreshPanel();
    }

    private void showWithdrawMoney() {
        handleBeforeChange();
        WithdrawMoneyPanel panel = new WithdrawMoneyPanel();
        mainPanel.add(panel);
        refreshPanel();
    }

    private void showGameManagement() {
        handleBeforeChange();
        GameManagement manageGame = new GameManagement();
        mainPanel.add(manageGame);
        refreshPanel();
    }

    private void showDownloadPage() {
        DownloadQueue.gI().setVisible(true);
    }

    public void showAccountSetting() {
        handleBeforeChange();
        AccountPanel accountPanel = new AccountPanel();
        mainPanel.add(accountPanel);
        refreshPanel();
    }
    public void showAddMoney() {
        handleBeforeChange();
        AddMoney addMoneyPanel = new AddMoney();
        mainPanel.add(addMoneyPanel);
        refreshPanel();
    }
    public void showGameDetail(Game game) {
        handleBeforeChange();
        GameDetailPanel gameDetail = new GameDetailPanel(game);
        mainPanel.add(gameDetail);
        refreshPanel();
    }

    public void search(String key) {
        WaitingDialog waitingDialog = new WaitingDialog(MFrame.gI());
        waitingDialog.start();
        Thread thread = new Thread(() -> {
            handleBeforeChange();
            List<GameDisplay> searchedGames = GameDAO.gI().selectGameByKeyword(key);
            mainPanel.add(new SearchInfo(searchedGames.size(), key));
            for(GameDisplay game : searchedGames) {
                ResourceManager.downloadAvatarGameOnly(game);
                mainPanel.add(new NormalGameItem(game));
            }
            refreshPanel();
            waitingDialog.stop();
        });
        thread.start();
    }

    private void saveCurrentState() {
        Component[] components = mainPanel.getComponents();
        if(components != null && components.length > 0) {
            stack.push(components);
        }
    }

    private void handleBeforeChange() {
        saveCurrentState();
        scrollPane1.getVerticalScrollBar().setValue(0);
        mainPanel.removeAll();
    }

    private void back() {
        if (!stack.isEmpty()) {
            SwingUtilities.invokeLater(() -> {
                mainPanel.removeAll();
                Component[] components = stack.pop();
                for (Component component : components) {
                    mainPanel.add(component);
                }
                refreshPanel();
            });
        }
    }


    @Override
    public void dispose() {
        super.dispose();
        DownloadQueue.gI().cancelAllDownload();
    }

    public void clearAllData() {
        gameList = null;
        theMostDownloadedGame = null;
        stack.clear();
        mainPanel.removeAll();
        instance = null;
    }

}