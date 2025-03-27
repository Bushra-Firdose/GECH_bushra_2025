package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class funInterface implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2; //small -high
	}
}
public class ComparatorInjava {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(1);
		list.add(2);
		list.add(45);
		list.add(23);
		
//		Collections.sort(list, new funInterface());
		Collections.sort(list ,(a,b)->b-a);
		System.out.println(list);	
		
		

	}

}