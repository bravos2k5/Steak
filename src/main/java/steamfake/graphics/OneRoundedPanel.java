package steamfake.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class OneRoundedPanel extends JPanel {
    public OneRoundedPanel(){
        setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Sử dụng GradientPaint cho nền
        GradientPaint g1 = new GradientPaint(0, 0, Color.decode("#4B4B4B"), 0, getHeight(), Color.decode("#000000"));
        g2.setPaint(g1);

        int width = getWidth();
        int height = getHeight();
        int arc = 10;

        // Tạo một hình dạng với góc dưới bên trái bo tròn
        Path2D path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(width, 0);
        path.lineTo(width, height);
        path.lineTo(arc, height);
        path.quadTo(0, height, 0, height - arc);
        path.lineTo(0, 0);
        path.closePath();

        g2.fill(path);
        super.paintComponent(g);
    }
}
