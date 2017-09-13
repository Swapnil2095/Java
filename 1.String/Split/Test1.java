// Java program to demonstrate working of split()
public class Test1
{
	public static void main(String args[])
	{
		String str = "Geekssss";
		String [] arrOfStr = str.split("s");

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
