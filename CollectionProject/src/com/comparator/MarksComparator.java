package com.comparator;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.getMarks() == s2.getMarks()) {
			return s1.getName().compareTo(s2.getName());
		} else if (s1.getMarks() > s2.getMarks()) {
			return -1;
		} else {
			return 1;
		}

	}

}
