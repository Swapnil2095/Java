class Main {
    public static void main(String args[]) {
	    int x = 0;
	    int y = 10;
	    int z = y/x;
    }
}


/*

Unchecked are the exceptions that are not checked at compiled time. 
In C++, all exceptions are unchecked, so it is not forced 
by the compiler to either handle or specify the exception. 
It is up to the programmers to be civilized, and specify or catch the exceptions.

In Java exceptions under Error and RuntimeException classes are unchecked exceptions, 
everything else under throwable is checked.

Consider the above Java program. It compiles fine, 
but it throws ArithmeticException when run. The compiler allows it to compile, 
because ArithmeticException is an unchecked exception.


Should we make our exceptions checked or unchecked?
Following is the bottom line from Java documents
If a client can reasonably be expected to recover from an exception, 
make it a checked exception. If a client cannot do anything to recover from 
the exception, make it an unchecked exception

*/