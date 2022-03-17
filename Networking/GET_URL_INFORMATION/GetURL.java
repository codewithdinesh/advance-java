import java.net.MalformedURLException;
import java.net.URL;

public class GetURL {
    public static void main(String[] args) throws MalformedURLException {
        
        URL url = new URL("http://msbte.org.in");
        System.out.println("Host: " + url.getHost());
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Port: " + url.getPort());
        System.out.println("File: " + url.getFile());
  
    }
}
