
import java.applet.*;
import java.awt.*;
import java.util.EventListener;
import java.awt.event.*;
import javax.swing.*;

public class CheckPassword  extends Applet implements ActionListener {

    JLabel pass,err_msg;
    JPasswordField u_pass;
    JButton btn;
    public void init() {

       u_pass=new JPasswordField(20);
       err_msg=new JLabel("");
  
       pass=new JLabel("Enter password:");
       btn=new JButton("Check");
       btn.addActionListener(this);
     

       add(pass);
       add(u_pass);
       add(btn);
       add(err_msg);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn){
            String passStr;
            passStr=u_pass.getText();
            int strLen=passStr.length();
        
            if(strLen<6){
                err_msg.setText("Password Length must be > 6 characters");
            }
            else{
                err_msg.setText("Password is okay");
            }

        }
    }

}

//<applet code="CheckPassword" width=250 height=300 ></applet>


