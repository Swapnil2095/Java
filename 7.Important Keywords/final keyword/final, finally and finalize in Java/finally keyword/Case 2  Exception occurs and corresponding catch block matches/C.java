// Java program to illustrate finally in
// Case where exceptions occur
// and match in the program
class C {
	public static void main(String[] args)
	{
		int k = 66;
		try {
			System.out.println("In try block");
			int z = k / 0;
			// Carefully see flow dosen't come here
			System.out.println("Flow dosen't came here");
		}

		catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether exception occurs or not");
		}
	}
}
