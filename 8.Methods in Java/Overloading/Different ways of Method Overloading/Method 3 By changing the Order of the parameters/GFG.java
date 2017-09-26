import java.io.*;

class Geek{
	
	public void geekIdentity(String name, int id){
		
		System.out.println("geekName :"+ name +" "+"Id :"+ id);
	}
	
	public void geekIdentity(int id, String name){
		
		System.out.println("geekName :"+ name +" "+"Id :"+ id);
	}
}

class GFG {
	public static void main (String[] args) {
		
		Geek geek = new Geek();
		
		geek.geekIdentity("Mohit", 1);
		geek.geekIdentity("shubham", 2);
		
	}
}
