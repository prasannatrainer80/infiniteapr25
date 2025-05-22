import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.*;
import java.rmi.server.*;
public class ChatClient extends JFrame implements ActionListener, ClientRemote
{
 	/* Initialize the variables */
	JTextField str;
 	JButton send;
 	JTextArea area;
 	JScrollPane scroll;
 	JLabel label1, label2, label3;
 	GridBagLayout gbl;
 	GridBagConstraints gbc; 
 	ServerRemote ser;
 	private static String name="";
 	int i=0;
	
/* Define the chat client constructor */
 	public ChatClient()
 	{
   		/* Set the size of the frame */
		setSize(350, 300);
		/* Create the layout */
   		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		/* Set the layout */
   		getContentPane().setLayout(gbl);
		
		/* Create and set the label on frame */
		gbc.gridx = 1;   
   		gbc.gridy = 1;
   		label1 = new JLabel("CHAT ROOM");
   		label1.setFont(new Font("Arial",Font.BOLD,20));
   		getContentPane().add(label1, gbc);
   		
		/* Create and set the message label on frame */
		gbc.gridx = 1;   
   		gbc.gridy = 2;
   		label2 = new JLabel("Message Display Area");
   		getContentPane().add(label2, gbc) ;
   		
		/* Create and set the scroll pane */
		gbc.gridx = 1;   
   		gbc.gridy = 3;
   		area = new JTextArea(10,30);
		scroll = new JScrollPane(area);
   		getContentPane().add(scroll, gbc);

		/* Create and set the label for message */
		gbc.gridx = 1;   
   		gbc.gridy = 4;
   		label3 = new JLabel("Enter Message");
   		getContentPane().add(label3, gbc);

		/* Create the textfield */
		str = new JTextField(30);
		gbc.gridx = 1;   
   		gbc.gridy = 5;
   		getContentPane().add(str, gbc);

		/* Create the button object */
		send = new JButton("Send");
   		gbc.gridx = 1;   
   		gbc.gridy = 6;
   		getContentPane().add(send, gbc);

		/* Add an action listener on the button */
   		send.addActionListener(this);
   		  		
		addWindowListener(new WindowAdapter()
   		{
			/* Define the windowClosing() method */
			public void windowClosing(WindowEvent we)
			{
				try
				{
					/* Remove the client */ 
					ser.removeClient(i);
				}
				catch(Exception e)
				{
						System.out.println("Error: " + e);
				}
				System.exit(0);
			}
		 });
   		try
   		{
			/* Set the security manager */
			System.setSecurityManager(new RMISecurityManager());
			/* Export the client object */
			UnicastRemoteObject.exportObject(this);
			/* Find the server remote object in the RMI registry */
			ser = (ServerRemote)Naming.lookup("localhost");   
   		}
   		catch(Exception e)
   		{
			System.out.println("Error:" + e);
   		}
   		try
   		{
			/* Register the client */
			i = ser.registerClient(this);
   		}
   		catch(Exception e)
   		{
			System.out.println("Error:" + e);
   		}
 	}
 	public void actionPerformed(ActionEvent ae)
 	{
    	try
    	{
     		/* Returns the string on the server */
		ser.showText(name+": "+str.getText());
    	}
    	catch(Exception e)
    	{
			System.out.println("Error:" + e);
    	}  
 	} 
 	public void getString(String str) throws RemoteException
 	{
  		/* Append the new text */
		area.append(str +"\n");  
 	}
 	public static void main(String arg[])
 	{
		name=arg[0];
		/* Create the chat client object */
		ChatClient cc = new ChatClient();
 		cc.show();
		cc.setTitle(name);
 	}
}
