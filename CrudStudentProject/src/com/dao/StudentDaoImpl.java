package com.dao;

import com.pojo.Course;
import com.pojo.Student;

public class StudentDaoImpl implements StudentDao {

	
	int index;
	Student stud1;
	Student st[];
	
	public StudentDaoImpl() {

		st = new Student[5];
		index = 0;
	}

	@Override
	public void addStudent(Student stud) {

		st[index] = stud;
		index++;

	}

	@Override
	public void updateStudent(Student stud) {

		stud1 = searchStudentById(stud.getSid());
		if (stud1 != null) {
			System.out.println("Student is present");
			for (int i = 0; i < index; i++) {
				if (st[i] == stud1)
					st[i] = stud;
				break;
			}

		} else {
			System.out.println("No student found");
		}

	}

	@Override
	public void deleteStudent(int studId) {

		stud1 = searchStudentById(studId);
		if (stud1 != null) {
			System.out.println("Student is present");
			for (int i = 0; i < index; i++) {
				if (st[i] == stud1)
					st[i] = null;
				break;
			}
			System.out.println("Student removed");

		} else {
			System.out.println("No student found");
		}

	}

	@Override
	public void showAllStudent() {

		for (int i = 0; i < index; i++) {
			if (st[i] != null)
				System.out.println(st[i]);
		}

	}

	@Override
	public Student searchStudentById(int studId) {
		stud1 = null;
	
		for (int i = 0; i < st.length; i++) {
			
			if (st[i].getSid() == studId)
				stud1 = st[i];
			break;
		}

		return stud1;
	}

	public void ShowCourse(Course c[]) {
		for (Course c1 : c) {
			System.out.println(c1);
		}
	}

	public Course applyCourse() {
		Course c = null;

		return c;
	}
}
