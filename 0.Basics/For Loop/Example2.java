// Java program to illustrate
// Initializing multiple variables 
// in initialization block
public class Example2 
{

	public static void main(String[] args) 
	{
		int x = 2;
		for(long y = 0, z = 4; x < 10 && y < 10; x++, y++) 
		{
			System.out.println(y + " ");
		}
	
		System.out.println(x);
	}
}
