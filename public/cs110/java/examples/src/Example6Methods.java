import java.util.Scanner;

public class Example6Methods {
	public static void main(String[] args) {

		Scanner scanIn = new Scanner(System.in);

		while (true) {
			System.out.println("Enter info: ");

			String inputString = scanIn.nextLine();

			if (inputString.equals("q")) // compare objects using the .equals method, String is an object!
				break; // get out of the loop

			int a = Integer.parseInt(inputString); // get an int from the given string

			System.out.println("Entered value : " + (a + 2));
		}

		scanIn.close();
	}
}