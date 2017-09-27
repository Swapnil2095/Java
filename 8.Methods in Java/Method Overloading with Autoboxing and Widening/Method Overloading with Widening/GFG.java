
class GFG 
{
	
	public static void main (String[] args)
	{
	
		Conversion c = new Conversion();
		
		// invoking the method with signature
		// has widened data type
		c.method(10);
		c.method(new Long(100));
	}
}


/*

If compiler fails to find any method corresponding to autoboxing, 
then it starts searching a method parameter(s) of the widened primitive data type.
In the example below, we are invoking overloaded method with primitive(int) formal argument 
that has the same data type as actual argument’s data type. We are invoking another method 
with argument of Long wrapper Object. Compiler starts searching for the method having 
the same reference type (Long wrapper class). Since there is no method having with parameter 
of Long wrapper class. So, It searches for method which can accept the parameter bigger than 
long primitive data type as an argument. In this case, it finds a method with float primitive data type 
and invokes it.

*/