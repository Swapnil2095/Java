// A Java program to demonstrate shallow copy
// using clone()
import java.util.ArrayList;

// An object reference of this class is
// contained by Test2
class Test
{
	int x, y;
}

// Contains a reference of Test and implements
// clone with shallow copy.
class Test2 implements Cloneable
{
	int a;
	int b;
	Test c = new Test();
	public Object clone() throws
				CloneNotSupportedException
	{
		return super.clone();
	}
}

// Driver class
public class Main
{
	public static void main(String args[]) throws
						CloneNotSupportedException
	{
	Test2 t1 = new Test2();
	t1.a = 10;
	t1.b = 20;
	t1.c.x = 30;
	t1.c.y = 40;

	Test2 t2 = (Test2)t1.clone();

	// Creating a copy of object t1 and passing
	// it to t2
	t2.a = 100;

	// Change in primitive type of t2 will not
	// be reflected in t1 field
	t2.c.x = 300;

	// Change in object type field will be
	// reflected in both t2 and t1(shallow copy)
	System.out.println(t1.a + " " + t1.b + " " +
						t1.c.x + " " + t1.c.y);
	System.out.println(t2.a + " " + t2.b + " " +
						t2.c.x + " " + t2.c.y);
	}
}


/*
Shallow copy is method of copying an object and is followed by default in cloning. 
In this method the fields of an old object X are copied to the new object Y. 
While copying the object type field the reference is copied to Y 
i.e object Y will point to same location as pointed out by X. 
If the field value is a primitive type it copies the value of the primitive type.
Therefore, any changes made in referenced objects in object X or Y will be reflected in other object.
Shallow copies are cheap and simple to make. In above example, we created a shallow copy of object.

*/