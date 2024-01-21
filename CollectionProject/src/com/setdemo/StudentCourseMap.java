package com.setdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentCourseMap {

	static void createMap(ArrayList<Student> list) {

		HashMap<Course, Integer> hm= new HashMap<>();
		for(Student s:list)
		{
			Course c= s.getCourse();
		   if(hm.containsKey(c))
		   {
			   hm.put(c, hm.get(c)+1);
		   }
		   else
		   {
			   hm.put(c, 1);
		   }
		}
		
		for(Map.Entry<Course, Integer> e: hm.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(1,"Pranay",new Course(101,"Java")));
		al.add(new Student(2,"Reetu",new Course(102,".net")));
		al.add(new Student(3,"Prachi",new Course(101,"Java")));
		al.add(new Student(4,"Pranali",new Course(101,"Java")));
		al.add(new Student(5,"Arpita",new Course(102,".net")));
		al.add(new Student(6,"Vikash",new Course(101,"Java")));

		HashMap<Course, ArrayList<Student>> hm = new HashMap<>();

		createMap(al);
	}

}
