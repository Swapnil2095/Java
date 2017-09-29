// Java program to demonstrate 
// getMessage method
public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 20/0;
		} catch (Exception e)
		{
			// getMessage method
			// Prints only the message of exception
			// and not the name of exception
			System.out.println(e.getMessage());
			
			// Prints what exception has been thrown
			// System.out.println(e);
		}
	}
}


/*

By using this method, we will only get description of an exception.

Syntax:
public String getMessage()

*/