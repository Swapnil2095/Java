// file name: Main.java

class Complex { 
	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	/* Returns the string representation of this Complex number.
	The format of string is "Re + iIm" where Re is real part
	and Im is imagenary part.*/
	@Override
	public String toString() {
		return String.format(re + " + i" + im);
	}
}

// Driver class to test the Complex class
public class Main2 {
	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		System.out.println(c1);
	}
}
