// Java program to demonstrate working of split()
public class Test4
{
	public static void main(String args[])
	{
		String str = "GeeksforforGeeksfor ";
		String [] arrOfStr = str.split("for");

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
