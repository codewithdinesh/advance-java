

import java.applet.*;
import java.awt.*;
import java.util.EventListener;

import java.awt.event.*;

public class Multiply extends Applet implements ActionListener  {
   Label l1,l2;
   TextField t1,t2,t3;
   Button b1;
   GridLayout g;

   public void init() {
       g=new GridLayout(4,2);
       setLayout(g);
       l1=new Label("Enter 1st input");
       l2=new Label("Enter 2nd input");
       t1=new TextField(10);
       t2=new TextField(10);
       t3=new TextField();
       
       b1=new Button("Multiply");
       b1.addActionListener(this);

       add(l1);
       add(t1);
       add(l2);
       add(t2);
       add(b1);
       add(t3);

       
   }

   public void actionPerformed(ActionEvent actionEvent){
       if(actionEvent.getSource()==b1){

        int i1,i2,res;
        i1= Integer.parseInt(t1.getText()) ;
        i2= Integer.parseInt(t2.getText()) ;
        res=i1*i2;
        t3.setText(Integer.toString(res));
       }
     
   
   }

}


// <applet code="Multiply" width=500 height=200>
// </applet>

