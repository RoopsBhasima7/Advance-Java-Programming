
package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientA_UDP {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket();        
         byte sendmsg[] = new byte[1024];
         byte recvmsg[] = new byte[1024];        
        String str = "128";
        sendmsg = str.getBytes();   
        DatagramPacket sendpacket = new DatagramPacket(sendmsg, sendmsg.length, InetAddress.getByName("localhost"), 8888);
        ds.send(sendpacket);
        
        DatagramPacket recvpacket = new DatagramPacket(recvmsg, recvmsg.length);
        ds.receive(recvpacket);   
        System.out.println("Server : "+ new String(recvmsg));
        ds.close();
    }
}
