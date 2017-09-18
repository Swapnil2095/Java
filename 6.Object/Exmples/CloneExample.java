/*
Here we are creating the clone of an existing Object and not any new Object.
Class need to implement Cloneable Interface otherwise it will throw CloneNotSupportedException.
*/
public class CloneExample implements Cloneable{
    String name = "Swapnil Gaikwad";

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args){
        CloneExample obj1 = new CloneExample();
        try{
            CloneExample obj2 = (CloneExample) obj1.clone();
            System.out.println("Object1 = "+obj1.name);
            System.out.println("Object2 = "+obj2.name);
            //System.out.println("Object2 = " +  java.lang.Object.toString("obj2"));
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}