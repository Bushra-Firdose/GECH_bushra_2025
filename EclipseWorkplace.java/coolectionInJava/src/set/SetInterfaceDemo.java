package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * set
		 * ============
		 * when u represent a group of individual object as a single entity where the insertion oder
		 * is not preserved duplicate will not allow
		 * then we should got for set interface
		 * 
		 * 1.order is not preserved
		 * 2.duplicate will not allow
		 * 3.random access is the there
		 * */
		Set<Integer> set =new HashSet<Integer>();
		set.add(12);
		set.add(null);
		set.add(34);
		set.add(54);
		set.add(76);
		
		System.out.println(set);
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(12);
		list.add(34);
		list.add(13);
		list.add(12);
		System.out.println("list :" +list);
		
		Set<Integer> set1 = new HashSet<Integer>(list);
		
		System.out.println("set1 "+set1);
		
	}

}