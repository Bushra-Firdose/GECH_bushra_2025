package encapsulation;
/*
 * hiding the content and accessing it through.....use of getters and setters*/

class Student {
	private String name;
	private int age;
	private double marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}

public class EncapsulationInJava {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.setName("Arbiya");
		System.out.println(std1.getName());

	}

}