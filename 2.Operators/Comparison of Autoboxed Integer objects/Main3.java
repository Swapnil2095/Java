// file name: Main3.java
/*
If we explicitly create Integer objects using new operator, we get the output as Not Same
See the following Java program. In the following program, valueOf() is not used.
*/
public class Main3 {
	public static void main(String args[]) {
		Integer x = new Integer(40), y = new Integer(40);
		if (x == y)
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
