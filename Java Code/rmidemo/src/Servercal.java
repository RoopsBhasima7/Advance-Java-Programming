
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Servercal {
    public static void main(String[] args) {
        try
        {
            Registry r = LocateRegistry.createRegistry(1099);
            r.rebind("calc", new Calimp());
        }
        catch(Exception ex)
        {
            System.out.println(ex);   
        }
    }
  
}
