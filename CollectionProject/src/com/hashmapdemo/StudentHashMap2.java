package com.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap2 {
	
	public static void main(String[] args) {
		
		HashMap<Student,Float> smap= new HashMap<>();
		smap.put(new Student(1, "Reetu"),56.7f);
		smap.put(new Student(2,"Prachi"),89.6f);
		smap.put(new Student(3,"Arpita"),90.5f);
		
		for(Map.Entry<Student,Float>e: smap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------");
		}
		
		System.out.println("----------------------------");
		smap.put(new Student(2,"Prachi"),69.7f);
		
		for(Map.Entry<Student,Float>e: smap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------");
		}
		
		
	}

}
