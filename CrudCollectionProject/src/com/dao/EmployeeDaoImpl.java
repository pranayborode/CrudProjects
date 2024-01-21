package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> elist = null;
	Employee eobj = null;

	public EmployeeDaoImpl() {
		elist = new ArrayList<Employee>();
	}

	@Override
	public void addEmployee(Employee emp) {

		elist.add(emp);

	}

	@Override
	public void updateEmployee(Employee emp) {
		
		for(int i = 0; i<elist.size(); i++) {
			
			if(elist.get(i).getEid() == emp.getEid()) {
				elist.set(i, emp);
			}
		}

	}

	@Override
	public void deleteEmployee(int empid) {

		eobj  = searchEmployeeById(empid);
		
		if(eobj != null) {
			
			for(int i = 0; i<elist.size(); i++) {
				
				if(elist.get(i).getEid() == empid) {
					elist.remove(i);
					break;
				}
			}
		}else {
			System.out.println("No Record of Employee Found");
		}
	}

	@Override
	public List<Employee> showEmployeeList() {

		return elist;
	}

	@Override
	public Employee searchEmployeeById(int empid) {

		eobj = null;
		
		for (int i = 0; i < elist.size(); i++) {

			if (elist.get(i).getEid() == empid) {

				eobj = elist.get(i);
				break;
			}
		}

		return eobj;
	}

}
