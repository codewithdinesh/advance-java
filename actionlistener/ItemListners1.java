
import java.applet.*;
import java.awt.*;
import java.util.EventListener;


import java.awt.event.*;

public class ItemListners1 extends Applet implements ItemListener {
    Checkbox b1,b2,b3;

    public void init() {
        b1=new Checkbox("red");
        b2=new Checkbox("Blue");
        b3=new Checkbox("black");

        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);

        add(b1);
        add(b2);
        add(b3);
        
    }
    public void itemStateChanged(ItemEvent iEvent){
        if(iEvent.getSource()==b1){
            setBackground(Color.RED);
            showStatus("You selected RED ");
        }
        else if(iEvent.getSource()==b2){
            setBackground(Color.BLUE);
            showStatus("You selected BlUE ");

        }
        else{
            setBackground(Color.black);
            showStatus("You selected BLACK");

        }
    }
}

// <applet code="ItemListners1" width=500 height=500>
// </applet>
