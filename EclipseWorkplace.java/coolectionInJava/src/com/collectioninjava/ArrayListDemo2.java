package com.collectioninjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(45);
		System.out.println("before:"+list);
		
		/*
		 * collections
		 * it is a utility classes that provides method to work with collection*/
		//sort
		
		Collections.sort(list);
		System.out.println("after:"+list);
		System.out.println("min vlaue:"+Collections.min(list));
		System.out.println("min vlaue:"+Collections.max(list));
		Collections.reverse(list);
		System.out.println("reverse values:"+list);
		Collections.replaceAll(list, 40, 30);
		System.out.println("replaceAll:"+list);
		 // Shuffling the list (randomize the order)
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Checking if the list contains a specific value
        System.out.println("List contains 30: " + list.contains(30));

        // Finding the frequency of a value (e.g., how many times 1 appears)
        System.out.println("Frequency of 30 in list: " + Collections.frequency(list, 30));

        // Rotating the list (rotate by 2 positions)
        Collections.rotate(list, 2);
        System.out.println("After Rotate by 2 positions: " + list);
		
	}

}