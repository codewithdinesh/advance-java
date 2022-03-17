
//change background Color when mouse entered to applte windoi
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class BackGround1 extends Applet implements MouseListener {

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        showStatus(e.getPoint());

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
        setBackground(Color.blue);
    }
}
//<applet code="BackGround1" width=300 height=300></applet>