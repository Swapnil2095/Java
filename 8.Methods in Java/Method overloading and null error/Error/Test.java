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

		// This line causes error
		mv.fun(null);
	}
}


/*
The reason why we get compile time error in the above scenario is, 
here the method arguments Integer and String both are not primitive data types in Java. 
That means they accept null values. When we pass a null value to the method1 the compiler gets confused 
which method it has to select, as both are accepting the null.

*/