package com.CustomStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student("munazza1",27,21);
		Student std2=new Student("munazza2",24,24);
		Student std3=new Student("munazza3",25,25);
		Student std4=new Student("munazza4",26,22);
		
		List<Student> students=new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(new Student("mahii",23,34));
		System.out.println("before");
		System.out.println(students);
//		students.remove(0);
//		System.out.println(students);
		
		Collections.sort(students ,(s1,s2)->s2.getRoll_num()-s1.getRoll_num());
		System.out.println("sorting using the roll no");
		System.out.println(students);
		

		Collections.sort(students ,(s1,s2)->s2.getName().charAt(0)-s1.getName().charAt(0));
		System.out.println("\n sorting using name");
		System.out.println(students);
		
		
		
	}

}