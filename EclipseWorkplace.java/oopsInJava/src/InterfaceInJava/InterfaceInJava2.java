package InterfaceInJava;

interface interface1{
	public void method();
	public  default void defaultmethod() {
		System.out.println("this is default method in interface");
		
	}
	public static void sataticmethod() {
		System.out.println("this is static method in interface");
		
	}
}

class Child3 implements interface1{
	

public void method() {
	System.out.println("this is method");
	
}
}
public class InterfaceInJava2 {
	public static void main(String[] args) {
		
		Child3 child=new Child3();
		child.method();
		child.defaultmethod();
		interface1.sataticmethod();
	}

}
