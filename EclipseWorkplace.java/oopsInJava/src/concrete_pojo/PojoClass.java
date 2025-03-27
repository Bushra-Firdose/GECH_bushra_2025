package concrete_pojo;

class Student{
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
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//private field
	 private String name;
	 private int age;
	 
}


public class PojoClass {
public static void main(String[] args) {
	/*
	 * POJO class
	 *plane ald java object(pojo)
	 *rules
	 *1.this class should not extend or implement any class or interface
	 *2.Every field (states/properties) should be private
	 *3. All args constructor
	 *4.No- args constructor
	 *5.toString()
	 *6.Getters and Setters public method*/
}
}
