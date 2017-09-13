// Java program to demonstrate working of valueOf()
public class Test2
{
	public static void main(String args[])
	{
		int decimalExample = Integer.valueOf("20");
		int signedPositiveExample = Integer.valueOf("+20");
		int signedNegativeExample = Integer.valueOf("-20");
		int radixExample = Integer.valueOf("20",16);
		int stringExample = Integer.valueOf("geeks",29);

		System.out.println(decimalExample);
		System.out.println(signedPositiveExample);
		System.out.println(signedNegativeExample);
		System.out.println(radixExample);
		System.out.println(stringExample);
	}
}
