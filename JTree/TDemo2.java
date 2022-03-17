package JTree;
import java.applet.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class TDemo2 extends JApplet {

    JTree t;
    DefaultMutableTreeNode root,n1,n2,n21,n22,n3,n4,n5,n6,n7,n8, n9, n10 ,n11, n12 ,n13, n14,n15 ,n16 ,n17,n18;


    public void init() {
       Container c=getContentPane();
       setLayout(new FlowLayout());

       root=new DefaultMutableTreeNode("K");
       n1=new DefaultMutableTreeNode("5th sem");
       n2=new DefaultMutableTreeNode("dristii");
       n21=new DefaultMutableTreeNode("Course");
       n22=new DefaultMutableTreeNode("React Native");
       root.add(n1);
       root.add(n2);
       root.add(n21);
       root.add(n22);


       
       n3=new DefaultMutableTreeNode("AJP");
       n4=new DefaultMutableTreeNode("ADM");
       n5=new DefaultMutableTreeNode("SEN");
       n6=new DefaultMutableTreeNode("OSY");
       n7=new DefaultMutableTreeNode("EVS");
       n1.add(n3);
       n1.add(n4);
       n1.add(n5);
       n1.add(n6);
       n1.add(n7);

       n8=new DefaultMutableTreeNode("React");
       n9=new DefaultMutableTreeNode("Node Js");
       n10=new DefaultMutableTreeNode("Angular");
       n11=new DefaultMutableTreeNode("Projects");

       n21.add(n8);
       n21.add(n9);
       n21.add(n10);
   
       n21.add(n11);

       n12=new DefaultMutableTreeNode("Manual");
       n13=new DefaultMutableTreeNode("Programs");

   

       n3.add(n12); 
       n3.add(n13);
       n14=new DefaultMutableTreeNode("TDemo.java");
       n15=new DefaultMutableTreeNode("TDemo.class");
       n16=new DefaultMutableTreeNode("MenuProgram1.java");
       n17=new DefaultMutableTreeNode("MenuProgram1.class");
       n18=new DefaultMutableTreeNode("Exp 6");

       n13.add(n14);
       n13.add(n15);
       n13.add(n16);
       n13.add(n17);
       n13.add(n18);





      
       t=new JTree(root);
     
       c.add(t);


    }
}
//<applet code="TDemo2" width=500 height=500 ></applet> 
