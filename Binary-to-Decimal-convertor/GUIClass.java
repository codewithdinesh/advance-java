import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class GUIClass extends JFrame implements ActionListener

{
    JTextField f1, f2, f3, f4;
    JLabel l1, l2, l3, l4;
    JButton b1;

    public GUIClass() {
        l1 = new JLabel(" Decimal ");

        l2 = new JLabel(" Binary ");

        l3 = new JLabel(" Octal ");

        l4 = new JLabel(" Hexadecimal ");

        f1 = new JTextField(20);

        f2 = new JTextField(20);
        f2.setEditable(false);

        f3 = new JTextField(20);
        f3.setEditable(false);

        f4 = new JTextField(20);
        f4.setEditable(false);

        b1 = new JButton("Calculate");

        setLayout(new GridLayout(6, 2));

        setSize(500, 500);
        setVisible(true);
        add(l1);

        add(f1);

        add(l2);

        add(f2);

        add(l3);

        add(f3);

        add(l4);

        add(f4);

        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)

    {

        if (e.getSource() == b1)

        {

            if (this.f1.getText() != "")

            {

                String text1 = this.f1.getText();

                int num1 = Integer.parseInt(text1);

                String binary = Integer.toBinaryString(num1);

                String octal = Integer.toOctalString(num1);

                String hexadecimal = Integer.toHexString(num1);

                f2.setText(binary);
                f3.setText(octal);
                f4.setText(hexadecimal);
            }

        }

    }

    public static void main(String[] args) {

        new GUIClass();

    }

}