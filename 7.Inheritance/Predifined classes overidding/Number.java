// Number is predefined class name in java.lang package
// Note : java.lang package is included in every java program by default
public class Number {
    // instance variable
    int Number = 20;
    public static void main (java.lang.String[] args){ // changed String class defined in same folder -> so don't use just String[] args
        // reference variable
        Number Number = new Number();
        // printing reference
        System.out.println(Number);
        // printing instance variable
        System.out.println(Number.Number);
    }
}
