package steamfake.utils;

import javax.swing.*;
import java.awt.*;

public class XMessage {

    public static void alert(Window window, String msg) {
        JOptionPane.showMessageDialog(window,msg,"Lỗi",JOptionPane.WARNING_MESSAGE);
    }

    public static void notificate(Window window, String msg) {
        JOptionPane.showMessageDialog(window,msg);
    }

    public static int confirm(Window window, String msg) {
        return JOptionPane.showConfirmDialog(window,msg,"Confirm",JOptionPane.YES_NO_OPTION);
    }

    public static String prompt(Window window, String msg) {
        return JOptionPane.showInputDialog(window,msg);
    }

    public static void main(String[] args) {
        System.out.println(prompt(null,"Test"));
    }

}
