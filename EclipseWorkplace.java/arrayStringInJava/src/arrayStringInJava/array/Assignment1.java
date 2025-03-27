package arrayStringInJava.array;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter the value of the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the " + i + "th value");
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");// here print will print the value in same line and println will print the
											// values in new line
		}
		sc.close();

	}

}
