public class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// compile-time error : can't find symbol 'NULL'
		Object obj = NULL; 
		
		//runs successfully
		Object obj1 = null; 
	}
}
