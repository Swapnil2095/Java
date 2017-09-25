// A java program to demonstrate 
// use of abstract keyword.

// abstract with class
abstract class A 
{
	// abstract with method
	// it has no body
	abstract void m1();
	
	// concrete methods are still allowed in abstract classes
	void m2()
	{
		System.out.println("This is a concrete method.");
	}
}

// concrete class B
class B extends A 
{
	// class B must override m1() method
	// otherwise, compile-time exception will be thrown
	void m1() {
		System.out.println("B's implementation of m2.");
	}
	
	
}

// Driver class
public class AbstractDemo 
{
	public static void main(String args[]) 
	{
		B b = new B();
		b.m1();
		b.m2();
	}
}




/*
Important rules for abstract methods:

Any class that contains one or more abstract methods must also be declared abstract

The following are various illegal combinations of other modifiers for methods with respect to abstract modifier :
final
abstract native
abstract synchronized
abstract static
abstract private
abstract strictfp

Note : Although abstract classes cannot be used to instantiate objects, 
they can be used to create object references, because Java’s approach to run-time polymorphism
 is implemented through the use of super-class references. Thus, it must be possible to create a reference 
 to an abstract class so that it can be used to point to a subclass object.

*/