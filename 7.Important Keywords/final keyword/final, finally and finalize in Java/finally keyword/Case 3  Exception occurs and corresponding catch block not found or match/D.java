// Java program to illustrate finally in
// Case where exceptions occur
// and do not match any case in the program
class D {
	public static void main(String[] args)
	{
		int k = 15;
		try {
			System.out.println("In try block");
			int z = k / 0;
		}

		catch (NullPointerException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}

		finally
		{
			System.out.println("Executes whether exception occurs or not");
		}
	}
}


/*
Flow of Above Program: First starts from main method and then goes to try block and 
in try an Arithmetic exception occurs and corresponding catch block is not available 
so flow dosen’t goes to catch block. After that flow don’t go to try block again 
since once an exception occurs in try block then flow dosen’t come back again to try block. 
After that finally execute since finally is meant to execute whether exception occurs or not or 
whether corresponding catch block found/match or not.
*/