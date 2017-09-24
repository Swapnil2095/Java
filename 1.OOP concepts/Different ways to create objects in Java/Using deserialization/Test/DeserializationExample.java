// Java program to illustrate creation of Object
// using Deserialization.
import java.io.*;

public class DeserializationExample
{
	public static void main(String[] args)
	{
		try
		{
			DeserializationExample d;
			FileInputStream f = new FileInputStream("../file.txt");
			ObjectInputStream oos = new ObjectInputStream(f);
			d = (DeserializationExample)oos.readObject();
			System.out.println(d);  // problem need to solve
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
