package collectionInJava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava1 {
	public static void main(String[] args) {
		/*
		 * 
		 * collection-->it is the root interface of collection framework
		 * collections-->it will provide some of the utility method to work with collection 
		 * 
		 * collection:
		 * when you represent a group of individual object as a single entity then we should 
		 * go for collection
		 * root interface in collection framework
		 * this will provide the some of the built-in methods to work with any collection class
		 * */
		
		Collection collection=new ArrayList();
		collection.add(10);
		collection.add("name");
		collection.add(10.23);
		collection.remove(10);
//		collection.clear();
		
		System.out.println(collection);
	}

}
