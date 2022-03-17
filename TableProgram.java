import javax.swing.*;
import java.applet.*;
import java.awt.*;


public class TableProgram extends JApplet{
    
JTable t;
JScrollPane sp;

    public void init() {
        Container c=getContentPane();
        setLayout(new FlowLayout());
        Object[] col_name={"ID","Name","Salary"};

        Object[][] data={{"1","Dinesh","200000"},{"2","Omkar","18000"},{"3","Sanket","500000"},{"4","reshma","757656"}};

        t=new JTable(data,col_name);

        sp=new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        c.add(sp);
    }
}

/*
 <applet code="TableProgram.java" height=500 width=500> </applet>
 */
