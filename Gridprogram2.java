import java.applet.*;
import java.awt.*;

public class Gridprogram2 extends Applet {
  
    GridLayout g;
    Button b1,b2,b3,b4,b5;

    public void init() {
        g=new GridLayout(3,2,10,10);
        setLayout(g);

        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b4=new Button("Button 4");
        b5=new Button("button 5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

    }
}
/*
 <applet code="Gridprogram2.java" height=500 width=500> </applet>
 */