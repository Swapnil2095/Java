class Test1 {
    final int i; // i could be assigned a value here also
    Test1() {
	    i = 10;
    }

//other stuff in the class
    public static void main(String[] args){

    }
}

/*
In Java, non-static final variables can be assigned a value either in constructor or
 with the declaration. But, static final variables cannot be assigned value in constructor; 
 they must be assigned a value with their declaration.
*/