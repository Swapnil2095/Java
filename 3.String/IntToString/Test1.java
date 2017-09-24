import java.text.DecimalFormat;
class Test1
{
public static void main(String args[])
{
	int j = 255;
	String hexString = Integer.toHexString(j);
    System.out.println(hexString);

    String customString=Integer.toString(j,7);
    System.out.println(customString);

    String binaryString=Integer.toBinaryString(j);
    System.out.println(binaryString);

    String octalString=Integer.toOctalString(j);
    System.out.println(octalString);

    String str6=new StringBuffer().append(1234).toString();
    System.out.println("String str6 = "+str6);
    
    String str7=new StringBuilder().append(1234).toString();
    System.out.println("String str7 = "+str7);


    int e=12345;
    DecimalFormat df=new DecimalFormat("#,###");
    String Str5=df.format(e);
    System.out.println(Str5);


    String str4=new Integer(1234).toString();
    System.out.println("String str4 = "+str4);

    String str3=String.valueOf(1234);
    System.out.println("String str3 = "+str3);

    int a=1234;int b=-1234;
    String str1=Integer.toString(a);
    String str2=Integer.toString(b);
    System.out.println("String str1 = "+str1);
    System.out.println("String str2 = "+str2);
    
}
} 
