
import java.applet.*;
import java.awt.*;
import java.util.EventListener;

import java.awt.event.*;

//accept name from user chck number of letter in it,if letter are less than 6 then msg should be displayed

public class WordCheck2 extends Applet implements ActionListener {
    Label l1;
    TextField t1, t2;
    Button b1;
    GridLayout g;

    public void init() {
        g = new GridLayout(3, 2);
        setLayout(g);
        l1 = new Label("Enter your name :");

        t1 = new TextField(10);
        t2 = new TextField(30);

        b1 = new Button("Check");
        b1.addActionListener(this);

        add(l1);
        add(t1);

        add(b1);
        add(t2);

    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == b1) {

            String i1;
            int l;
            i1 = t1.getText();
            l = i1.length();
            
            t2.setText(Integer.toString(l));
         
        }

    }

}

// <applet code="WordCheck2" width=500 height=500>
// </applet>
