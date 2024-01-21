package com.labMapCw;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//11.WAP to create a map using Custom class as key and any other Custom class as value
public class Q11CustomClass {

	public static void main(String[] args) {
		
		HashMap<Student, Course> hashMap = new HashMap<>();
		
		hashMap.put(new Student(101, "Ron"), new Course(1, "Java"));
		hashMap.put(new Student(102, "Amar"), new Course(1, ".Net"));
		hashMap.put(new Student(103, "Swapnil"), new Course(1, "Python"));
		
		Set<Entry<Student, Course>>entries = hashMap.entrySet();
		
		for(Entry<Student, Course>  e: entries) {
			System.out.println("Keys:"+e.getKey()+"--> Values: "+e.getValue());
		}

	}

}
