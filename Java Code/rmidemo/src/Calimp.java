
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Calimp extends UnicastRemoteObject implements calinterface{

    public Calimp()throws RemoteException
    {
        
    }
    @Override
    public int sum(int a, int b) {
       return a+b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }
    
}
