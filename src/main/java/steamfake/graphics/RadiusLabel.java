package steamfake.graphics;

import javax.swing.*;
import java.awt.*;

public class RadiusLabel extends JLabel {

    private int radius;
    private Color borderColor;
    private int borderWidth;

    public RadiusLabel() {
        radius = 8;
        borderColor = new Color(30, 30, 30);
        borderWidth = 1;
        setOpaque(false);
        setHorizontalAlignment(CENTER);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint background with rounded corners
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Paint border with rounded corners
        if (borderWidth > 0 && borderColor != null) {
            g2.setColor(borderColor);
            g2.setStroke(new BasicStroke(borderWidth));
            g2.drawRoundRect(borderWidth / 2, borderWidth / 2, getWidth() - borderWidth, getHeight() - borderWidth, radius, radius);
        }

        g2.dispose();
        // Paint text after background and border to ensure it's not overwritten
        super.paintComponent(g);
    }
}
