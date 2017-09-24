// Java program to fill a multidimensional array with 
// given value.
import java.util.Arrays;

public class Main3
{
	public static void main(String[] args)
	{
		int [][]ar = new int [3][4];

		// Fill each row with 10. 
		for (int[] row : ar)
			Arrays.fill(row, 10);
	
		System.out.println(Arrays.deepToString(ar));
	}
}
