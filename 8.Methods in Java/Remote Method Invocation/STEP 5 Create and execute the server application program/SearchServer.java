//program for server application
import java.rmi.*;
import java.rmi.registry.*;
public class SearchServer
{
	public static void main(String args[])
	{
		try
		{
			// Create an object of the interface
			// implementation class
			Search obj = new SearchQuery();

			// rmiregistry within the server JVM with
			// port number 1900
			LocateRegistry.createRegistry(1900);

			// Binds the remote object by the name
			// geeksforgeeks
			Naming.rebind("rmi://localhost:1900"+
						"/geeksforgeeks",obj);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}
}


/*

The next step is to create the server application program and execute it on a separate command prompt.

The server program uses createRegistry method of LocateRegistry class to create rmiregistry 
within the server JVM with the port number passed as argument.
The rebind method of Naming class is used to bind the remote object to the new name.

*/