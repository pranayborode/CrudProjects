package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<>();

		slist.add(new Student(101, "Pranali", 67));
		slist.add(new Student(103, "Pooja", 37));
		slist.add(new Student(102, "Reetu", 74));
		slist.add(new Student(107, "Pranay", 66));
		slist.add(new Student(105, "Nisha", 67));

		for (Student s : slist) {
			System.out.println(s);
		}

		System.out.println("***********************************************************");
		// Collections.sort(slist, new NameComparator());
		Collections.sort(slist, new MarksComparator());

		for (Student s : slist) {
			System.out.println(s);
		}

	}

}
