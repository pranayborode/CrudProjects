package com.setdemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> empList = new LinkedHashSet<>();
		
		empList.add(new Employee(101, "Rahul", 25000));
		empList.add(new Employee(102, "Amar", 44000));
		empList.add(new Employee(103, "Priya", 21000));
		empList.add(new Employee(104, "Amit", 47000));
		empList.add(new Employee(102, "Amar", 25000));
		empList.add(new Employee(106, "Sahil", 25000));
		
		for(Employee e: empList) {
			System.out.println(e);
		}
		
		
//		Iterator<Employee> iterator = empList.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
	}

}
