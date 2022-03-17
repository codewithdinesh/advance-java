import javax.swing.*;
import java.awt.*;

public class ComboBox1 extends JApplet {
   JComboBox c1,c2;
   FlowLayout fl;
  
   public void init() {
       fl=new FlowLayout();
       Container c=getContentPane();
       setLayout(fl);
       c1=new JComboBox();
       c1.addItem("India");
       c1.addItem("Itly");
       c1.addItem("UK");
       c1.addItem("japan");
             
       
       c.add(c1);

       String[] lang={"C","C++","Java","JavaScript","PYthon"};
       c2=new JComboBox(lang);
       c2.setEditable(true);
       c.add(c2);


   } 
}
/*
 <applet code="ComboBox1.java" height=500 width=500> </applet>
 */