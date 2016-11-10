
// Here is a list of all primitives in Java:
// byte (number, 1 byte)
// short (number, 2 bytes)
// int (number, 4 bytes)
// long (number, 8 bytes)
// float (float number, 4 bytes)
// double (float number, 8 bytes)
// char (a character, 2 bytes)
// boolean (true or false, 1 byte)

public class Example2VarsAndTypes {
	public static void main(String[] args) {
		
		// numbers
		double a = 4.5;
		double b = 5.683;
		int c = (int) b; // casting (changing the type)
		
		System.out.println("a + b + c = " + (a + b + c));
		
		// characters
		char d = 'A';
		
		System.out.println(d);
		
		// boolean
		boolean bb = true;
		if(bb) {
			System.out.println("The value of bb is: " + bb);
		}
		
		
		// String (not a primitive, but a type)
		String s = "Who who who who!";
		System.out.println(s);
	}
}