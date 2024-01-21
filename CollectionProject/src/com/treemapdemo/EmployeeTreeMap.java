package com.treemapdemo;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<Employee,String> tmap= new TreeMap<>(new IdComparator());
		
		tmap.put(new Employee(101,"Pranali",45000), "IT");
		tmap.put(new Employee(102,"Prachi",56000), "HR");
		tmap.put(new Employee(103,"Pranay",49000), "Sales");
		tmap.put(new Employee(108,"Arpita",40000), "IT");
		tmap.put(new Employee(105,"Jyoti",50000), "HR");
		tmap.put(new Employee(106,"Nisha",57000), "IT");
		
		for(Map.Entry<Employee, String>e:tmap.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		
		tmap.put(new Employee(106,"Nisha",57000), "HR");
		
		System.out.println("-------------------------------------");
		
		for(Map.Entry<Employee, String>e:tmap.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		
	}

}
