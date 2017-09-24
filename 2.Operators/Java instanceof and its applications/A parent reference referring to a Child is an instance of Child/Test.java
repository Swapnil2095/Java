// A Java program to show that a parent reference
// referring to a Child is an instance of Child

class Parent { }
class Child extends Parent { }

class Test
{
	public static void main(String[] args)
	{
		// Reference is Parent type but object is
		// of child type.
		Parent cobj = new Child();
		if (cobj instanceof Child)
		System.out.println("cobj is instance of Child");
		else
		System.out.println("cobj is NOT instance of Child");
	}
}
