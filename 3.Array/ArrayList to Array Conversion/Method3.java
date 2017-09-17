// Java program to convert a ArrayList to an array
// using get() in a loop.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Method3
{
	public static void main (String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Integer[] arr = new Integer[al.size()];

		// ArrayList to Array Conversion
		for (int i =0; i < al.size(); i++)
			arr[i] = al.get(i);

		for (Integer x : arr)
			System.out.print(x + " ");
	}
}
