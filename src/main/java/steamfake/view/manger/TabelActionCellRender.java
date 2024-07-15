package steamfake.view.manger;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class TabelActionCellRender  extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       Component com =   super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        PanelAction panelAction = new PanelAction();
            panelAction.setBackground(getBackground());


        return panelAction;
    }
}
