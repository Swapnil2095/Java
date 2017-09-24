// A Java program to demonstrate flexible nature of
// java.lang.Object
public class GFG
{
	public static void main(String arr[])
	{
		Object y;

		y = 'A';
		System.out.println(y.getClass().getName());

		y = 1;
		System.out.println(y.getClass().getName());

		y = "Hi";
		System.out.println(y.getClass().getName());

		y = 1.222;
		System.out.println(y.getClass().getName());

		y = false;
		System.out.println(y.getClass().getName());
	}
}
