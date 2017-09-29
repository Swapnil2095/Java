// Java program to demonstrate 
// printStackTrace method
public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			int a = 20/0;
		} catch (Exception e)
		{
			// printStackTrace method
			// prints line numbers + call stack
			e.printStackTrace();
			
			// Prints what exception has been thrown
			System.out.println(e);
		}
	}
}


/*

By using this method, we will get name(e.g. java.lang.ArithmeticException) and 
description(e.g. / by zero) of an exception separated by colon, 
and stack trace (where in the code, that exception has occurred) in the next line.


Syntax:
public void printStackTrace()

*/