package collectionInJava;

public class CollectionInJava {
	public static void main(String[] args) {
		/*
		 * why we need collection ?
		 * -->to over come the drawbacks of array we have to make use of collection
		 * 
		 * drawbacks of an array
		 * -->fixed size
		 * -->same data type elements
		 * -->we cannot reduce teh size of array
		 * 
		 * adv of array:
		 * -->Random access
		 * -->type safety- the elements inside an array is based on the data type
		 * -->type casting- to print elements in arrays, no need to type cast
		 * 
		 * */
		
		int[] arr=new int[20];
		arr[0]=12;
		arr[1]=20;
		
		System.out.println((int)arr[0]); //no need of type casting
		System.out.println(arr[1]);
		
	}

}
