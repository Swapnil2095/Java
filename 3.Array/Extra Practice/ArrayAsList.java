/*public static List asList(T…a)
It takes an array and creates a wrapper that implements List,
which makes the original array available as a list.Nothing is copied and all,
only a single wrapper object is created.Operations on the list wrapper are 
propagated to the original array.This means that if you shuffle the list wrapper,
the original array is shuffled as well,if you overwrite an element,
it gets overwritten in the original array,etc.Of course,
some List operations aren’t allowed on the wrapper,
like adding or removing elements from the list,you can only read or overwrite the elements.
*/

// Java program to demonstrate asList()
import java.util.Arrays;
import java.util.List; 

public class ArrayAsList {
        public static void main(String[] args)
    {
        Integer ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
 
        // Creates a wrapper list over ar[]
        List<Integer> l1 = Arrays.asList(ar);
 
        System.out.println(l1);

    
    }
}