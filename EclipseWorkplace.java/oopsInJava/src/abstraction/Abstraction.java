package abstraction;

//1. Interface
interface Animal{
	public void eat();
}

class Lion implements Animal{
	@Override
	public void eat() {
		System.out.println("Lion eat meat");		
	}
	
}

//2. Abstract Class
abstract class Vehicle{
	//abstract-method
	public abstract void start();
	
	//Non-abstract method
	public void stop()
	{
		System.out.println("The vechicle is stopped");
	}
}

class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("The car Starts");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		/* 
		 * Abstraction
		 * ===========
		 *  It is a process of biding the implementation and showing only the essention resource
		 *  
		 *  Two ways
		 *  1. Interface(100% Abstraction)
		 *  2. abstract class(0-100% Abstraction)----cannot create an object
		 */
         //1. Interface
		Lion lion = new Lion();
		lion.eat();
		
		//2. abstract class
		Car car = new Car();
		car.start();
		car.stop();
		
	}

}