
// Java Program to illustrate MouseMotionListener events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mouseMotionProgram extends JFrame implements MouseMotionListener {

    JLabel label1, label2;
    Container c;

    mouseMotionProgram() {
        setSize(400, 400);
        setVisible(true);
        label1 = new JLabel("no event ");

        label2 = new JLabel("no event ");

        setLayout(new FlowLayout());
        c = getContentPane();
        c.add(label1);
        c.add(label2);
        // add(c);
        addMouseMotionListener(this);

    }

    public void mouseDragged(MouseEvent e) {

        label1.setText("mouse is dragged through point "+ e.getX() + " " + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        // update the label to show the point to which the cursor moved
        label2.setText("mouse is moved to point "+ e.getX() + " " + e.getY());
    }

    public static void main(String[] args) {
        new mouseMotionProgram();

    }

}
