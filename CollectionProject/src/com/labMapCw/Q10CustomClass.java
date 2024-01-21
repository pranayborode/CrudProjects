package com.labMapCw;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


////10.  WAP to create a map using Custom class as key and any other JDK provided object as value

public class Q10CustomClass {

	public static void main(String[] args) {
		
		HashMap<Student, Integer> hashMap = new HashMap<>();
		
		hashMap.put(new Student(101, "Sahil"),1);
		hashMap.put(new Student(102, "Ron"),2 );
		hashMap.put(new Student(103, "Amar"),3);
		hashMap.put(new Student(104, "Utkarsh"),4);
		
		
		Set<Entry<Student,Integer >> entries = hashMap.entrySet();
		
		for(Entry<Student, Integer> e : entries) {
			System.out.println("Keys:"+e.getKey()+"--> Values: "+e.getValue());
		}

	}

}
