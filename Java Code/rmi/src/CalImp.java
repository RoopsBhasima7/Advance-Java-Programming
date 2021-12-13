
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalImp extends UnicastRemoteObject implements CalInterface{

    public CalImp()throws RemoteException
    {
        
    }
    @Override
    public int add(int a, int b) throws RemoteException {
       return a+b;
    }

    @Override
    public int Difference(int a, int b) throws RemoteException {
       return a-b;
    }
    
}
