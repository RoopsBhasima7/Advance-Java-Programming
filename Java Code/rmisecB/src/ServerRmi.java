
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ServerRmi {
    public static void main(String[] args) {
        try {
            Registry r = LocateRegistry.createRegistry(1099);
            Calimp robj = new Calimp();
            r.rebind("cal", robj);
            
        } catch (RemoteException ex) {
            System.out.println(ex); 
        }
    }
}
