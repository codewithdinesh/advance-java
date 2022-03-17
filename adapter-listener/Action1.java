import java.applet.*;
import java.awt.*;
import java.util.EventListener;


import java.awt.event.*;

public class Action1 extends Applet implements MouseListener {

    public void init() {

        addMouseListener(this);// register source with listener

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {
        setBackground(Color.BLUE);
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

        setBackground(Color.RED);

    }
    public void mouseReleased(MouseEvent e) {
        
    }
}

// <applet code="Action1" width=500 height=500>
// </applet>
