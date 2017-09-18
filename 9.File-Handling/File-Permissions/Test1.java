
// Java program to check the current file permissions.
import java.io.*;
public class Test1{
    public static void main(String[] args){
        // creating a file instance
        File file = new File("C:\\Users\\Dell\\Documents\\Codes\\newfile.txt");
        // check if the file exists
        boolean exists = file.exists();
        if(exists == true)
        {
            // printing the permissions associated with the file
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: "+ file.canWrite());
        }
        else{
            System.out.println("File not found.");
        }
    }
}