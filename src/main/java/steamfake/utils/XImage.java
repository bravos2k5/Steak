package steamfake.utils;

import javax.swing.*;
import java.awt.*;

public class XImage {
    public static ImageIcon scaleImageForLabel(ImageIcon imageIcon, JLabel label) {
        int widthImg = imageIcon.getIconWidth();
        int heightImg = imageIcon.getIconHeight();
        int widthLabel = label.getWidth();
        int heightLabel = label.getHeight();

        double scaleWidth = (double) widthImg / widthLabel;
        double scaleHeight = (double) heightImg / heightLabel;
        double scale = Math.max(scaleWidth, scaleHeight);

        if (scale > 1.0) {
            widthImg = (int) (widthImg / scale);
            heightImg = (int) (heightImg / scale);

            Image image = imageIcon.getImage().getScaledInstance(widthImg, heightImg, Image.SCALE_SMOOTH);
            return new ImageIcon(image);
        }

        return imageIcon;
    }

    public static void imageFileFilter(JFileChooser fileChooser) {
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(java.io.File f) {
                return f.isDirectory() || f.getName().endsWith(".jpg") || f.getName().endsWith(".png");
            }

            @Override
            public String getDescription() {
                return "Image file (*.jpg, *.png)";
            }
        });
    }
}
