class Hello {


    String s = new String("RR");

    
	public static void main(String[] args)
	{
		
		//s = null;
        Hello s = new Hello();
        s = null;
		// Requesting JVM to call Garbage Collector method
		System.gc();
		System.out.println("Main Completes");
	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overriden");
	}
}


/*
The object which is eligible for Garbage Collection, that object’s corresponding class finalize method 
is going to be executed
*/