public class Conversion 
{
	
	// 1.overloaded method with primitive formal argument
	public void method(int i)
	{
		
		System.out.println("Primitive type int formal argument :" + i);
	}
	
    // overloaded method with reference formal argument
    // if we comment this method, int -> primitive type method will run
	public void method(Integer i)
	{
		
		System.out.println("Reference type Integer formal argument :" + i);
	}
	
	// 2. overloaded method primitive formal argument
	// and to be invoked for wrapper Object as overloaded method
	// with wrapper object of same(Long) type as an argument is not 
	// available.
	public void method(long i)
	{
		
		System.out.println("Primitive type long formal argument :" + i);
    }
    
    public static void main(String[] args) {
        
    }
}
