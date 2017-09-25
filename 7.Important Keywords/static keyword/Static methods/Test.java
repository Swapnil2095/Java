// java program to demonstrate restriction on static methods

/**

They can only directly call other static methods.
They can only directly access static data.
They cannot refer to this or super in any way.

*/

class Test
{
	// static variable
	static int a = 10;
	
	// instance variable
	int b = 20;
	
	// static method
	static void m1()
	{
		a = 20;
		System.out.println("from m1");
		
		// Cannot make a static reference to the non-static field b
		//b = 10; // compilation error
				
		// Cannot make a static reference to the 
				// non-static method m2() from the type Test
		//m2(); // compilation error
		
		// Cannot use super in a static context
		//System.out.println(super.a); // compiler error 
	}
	
	// instance method
	void m2()
	{ 
		System.out.println("from m2");
	}
	
	
	
	public static void main(String[] args)
	{
		// main method 
	}
}
