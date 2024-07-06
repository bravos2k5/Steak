package steamfake.graphics;

import javax.swing.*;
import java.awt.*;

public class RadiusPanel extends JPanel {

    private int radius;
    private Color borderColor;
    private int borderWidth;
    private Color startGradientColor;
    private Color endGradientColor;
    private String borderStyle; // "solid", "dashed", "dotted"

    public RadiusPanel() {
        radius = 8;
        borderColor = new Color(30, 30, 30);
        borderWidth = 2;
        startGradientColor = new Color(240, 240, 240); // Default light gray
        endGradientColor = new Color(220, 220, 220); // Default darker gray
        borderStyle = "solid"; // Default border style
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Shadow effect
        g2.setColor(new Color(0, 0, 0, 50)); // Semi-transparent black for shadow
        g2.fillRoundRect(5, 5, getWidth() - 6, getHeight() - 6, radius, radius);

        // Gradient background
        GradientPaint gp = new GradientPaint(0, 0, startGradientColor, 0, getHeight(), endGradientColor);
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth() - 5, getHeight() - 5, radius, radius);

        // Border
        if (borderWidth > 0 && borderColor != null) {
            g2.setColor(borderColor);
            Stroke stroke;
            switch (borderStyle) {
                case "dashed":
                    stroke = new BasicStroke(borderWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
                    break;
                case "dotted":
                    stroke = new BasicStroke(borderWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, new float[]{1, 10}, 0);
                    break;
                default:
                    stroke = new BasicStroke(borderWidth);
            }
            g2.setStroke(stroke);
            g2.drawRoundRect(0, 0, getWidth() - 5, getHeight() - 5, radius, radius);
        }
        g2.dispose();
    }

    // Getters and setters for new properties
    public void setStartGradientColor(Color startGradientColor) {
        this.startGradientColor = startGradientColor;
        repaint();
    }

    public void setEndGradientColor(Color endGradientColor) {
        this.endGradientColor = endGradientColor;
        repaint();
    }

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
        repaint();
    }

    // Existing getters and setters remain unchanged


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Color getStartGradientColor() {
        return startGradientColor;
    }

    public Color getEndGradientColor() {
        return endGradientColor;
    }

    public String getBorderStyle() {
        return borderStyle;
    }
}