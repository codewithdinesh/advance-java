import java.net.*;
import java.util.Scanner;

public class GetIP {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Host Name");
        String host = scanner.nextLine();
        InetAddress objInetAddress = InetAddress.getByName(host);
        System.out.println("Host Name: " + objInetAddress.getHostName());
        System.out.println("IP Address: " + objInetAddress.getHostAddress());
    }
}
