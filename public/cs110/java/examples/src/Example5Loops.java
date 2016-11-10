// for, while, do while
// break, continue

public class Example5Loops {
	public static void main(String[] args) {
		
		// for loop
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// while loop
		int a = 0;
		while(a < 5) {
			System.out.println(a);
			a += 1;
		}
		
		// do while loop
		
		a = 0;
		do {
			System.out.println(a);
			a += 1;
		} while(a < 5);
		
		// foreach
		String[] arr = {"American", "University", "of", "Armenia"};
		for(String el : arr) {
			System.out.println(el);
		}
	}
}