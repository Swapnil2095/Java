public class BoxingExample 
{
	public static void main(String[] args) 
	{
			Integer i = new Integer(10);
			Integer j = new Integer(20);
			Integer k = new Integer(i.intValue() + j.intValue());
			System.out.println("Output: "+ k);
	}
}
