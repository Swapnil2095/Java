// A Java program to demonstrate that
// final methods cannot be overridden

class Parent
{
	// Can't be overridden
	final void show() { }
}

class Child extends Parent
{
	// This would produce error
	void show() { }
}
