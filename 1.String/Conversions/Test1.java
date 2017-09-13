// Java program to demonstrate conversion from 
// String to StringBuffer and StringBuilder.
public class Test1 
{
	public static void main(String[] args)
	{
		StringBuffer sbr = new StringBuffer("Geeks");
		
		// conversion from StringBuffer object to StringBuilder
		String str = sbr.toString();
		StringBuilder sbl = new StringBuilder(str);
		
		System.out.println(sbl);
		
	}
}
