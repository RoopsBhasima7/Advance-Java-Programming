
package socket;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class UDPClientA {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        DatagramSocket ds = new DatagramSocket();        
        byte sendpacket [] = new byte[1024];
        byte recpacket [] = new byte[1024];
        
        String str= "Hello";
        sendpacket = str.getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
