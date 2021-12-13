
package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class ClientB {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("10.10.0.64",8888);
            String clienttxt;
            do{   
                    
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    System.out.print ("Client : ");
                    clienttxt = sc.nextLine();
                    dos.writeUTF(clienttxt);
                    System.out.print("Server : " + dis.readUTF()+"\n");               
            } 
            while(!clienttxt.equalsIgnoreCase("bye"));
            s.close();
        } 
        catch(IOException ex){
                    System.out.println(ex);
                }
    }
  
}
