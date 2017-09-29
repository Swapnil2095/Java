// Java program to demonstrate exception is thrown
// how the runTime system searches th call stack
// to find appropriate exception handler.
class ExceptionThrown
{
	// It throws the Exception(ArithmeticException).
	// Appropriate Exception handler is not found within this method.
	static int divideByZero(int a, int b){
		
		// this statement will cause ArithmeticException(/ by zero)
		int i = a/b; 
		
		return i;
	}
	
	// The runTime System searches the appropriate Exception handler
	// in this method also but couldn't have found. So looking forward
	// on the call stack.
	static int computeDivision(int a, int b) {
		
		int res =0;
		
		try
		{
		res = divideByZero(a,b);
		}
		// doesn't matches with ArithmeticException
		catch(NumberFormatException ex)
		{
		System.out.println("NumberFormatException is occured"); 
		}
		return res;
	}
	
	// In this method found appropriate Exception handler.
	// i.e. matching catch block.
	public static void main(String args[]){
		
		int a = 1;
		int b = 0;
		
		try
		{
			int i = computeDivision(a,b);
		
		}
		
		// matching ArithmeticException
		catch(ArithmeticException ex)
		{
			// getMessage will print description of exception(here / by zero)
			System.out.println(ex.getMessage());
		}
	}
}


/*

How JVM handle an Exception?

Default Exception Handling : Whenever inside a method, if an exception has occurred, 
the method creates an Object known as Exception Object and hands it off to the run-time system(JVM). 
The exception object contains name and description of the exception, and current state of 
the program where exception has occurred. Creating the Exception Object and handling it to 
the run-time system is called throwing an Exception.There might be the list of the methods 
that had been called to get to the method where exception was occurred. This ordered list of 
the methods is called Call Stack.Now the following procedure will happen.

The run-time system searches the call stack to find the method that contains block of code that
 can handle the occurred exception. The block of the code is called Exception handler.

The run-time system starts searching from the method in which exception occurred, proceeds 
through call stack in the reverse order in which methods were called.

If it finds  appropriate handler then it passes the occurred exception to it. Appropriate
 handler means the type of the exception object thrown matches the type of the exception 
 object it can handle.

If run-time system searches all the methods on call stack and couldn’t have found the 
appropriate handler then run-time system handover the Exception Object to default exception
 handler , which is part of run-time system. This handler prints the exception information 
 in the following format and terminates program abnormally.

*/