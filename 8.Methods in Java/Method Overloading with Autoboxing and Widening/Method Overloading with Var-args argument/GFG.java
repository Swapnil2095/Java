// Java program to illustrate
// method overloading for var-args
// and widening concept together
import java.io.*;

class Conversion
{
	// overloaded method primitive(byte) var-args formal argument
	public void method(byte... a)
	{
		System.out.println("Primitive type byte formal argument :" + a);
	}
	
	// overloaded method primitive(int) formal arguments
	public void method(long a, long b)
	{
		System.out.println("Widening type long formal argument :" + a);
	}
}

class GFG 
{
	
	public static void main (String[] args)
	{
		Conversion c = new Conversion();
		
		// invokes the method having widening 
		// primitive type parameters.
		byte val = 5;
		c.method(val,val);
	}
}


/*
Widening of primitive type gets more priority over var-args.
*/