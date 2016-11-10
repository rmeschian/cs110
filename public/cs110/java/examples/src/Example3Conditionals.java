
// Comparators: >, <, >=, <=, ==, !=
// Boolean operators: &&, ||, !

public class Example3Conditionals {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 5;
		
		boolean bb = a == b;
		
		if(a == b && a == c && !bb) {
			System.out.println("They are the same");
		} else if(a != c) {
			System.out.println("They are different");
		} else {
			System.out.println("huh?");
		}
	}
}