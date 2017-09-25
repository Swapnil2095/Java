// Java program to demonstrate re-assigning
// final variable will throw compile-time error

class Gfg2 
{
	static final int CAPACITY = 4;
	
	public static void main(String args[])
	{
		// re-assigning final variable
		// will throw compile-time error
		CAPACITY = 5;
	}
}
