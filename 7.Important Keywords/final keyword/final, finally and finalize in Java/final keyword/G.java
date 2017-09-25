// Java program to illustrate final keyword
final class G {

	// by default it is final.
	void h() {}

	// by default it is not final.
	static int j = 30;

public static void main(String[] args)
	{
		// See modified contents of variable j.
		j = 36;
		System.out.println(j);
	}
}


/*
Note : If a class is declared as final then by default all of the methods present in that class 
are automatically final but variables are not.
*/