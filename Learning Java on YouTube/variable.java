
public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x; // declaration
//		x = 123; // assignment
		
		int x = 123; // initialization int is about +/- 2 billions
		
		System.out.println("x");
		System.out.println(x);
		System.out.println("x");
		System.out.println("My number is " + x);
		
		long y = 13413545646654L; // make sure to put 'L' with the number for long
		System.out.println(y);
		
		byte z = 127; // byte is between -127 and 127
		System.out.println(z);
		
		float a = 3.14f; // decimals can be used by float (f)/double
		double b = 3.57; // does not need a character at the end of the number
		System.out.println(a);
		System.out.println(b);
		
		boolean c = true; // Boolean only hold true or false
		System.out.println(c);
		
		char symbol = '$'; // variable can be long but the value is a character
		System.out.println(symbol);
		
		String name = "Prem";
		System.out.println(name);
	}

}
