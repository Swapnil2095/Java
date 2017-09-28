// Java program to illustrate
// Constructor Overloading
class Box
{
	double width, height, depth;

	// constructor used when all dimensions
	// specified
	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	// constructor used when no dimensions
	// specified
	Box()
	{
		width = height = depth = 0;
	}

	// constructor used when cube is created
	Box(double len)
	{
		width = height = depth = len;
	}

	// compute and return volume
	double volume()
	{
		return width * height * depth;
	}
}

// Driver code
public class Test
{
	public static void main(String args[])
	{
		// create boxes using the various
		// constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);

		double vol;

		// get volume of first box
		vol = mybox1.volume();
		System.out.println(" Volume of mybox1 is " + vol);

		// get volume of second box
		vol = mybox2.volume();
		System.out.println(" Volume of mybox2 is " + vol);

		// get volume of cube
		vol = mycube.volume();
		System.out.println(" Volume of mycube is " + vol);
	}
}

/*

Sometimes there is a need of initializing an object in different ways. This can be done using constructor overloading. For example, Thread class has 8 types of constructors. If we do not want to specify anything about a thread then we can simply use default constructor of Thread class, however if we need to specify thread name, then we may call the parameterized constructor of Thread class with a String args like this:

Thread t= new Thread (" MyThread "); 
Let us take an example to understand need of constructor overloading. Consider the following implementation of a class Box with only one constructor taking three arguments.

// An example class to understand need of
// constructor overloading.
class Box
{
    double width, height,depth;

    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
As we can see that the Box() constructor requires three parameters. This means that all declarations of Box objects must pass three arguments to the Box() constructor. For example, the following statement is currently invalid:

Box ob = new Box();
Since Box() requires three arguments, it’s an error to call it without them. Suppose we simply wanted a box object without initial dimension, or want to to initialize a cube by specifying only one value that would be used for all three dimensions. From the above implementation of Box class these options are not available to us.

These types of problems of different ways of initializing an object can be solved by constructor overloading.

*/