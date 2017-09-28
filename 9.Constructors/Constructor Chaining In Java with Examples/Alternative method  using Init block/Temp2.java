class Temp2
{
	// block to be excuted first
	{
		System.out.println("init");
	}
	Temp2()
	{
		System.out.println("default");
	}
	Temp2(int x)
	{
		System.out.println(x);
	}

	// block to be executed after the first block
	// which has been defined above.
	{
		System.out.println("second");
	}
	public static void main(String args[])
	{
		new Temp2();
		new Temp2(10);
	}
}


/*
NOTE: If there are more than one blocks, they are executed in the order in which 
they are are defined within the same class.

*/