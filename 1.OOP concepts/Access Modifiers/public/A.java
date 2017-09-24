//Java program to illustrate
//public modifier
//package p1;
public class A
{
    public void display()
	{
		System.out.println("GeeksforGeeks");
	}
	
	public static void main(String args[])
	{
		A obj = new A();
		obj.display();
	}
}