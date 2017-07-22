

// Inheritance
// 	extends - inherit from a class
// 	instanceof - check if an object is an instance of a class

public class Example9Inheritance {
	
	public int[] reverse(int[] list) {
		int[] newList = new int[list.length];
		
		for(int i = 0; i < list.length; i++) {
			newList[list.length-i-1] = list[i];
		}
		return list;
	}
	
	public static void main(String[] alakjsd) {
		Example9Inheritance a = new Example9Inheritance();
		
		int[] list = {4, 3, 4, 5, 6};
		System.out.println(a.reverse(list));
		
	}
}

