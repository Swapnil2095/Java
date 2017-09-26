// file name: Main.java
class Base {
	private final void foo() {}
}

class Derived extends Base {
	public void foo() {} 
}

public class Main {
	public static void main(String args[]) {

        Derived d = new Derived();
        d.foo();

		Base b = new Derived();
		b.foo(); //error
	}
}


/*

When we use final specifier with a method, the method cannot be overridden in any of the inheriting classes. 
Methods are made final due to design reasons. 
Since private methods are inaccessible, they are implicitly final in Java. 
So adding final specifier to a private method doesn’t add any value. 
It may in-fact cause unnecessary confusion.

*/