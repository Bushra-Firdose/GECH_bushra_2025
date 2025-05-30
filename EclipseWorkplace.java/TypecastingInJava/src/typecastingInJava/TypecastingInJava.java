package typecastingInJava;

public class TypecastingInJava {
	public static void main(String[] args) {
		/*
		 * Type casting :
		 * conversion of one data to another
		 * 
		 * 1.implicide type casting:
		 * byte-> short-> int -> long -> float -> double
		 * 
		 * 2.explicide type casting:
		 * double -> float -> long -> int -> short -> byte
		 * 
		 * */
		
		//implicide type casting
		
		int a=10;
		long a1=a;
		
		System.out.println("int : " +a);
		System.out.println("long : " +a1);
		
		//explicide type casting
		long b=20;
		int b1=(int)b;
		
		System.out.println("long :"+b);
		System.out.println("int :" +b1);
	}

}
