import java.applet.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class TDemo extends JApplet {

    JTree t;
    DefaultMutableTreeNode root,n1,n2,n3,n4,n5,n6,n7,n8;
    JScrollPane js;

    public void init() {
       Container c=getContentPane();
       setLayout(new FlowLayout());

       root=new DefaultMutableTreeNode("Root");
       n1=new DefaultMutableTreeNode("Vegitables");
       n2=new DefaultMutableTreeNode("Fruits");
       root.add(n1);
       root.add(n2);
       
       n3=new DefaultMutableTreeNode("Capsicum");
       n4=new DefaultMutableTreeNode("Carrot");
       n5=new DefaultMutableTreeNode("Tomato");
       n6=new DefaultMutableTreeNode("Potato");
       n1.add(n3);
       n1.add(n4);
       n1.add(n5);
       n1.add(n6);
       n7=new DefaultMutableTreeNode("Banana");
       n8=new DefaultMutableTreeNode("Mango");
       n2.add(n7);
       n2.add(n8);
       t=new JTree(root);
       js=new JScrollPane(t);
       c.add(js);


    }
}
//<applet code="TDemo" width=500 height=500 ></applet> 
