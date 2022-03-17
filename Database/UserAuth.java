
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserAuth extends JFrame implements ActionListener {
    JTextField u_name;
    JLabel name, pass, form, output;
    JPasswordField u_pass;
    JButton btn;
    Container c;
    
    UserAuth() {
        setSize(300, 300);
        setVisible(true);
        c=getContentPane();
        setLayout(new FlowLayout());
        

        u_name = new JTextField(20);
        u_pass = new JPasswordField(20);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        name = new JLabel("Enter Username:");
        pass = new JLabel("Enter password:");
        form = new JLabel("User Authentication ");
        btn = new JButton("Login");

        btn.addActionListener(this);

        c.add(form);
        c.add(name);
        c.add(u_name);
        c.add(pass);
        c.add(u_pass);
        c.add(btn);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {

            String passStr, userStr;
            passStr = u_pass.getText();
            userStr = u_name.getText();

            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                System.out.print("Driver loaded\n");

                Connection c = DriverManager.getConnection("jdbc:odbc:college");
                System.out.print("Connection Created\n");

                String sql = "insert into loginData(username,password) values(?,?)";

                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1, userStr);
                ps.setString(2, passStr);
                ps.executeUpdate();
                System.out.print("Query Inserted\n");

                c.close();

            } catch (SQLException e1) {
                System.out.println("SQL exception" + e1);

            } catch (ClassNotFoundException e2) {
                System.out.println("class not found" + e2);
            }
        }

    }

    public static void main(String[] args) {
        new UserAuth();

    }
}
