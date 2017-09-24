// Java program to demonstrate that deepToString(strs))
// works for single dimensional arrays also, but doesn't
// work single dimensional array of primitive types.
import java.util.Arrays;
public class Deeptostring2
{
	public static void main(String[] args)
	{
		String[] strs = new String[] {"practice.geeksforgeeks.org",
									"quiz.geeksforgeeks.org"
									};
		System.out.println(Arrays.deepToString(strs));
		
		Integer [] arr1 = {10, 20, 30, 40};
		System.out.println(Arrays.deepToString(arr1));
		
		/* Uncommenting below code would cause error as 
		deepToString() doesn't work for primitive types
		int [] arr2 = {10, 20, 30, 40};
		System.out.println(Arrays.deepToString(arr2)); */
	}
}
