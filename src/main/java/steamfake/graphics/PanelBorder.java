package steamfake.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class PanelBorder extends JPanel {
    public PanelBorder() {
        setOpaque(false);

    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2.setColor(getBackground());
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//        super.paintComponent(g);
//    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());

        int width = getWidth();
        int height = getHeight();
        int arc = 10;

        // Tạo một hình dạng với hai góc dưới bo tròn
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(width, 0);
        path.lineTo(width, height - arc);
        path.quadTo(width, height, width - arc, height);
        path.lineTo(arc, height);
        path.quadTo(0, height, 0, height - arc);
        path.closePath();
        g2.fill(path);
        super.paintComponent(g);
    }

}
