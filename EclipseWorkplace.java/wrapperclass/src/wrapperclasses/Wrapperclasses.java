package wrapperclasses;

public class Wrapperclasses {
public static void main(String[] args) {
	/*
	 * java is a pure oop or not?
	 * ----> No (primitive data type)
	 * 
	 * ----------------------------------------------------------------
	 * 
	 * primitive data types:
	 * byte , short , int , long , float , double , character ,boolean 
	 * 
	 * String name= new String("mohan") ;
	 * 
	 * -----------------------------------------------------------------
	 * collection:
	 * -->to store group of individual object as a single entity 
	 * -->it works only for objects but not on primitive data types
	 * -->to overcome this we use classes called wrapper classes
	 * 
	 * -----------------------------------------------------------------
	 * wrapper classes:
	 * byte -->Byte (class name for wrapper classes)
	 * short -->Short 
	 * int -->Integer
	 * long -->Long
	 * float -->Float 
	 * double -->double
	 * char -->Character
	 * boolean -->Boolean
	 * */
	
	//1.Auto boxing --->from primitive to wrapper
	System.out.println("-----------------------auto-int--------------------------");
	int a=100;
	Integer i=Integer.valueOf(a);
	System.out.println("int :"+a);
	System.out.println("Intiger" +i);
	System.out.println("Integer type :" +i.getClass().getName());
	
	System.out.println("----------------unbox-int----------------------------");
	
	//2.unboxing
	Integer i1=10;
	
	int a1=i1.intValue();
	System.out.println("int :"+a1);
	System.out.println("Intiger" +i1);
	System.out.println("Integer type :" +i1.getClass().getName());
	
	System.out.println("---------------------unboxing-byte------------------------");
	byte a3=100;
	//explicit conversion
	Byte i3=Byte.valueOf(a3);
	
	//implicit conversion
	System.out.println("int :"+a3);
	System.out.println("Intiger" +i3);
	System.out.println("Integer type :" +i3.getClass().getName());
	
	//auto boxing ....byte 
	System.out.println("----------------auto-btye----------------------");
	byte a4=100;
	Integer i4=Integer.valueOf(a4);
	System.out.println("int :"+a4);
	System.out.println("Intiger" +i4);
	System.out.println("Integer type :" +i4.getClass().getName());
	
	System.out.println("----------------auto-short----------------------");
	short a5=100;
	Integer i5=Integer.valueOf(a5);
	System.out.println("int :"+a5);
	System.out.println("Intiger" +i5);
	System.out.println("Integer type :" +i5.getClass().getName());
	
	
}
}
