
import java.applet.*;
import java.awt.*;
import java.util.EventListener;

import java.awt.event.*;
import javax.swing.*;

public class AddProgram1 extends Applet implements ActionListener  {
   JLabel l1,l2;
   JTextField t1,t2,t3;
   JButton b1;
   GridLayout g;

   public void init() {
       g=new GridLayout(4,2);
       setLayout(g);
       l1=new JLabel("Enter 1st input");
       l2=new JLabel("Enter 2nd input");
       t1=new JTextField(10);
       t2=new JTextField(10);
       t3=new JTextField();
       
       b1=new JButton("Add");
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
        res=i1+i2;
        t3.setText(Integer.toString(res));
       }
     
   
   }

}


// <applet code="AddProgram1" width=300 height=300>
// </applet>

