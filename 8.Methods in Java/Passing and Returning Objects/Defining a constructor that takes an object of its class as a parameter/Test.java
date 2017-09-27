// Java program to demonstrate one object to
// initialize another
class Box
{
	double width, height, depth;

	// Notice this constructor. It takes an
	// object of type Box. This constructor use
	// one object to initialize another
	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

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

// driver class
public class Test
{
	public static void main(String args[])
	{
		// creating a box with all dimensions specified
		Box mybox = new Box(10, 20, 15);

		// creating a copy of mybox
		Box myclone = new Box(mybox);  //*********** */

		double vol;

		// get volume of mybox
		vol = mybox.volume();
		System.out.println("Volume of mybox is " + vol);

		// get volume of myclone
		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
	}
}
