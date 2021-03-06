// Java program to demonstrate 
// reference final variable

class GfG
{
	public static void main(String[] args) 
	{
		// a final reference variable sb
		final StringBuilder sb = new StringBuilder("Geeks");
		
		System.out.println(sb);
		
		// changing internal state of object
		// reference by final reference variable sb
		sb.append("ForGeeks");
		
		System.out.println(sb);
	} 
}


/*
When to use a final variable :

The only difference between a normal variable and a final variable is that 
we can re-assign value to a normal variable but we cannot change the value of a final variable 
once assigned. Hence final variables must be used only for the values that we want 
to remain constant throughout the execution of program.

Reference final variable : 
When a final variable is a reference to an object, then this final variable 
is called reference final variable. For example, a final StringBuffer variable looks like

final StringBuffer sb;
As you know that a final variable cannot be re-assign. But in case of a reference final variable, 
internal state of the object pointed by that reference variable can be changed. 
Note that this is not re-assigning. This property of final is called non-transitivity. 
To understand what is mean by internal state of the object.

*/