import java.applet.*;
import java.awt.*;
public class Listprogram extends Applet {
    List news;

    public void init() {
        // setLayout(new GridLayout(3, 1));
        news = new List(5,true);
       
        news.add("Mumbai Times");
        news.add("India Today");
        news.add("Sakal");
        news.add("Pudhari");
        news.add("Krushival");
        

        add(news);

    }
}

/*
 <applet code="Listprogram.java" height=500 width=500> </applet>
 */
