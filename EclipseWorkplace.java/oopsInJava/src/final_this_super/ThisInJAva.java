package final_this_super;

class Person {
	public String name;
	public int age;

	// no-args
	public Person() {
		System.out.println("Default constructor");
	}

	// all-args
	public Person(String name, int age) {
		this();
		System.out.println("all args constructor");
		this.name = name;
		this.age = age;

	}

	public void sayHello() {
		System.out.println("hello");
	}

	public void display() {
		this.sayHello();
		System.out.println("Name is: " + this.name);
		System.out.println("Age is :" + age);

	}
}

public class ThisInJAva {
	public static void main(String[] args) {
		/*
		 * This keyword : 
		 * 1.used to refer instance variables current class 
		 * 2.used to refer current class constructor 
		 * 3.used to refer
		 */
	}
}
