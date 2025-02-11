/*
 * Created by JFormDesigner on Thu Jul 11 20:15:22 ICT 2024
 */

package steamfake.view.managegame;

import steamfake.dao.GameDAO;
import steamfake.dao.KiemDuyetDAO;
import steamfake.graphics.RadiusButton;
import steamfake.graphics.RadiusPanel;
import steamfake.model.Game;
import steamfake.model.PhieuKiemDuyet;
import steamfake.model.dto.statistic.GameDoiTac;
import steamfake.utils.SessionManager;
import steamfake.view.mainframe.MFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;


/**
 * @author ACER
 */
public class GameManagement extends JPanel {

    private static final DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    private List<Game> gameList;
    private List<PhieuKiemDuyet> phieuKiemDuyetList;

    private static final int ALL = 0;
    private static final int OPENED = 1;
    private static final int CLOSED = 2;

    public GameManagement() {
        initComponents();
        initialize();
    }

    public List<PhieuKiemDuyet> getPhieuKiemDuyetList() {
        return phieuKiemDuyetList;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        tabs = new JTabbedPane();
        panel2 = new RadiusPanel();
        scrollPane1 = new JScrollPane();
        tblGames = new JTable();
        cboGameFilter = new JComboBox<>();
        btnAddGame = new RadiusButton();
        panel3 = new RadiusPanel();
        scrollPane2 = new JScrollPane();
        tblReviews = new JTable();
        cboReviewFilter = new JComboBox<>();
        btnRefresh = new JButton();
        panel4 = new JPanel();
        scrollPane3 = new JScrollPane();
        tblStatisticGame = new JTable();

        //======== this ========
        setBackground(new Color(0x191b20));

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x252730));

            //======== tabs ========
            {
                tabs.setBackground(new Color(0x191b20));
                tabs.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));

                //======== panel2 ========
                {
                    panel2.setBorderColor(Color.white);
                    panel2.setBorderWidth(1);
                    panel2.setRadius(0);
                    panel2.setBackground(new Color(0x191b20));

                    //======== scrollPane1 ========
                    {

                        //---- tblGames ----
                        tblGames.setRowHeight(30);
                        tblGames.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null},
                            },
                            new String[] {
                                "ID game", "T\u00ean game", "Tr\u1ea1ng th\u00e1i"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                false, false, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        {
                            TableColumnModel cm = tblGames.getColumnModel();
                            cm.getColumn(0).setResizable(false);
                            cm.getColumn(0).setPreferredWidth(300);
                            cm.getColumn(1).setResizable(false);
                            cm.getColumn(1).setPreferredWidth(200);
                            cm.getColumn(2).setResizable(false);
                            cm.getColumn(2).setPreferredWidth(150);
                        }
                        tblGames.setBackground(new Color(0x252730));
                        tblGames.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
                        tblGames.setOpaque(false);
                        tblGames.setSelectionBackground(new Color(0x191b20));
                        tblGames.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                        scrollPane1.setViewportView(tblGames);
                    }

                    //---- cboGameFilter ----
                    cboGameFilter.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    cboGameFilter.setModel(new DefaultComboBoxModel<>(new String[] {
                        "T\u1ea5t c\u1ea3",
                        "\u0110ang ho\u1ea1t \u0111\u1ed9ng",
                        "\u0110\u00e3 \u0111\u00f3ng"
                    }));

                    //---- btnAddGame ----
                    btnAddGame.setText("Th\u00eam m\u1edbi");
                    btnAddGame.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    btnAddGame.setIcon(null);

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(cboGameFilter, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 576, Short.MAX_VALUE)
                                        .addComponent(btnAddGame, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddGame, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboGameFilter, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 580, GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                    );
                }
                tabs.addTab("Game c\u1ee7a t\u00f4i", panel2);

                //======== panel3 ========
                {
                    panel3.setBackground(new Color(0x191b20));
                    panel3.setBorderColor(Color.white);
                    panel3.setBorderWidth(1);
                    panel3.setRadius(0);

                    //======== scrollPane2 ========
                    {

                        //---- tblReviews ----
                        tblReviews.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null, null},
                            },
                            new String[] {
                                "M\u00e3 phi\u1ebfu duy\u1ec7t", "M\u00f4 t\u1ea3", "Ng\u00e0y \u0111\u0103ng", "Tr\u1ea1ng Th\u00e1i", "L\u00fd do"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        {
                            TableColumnModel cm = tblReviews.getColumnModel();
                            cm.getColumn(0).setPreferredWidth(180);
                            cm.getColumn(2).setResizable(false);
                            cm.getColumn(2).setPreferredWidth(50);
                        }
                        tblReviews.setBackground(new Color(0x252730));
                        tblReviews.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                        tblReviews.setRowHeight(30);
                        scrollPane2.setViewportView(tblReviews);
                    }

                    //---- cboReviewFilter ----
                    cboReviewFilter.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
                    cboReviewFilter.setModel(new DefaultComboBoxModel<>(new String[] {
                        "T\u1ea5t c\u1ea3",
                        "\u0110ang ch\u1edd duy\u1ec7t",
                        "\u0110\u00e3 duy\u1ec7t",
                        "B\u1ecb t\u1eeb ch\u1ed1i"
                    }));

                    //---- btnRefresh ----
                    btnRefresh.setIcon(new ImageIcon(getClass().getResource("/icon/Refresh.png")));

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 1016, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                        .addComponent(cboReviewFilter, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
                    );
                    panel3Layout.setVerticalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addComponent(btnRefresh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addComponent(cboReviewFilter, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
                    );
                }
                tabs.addTab("Phi\u1ebfu duy\u1ec7t", panel3);

                //======== panel4 ========
                {
                    panel4.setBackground(new Color(0x191b20));

                    //======== scrollPane3 ========
                    {

                        //---- tblStatisticGame ----
                        tblStatisticGame.setBackground(new Color(0x252730));
                        tblStatisticGame.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null},
                                {null, null, null, null},
                            },
                            new String[] {
                                "T\u00ean game", "T\u1ed5ng l\u01b0\u1ee3t t\u1ea3i", "T\u1ed5ng doanh thu", "Doanh thu th\u00e1ng"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        {
                            TableColumnModel cm = tblStatisticGame.getColumnModel();
                            cm.getColumn(0).setResizable(false);
                            cm.getColumn(1).setResizable(false);
                            cm.getColumn(2).setResizable(false);
                            cm.getColumn(3).setResizable(false);
                        }
                        scrollPane3.setViewportView(tblStatisticGame);
                    }

                    GroupLayout panel4Layout = new GroupLayout(panel4);
                    panel4.setLayout(panel4Layout);
                    panel4Layout.setHorizontalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    panel4Layout.setVerticalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }
                tabs.addTab("Th\u1ed1ng k\u00ea", panel4);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tabs, GroupLayout.PREFERRED_SIZE, 1081, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabs, GroupLayout.PREFERRED_SIZE, 727, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JTabbedPane tabs;
    private RadiusPanel panel2;
    private JScrollPane scrollPane1;
    private JTable tblGames;
    private JComboBox<String> cboGameFilter;
    private RadiusButton btnAddGame;
    private RadiusPanel panel3;
    private JScrollPane scrollPane2;
    private JTable tblReviews;
    private JComboBox<String> cboReviewFilter;
    private JButton btnRefresh;
    private JPanel panel4;
    private JScrollPane scrollPane3;
    private JTable tblStatisticGame;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    private void initialize() {
        tblGames.setBorder(null);
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tblGames.getTableHeader().setBackground(new Color(32,136,203));
        tblGames.getTableHeader().setPreferredSize(new Dimension(800,30));
        tblReviews.getTableHeader().setBackground(new Color(32,136,203));
        tblReviews.getTableHeader().setPreferredSize(new Dimension(800,30));
        btnAddGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new CreatingPanel(MFrame.gI()).setVisible(true);
            }
        });
        int colCount = tblGames.getColumnModel().getColumnCount();
        for (int i = 0 ; i < colCount; i++){
            tblGames.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        for(int i = 0; i < tblReviews.getColumnModel().getColumnCount(); i++) {
            tblReviews.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        for(int i = 0; i < tblStatisticGame.getColumnModel().getColumnCount(); i++) {
            tblStatisticGame.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }
        tabs.addChangeListener(e -> {
            if(tabs.getSelectedIndex() == 1) {
                fillTheReviewTable();
            }
            if(tabs.getSelectedIndex() == 2) {
                fillTheStatisticTable();
            }
        });
        tblGames.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2){
                    int selectedFilter = cboReviewFilter.getSelectedIndex();
                    int row = tblGames.getSelectedRow();
                    if(row != -1 && selectedFilter == ALL) {
                        Game game = gameList.get(row);
                        if (game.isOpened()) {
                            new UpdatingPanel(MFrame.gI(),game).setVisible(true);
                        }
                    }
                }
            }
        });
        cboGameFilter.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.DESELECTED) {
                    fillTheGameTable();
                }
            }
        });
        cboReviewFilter.addItemListener(e -> fillTheReviewTable());
        fillTheGameTable();
        btnRefresh.addActionListener(e -> refresh());
    }

    private void fillTheGameTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblGames.getModel();
        defaultTableModel.setRowCount(0);
        int selectedFillter = cboGameFilter.getSelectedIndex();
        if(selectedFillter == ALL) {
            gameList = GameDAO.gI().selectGameByPublisher(SessionManager.user);
        }
        if(selectedFillter == OPENED) {
            gameList = GameDAO.gI().selectGameByPublisher(SessionManager.user,true);
        }
        if(selectedFillter == CLOSED) {
            gameList = GameDAO.gI().selectGameByPublisher(SessionManager.user,false);
        }
        for(Game game : gameList) {
            if(selectedFillter != ALL) {
                if(selectedFillter == OPENED && !game.isOpened()) {
                    continue;
                }
                if(selectedFillter == CLOSED && game.isOpened()) {
                    continue;
                }
            }
            Object[] rowData = {game.getId(),game.getName(),game.isOpened() ? "Đang hoạt động" : "Đã đóng"};
            defaultTableModel.addRow(rowData);
        }
    }

    private void refresh() {
        phieuKiemDuyetList = KiemDuyetDAO.getInstance().selectByPublisherID(SessionManager.user.getId());
        fillTheReviewTable();
    }

    private void fillTheReviewTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblReviews.getModel();
        defaultTableModel.setRowCount(0);
        if (phieuKiemDuyetList == null || phieuKiemDuyetList.isEmpty()) {
            phieuKiemDuyetList = KiemDuyetDAO.getInstance().selectByPublisherID(SessionManager.user.getId());
        }
        int selectedFilter = cboReviewFilter.getSelectedIndex();
        for(PhieuKiemDuyet phieuKiemDuyet : phieuKiemDuyetList) {
            if(selectedFilter != ALL) {
                if(selectedFilter - 1 != phieuKiemDuyet.getStatus()) {
                    continue;
                }
            }
            String status = switch (phieuKiemDuyet.getStatus()) {
                case PhieuKiemDuyet.PENDING -> "Chờ duyệt";
                case PhieuKiemDuyet.ACCEPTED -> "Đã duyệt";
                case PhieuKiemDuyet.REJECTED -> "Từ chối";
                default -> "";
            };
            Object[] rowData = {phieuKiemDuyet.getId(),phieuKiemDuyet.getMoTa(),phieuKiemDuyet.getNgayTao(),status,phieuKiemDuyet.getThongBao()};
            defaultTableModel.addRow(rowData);
        }
    }

    private void fillTheStatisticTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblStatisticGame.getModel();
        defaultTableModel.setRowCount(0);
        List<GameDoiTac> gameDoiTacList = GameDAO.gI().selectThongKe();
        for(GameDoiTac gameDoiTac : gameDoiTacList) {
            Object[] rowData = {gameDoiTac.getGameName(),gameDoiTac.getDownload(),gameDoiTac.getTotalRevenue(),gameDoiTac.getMonthlyRevenue()};
            defaultTableModel.addRow(rowData);
        }
    }

}
