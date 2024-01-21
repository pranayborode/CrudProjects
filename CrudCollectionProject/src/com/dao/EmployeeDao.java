package com.dao;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDao {

	void addEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(int empid);
	List<Employee>showEmployeeList();
	Employee searchEmployeeById(int empid);
	
	
}
