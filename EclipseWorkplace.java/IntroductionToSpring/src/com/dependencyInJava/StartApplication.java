package com.dependencyInJava;

public class StartApplication {
	public static void main(String[] args) {
		
		//1.constructor injectio
		Address address = new Address("hassan", "Karnataka");
		Student student = new Student(12, "bushra", address);
		System.out.println(student.getId());
		System.out.println(student.getName());
//		System.out.println(student.getAddress());
		
		Address address1= student.getAddress();
		System.out.println(address1.getCity());
		System.out.println(address1.getState());
		
		//2.setting injection
		Address address2= student.getAddress();
		address1.setCity("Bangluru");
		address1.setState("Karnataka");
		
		Student student2 =new Student();
		student2.setId(14);
		student2.setName("Neha");
		student2.setAddress(address2);
		
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		System.out.println(student.getAddress());
		System.out.println();
		
	}

}
