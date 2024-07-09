/*
 * Created by JFormDesigner on Sun Jul 07 16:47:13 ICT 2024
 */

package steamfake.view.MainFrame;

import steamfake.utils.database.DatabaseConnector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author BRAVOS
 */
public class LogoPanel extends JPanel {
    public LogoPanel() {
        initComponents();
        initialize();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panelHeader = new JPanel();
        lblExit = new JLabel();
        lblMinimize = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //======== panelHeader ========
        {
            panelHeader.setBackground(new Color(0x191b20));

            //---- lblExit ----
            lblExit.setIcon(new ImageIcon(getClass().getResource("/icon/Multiply.png")));
            lblExit.setHorizontalAlignment(SwingConstants.CENTER);

            //---- lblMinimize ----
            lblMinimize.setIcon(new ImageIcon(getClass().getResource("/icon/-.png")));
            lblMinimize.setHorizontalAlignment(SwingConstants.CENTER);

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
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(623, 623, 623)
                        .addComponent(lblMinimize, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblExit, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
            );
            panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup()
                    .addComponent(lblExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMinimize, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }
        add(panelHeader);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panelHeader;
    private JLabel lblExit;
    private JLabel lblMinimize;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private void initialize() {
        panelHeader.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
        lblMinimize.setOpaque(true);
        lblExit.setOpaque(true);
        lblMinimize.setBackground(new Color(0x191B20));
        lblExit.setBackground(new Color(0x191B20));
        lblMinimize.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(LogoPanel.this);
                frame.setExtendedState(JFrame.ICONIFIED);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblMinimize.setBackground(Color.GRAY);
                lblMinimize.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblMinimize.setBackground(new Color(0x191B20));
                lblMinimize.repaint();
            }
        });

        lblExit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                DatabaseConnector.getInstance().closeConnection();
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lblExit.setBackground(Color.GRAY);
                lblExit.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblExit.setBackground(new Color(0x191B20));
                lblExit.repaint();
            }
        });


    }

}
