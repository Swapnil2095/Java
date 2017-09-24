// file name: Main.java
public class Main2 {
	public static void main(String args[]) {
		Integer x = 40, y = 40;
		if (x == y)
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}

/*
In Java, values from -128 to 127 are cached, so the same objects are returned. 
The implementation of valueOf() uses cached objects if the value is between -128 to 127.
*/