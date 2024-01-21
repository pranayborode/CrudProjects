package com.classwork;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeConstructor {

	public static void main(String[] args) {
		 
		ArrayList<Employee>empList = new ArrayList<>();
		
		empList.add(new Employee(101, "Ravi", 45000));
		empList.add(new Employee(103, "Priya", 50000));
		empList.add(new Employee(102, "Amar", 33000));
		empList.add(new Employee(105, "Purva", 45000));
		empList.add(new Employee(104, "Swapnil", 65000));

		for(Employee e : empList) {
			System.out.println(e);
		}
		System.out.println("**************************************************");
		Collections.sort(empList, new SalaryComparator());
		
		for(Employee e : empList) {
			System.out.println(e);
		}
	}

}
