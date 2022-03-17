import java.awt.*;
import java.awt.event.*;

public class MenuProgram1 {
    MenuProgram1() {
        Frame f = new Frame("Frame 1");

        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("menu");
        MenuItem i1 = new MenuItem("White");
        MenuItem i2 = new MenuItem("Yellow");
        MenuItem i3 = new MenuItem("Red");
        MenuItem i4 = new MenuItem("Black");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        i4.setEnabled(false);
        mb.add(menu);
        f.setMenuBar(mb);

    }

    public static void main(String[] args) {
        MenuProgram1 hey = new MenuProgram1();
    }
}
