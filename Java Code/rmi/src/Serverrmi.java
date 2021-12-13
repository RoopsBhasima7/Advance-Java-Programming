
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Serverrmi {
    public static void main(String[] args) {
        try
        {
         Registry r = LocateRegistry.createRegistry(1099);
         CalImp robj = new CalImp();
         r.rebind("cal", robj);
        }
        catch(Exception ex)
        {
            System.out.println(ex);   
        }
    }
 
}
