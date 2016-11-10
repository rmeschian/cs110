
public class Example6Objects {
	public static void main(String[] args) {
		
		Person p = new Person("Mark", "Twain");
		
		Cat a = new Cat("Fluffy", p);
		Cat b = new Cat("Jaes", p);
		
		System.out.println(a.name);
		System.out.println(b.owner.getFullName());
		
	}
}

class Person {
	String firstName;
	String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}

class Cat {
	String name;
	Person owner;
	
	public Cat(String name, Person owner) {
		this.name = name;
		this.owner = owner;
	}
}