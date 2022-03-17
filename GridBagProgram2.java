import java.applet.*;
import java.awt.*;

public class GridBagProgram2 extends Applet{
    GridBagLayout g;
    GridBagConstraints gc;
    Button b1;

    TextField name1;
    TextArea comment1;
    Label name,comment;

    public void init() {
        g=new GridBagLayout();
        gc=new GridBagConstraints();
        setLayout(g);
        name=new Label("Name");
        comment=new Label("Comments");
        name1=new TextField(17);
        comment1=new TextArea(17,20);

        b1=new Button("Submit");
      
        

        // gc.fill = GridBagConstraints.HORIZONTAL;  
        gc.gridx = 0;  
        gc.gridy = 0;  
        add(name,gc);

        gc.gridx = 1;  
        gc.gridy = 0;
        add(name1,gc);

        gc.gridx=0;
        gc.gridy=1;
        add(comment,gc);

        gc.gridx=1;
        gc.gridy=1;
        add(comment1,gc);

   
        gc.gridx=0;
        gc.gridy=2;
        gc.gridwidth=2;
        add(b1,gc);

 
    }
}

/*
 <applet code="GridBagProgram2.java" height=500 width=500> </applet>
 */