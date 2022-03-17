package JTable;


import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class TableProgram extends JApplet{
    
JTable t;


    public void init() {
        Container c=getContentPane();
        setLayout(new FlowLayout());
        Object[] col_name={"ID","NAME","SALARY"};

        Object[][] data={{"101","Amit","670000"},{"102","Jai","780000"},{"103","Sachin","700000"}};

        t=new JTable(data,col_name);
        c.add(t);
    }
}

/*
 <applet code="TableProgram.java" height=500 width=500> </applet>
 */

