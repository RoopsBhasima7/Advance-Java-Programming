
package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerB {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            String client;
            do{          
                    
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    
                     client= dis.readUTF();
                    System.out.print("Client : " + client+"\n");
                    System.out.print ("Server : ");
                    dos.writeUTF(sc.nextLine());
                    
              
            }while(!client.equalsIgnoreCase("bye"));
            s.close();
            
        }
                catch(IOException ex){
                    System.out.println(ex);
                }
              
    }
            
            
}
