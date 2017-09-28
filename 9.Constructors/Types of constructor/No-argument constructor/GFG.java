// Java Program to illustrate calling a
// no-argument constructor
import java.io.*;

class Geek
{
	int num;
	String name;

	// this would be invoked while object
	// of that class created.
	Geek()
	{
		System.out.println("Constructor called");
	}
}

class GFG
{
	public static void main (String[] args)
	{
		// this would invoke default constructor.
		Geek geek1 = new Geek();

		// Default constructor provides the default
		// values to the object like 0, null
		System.out.println(geek1.name);
		System.out.println(geek1.num);
	}
}


/*

Constructors are used to initialize the object’s state. 
Like methods, a constructor also contains collection of statements(i.e. instructions) 
that are executed at time of Object creation.

When is a Constructor called ?
Each time an object is created using new() keyword at least one constructor 
(it could be default constructor) is invoked to assign initial values to the data members 
of the same class.

*/