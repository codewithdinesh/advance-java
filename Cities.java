import java.applet.*;
import java.awt.*;

public class Cities extends Applet
{ 
   List l;

public void init()
{ 
  l= new List(10);
  l.add("Alibag");
  l.add("Ratnagiri");
  l.add("Panvel");
  l.add("Bengaluru");
  l.add("Hyderabad");
  l.add("Delhi");
  l.add("Chennai");
  l.add("Pune");
  l.add("Mumbai");
  l.add("Tirunelveli");
  add(l);

}
}
//<applet code="Cities.java" width=500 height=500></applet>/
