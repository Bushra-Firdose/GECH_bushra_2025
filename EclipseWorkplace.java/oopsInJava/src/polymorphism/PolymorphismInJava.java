package polymorphism;
class Person{
	public void walking() {
		System.out.println("the person is walking");
	}
}
//1.method overriding
class Mohan extends Person{
	public void walking() {
		System.out.println("mohan is walking");
		
	}
}

//2.method - overloaging
class Addition{
	public static void add(int a,int b) {
		System.out.println("addition is : " +(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("addition is : " +(a+b+c));
	}
}

public class PolymorphismInJava {
	public static void main(String[] args) {
		/*
		 * polymorphism :
		 * poly -> many
		 * morphism -> forms
		 * it a mechanism that method will perform a different action 
		 * based on the situation 
		 * 1.methos-overloading(one class)
		 * 2.method-overriding(two class)
		 * */
		
		
		//1.method ovverriding / dynamic polymorphism / runtime polymorphism / dynamic binding
		Mohan mohan=new Mohan();
		mohan.walking();
		
		//2.method overloading /compile time polymorphism /staitc binding / static polymorphism
		Addition addition = new Addition();
		addition.add(10, 20);
		addition.add(10, 20, 30);
	}

}
