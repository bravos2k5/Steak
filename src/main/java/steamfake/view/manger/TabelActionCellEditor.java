package steamfake.view.manger;

import javax.swing.*;
import java.awt.*;

public class TabelActionCellEditor extends DefaultCellEditor {
    public TabelActionCellEditor() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAction panelAction = new PanelAction();
        panelAction.setBackground(table.getSelectionBackground());
        return panelAction;
    }
}
