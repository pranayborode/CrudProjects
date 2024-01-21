package com.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Student> smap= new HashMap<>();
		smap.put(1, new Student(1, "Reetu"));
		smap.put(2, new Student(2,"Prachi"));
		smap.put(3, new Student(3,"Arpita"));
		
		for(Map.Entry<Integer, Student>e: smap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------");
		}
		
		System.out.println("----------------------------");
		smap.put(2, new Student(2,"Jyoti"));
		for(Map.Entry<Integer, Student>e: smap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------");
		}
		
		
	}

}
