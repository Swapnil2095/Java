// Java program to demonstrate working of split(regex,
// limit) with high limit.
public class Test6
{
	public static void main(String args[])
	{
		String str = "geekss@for@geekss";
		String [] arrOfStr = str.split("s", 5);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
