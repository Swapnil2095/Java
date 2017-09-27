// Creating a Search interface
import java.rmi.*;
public interface Search extends Remote
{
	// Declaring the method prototype
	public String query(String search) throws RemoteException;
}


/*


The first thing to do is to create an interface which will provide the description of the methods 
that can be invoked by remote clients. This interface should extend the Remote interface and 
the method prototype within the interface should throw the RemoteException.

*/