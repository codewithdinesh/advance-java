import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class UserAuth extends Applet implements ActionListener {
    JTextField u_name;
    JLabel name, pass, form, output;
    JPasswordField u_pass;
    JButton btn;

    public void init() {
        u_name = new JTextField(20);
        u_pass = new JPasswordField(20);
        name = new JLabel("Enter Username:");
        pass = new JLabel("Enter password:");
        form = new JLabel("           User Authentication            ");
        btn = new JButton("Login");
        output = new JLabel();
        btn.addActionListener(this);
        add(form);
        add(name);
        add(u_name);
        add(pass);
        add(u_pass);
        add(btn);
        add(output);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            String passStr, userStr;
            passStr = u_pass.getText();
            userStr = u_name.getText();

            String d_pass,d_name;
            d_name= "ABC";
            d_pass="@123";
            output.setText(passStr);

            if (userStr.equals(d_name) && passStr.equals(d_pass)) {
                    output.setText("Login Successfully");
                    // showStatus("Login Successfully");
              
              
            } else {
                output.setText("Login UnSuccessfully");
                showStatus("Login UnSuccessfully");

            }
        }
    }
}

// <applet code="UserAuth" width=250 height=300 ></applet>
