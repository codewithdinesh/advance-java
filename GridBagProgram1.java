import java.applet.*;
import java.awt.*;

public class GridBagProgram1 extends Applet{
    GridBagLayout g;
    GridBagConstraints gc;
    Button b1,b2,b3,b4,b5;
    public void init() {
        g=new GridBagLayout();
        gc=new GridBagConstraints();
        setLayout(g);
        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b4=new Button("Button 4");
        b5=new Button("button 5");
        

        // gc.fill = GridBagConstraints.HORIZONTAL;  
        gc.gridx = 0;  
        gc.gridy = 0;  
        add(b1,gc);

        gc.gridx = 1;  
        gc.gridy = 0;
        add(b2,gc);

        gc.gridx=0;
        gc.gridy=1;
        gc.gridheight=2;
        add(b3,gc);

        gc.gridx=1;
        gc.gridy=1;
        gc.gridheight=2;
        add(b4,gc);

        gc.fill = GridBagConstraints.HORIZONTAL; 
        gc.gridx=0;
        gc.gridy=3;
        gc.gridwidth=2;
        add(b5,gc);

 
    }
}

/*
 <applet code="GridBagProgram1.java" height=500 width=500> </applet>
 */