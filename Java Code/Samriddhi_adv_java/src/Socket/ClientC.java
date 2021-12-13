
package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientC {
    public static void main(String[] args) {
        try
        {
           Socket s = new Socket("10.10.0.64",8888);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Length :");
            System.out.println();
            dos.writeUTF(sc.nextLine());
            System.out.print("width :");
            dos.writeUTF(sc.nextLine());
            
            System.out.println("Area : " + dis.readUTF());
            System.out.println("Perimeter : "+dis.readUTF());
            dos.close();
            dis.close();
            s.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex);  
        }
    }
  
}
