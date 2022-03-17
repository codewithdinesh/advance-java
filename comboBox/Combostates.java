package comboBox;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Combostates extends JApplet {
    JComboBox states;
    // JScrollPane jPane;

    JLabel text;
    Container c;
    JButton btn;

    public void init() {
        setLayout(new FlowLayout());
        c = getContentPane();

        states = new JComboBox();

        text = new JLabel();

        states.addItem("Delhi");
        states.addItem("Maharastra");
        states.addItem("karnataka");
        states.addItem("Uttar Pradesh");
        states.addItem("Gujrat");
        // jPane=new JScrollPane(states,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        // ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        // c.add(jPane);
        c.add(states);

    }
}

// <applet code="Combostates" height=500 width=500></applet>
