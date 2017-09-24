// A Java program to show that a parent object is
// not an instance of Child

class Parent { }
class Child extends Parent { }

class Test
{
	public static void main(String[] args)
	{
		Parent pobj = new Parent();
		if (pobj instanceof Child)
		System.out.println("pobj is instance of Child");
		else
		System.out.println("pobj is NOT instance of Child");
	}
}
