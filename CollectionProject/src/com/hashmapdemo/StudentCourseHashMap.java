package com.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentCourseHashMap {
	
	static void createMapStudentCount(HashMap<Student, Course> sm)
	{
		HashMap<Course,Integer> hmap= new HashMap<>();
		
		for(Map.Entry<Student, Course> e: sm.entrySet())
		{
			Course c= e.getValue();
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
		}
		
		for(Map.Entry<Course, Integer> e:hmap.entrySet())
		{
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
	}
	
	static void createMapStudentNames(HashMap<Student, Course> sm)
	{
		HashMap<Course,ArrayList<String>> hmap= new HashMap<>();
		
		ArrayList<String> names;
		
		for(Map.Entry<Student, Course> e: sm.entrySet())
		{
			Course c= e.getValue();
			if(hmap.containsKey(c))
			{
				names= hmap.get(c);
//				names.add(e.getKey().getName());
//				hmap.put(c, names);
			}
			else
			{
				names= new ArrayList<>();
//				names.add(e.getKey().getName());
//				hmap.put(c, names);
			}
			names.add(e.getKey().getName());
			hmap.put(c, names);
		}
		
		for(Map.Entry<Course, ArrayList<String>> e:hmap.entrySet())
		{
			System.out.println(e.getKey());
			for(String s:e.getValue())
			{
				System.out.println(s);
			}
			System.out.println("------------------------");
		}
		
	}
	
	static void createMapStudentDetails(HashMap<Student, Course> sm)
	{
		HashMap<Course,ArrayList<Student>> hmap= new HashMap<>();
		
		ArrayList<Student> studs;
		
		for(Map.Entry<Student, Course> e: sm.entrySet())
		{
			Course c= e.getValue();
			if(hmap.containsKey(c))
			{
				studs= hmap.get(c);

			}
			else
			{
				studs= new ArrayList<>();

			}
			studs.add(e.getKey());
			hmap.put(c, studs);
		}
		
		for(Map.Entry<Course, ArrayList<Student>> e:hmap.entrySet())
		{
			System.out.println(e.getKey());
			for(Student s:e.getValue())
			{
				System.out.println(s);
			}
			System.out.println("------------------------");
		}
		
	}
	
	public static void main(String[] args) {
		
		HashMap<Student, Course> smap= new HashMap<>();
		
		smap.put(new Student(1,"Prachi"), new Course(101,"Java"));
		smap.put(new Student(2,"Reetu"), new Course(102,".net"));
		smap.put(new Student(3,"Pranay"), new Course(101,"Java"));
		smap.put(new Student(4,"Arpita"), new Course(102,".net"));
		smap.put(new Student(5,"Bhaskar"), new Course(102,".net"));
		
//		for(Map.Entry<Student, Course> e: smap.entrySet())
//		{
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//			System.out.println("----------------------------------");
//		}
			
		smap.put(new Student(5,"Bhaskar"), new Course(101,"Java"));
//		System.out.println("----------------------------------");
//		System.out.println("----------------------------------");
		
//		for(Map.Entry<Student, Course> e: smap.entrySet())
//		{
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//			System.out.println("----------------------------------");
//		}
		
		createMapStudentCount(smap);
		
		System.out.println("----------------------------");
		
		createMapStudentNames(smap);
		
		System.out.println("----------------------------");
		
		createMapStudentDetails(smap);
	}

}
