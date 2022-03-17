import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.MalformedInputException;
import java.util.Date;
import java.util.Scanner;

public class URLGetInfo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter URL : ");
        Scanner sc=new Scanner(System.in);
        String uriInputString=sc.nextLine();
        URL url=new URL(uriInputString);

        URLConnection urlConnection=url.openConnection();
        System.out.println(new Date(urlConnection.getDate()));
        System.out.println(urlConnection.getContentType());
        System.out.println(urlConnection.getContentLength());


    }
}
