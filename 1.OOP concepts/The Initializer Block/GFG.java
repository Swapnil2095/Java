import java.io.*;
public class GFG
{
	// Initializer block starts..
	{
		// This code is executed before every constructor.
		System.out.println("1.Common part of constructors invoked !!");
	}
	// Initializer block ends

	public GFG()
	{
		System.out.println("2.Default Constructor invoked");
    }
    
	public GFG(int x)
	{
		System.out.println("3.Parametrized constructor invoked");
    }
    
	public static void main(String arr[])
	{
		GFG obj1, obj2;
		obj1 = new GFG();
		obj2 = new GFG(0);
	}
}
