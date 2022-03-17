package Manual.Programs;
import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class RadioBtn extends JFrame{
 JRadioButton r1,r2,r3;
 ButtonGroup bg;
 RadioBtn(){
     setSize(500,500);
     setVisible(true);
     
     Container c=getContentPane();
     setLayout(new FlowLayout());
     r1=new JRadioButton("Red");
     r2=new JRadioButton("Blue");
     r3=new JRadioButton("Green");

     c.add(r1);
     c.add(r2);
     c.add(r3);

     bg=new ButtonGroup();
     bg.add(r1);
     bg.add(r2);
     bg.add(r3);

 }  
 public static void main(String[] args) {
     RadioBtn btn=new RadioBtn();

 } 
}
