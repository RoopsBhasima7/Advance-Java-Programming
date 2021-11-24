
package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerC {
    public static void main(String[] args) {
        
    try
        {
           ServerSocket ss = new ServerSocket(8888);
           Socket s = ss.accept();
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
             int l = Integer.parseInt(dis.readUTF());
             int b = Integer.parseInt(dis.readUTF());
             int area = l * b;
             int peri = 2*(l+b);
             dos.writeUTF(Integer.toString(area));
             dos.writeUTF(Integer.toString(peri));
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
