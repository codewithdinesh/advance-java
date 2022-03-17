import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class KeyProgram1 extends Applet implements KeyListener{

    public void init(){
        addKeyListener(this);
    }

    public void keyTyped(KeyEvent k){

      

    }
    public void keyPressed(KeyEvent e){
        showStatus("key Pressed "+ e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
      
        
    }

}

//<applet code="KeyProgram1" width=300 height=200></applet>