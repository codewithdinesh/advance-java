package progressBar;


import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class ProgressBar extends JApplet{
    
JTable t;


    public void init() {
        Container c=getContentPane();
        setLayout(new FlowLayout());
        Object[] col_name={"Name","Percentage","Grade"};

        Object[][] data={{"Dinesh","92","A+"},{"Omkar","60","B"},{"Sanket","70","A"},{"vedant","45","C"},{"Renuka","35","D"},{"Prasad","76","A+"},{"Apeksha","73","A"},{"Laila","55","B"},{"Sachin","98","A+"},{"Pranali","65","B"}};

        t=new JTable(data,col_name);
        c.add(t);
    }
}

/*
 <applet code="PressBar.java" height=500 width=500> </applet>
 */

