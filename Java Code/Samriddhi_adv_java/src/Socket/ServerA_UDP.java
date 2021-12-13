
package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ServerA_UDP {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
       DatagramSocket ds = new DatagramSocket(8888);        
        byte sendmsg[] = new byte[1024];
        byte recvmsg[] = new byte[1024];        
        
        DatagramPacket recvpacket = new DatagramPacket(recvmsg, recvmsg.length);
        ds.receive(recvpacket);        
        String str = new String(recvmsg);
        System.out.println(str);
        //String strupper = str.toUpperCase();
        //sendmsg = strupper.getBytes();
        int number = Integer.parseInt(str.trim());
        if(number%2 == 0)
        {
          sendmsg = "Even".getBytes();
        }
        else
        {
          sendmsg = "Odd".getBytes();  
        }
        
        
        //sending reply
        InetAddress address  = recvpacket.getAddress();
        int port = recvpacket.getPort();
        
        DatagramPacket sendpacket  = new DatagramPacket(sendmsg, sendmsg.length, address, port);
        ds.send(sendpacket);
        ds.close();
        
        
        
        
        
        
        
    }
}
