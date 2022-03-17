
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AdapterProgram1 extends MouseAdapter {
    JLabel display;
    JFrame f;
    AdapterProgram1(){
        display=new JLabel();
        f=new JFrame();
       
        f.setSize(300,300);
        f.setVisible(true);
        f.addMouseListener(this);
        f.add(display);

       
    }
    public void mouseClicked(MouseEvent e){
        display.setText(" You clicked mouse " + Integer.toString(e.getClickCount()) + " times");

    }

    public static void main(String[] args) {
      new AdapterProgram1();
    }
   
}
