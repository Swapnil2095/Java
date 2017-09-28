class Test2 {
static final int i = 10; // Since i is static final, it must be assigned value here only. 

//other stuff in the class
    public static void main(String[] args){

    }
}

/*


If we make i as static final then we must assign value to i with the delcaration.

Such behavior is obvious as static variables are shared among all the objects of a class; 
creating a new object would change the same static variable which is not allowed 
if the static variable is final.


*/