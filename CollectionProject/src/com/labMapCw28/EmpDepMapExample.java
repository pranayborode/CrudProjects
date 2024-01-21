package com.labMapCw28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to create a Map which contain Department object as a key and ArrayList of Employees who are belonging to that department.
//
//Department class
//  deptid,deptname,location
//Employee class
//  empid ,ename ,salary ,deptid

//Complete below task
//1>Display all the department wise employee.
//2>Find max salary along with Employee details in all departments
//3>display  all employees from IT departments who is having salary less than 70K
//4>Add the new employee in Testing department
//5>Give department details in which maximum number of Employees working.
//6>Find employees whose name start with 'A'

public class EmpDepMapExample {

	// Display all the department wise employee.
	public static void displayAllDepWiseEmp(Map<Department, ArrayList<Employee>> depMap) {

		System.out.println("Display all the department wise employee.");

		Set<Entry<Department, ArrayList<Employee>>> entries = depMap.entrySet();

		for (Entry<Department, ArrayList<Employee>> e : entries) {

			System.out.println(e.getKey() + " --> " + e.getValue());

		}
	}

	// Find max salary along with Employee details in all departments
	public static void findMaxSalaryDepWiseOfEmp(Map<Department, ArrayList<Employee>> depMap) {

		System.out.println("Find max salary Dep wise for all Employee");

		for (Map.Entry<Department, ArrayList<Employee>> entry : depMap.entrySet()) {

			ArrayList<Employee> emp = entry.getValue();

			if (!emp.isEmpty()) {

				System.out.println("Department: " + entry.getKey());

				Collections.sort(emp, new MaxSalaryComparator());
				System.out.println(emp.get(0));
			}
			System.out.println();
		}

	}

	// display all employees from IT departments who is having salary less than 70K
	public static void displayITempSalaryLessThan70k(Map<Department, ArrayList<Employee>> depMap, String depName) {

		System.out.println("Display  all employees from IT departments who is having salary less than 70K");

		for (Map.Entry<Department, ArrayList<Employee>> entry : depMap.entrySet()) {

			if (entry.getKey().getDeptname().equals(depName)) {

				ArrayList<Employee> emp = entry.getValue();

				for (Employee e : emp) {

					if (e.getSalary() < 70000) {
						System.out.println("Employee: " + e.getEname() + ", Salary: " + e.getSalary());
					}
				}

			}
		}

	}

	// 4.Add the new employee in IT department
	public static void addEmployeeInITdep(Map<Department, ArrayList<Employee>> depMap) {

		System.out.println("Add the new employee in Testing department");

		for (Map.Entry<Department, ArrayList<Employee>> entry : depMap.entrySet()) {

			if (entry.getKey().getDeptname().equals("IT")) {

				ArrayList<Employee> emp = entry.getValue();

				Employee newEmp = new Employee(110, "Pratik", 67000, 1);

				emp.add(newEmp);
			}
		}

	}

	// 5>Give department details in which maximum number of Employees working.
	public static void depWithMaxEmpWorking(Map<Department, ArrayList<Employee>> depMap) {

		System.out.println("Department details in which maximum number of Employees working");

		int maxEmpCount = 0;
		Department depMaxEmp = null;

		for (Map.Entry<Department, ArrayList<Employee>> entry : depMap.entrySet()) {

			int eCount = entry.getValue().size();

			if (eCount > maxEmpCount) {
				maxEmpCount = eCount;
				depMaxEmp = entry.getKey();
			}

		}
		
		System.out.println("Department With Max Employee: "+depMaxEmp.getDeptname());
		System.out.println("Number of Employee          : "+maxEmpCount);

	}
	
	//6>Find employees whose name start with 'A'
	public static void findEmpNameStartWithA(Map<Department, ArrayList<Employee>> depMap) {
		
		System.out.println("Find employees whose name start with 'A'");
		
		for (Map.Entry<Department, ArrayList<Employee>> entry : depMap.entrySet()) {
			
			List<Employee> empList = entry.getValue();
			for(Employee emp : empList ) {
				
				if(emp.getEname().startsWith("A")) {
					System.out.println(emp.getEname());
				}
			}
		}
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> empList1 = new ArrayList<>();

		empList1.add(new Employee(101, "Rahul", 45000, 1));
		empList1.add(new Employee(102, "Swapnil", 75000, 1));
		empList1.add(new Employee(103, "Ashwini", 35000, 1));

		ArrayList<Employee> empList2 = new ArrayList<>();
		empList2.add(new Employee(104, "Gaurav", 68000, 2));
		empList2.add(new Employee(105, "Shital", 28000, 2));
		empList2.add(new Employee(106, "Aditya", 73000, 2));


		ArrayList<Employee> empList3 = new ArrayList<>();
		empList3.add(new Employee(107, "Amar", 63000, 3));
		empList3.add(new Employee(108, "Joy", 58000, 3));
		empList3.add(new Employee(109, "Riya", 43000, 3));

		Map<Department, ArrayList<Employee>> depMap = new HashMap<>();

		depMap.put(new Department(1, "IT", "Pune-P1"), empList1);
		depMap.put(new Department(2, "HR", "Pune-P2"), empList2);
		depMap.put(new Department(3, "Sales", "Pune-P3"), empList3);

		displayAllDepWiseEmp(depMap);

		System.out.println("**********************************");

		findMaxSalaryDepWiseOfEmp(depMap);

		System.out.println("**********************************");

//		System.out.println("Enter Department Name: ");
//		System.out.println("IT, HR or Sales");
//		
//		String depName = sc.next();
//		
//		displayITempSalaryLessThan70k(depMap, depName);

		addEmployeeInITdep(depMap);

		System.out.println("**********************************");

		displayAllDepWiseEmp(depMap);

		System.out.println("**********************************");

		depWithMaxEmpWorking(depMap);
		
		System.out.println("**********************************");
		
		findEmpNameStartWithA(depMap);
		
	}

}
