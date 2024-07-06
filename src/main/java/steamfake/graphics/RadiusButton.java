package steamfake.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadiusButton extends JButton {
    private int radius;
    private Color hoverColor;
    private Color originColor;
    private Color pressColor;
    private boolean isPressed = false;
    private boolean isRollover = false;

    public RadiusButton() {
        radius = 8;
        hoverColor = new Color(200, 200, 200); // Lighter gray for hover
        originColor = getBackground();
        pressColor = new Color(170, 170, 170); // Darker gray for press
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setFont(new Font("Arial", Font.BOLD, 12)); // Custom font

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
                isRollover = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(originColor);
                isRollover = false;
                isPressed = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(pressColor);
                isPressed = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(isRollover ? hoverColor : originColor);
                isPressed = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (isPressed) {
            g2.setColor(pressColor);
        } else {
            g2.setColor(getBackground());
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        FontMetrics fm = g.getFontMetrics();
        Rectangle r = fm.getStringBounds(getText(), g).getBounds();
        int textX = (getWidth() - r.width) / 2;
        int textY = (getHeight() - r.height) / 2 + fm.getAscent();
        g2.setColor(getForeground());
        g2.drawString(getText(), textX, textY);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        if (!isPressed) {
            super.paintBorder(g);
        }
    }

    // Getters and setters for radius, hoverColor, originColor, and pressColor


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }

    public Color getOriginColor() {
        return originColor;
    }

    public void setOriginColor(Color originColor) {
        this.originColor = originColor;
    }

    public Color getPressColor() {
        return pressColor;
    }

    public void setPressColor(Color pressColor) {
        this.pressColor = pressColor;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public boolean isRollover() {
        return isRollover;
    }

    public void setRollover(boolean rollover) {
        isRollover = rollover;
    }
}