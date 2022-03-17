package JTree;
import java.applet.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class TDemo extends JApplet {

    JTree t;
    DefaultMutableTreeNode root,n1,n2,n3,n4,n5,n6,n7,n8;


    public void init() {
       Container c=getContentPane();
       setLayout(new FlowLayout());

       root=new DefaultMutableTreeNode("India");
       n1=new DefaultMutableTreeNode("Maharastra");
       n2=new DefaultMutableTreeNode("Gujrath");
       root.add(n1);
       root.add(n2);
       
       n3=new DefaultMutableTreeNode("Mumbai");
       n4=new DefaultMutableTreeNode("Pune");
       n5=new DefaultMutableTreeNode("Nashik");
       n6=new DefaultMutableTreeNode("Nagpur");
       n1.add(n3);
       n1.add(n4);
       n1.add(n5);
       n1.add(n6);
      
       t=new JTree(root);
     
       c.add(t);


    }
}
//<applet code="TDemo" width=500 height=500 ></applet> 
