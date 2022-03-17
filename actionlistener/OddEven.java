
import java.applet.*;
import java.awt.*;
import java.util.EventListener;

import java.awt.event.*;

public class OddEven extends Applet implements ActionListener  {
   Label l1;
   TextField t1,t2;
   Button b1;
   GridLayout g;

   public void init() {
       g=new GridLayout(3,2);
       setLayout(g);
       l1=new Label("Enter Number to check Even or Odd");

       t1=new TextField(10);
       t2=new TextField(10);
       
       b1=new Button("Check");
       b1.addActionListener(this);

       add(l1);
       add(t1);
      
       add(b1);
       add(t2);


       
   }

   public void actionPerformed(ActionEvent actionEvent){
       if(actionEvent.getSource()==b1){

        int i1;
        i1= Integer.parseInt(t1.getText()) ;
        
        if(i1%2==0){
            t2.setText(i1+" Is a Even Number");
        }
        else{
            t2.setText(i1+" Is a Odd Number");   
        }
      
       }
     
   
   }

}


// <applet code="OddEven" width=500 height=500>
// </applet>

