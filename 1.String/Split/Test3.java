// Java program to demonstrate working of split()
public class Test3
{
	public static void main(String args[])
	{
		String str = "GeeksforGeeksforStudents";
		String [] arrOfStr = str.split("for");

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
