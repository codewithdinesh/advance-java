import java.awt.*;
import java.awt.event.*;

public class MenuDemo1 extends Frame {
    MenuBar mb;
    MenuItem m1, m2, m3, m4;
    Menu mn;
    MenuShortcut ms;


    MenuDemo1() {
        setTitle("MenuBar Demo");
        setSize(500, 500);
        setLayout(null);
        ms = new MenuShortcut(KeyEvent.VK_X);
        mn = new Menu("File");
        mb = new MenuBar();
        m1 = new MenuItem("New...");
        m2 = new MenuItem("Open...");
        m3 = new MenuItem("Save As...");
        m4 = new MenuItem("Exit", ms);
        setMenuBar(mb);

        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.addSeparator();
        mn.add(m4);
        mb.add(mn);
    }

    public static void main(String[] args) {
        MenuDemo1 md = new MenuDemo1();
        md.setVisible(true);
    }
}