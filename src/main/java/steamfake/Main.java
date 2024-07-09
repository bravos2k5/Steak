package steamfake;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import steamfake.view.MainFrame.MFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        SwingUtilities.invokeLater(MFrame::new);
    }
}
