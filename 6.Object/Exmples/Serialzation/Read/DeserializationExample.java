/*

*/

import java.io.*;
public class DeserializationExample{
     String name;
     public static void main(String[] args) {
         DeserializationExample d1 ;
         try{
             FileInputStream file = new FileInputStream("test.txt");
             ObjectInputStream oos = new ObjectInputStream(file);
             d1 = (DeserializationExample)oos.readObject();
             //oos.close();
             //file.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(d1);

    }
}