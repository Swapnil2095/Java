// A Java program to demonstrate that we can return
// multiple values of different types by making a class
// and returning an object of class.

// A class that is used to store and return
// two members of different types
class MultiDiv
{
	int mul; // To store multiplication
	double div; // To store division
	MultiDiv(int m, double d)
	{
		mul = m;
		div = d;
	}
}

class Test
{
	static MultiDiv getMultandDiv(int a, int b)
	{
		// Returning multiple values of different
		// types by returning an object
		return new MultiDiv(a*b, (double)a/b);
	}

	// Driver code
	public static void main(String[] args)
	{
		MultiDiv ans = getMultandDiv(10, 20);
		System.out.println("Multiplication = " + ans.mul);
		System.out.println("Division = " + ans.div);
	}
}
