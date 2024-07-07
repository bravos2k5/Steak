package steamfake.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadiusLabel extends JLabel {
    private int radius;
    private Color borderColor;
    private int borderWidth;
    private Color startGradientColor;
    private Color endGradientColor;
    private Color hoverColor;
    private boolean isHovering = false;

    public RadiusLabel() {
        radius = 8;
        borderColor = new Color(30, 30, 30);
        borderWidth = 1;
        startGradientColor = new Color(100, 100, 255); // Example start color
        endGradientColor = new Color(200, 200, 255); // Example end color
        hoverColor = new Color(220, 220, 255); // Lighter color for hover effect
        setOpaque(false);
        setHorizontalAlignment(CENTER);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isHovering = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isHovering = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradient or hover background
        if (isHovering) {
            g2.setColor(hoverColor);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        } else {
            GradientPaint gp = new GradientPaint(0, 0, startGradientColor, 0, getHeight(), endGradientColor);
            g2.setPaint(gp);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        }

        // Border
        if (borderWidth > 0 && borderColor != null) {
            g2.setColor(borderColor);
            g2.setStroke(new BasicStroke(borderWidth));
            g2.drawRoundRect(borderWidth / 2, borderWidth / 2, getWidth() - borderWidth, getHeight() - borderWidth, radius, radius);
        }

        // Text shadow
        g2.setColor(Color.GRAY);
        g2.drawString(getText(), getInsets().left + 1, getFontMetrics(getFont()).getAscent() + 1);

        // Text
        g2.setColor(getForeground());
        g2.drawString(getText(), getInsets().left, getFontMetrics(getFont()).getAscent());

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

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
        repaint();
    }

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

    public Color getHoverColor() {
        return hoverColor;
    }

    public boolean isHovering() {
        return isHovering;
    }

    public void setHovering(boolean hovering) {
        isHovering = hovering;
    }
}