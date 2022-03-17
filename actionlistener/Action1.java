import java.applet.*;
import java.awt.*;
import java.util.EventListener;

import java.awt.event.*;

public class Action1 extends Applet implements ActionListener {
    Button b1, b2;

    public void init() {
        b1 = new Button("red");
        b2 = new Button("Blue");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);// register source with listener

    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b1) {
            setBackground(Color.RED);
        } else if (a.getSource() == b2) {
            setBackground(Color.BLUE);
        } else {
            setBackground(Color.black);
        }
    }
}

// <applet code="Action1" width=500 height=500>
// </applet>
