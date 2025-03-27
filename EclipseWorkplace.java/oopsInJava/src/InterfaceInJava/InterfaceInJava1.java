package InterfaceInJava;

interface A {
	public void methodA();
}

interface B {
	public void methodB();
}

//for same method 

interface C {
	public void method() ;
		
	
}

interface D {
	public void method() ;
			
		
}

class Child1 implements C, D {

	@Override
	public void method() {
		System.out.println("this has used only on emethod for both interface c an d");

	}

}

class Child implements A, B {

	@Override
	public void methodB() {
		System.out.println("this is method B");

	}

	@Override
	public void methodA() {
		System.out.println("This is method B");

	}

}

public class InterfaceInJava1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.methodA();
		child.methodB();
		Child1 child1=new Child1();
		child1.method();
	}
	/*
	 * */

}
