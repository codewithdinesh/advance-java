import java.applet.*;
import java.awt.*;

public class BorderProgram1 extends Applet {
  
    BorderLayout b;
    Button b1,b2,b3,b4,b5;

    public void init() {
        b=new BorderLayout();
        setLayout(b);

        b1=new Button("SOUTH");
        b2=new Button("CENTER");
        b3=new Button("WEST");
        b4=new Button("EAST");
        b5=new Button("NORTH");

        add(b1,b.SOUTH);
        add(b2,b.CENTER);
        add(b3,b.WEST);
        add(b4,b.EAST);
        add(b5,b.NORTH);

    }
}
/*
 <applet code="BorderProgram1.java" height=500 width=500> </applet>
 */