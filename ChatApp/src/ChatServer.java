import java.net.*;
import java.io.*;
import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.LocateRegistry;
public class ChatServer implements Remote, ServerRemote
{
	private static ChatServer rmi;
   	private ClientRemote cr;
   	Vector v = new Vector();
   	public static void main (String[] args)
   	{
      		/* Set the security manager */
		System.setSecurityManager(new RMISecurityManager());
      		try
      		{
         		/* Create the server object */
			rmi = new ChatServer();
         		System.out.println("Registry is created." );
			/* Export the server object */
         		UnicastRemoteObject.exportObject(((ServerRemote)rmi));
			/* Bind the server object */
         		Naming.rebind("localhost",rmi);
         		System.out.println("Binding has completed." );
         		System.out.println( "Server is waiting for client requests..." );
      		}
      		catch(java.rmi.UnknownHostException uhe)
      		{
         		System.out.println("Error");
      		}
      		catch(RemoteException re)
      		{
         		System.out.println( "Error" + re);
         	}
      		catch (MalformedURLException mURLe)
      		{
         		System.out.println( "Error" + mURLe );
      		}
   	}
	/* Define the registerClient() method */
   	public int registerClient( ClientRemote cr) throws RemoteException
   	{
		int i=0;
      		System.out.println("Client is requesting a connection..." );
  		/* Add a new client */
		v.addElement(cr);
		/* Update the index */
		i=v.indexOf(cr);
      		System.out.println("Timer is started" +v.size());
		return i;
   	}
   	/* Define the removeClient() method */
	public void removeClient(int i) throws RemoteException
   	{
		/* Remove the client */
		v.removeElementAt(i);
   	}
	/* Define the showText() method */
   	public void showText(String str) throws RemoteException
   	{
		System.out.println(str);
		for( int i=0; i<v.size(); i++)
		{
			ClientRemote cr1 = (ClientRemote)v.elementAt(i);
			if(cr1 != null)
                cr1.getString(str);
        	}
	}
}
