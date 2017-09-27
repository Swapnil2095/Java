// Java program to illustrate
// autoboxing followed by 
// widening in refernce type
// variables
import java.io.*;

class Conversion 
{
	
	// overloaded method with refernce type
	// formal argument
	public void method(Object b)
	{
		
		// Object b is typecasted to Byte and then printed 
		Byte bt = (Byte) b;
		System.out.println("refernce type formal argument :" + bt);
	}
	
}

class GFG 
{
	
	public static void main (String[] args) 
	{
	
		Conversion c = new Conversion();
	
		byte val = 5;
		
		// b is first widened to Byte 
		// and then Byte is passed to Object. 
		c.method(val);
	}
}

/*
But boxing followed by widening is acceptable if this is passed to a reference of type Object. 
See the above example for this.
*/