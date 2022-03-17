import java.net.*;
public class InetDemo1 {
    public static void main(String[] args) {
        try {

        //local Host details
        InetAddress obj=InetAddress.getLocalHost();
        System.out.println("InetAddress of local host :"+obj);
        System.out.println("Host Address: "+ obj.getHostAddress());
        System.out.println("Host Name: "+ obj.getHostName());


        //display host details of domain
        InetAddress obj1=InetAddress.getByName("www.google.com");
        System.out.println("InetAddress of host :"+obj1);

        //display inetAddresss multiple host details of domain
        InetAddress obj2[]=InetAddress.getAllByName("www.javatpoint.com");
        int i;
        for(i=0;i<obj2.length-1;i++){
            System.out.println("Host Details: "+obj2[i]);
        }
        
            
        } catch (UnknownHostException e) {
            System.out.println(e);
            
        }
    }
}
