
// Java Program to illustrate reading from
// FileReader using FileReader
import java.io.*;
public class ReadingFromFile {
    public static void main(String[] args) throws Exception{
        // pass the path to the file as a parameter
        int i;
        char a;
        FileReader fr = new FileReader("C:\\Users\\Dell\\Documents\\Codes\\newfile.txt");
        while ((i=fr.read()) != -1){
            a=(char)i;
            System.out.print(a);
        }
    }
}