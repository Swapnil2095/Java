// Java program to illustrate copyOf when new array
// is of higher length.
import java.util.Arrays;

public class Main2
{
public static void main(String args[]) 
{
	// initializing an array original
	int[] org = new int[] {1, 2 ,3};
	
	System.out.println("Original Array : \n");
	for (int i = 0; i < org.length; i++)
		System.out.print(org[i] + " "); 
	
	// copying array org to copy 
	// Here, new array has 5 elements - two
	// elements more than the original array
	int[] copy = Arrays.copyOf(org, 5);

	System.out.print("\nNew array copy (of higher length):\n");
	for (int i = 0; i < copy.length; i++) 
		System.out.print(copy[i] + " ");
	}
}
