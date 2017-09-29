// Java program to demonstrate 
// toString method
public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 20/0;
		} catch (Exception e)
		{
			// toString method
			System.out.println(e.toString());
			
			// OR
			// System.out.println(e);
		}
	}
}

/*

By using this method, we will only get name and description of an exception. 
Note that this method is overridden in Throwable class.

*/