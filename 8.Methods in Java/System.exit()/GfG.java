// A Java program to demonstrate working of exit()
import java.util.*;
import java.lang.*;

class GfG
{
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] >= 5)
			{
				System.out.println("exit...");

				// Terminate JVM
				System.exit(0);
			}
			else
				System.out.println("arr["+i+"] = " +
								arr[i]);
		}
		System.out.println("End of Program");
	}
}


/*

The java.lang.System.exit() method exits current program by terminating running Java virtual machine. 
This method takes a status code. A non-zero value of status code is generally used 
to indicate abnormal termination. This is similar exit in C/C++.

Following is the declaration for java.lang.System.exit() method:

public static void exit(int status)
exit(0) : Generally used to indicate successful termination.
exit(1) or exit(-1) or any other non-zero value – Generally indicates unsuccessful termination.

Note : This method does not return any value.

*/