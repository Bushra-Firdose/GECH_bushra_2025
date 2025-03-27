package functionInJava.function;

public class Functionsinjava1 {
	//1.public function 
	//-> anywhere
	public void publicfunctio() {
		System.out.println("this is a public function");
	}
	
	//2.private function
	//->within the class
	private void privatefunction() {
		System.out.println("it is a private function");
	}
	
	//3.default function
	//->within the package
	void defaultfunction() {
		System.out.println("this is default function");
	}
	
	//4.protected function
	//->within package and subclass in other package
	protected void protectedfunction() {
		System.out.println("this is protected function");
		
	}
	
	
	//5.static function
	//->we can access this by using class name
	public static void staticfunction() {
		System.out.println("This is static function");
	}
	public static void main(String[] args) {
		Functionsinjava1 obj1=new Functionsinjava1();
		obj1.publicfunctio();
		obj1.privatefunction();
		obj1.protectedfunction();
		Functionsinjava1.staticfunction();
		
		
	}

}
