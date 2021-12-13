
package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetaddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getByName("localhost"));
        System.out.println(InetAddress.getLocalHost());

    }
}
