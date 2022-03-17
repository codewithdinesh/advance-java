//create TCP client
import java.net.*;

import java.io.*;
import java.util.*;

class TCP_client{
    OutputStream out;
    DataOutputStream dout;

    public static void main(String args[]) throws Exception{

        Socket s=new Socket("localhost",3000);

        OutputStream out;
        DataOutputStream dout;
      
        out=s.getOutputStream();
        dout=new DataOutputStream(out);

        System.out.println("Enter Your Message: ");


        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();

        dout.writeUTF(input);
        
        dout.close();
        s.close();

    }
}