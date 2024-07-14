package steamfake.graphics;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.View;
import java.awt.*;

public class CustomTextBox extends JTextPane {

    public CustomTextBox() {

        super();
        setOpaque(false);
        setContentType("text/html");
        setEditable(false);
        setFocusable(false);
        setBorder(null);

        this.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                updateSize();
            }

            public void removeUpdate(DocumentEvent e) {
                updateSize();
            }

            public void changedUpdate(DocumentEvent e) {
                updateSize();
            }
        });
    }

    private void updateSize() {
        invalidate();
        if (getParent() != null) {
            getParent().revalidate();
            getParent().repaint();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        if (getWidth() > 0) {
            View view = (View) getClientProperty(javax.swing.plaf.basic.BasicHTML.propertyKey);
            if (view != null) {
                int height = (int) view.getPreferredSpan(View.Y_AXIS);
                return new Dimension(getWidth(), height);
            }
        }
        return super.getPreferredSize();
    }

}
