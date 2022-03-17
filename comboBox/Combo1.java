package comboBox;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
public class Combo1 extends JApplet {
    JComboBox city;
    Container c;
    JLabel  t;

    public void init() {
        setLayout(new FlowLayout());
        c = getContentPane();
        city = new JComboBox();
        t=new JLabel();
        city.addItem("Solapur");
        city.addItem("Banglore");
        city.addItem("Pune");
        city.addItem("Mumbai");
        t.setText("Your are in Solapur");
        c.add(city);
        c.add(t);
    }
}

// <applet code="Combo1" height=500 width=500></applet>