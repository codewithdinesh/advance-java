import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class ImagelabelProgram extends JApplet{
   JLabel l;
   ImageIcon img;
   FlowLayout fl;

   public void init() {
     
       Container c=getContentPane();
       fl=new FlowLayout();
       setLayout(fl);
       img=new ImageIcon("img.png");
       l=new  JLabel(img);
       add(l);

   } 
   
}

/*
 <applet code="ImagelabelProgram.java" height=500 width=500> </applet>
 */
