package arrayStringInJava.array;

import java.util.Scanner;

public class ArrayUserInput {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of row and col :");
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	int [][] arr=new int[row][col];
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;i++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("array elements are :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
			
	
}
}
