
import java.applet.*;
import java.awt.*;
import java.util.EventListener;

import javax.swing.JLabel;

import java.awt.event.*;

public class MouseClick1 extends Frame implements MouseListener {
    JLabel display;

    public MouseClick1() {
        display = new JLabel();

        setSize(400, 400);
        setVisible(true);
        addMouseListener(this);
        add(display);

    }

    public void mouseClicked(MouseEvent e) {
        display.setText(" You clicked mouse " + Integer.toString(e.getClickCount()) + " times");
    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public static void main(String[] args) {
        MouseClick1 c1 = new MouseClick1();
    }
}
