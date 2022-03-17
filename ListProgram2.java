import java.applet.*;
import java.awt.*;

public class ListProgram2 extends Applet
{
  List l;

  public void init()
{  l=new List();
   l.add("Summer");
   l.add("Winter");
   l.add("Rainy");
   add(l);

}

}

//<applet code="ListProgram2.java" width=500 height=500></applet>/
