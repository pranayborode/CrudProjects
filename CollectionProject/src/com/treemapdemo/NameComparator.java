package com.treemapdemo;

import java.util.Comparator;

import com.hashmapdemo.Student;

public class NameComparator  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
