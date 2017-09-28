// Java program to illustrate role of this() in
// Constructor Overloading
class Box
{
	double width, height, depth;
	int boxNo;

	// constructor used when all dimensions and
	// boxNo specified
	Box(double w, double h, double d, int num)
	{
		width = w;
		height = h;
		depth = d;
		boxNo = num;
	}

	// constructor used when no dimensions specified
	Box()
	{
		// an empty box
		width = height = depth = 0;
	}

	// constructor used when only boxNo specified
	Box(int num)
	{
		// this() is used for calling the default
		// constructor from parameterized constructor
		this();

		boxNo = num;
	}

	public static void main(String[] args)
	{
		// create box using only boxNo
		Box box1 = new Box(1);

		// getting initial width of box1
		System.out.println(box1.width);
	}
}


/*
Constructors overloading vs Method overloading

Strictly speaking, constructor overloading is somewhat similar to method overloading. If we want to have different ways of initializing an object using different number of parameters, then we must do constructor overloading as we do method overloading when we want different definitions of a method based on different parameters.

*/