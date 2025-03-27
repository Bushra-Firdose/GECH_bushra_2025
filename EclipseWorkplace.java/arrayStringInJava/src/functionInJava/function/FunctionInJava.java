package functionInJava.function;

public class FunctionInJava {
	
	
	// b. function return a value accepting a parameter.
	 public int add(int a,int b) {
		 return a+b;
	 }
	 //c. function not return a value  accepting a parameter
	 
	 public void add1(int a,int b) {
		 System.out.println("addition of c and d :" +(a+b));
	 }
	 //a. function return a value not accepting a parameter
	 public int add2() {
		 return 100;
	
	 }
	 //d.function not return a value not accepting a parameter
	  public void add3() {
		  System.out.println("hello java");
	  }

	public static void main(String[] args) {
		
		/*
		 * Functions/methods in java:
		 * 
		 * <access modifier> return_type function_name(parameters){
		 * code
		 * }
		 * 
		 * public void add(int a,intb){
		 * syso(a+b);
		 * ------------------------------------------
		 * 
		 * 2 types of functions:
		 * 1.built-in -> next(),nextLine(),println(),equals()
		 * 2. User defined:
		 * 
		 * -------------------------------------------
		 * 
		 * a. function return a value not accepting a parameter
		 * b. function return a value accepting a parameter
		 * c. function not return a value  accepting a parameter
		 * d. function not return a value not accepting a parameter
		 */
		
		FunctionInJava obj1= new FunctionInJava();
		int res =obj1.add(50, 9);
		System.out.println("Result:"+res);
		int res1=obj1.add2();
		System.out.println("Result:"+res1);
        obj1.add3();
		
		obj1.add2();
		
		

		obj1.add1(10,20);
	}

}