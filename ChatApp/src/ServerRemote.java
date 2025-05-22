import java.rmi.*;
public interface ServerRemote extends Remote
{
	/* Declare the remote methods that register a new client */
	public int registerClient(ClientRemote cr) throws RemoteException;
	/* Declare a remote method that removes the existing client */	
	public void removeClient(int i) throws RemoteException;
	/* Declare a remote interface that displays the text */
	public void showText(String str) throws RemoteException;
}
