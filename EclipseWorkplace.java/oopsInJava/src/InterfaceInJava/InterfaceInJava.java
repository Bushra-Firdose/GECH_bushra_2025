package InterfaceInJava;

interface Animal{
	public void makeSound();
}

class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("dog barks");
		
	}
}

class Cat implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("cat Meow Meow");
		
	}
	
}

public class InterfaceInJava {
	public static void main(String[] args) {
		/*
		 * Interface : It is the blue print of the class The method in the interface by
		 * default abstracts(does not contain ) from java 8 we can write default and
		 * static methods in interface
		 * 
		 * interface interface_name 
		 * //code
		 * 
		 * interface animal(){
		 * 		publiv void makesound()
		 * }
		 */
		Dog dog=new Dog();
		dog.makeSound();
		Cat cat=new Cat();
		cat.makeSound();
	}

}
