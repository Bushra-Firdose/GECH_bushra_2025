package set;

import java.util.TreeSet;

public class TreesetInJava {
	public static void main(String[] args) {
		
		//it will arrange the elements in ascending order
		TreeSet<Integer> treeSet = new TreeSet<Integer>((a,b)->b-a);
		treeSet.add(89);
		treeSet.add(61);
		treeSet.add(71);
		treeSet.add(80);
		treeSet.add(90);
		treeSet.add(100);
		treeSet.add(24);
		
		System.out.println(treeSet);
	}

}
