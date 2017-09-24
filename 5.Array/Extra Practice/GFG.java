
Explore More...
Arrays
Arrays in Java
Default array values in Java
Compare two arrays
Final Arrays & Jagged Arrays
Array IndexOutofbounds Exception
Explore More...
Strings
String Class in Java
StringBuffer , StringTokenizer & StringJoiner
Initialize and Compare Strings
String vs StringBuilder vs StringBuffer
Integer to String & String to Integer
Search, Reverse and Split()
Explore More...
OOP in Java
Classes and Objects in Java
Different ways to create objects
Access Modifiers in Java
Object class in Java
Encapsulation & Inheritance
Method Overloading & Overriding
Explore More...
Constructors
Constructors & Constructor Chaining
Constructor Overloading
Private Constructors and Singleton Classes
Explore More...
Methods
Parameter Passing
Returning Multiple Values
Private and Final Methods
Default Methods
Explore More...
Exception Handling
Exceptions & Types of Exceptions
Flow control in try-catch & Multicatch 
throw and throws
Explore More...
Multithreading
Multithreading
Lifecycle and States of a Thread
Main Thread
Synchronization
Inter-thread Communication & Java Concurrency
Explore More...
File Handling
File Class
File Permissions
Different ways of Reading a text file
Delete a File
Explore more...
Garbage Collection
Garbage Collection
Mark and Sweep
Explore more...
Java Packages
Packages
Java.io Package
Java.lang package
Java.util Package
Networking
Socket Programming
URL class in Java
Reading from a URL
Inet Address Class
A Group Chat Application
Explore more...
ArrayList to Array Conversion in Java : toArray() Methods
Following methods can be used for converting ArrayList to Array:

Method 1: Using Object[] toArray() method

Syntax:
 public Object[] toArray() 
It is specified by toArray in interface Collection and interface List
It overrides toArray in class AbstractCollection
It returns an array containing all of the elements in this list in the correct order.
// Java program to demonstrate working of
// Objectp[] toArray()
import java.io.*;
import java.util.List;
import java.util.ArrayList;
 
class GFG
{
    public static void main (String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
 
        Object[] objects = al.toArray();
 
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}