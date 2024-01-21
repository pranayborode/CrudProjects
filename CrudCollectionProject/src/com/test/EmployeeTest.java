package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDaoImpl;
import com.pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		int eid;
		String ename;
		double esal;

		int choice;
		char ch;
		Employee emp = null;

		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		List<Employee> elist = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("-----Employee Operation-----");
			System.out.println("----------------------------");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Show Employee List");
			System.out.println("5. Search Employee By Id");
			System.out.println("----------------------------");

			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("---Add Employee---");
				System.out.println("How many Employees do you want to add in list ?");
				int num = sc.nextInt();

				for (int i = 1; i <= num; i++) {

					System.out.println("Enter Employee Id:");
					eid = sc.nextInt();

					System.out.println("Enter Employee name:");
					ename = sc.next();

					System.out.println("Enter Employee Salary");
					esal = sc.nextDouble();

					emp = new Employee(eid, ename, esal);
					edao.addEmployee(emp);

				}
				break;

			case 2:
				System.out.println("----Update Employee----");
				
				System.out.println("Enter Employee Id:");
				eid = sc.nextInt();

				System.out.println("Enter Employee name:");
				ename = sc.next();

				System.out.println("Enter Employee Salary");
				esal = sc.nextDouble();
				
				emp = new Employee(eid, ename, esal);
				
				edao.addEmployee(emp);
				break;
				
			case 3:
				System.out.println("Enter Employee Id");
				eid = sc.nextInt();

				edao.deleteEmployee(eid);
				break;

			case 4:
				elist = edao.showEmployeeList();

				if (!elist.isEmpty()) {
					System.out.println("Employee List");

					for (Employee e1 : elist) {
						System.out.println(e1);
					}
				} else {
					System.out.println("No list Found");
				}
				break;

			case 5:
				System.out.println("----Search Employee----");
				System.out.println("Enter Employee Id");
				eid = sc.nextInt();

				emp = edao.searchEmployeeById(eid);

				if (emp != null) {
					System.out.println("Employee Found");
					System.out.println(emp);
				} else {
					System.out.println("Employee Not Present");
				}
				break;
			}

			System.out.println("Do you want to Continue ?");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}
