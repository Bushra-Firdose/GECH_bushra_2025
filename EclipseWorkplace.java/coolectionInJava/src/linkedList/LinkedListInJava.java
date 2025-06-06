package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {
public static void main(String[] args) {
	/*
	 * Linked list:
	 * -->linked list underline data in doubly linked list
	 * -->linked list will allow duplicate
	 * -->linked list will allow random access(using index)
	 * -->linked list will allow null value
	 * -->linked list will preserve the order of insertion*/
	
	List<Integer> list =  new LinkedList<Integer>();
	list.add(45);
	list.add(45);
	list.add(null);
	list.add(23);
	list.add(30);
	System.out.println(list);
	System.out.println(list.get(2));
	
	/*
	 * COMPARISION B/W LINKED LIST AND ARRAY LIST
	 * 
	 *-->linked list underline data in doubly linked list
	 *-->array list dynamic array
	 *
	 * -->Linked list will occupy more memory
	 * -->Array list will occupy less memory
	 * 
	 * -->when ever there is a continuous operation of deletion we should go for Linked list.
	 * -->when ever there is a continuous operation of deletion we should not go for Array list. 
	 * 
	 * -->for continuous insertion then we should go for Linked list.
	 * 
	 * 
	 * */
	

	
}
}
