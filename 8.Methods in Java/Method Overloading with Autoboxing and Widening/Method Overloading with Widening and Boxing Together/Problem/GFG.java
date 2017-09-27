// Java program to illustrate method 
// overloading for widening
// and autoboxing together
import java.io.*;

class Conversion 
{
	// overloaded method with refernce type formal argument
	public void method(Integer a)
	{
		
		System.out.println("Primitive type byte formal argument :" + a);
	}
	
}

class GFG 
{
	
	public static void main (String[] args) 
	{
	
		Conversion c = new Conversion();
		
		// invoking the method 
		byte val = 5;
		c.method(val);
	}
}


/*

What happens if widening and boxing happen together? What method invocation will compiler be able to do?
Widening of primitive type has taken priority over boxing and var-args. But widening and 
boxing of primitive type can not work together.

*/