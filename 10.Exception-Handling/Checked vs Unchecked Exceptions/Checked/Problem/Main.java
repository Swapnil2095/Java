import java.io.*;

class Main {
	public static void main(String[] args) {
		FileReader file = new FileReader("C:\\Users\\Dell\\Documents\\Codes\\demo.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
        Printfirst 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++) 
			System.out.println(fileInput.readLine());
		
		fileInput.close();
	}
}


/*

Checked: are the exceptions that are checked at compile time. 
If some code within a method throws a checked exception, 
then the method must either handle the exception or it must specify the exception 
using throws keyword.

For example, consider the following Java program that opens 
file at locatiobn “C:\\Users\\Dell\\Documents\\Codes\\demo.txt” and prints first three lines of it. 
The program doesn’t compile, because the function main() uses FileReader() and 
FileReader() throws a checked exception FileNotFoundException. 
It also uses readLine() and close() methods, 
and these methods also throw checked exception IOException

*/
