
import java.rmi.Naming;



public class ClientRmi {
    public static void main(String[] args) {
        try
        {
           CalInterface obj = (CalInterface)Naming.lookup("rmi://localhost:1099/cal");
            System.out.println("Sum : "  + obj.sum(20, 10));
            System.out.println("Difference : "  + obj.diff(20, 10));
            System.out.println("Product : "  + obj.prod(20, 10));
            System.out.println("divident : "  + obj.div(20, 10));
        }
        catch(Exception ex)
        {
            
        }
    }
}
