public class Example4Arrays {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(arr.length);

		arr[0] = 33;
		arr[1] = 44;
		arr[2] = 55;
		arr[3] = 66;
		arr[4] = 77;

		System.out.println(arr[5]);

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(arr2[1]);
	}
}