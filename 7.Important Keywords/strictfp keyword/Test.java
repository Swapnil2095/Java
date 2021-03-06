//Java program to illustrate strictfp modifier

public class Test
{
	// calculating sum using strictfp modifier
	public strictfp double sum()
	{
		double num1 = 10e+10;

		double num2 = 6e+08;

		return (num1+num2);

	}

	public static strictfp void main(String[] args)
	{
		Test t = new Test();

		System.out.println(t.sum());
	}
}



/*

strictfp is a keyword in java used for restricting floating-point calculations and ensuring same result on 
every platform while performing operations in the floating-point variable.
Floating point calculations are platform dependent i.e. different output(floating-point values)
 is achieved when a class file is run on different platforms(16/32/64 bit processors). 
 To solve this types of issue, strictfp keyword was introduced in JDK 1.2 version by following 
 IEEE 754 standards for floating-point calculations.

Important points:

strictfp modifier is used with classes, interfaces and methods only.
strictfp class Test
{   
    // all concrete methods here are
    // implicitly strictfp.	
}
strictfp interface Test
{   
    // all  methods here becomes implicitly 
    // strictfp when used during inheritance.	
}
class Car
{  
    // strictfp applied on a concrete method 
    strictfp void calculateSpeed(){}
}  
        

When a class or an interface is declared with strictfp modifier, 
then all methods declared in the class/interface, and all nested types declared in the class, 
are implicitly strictfp.

strictfp cannot be used with abstract methods. However, it can be used with abstract classes/interfaces.
Since methods of an interface are implicitly abstract, strictfp cannot be used with any method 
inside an interface.


strictfp interface Test 
{
    double sum();
    strictfp double mul(); // compile-time error here
}
*/