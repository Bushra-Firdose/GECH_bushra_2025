package exceptionInJava;

public class ExceptionInJava3 {
	
	
public static void validate(int age) {
	if(age<18) {
		throw new ArithmeticException("Invalid age");
	}
	else {
		System.out.println("Your age is :" +age);
	}
}
public static void main(String[] args) {
		
	
	/*
	 * finally block
	 * this will execute even if the exception occurs 
	 * where we can have to write the closing code like
	 * db connection ,file close
	 * */
	
	
//	try {
//		System.out.println(10/0);
//		
//	}catch(Exception e) {
//		System.out.println(e);
//	}
//	finally {
//		System.out.println("this is finally block");
//		
//	}
	validate(19);
	
}
}

