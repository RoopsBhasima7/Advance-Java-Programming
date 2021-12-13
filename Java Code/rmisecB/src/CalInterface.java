
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface CalInterface extends Remote{
    public int sum(int a ,int b) throws RemoteException;
    public int diff(int a ,int b) throws RemoteException;
    public int prod(int a ,int b) throws RemoteException;
    public double div(int a ,int b) throws RemoteException;
    }
