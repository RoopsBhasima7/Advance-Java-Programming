
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface calinterface extends Remote{
    public int sum(int a,int b)throws RemoteException;
    public int mul(int a , int b)throws RemoteException;
}
