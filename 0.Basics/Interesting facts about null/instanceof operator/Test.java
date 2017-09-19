public class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Integer i = null;
		Integer j = 10;
			
		//prints false
		System.out.println(i instanceof Integer);
		
		//Compiles successfully
		System.out.println(j instanceof Integer);
	}
}
