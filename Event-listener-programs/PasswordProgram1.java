import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class PasswordProgram1 extends Applet {
    JPasswordField p1;

    public void init() {
        p1 = new JPasswordField(20);
        p1.setEchoChar('#');
        add(p1);
    }
}

//<applet code="PasswordProgram1" width=500 height=300 ></applet>