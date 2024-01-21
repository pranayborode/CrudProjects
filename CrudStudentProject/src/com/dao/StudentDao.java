package com.dao;

import com.pojo.Student;

public interface StudentDao {

	void addStudent(Student stud);
	void updateStudent(Student stud);
	void deleteStudent(int studId);
	void showAllStudent();
	Student searchStudentById(int studId);

}
