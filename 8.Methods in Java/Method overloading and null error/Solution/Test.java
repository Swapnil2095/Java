public class Test
{
	// Overloaded methods
	public void fun(Integer i)
	{
		System.out.println("fun(Integer ) ");
	}
	public void fun(String name)
	{
		System.out.println("fun(String ) ");
	}

	// Driver code
	public static void main(String [] args)
	{
		Test mv = new Test();
		
		Integer arg = null;

		// No compiler error
		mv.fun(arg);
	}
}

/*
This compile time error wouldn’t happen unless we intentionally pass null value. 
For example see the below scenario which we follow generally while coding.


In the above scenario if the “arg” value is null due to the result of the expression, 
then the null value is passed to method1. Here we wouldn’t get compile time error 
because we are specifying that the argument is of type Integer, 
hence the compiler selects the method1(Integer i) and will execute the code inside that.
*/
