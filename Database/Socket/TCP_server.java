//creating TCP server
import java.net.*;
import java.io.*;

class TCP_server{
   

    public static void main(String args[]) throws Exception{
        InputStream in;
        DataInputStream din;

        //create server on port 3000
        ServerSocket ss=new ServerSocket(3000);

        Socket s=ss.accept();
        in=s.getInputStream();

        din=new DataInputStream(in);

        String msg=(String)din.readUTF();

        System.out.println("Client said: "+msg);
        
        din.close();
        s.close();
        


    }
}