// Java program to illustrate
// declaring a variable
// in initialization block
public class Example4 
{
	public static void main(String[] args) 
	{ 
		// This will cause error; 
		// int x;
		
		// redeclaring x as long will not work
		for(long y = 0, x = 1; x < 5; x++) 
		{ 
			System.out.print(x + " ");
		}
		
	}
}
