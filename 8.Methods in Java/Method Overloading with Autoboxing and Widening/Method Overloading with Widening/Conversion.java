// Java program to illustrate method 
// overloading 
// in case of widening
import java.io.*;

public class Conversion 
{
	// overloaded method
	public void method(int i)
	{
		System.out.println("Primitive type int formal argument :" + i);
	}
	
	// overloaded method primitive formal argument
	// and to be invoked for wrapper Object as 

	public void method(float i)
	{
		
		System.out.println("Primitive type float formal argument :" + i);
	}

	
}