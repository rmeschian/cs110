
// In Java, every line of code that can actually run needs to be 
// inside a class. This line declares a class named Example1HelloWorld, 
// which is public, that means that any other class can access it.

// Notice that when we declare a public class, we must declare it inside a 
// file with the same name (Example1HelloWorld.java), otherwise we'll get an 
// error when compiling.
public class Example1HelloWorld {
	
	// Starting point of our program.
	// public - means that anyone can access it
	// static - can run this method without creating an instance of Example1HelloWorld
	// void - this method doesn't return any value
	// main - name of the method
	public static void main(String[] args) {
		
		// System - class that Java provides us and it holds some useful methods and variables.
		// out - static variable within System that represents the output of your program (stdout).
		// println - method of out that can be used to print a line.
		System.out.println("Hello World!!!");
	}

}