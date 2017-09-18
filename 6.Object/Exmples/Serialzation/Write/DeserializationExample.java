/*

*/

import java.io.*;
public class DeserializationExample implements Serializable{
 
    private String name; 
    DeserializationExample(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        
        try{
             DeserializationExample d = new DeserializationExample("Swapnil Gaikwad");
             FileOutputStream file = new FileOutputStream("test.txt");
             ObjectOutputStream oos = new ObjectOutputStream(file);
             oos.writeObject(d);
             oos.close();
             file.close();


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}