import java.rmi.*;
public interface ClientRemote extends Remote
{
	/* Declare the remote object */  
	public void getString(String str) throws RemoteException;
}
