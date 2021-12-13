
import java.rmi.Naming;


public class ClientRmi {
    public static void main(String[] args) {
        try
        {
          CalInterface obj = (CalInterface)Naming.lookup("rmi://localhost:1099/cal");
            System.out.println("Sum :" + obj.add(50, 30));
             System.out.println("difference :" + obj.Difference(50, 30));
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);    
        }
    }

}
