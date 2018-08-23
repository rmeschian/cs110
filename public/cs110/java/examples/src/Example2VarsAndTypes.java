
// Here is a list of all primitives in Java:
// byte (number, 1 byte, 128 to -127)
// short (number, 2 bytes, -32,768 to 32,767)
// int (number, 4 bytes, -2,147,483,648 to 2,147,483,647)
// long (number, 8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808)
// float (float number, 4 bytes, 7 decimal digits)
// double (float number, 8 bytes, 16 decimal digits)
// char (a character, 2 bytes)
// boolean (true or false, 1 byte)

public class Example2VarsAndTypes {

	public static void main(String[] args) {
		
		// string
		String name = "Joe";
		
		System.out.println(name);
		
		// numbers
		double a = 4.5;
		double b = 5.683;
		int c = (int) b; // casting (changing the type)
		
		System.out.println("a + b + c = " + (a + b + c));
		
		// characters
		char d = 'A';
		
		System.out.println(d);
		
		// boolean
		boolean isAwesome = true;
		if(isAwesome) {
			System.out.println("The value of bb is: " + isAwesome);
		}
		
		
		// String (not a primitive, but a type)
		String s = "Who who who who!";
		System.out.println(s);
	}
}