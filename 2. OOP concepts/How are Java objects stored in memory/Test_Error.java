class Test {
	// class contents
	void show() {
		System.out.println("Test::show() called");
	}
}

public class Test_Error {
	public static void main(String[] args) {
		Test t; 
		t.show(); // Error here because t is not initialed
	}
}
