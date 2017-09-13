import java.io.*;
class Test4
{
	public static void main (String[] args)
	{
		StringBuffer s=new StringBuffer("GeeksforGeeks");
		s.replace(5,8,"are");
        System.out.println(s); //returns GeeksareGeeks
        

        StringBuffer s1=new StringBuffer("GeeksforGeeks");
		s1.delete(0,5);
		System.out.println(s1); //returns forGeeks
		s1.deleteCharAt(7);
        System.out.println(s1); //returns forGeek
        
        StringBuffer s2=new StringBuffer("GeeksGeeks");
		s2.reverse();
        System.out.println(s2); //returns skeeGrofskeeG
        
        StringBuffer s3=new StringBuffer("GeeksGeeks");
		s3.insert(5, "for");
		System.out.println(s3); //returns GeeksforGeeks
		s3.insert(0,5);
        System.out.println(s3); //returns 5GeeksforGeeks
        

        StringBuffer s4=new StringBuffer("GeeksforGeeks");
		int p=s4.length();
		int q=s4.capacity();
		System.out.println("Length of string GeeksforGeeks="+p);
        System.out.println("Capacity of string GeeksforGeeks="+q);
        
        StringBuffer s5=new StringBuffer("Geeksfor");
		s5.append("Geeks");
		System.out.println(s5); //returns GeeksforGeeks
		s5.append(1);
		System.out.println(s5); //returns GeeksforGeeks1

	}
}
