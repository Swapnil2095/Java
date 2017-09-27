// Java program to illustrate 
// Autoboxing
// while resolving data type as:
// a)reference b)primitive 
import java.io.*;


class GFG 
{
	
	public static void main (String[] args) 
	{
		Conversion c = new Conversion();
		
		// invoking the method with different signature.
		c.method(10);
		c.method(new Integer(15));
		c.method(new Long(100));
		
		// Using short will give, argument mismatch;
		// possible lossy conversion from int to short
		// c.method(new Short(15));
		
	}
}


/*

In method overloading, you may come across a situation where a signature takes 
reference type or a primitive type as a formal argument. The compiler first searches a method 
with parameter(s) of the same data type(s). If you are using wrapper class Object as an actual argument 
and compiler does not find the method with parameter(s) of the same reference type 
(i.e. class or interface type), then it starts searching a method with parameter(s) 
having the corresponding primitive data type.

*/