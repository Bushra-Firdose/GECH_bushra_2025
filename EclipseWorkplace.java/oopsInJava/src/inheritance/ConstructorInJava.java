package inheritance;

class Student1 {
	// states
	public int age = 30;
	public String name = "Habiba";
	public double marks = 80.34;

	//full arguement constructor(auto-generated)
	public Student1(int age, String name, double marks) {
		System.out.println("full arguement constructor");
	    this.age = age;
		this.name = name;
		this.marks = marks;
	}
	
	//no arguemnt constructor(auto-generated)
	public Student1() {
		System.out.println("No arg Constructor");
		
	}

	// action
	public void isplaying() {
		System.out.println(this.name + " is playing");
	}

	public void isSleeping() {
		System.out.println(this.name + " is sleeping");
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("mark:" + this.marks);
	}
}

public class ConstructorInJava {

	public static void main(String[] args) {
		Student1 std1 = new Student1(12, "arbiya", 23.23);
		std1.display();
		Student1 std2 = new Student1();
		std1.display();

	}

}
