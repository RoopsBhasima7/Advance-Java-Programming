
import java.rmi.Naming;


public class Clientcal {
    public static void main(String[] args) {
        try
        {
         calinterface   obj = (calinterface)Naming.lookup("rmi://localhost:1099/calc");
         System.out.println("sum : "+ obj.sum(41, 50));
        }
        catch(Exception ex)
        {
            System.out.println(ex);  
        }
    }
}
