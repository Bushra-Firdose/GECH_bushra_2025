package arrayStringInJava.array;

import java.util.Scanner;

public class ArrayInJava {

	public static void main(String[] args) {
		/*
		 * Array in java
		 * 
		 * if we want to store multiple values of same datatype
		 * 
		 * ----------------------------------------------------- how to declare an array
		 * <datatype> [] array_name=new <datatype>[size];
		 * 
		 * int [] array1= new int[4];
		 * 
		 * ------------------------------------------------------
		 * 
		 * How to decalre and initilize the array int[] arr={1,2,3,4,5,6}
		 * 
		 * ------------------------------------------------------ Types of array: 1. 1D
		 * ->single row int [] arr = new int[3]
		 * 
		 * 
		 * 2. 2D ->in the form of matrix or table int [][] arr = new int[2][3];
		 */

		int[] arr = new int[5];
		arr[0] = 30;
		arr[1] = 40;
		arr[2] = 20;
		arr[3] = 10;
		arr[4] = 20;
		for (var i : arr) {
			System.out.println(i + "");

		}
		for(int j=0;j<=4;j++) {
			arr[j]=10;// using for loop insted of writing each element...o/p- 10 10 10 10
		}
		
	}

}
