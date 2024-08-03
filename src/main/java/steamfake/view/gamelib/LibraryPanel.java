/*
 * Created by JFormDesigner on Thu Jul 11 23:44:31 ICT 2024
 */

package steamfake.view.gamelib;

import steamfake.dao.GameLibraryDAO;
import steamfake.model.Game;
import steamfake.model.GameLibrary;
import steamfake.utils.SessionManager;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;

/**
 * @author BRAVOS
 */
public class LibraryPanel extends JPanel {

    private static LibraryPanel instance;

    public static LibraryPanel gI() {
        if(instance == null) {
            instance = new LibraryPanel();
        }
        return instance;
    }

    private LibraryPanel() {
        initComponents();
        libraryMap = GameLibraryDAO.gI().selectLibraryMap(SessionManager.user);
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        scrollbar1 = new JScrollPane();
        downloadedPanel = new JPanel();
        scrollbar2 = new JScrollPane();
        undownloadedPanel = new JPanel();

        //======== this ========
        setBackground(new Color(0x191b20));
        setOpaque(false);

        //---- label1 ----
        label1.setText("Game \u0111\u00e3 t\u1ea3i xu\u1ed1ng:");
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 26));

        //---- label2 ----
        label2.setText("Game ch\u01b0a t\u1ea3i xu\u1ed1ng:");
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 26));

        //======== scrollbar1 ========
        {
            scrollbar1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //======== downloadedPanel ========
            {
                downloadedPanel.setBackground(new Color(0x191b20));
                downloadedPanel.setLayout(new BoxLayout(downloadedPanel, BoxLayout.Y_AXIS));
            }
            scrollbar1.setViewportView(downloadedPanel);
        }

        //======== scrollbar2 ========
        {
            scrollbar2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //======== undownloadedPanel ========
            {
                undownloadedPanel.setBackground(new Color(0x191b20));
                undownloadedPanel.setLayout(new BoxLayout(undownloadedPanel, BoxLayout.Y_AXIS));
            }
            scrollbar2.setViewportView(undownloadedPanel);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollbar2, GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(label2))
                            .addGap(0, 904, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollbar1, GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollbar1, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollbar2, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollbar1;
    private JPanel downloadedPanel;
    private JScrollPane scrollbar2;
    private JPanel undownloadedPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private final HashMap<GameLibrary, Game> libraryMap;


    private void initialize() {
        if (libraryMap != null) {
            for(GameLibrary gameLibrary : libraryMap.keySet()) {
                Game game = libraryMap.get(gameLibrary);
                GameLibraryItem gameLibraryItem = new GameLibraryItem(gameLibrary, game);
                if(new File("games/" + game.getId() + "/" + game.getVersion() + "/" + game.getExecPath()).exists()) {
                    downloadedPanel.add(gameLibraryItem);
                } else {
                    undownloadedPanel.add(gameLibraryItem);
                }
            }
        }
        downloadedPanel.revalidate();
        downloadedPanel.repaint();
        undownloadedPanel.revalidate();
        undownloadedPanel.repaint();
        this.revalidate();
        this.repaint();
    }

    public void reload() {
        downloadedPanel.removeAll();
        undownloadedPanel.removeAll();
        initialize();
    }

    public void handleUninstall(GameLibraryItem item) {
        downloadedPanel.remove(item);
        undownloadedPanel.add(item);
        downloadedPanel.revalidate();
        downloadedPanel.repaint();
        undownloadedPanel.revalidate();
        undownloadedPanel.repaint();
    }

    public HashMap<GameLibrary, Game> getLibraryMap() {
        return libraryMap;
    }

    public void clearAllData() {
        libraryMap.clear();
        instance = null;
        downloadedPanel.removeAll();
        undownloadedPanel.removeAll();
    }


}
