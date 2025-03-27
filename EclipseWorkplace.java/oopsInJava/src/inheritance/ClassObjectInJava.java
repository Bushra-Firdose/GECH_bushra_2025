package inheritance;

class Student{
	//states
	public int age=30;
	public String name="Habiba";
	public double marks=80.34;
	
	//action
	public void isplaying() {
		System.out.println(this.name+" is playing");
	}
	public void isSleeping() {
		System.out.println(this.name+" is sleeping");
	}
}

public class ClassObjectInJava {
	public static void main(String[] args) {

		/*-----------------------------------------------------------------------------------------------------
		 * class:
		 * `````
		 * class will represent the state and behavior of object
		 * state->property
		 * behavior->action
		 *------------------------------------------------------------------------------------------------------ 
		 * object:
		 * ````````
		 * object is the implemantation of class( state and behavior )
		 * example
		 * ------
		 * student
		 * -----------------------------------------------------------------------------------------------------
		 * property:
		 * `````````
		 * 
		 * USN
		 * Name
		 * Branch
		 * Age
		 *-------------------------------------------------------------------------------------------------------- 
		 * Action:
		 * ````````
		 *
		 * isplaying();
		 * issinging();
		 * ---------------------------------------------------------------------------------------------
		 *  how to declare class and object
		 *  ````````````````````````````````
		 *  class class_name{
		 *  state
		 *  action
		 *  }
		 *  ex:
		 *  ------
		 *  class Student{
		 *  	property:
		 *  	public int age=30;
		 *  
		 *  	action:
		 *  	public void isplaying(){
		 *  	syso("he is playing")
		 *  }
		 *  Student obj=new Student();
		 *  	
		 *  }
		 * 
		 * */
		//student 1
	Student std1=new Student();
	System.out.println(std1.name);
	System.out.println(std1.age);
	System.out.println(std1.marks);
	std1.isplaying();
	std1.isSleeping();
	
	//stu 2
	Student std2=new Student();
	System.out.println(std2.name);
	System.out.println(std2.age);
	System.out.println(std2.marks);
	std2.isplaying();
	std2.isSleeping();
	}
}
