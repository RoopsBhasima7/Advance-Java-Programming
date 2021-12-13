
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface CalInterface extends Remote{
   int add(int a ,int b) throws RemoteException;
   int Difference(int a ,int b) throws RemoteException;
   }
