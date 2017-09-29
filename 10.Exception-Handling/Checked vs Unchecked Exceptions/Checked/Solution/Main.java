import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\Dell\\Documents\\Codes\\demo.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++) 
			System.out.println(fileInput.readLine());
		
		fileInput.close();
	}
}


/*

To fix the above program, we either need to specify list of exceptions using throws,
 or we need to use try-catch block. We have used throws in the below program. 
 Since FileNotFoundException is a subclass of IOException, 
 we can just specify IOException in the throws list and
 make the above program compiler-error-free.

*/