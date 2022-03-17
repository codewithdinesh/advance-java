import java.applet.*;
import java.awt.*;

public class Gridprogram1 extends Applet {
  
    GridLayout g;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    public void init() {
        g=new GridLayout(3,3);
        setLayout(g);
     
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
    }
    
}
/*
 <applet code="Gridprogram1.java" height=500 width=500> </applet>
 */