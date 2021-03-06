// Main.java
class Test {
int i;
Test t;
boolean b;
byte bt;
float ft;
}

public class Main {
	public static void main(String args[]) {
	Test t = new Test(); // default constructor is called.
	System.out.println(t.i);
	System.out.println(t.t);
	System.out.println(t.b);
	System.out.println(t.bt);
	System.out.println(t.ft);
	}
}


/*
Like C++, Java automatically creates default constructor if there is no default or 
parameterized constructor written by user, and (like C++) the default constructor 
automatically calls parent default constructor. But unlike C++, default constructor in Java 
initializes member data variable to default values (numeric values are initialized as 0, 
booleans are initialized as false and references are initialized as null).

*/