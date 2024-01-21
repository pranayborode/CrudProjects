package com.labMapCw28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//WAP to create a ArrayList Student which contain rollno,name,arrayList marks,percentage ,grade.
//From Above arrayList create a Map which having key as a grade and value is ArrayList<Student> .

public class StudentMap {

	public static void main(String[] args) {

		ArrayList<Double> marksList1 = new ArrayList<>();

		marksList1.add(68.0);
		marksList1.add(71.0);
		marksList1.add(89.0);

		ArrayList<Double> marksList2 = new ArrayList<>();

		marksList2.add(76.0);
		marksList2.add(82.0);
		marksList2.add(89.0);

		ArrayList<Double> marksList3 = new ArrayList<>();

		marksList3.add(68.0);
		marksList3.add(71.0);
		marksList3.add(89.0);

		ArrayList<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student(1, "Arpita", marksList1, 'A'));
		stdList.add(new Student(2, "Pranay", marksList2, 'A'));
		stdList.add(new Student(3, "Reetu", marksList3, 'C'));
		stdList.add(new Student(4, "Prachi", marksList2, 'B'));
		stdList.add(new Student(5, "Nisha", marksList3, 'C'));
		stdList.add(new Student(6, "Pranali", marksList1, 'B'));

		HashMap<Character, ArrayList<Student>> smap = new HashMap<>();

		ArrayList<Student> slist = null;

		for (Student s : stdList) {

			slist = new ArrayList<Student>();
			for (Student s1 : stdList) {
				if (s.getGrade() == s1.getGrade()) {
					slist.add(s1);

				}
				smap.put(s.getGrade(), slist);
			}

		}
		for (Map.Entry<Character, ArrayList<Student>> en : smap.entrySet()) {
			System.out.println(en.getKey());
			for (Student s : en.getValue()) {
				System.out.println(s);
			}
			System.out.println("---------------------------------------------------------------------");
		}

	}

}
