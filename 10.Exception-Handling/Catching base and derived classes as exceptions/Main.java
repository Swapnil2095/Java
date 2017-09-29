//filename Main.java
class Base extends Exception {}
class Derived extends Base {}

public class Main {

    public static void main(String args[]) {
	    try {
	            throw new Derived();
	        }
	        catch(Base b) {}
	        catch(Derived d) {} // error
    }
}


/*

In Java, catching a base class exception before derived is not allowed by the compiler itself. 
In C++, compiler might give warning about it, but compiles the code.

For example, above Java code fails in compilation with 
error message “exception Derived has already been caught”

*/
