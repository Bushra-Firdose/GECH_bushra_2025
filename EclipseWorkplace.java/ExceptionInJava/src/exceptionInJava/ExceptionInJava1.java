package exceptionInJava;

public class ExceptionInJava1 {
	public static void main(String[] args) {
		
//		 Unchecked exception(run time)

		int a = 10;
		int b = 0;
		System.out.println("res is : " + (a / b));
		try {
			System.out.println("hello arbiya");

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			// TODO: handle exception 
		}
		System.out.println("hello world");
	}

}
