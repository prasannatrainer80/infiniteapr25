import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class Server {

	public static void main(String[] args) {
		System.setSecurityManager(new RMISecurityManager());
		try {
			Hello obj = new HelloImpl();
			Naming.rebind("localhost", obj);
			System.out.println("Server is Ready...");
			System.out.println("Waiting for Clients Requests...");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
