package steamfake.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RadiusTextField extends JTextField {
    private Color startGradientColor = new Color(255, 255, 255);
    private Color endGradientColor = new Color(230, 230, 230);
    private String placeholder = "";
    private int radius = 8;

    public RadiusTextField() {
        super();
        setOpaque(false);
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradient background
        GradientPaint gp = new GradientPaint(0, 0, startGradientColor, 0, getHeight(), endGradientColor);
        g2.setPaint(gp);
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), radius, radius));

        super.paintComponent(g2);

        // Placeholder text
        if (getText().isEmpty() && !placeholder.isEmpty()) {
            g2.setColor(Color.GRAY);
            g2.drawString(placeholder, getInsets().left, g.getFontMetrics().getMaxAscent() + getInsets().top);
        }

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(hasFocus() ? Color.BLUE : Color.GRAY);
        g2.draw(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, radius, radius));
        g2.dispose();
    }

    public Color getStartGradientColor() {
        return startGradientColor;
    }

    public void setStartGradientColor(Color startGradientColor) {
        this.startGradientColor = startGradientColor;
    }

    public Color getEndGradientColor() {
        return endGradientColor;
    }

    public void setEndGradientColor(Color endGradientColor) {
        this.endGradientColor = endGradientColor;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getters and setters for startGradientColor, endGradientColor, and radius
}