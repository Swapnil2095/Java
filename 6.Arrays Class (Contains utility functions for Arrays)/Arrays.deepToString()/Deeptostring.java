// Java program to demonstrate that toString works if we 
// want to print single dimensional array, but doesn't work
// for multidimensional array.
import java.util.Arrays;
public class Deeptostring
{
	public static void main(String[] args)
	{
		// Trying to print array of strings using toString
		String[] strs = new String[] {"practice.geeksforgeeks.org",
									"quiz.geeksforgeeks.org"
									};
		System.out.println(Arrays.toString(strs));

		// Trying to print multidimensional array using
		// toString
		int[][] mat = new int[2][2];
		mat[0][0] = 99;
		mat[0][1] = 151;
		mat[1][0] = 30;
		mat[1][1] = 50;
		System.out.println(Arrays.toString(mat));
	}
}
