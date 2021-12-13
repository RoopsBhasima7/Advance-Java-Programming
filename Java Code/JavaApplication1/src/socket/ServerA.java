
package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerA {
    public static void main(String[] args) {
         try{
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String msg = dis.readUTF();
            System.out.println("Client: " + msg);
            
            String msgupper = msg.toUpperCase();
            dos.writeUTF(msgupper);
            
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
