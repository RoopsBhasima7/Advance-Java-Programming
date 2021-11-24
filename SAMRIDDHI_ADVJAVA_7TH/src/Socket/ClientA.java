
package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientA {
    public static void main(String[] args) {
        try
        {
            Socket s = new Socket("10.10.0.64",8888);
            DataOutputStream dos  = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
            Scanner sc  =new Scanner(System.in);
            System.out.print("Client : ");
            String msg = sc.nextLine();
            
           dos.writeUTF(msg);
           
            System.out.println("Server :" + dis.readUTF());
            dis.close();
            dos.close();
            s.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
 
}
