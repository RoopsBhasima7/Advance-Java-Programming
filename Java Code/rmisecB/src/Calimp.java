
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class Calimp extends UnicastRemoteObject implements CalInterface{
    public Calimp() throws RemoteException
    {
        
    }

    @Override
    public int sum(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int diff(int a, int b) throws RemoteException {
         return a-b;
    }

    @Override
    public int prod(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public double div(int a, int b) throws RemoteException {
        return (double)a/b;
    }
    
}
