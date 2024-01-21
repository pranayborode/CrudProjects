package com.test;

import java.util.Scanner;

import com.dao.StudentDaoImpl;
import com.pojo.Course;
import com.pojo.Student;

public class StudentTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int sid;
		String sname;
		double marks;

		int choice;
		char ch;
		int noOfStud = 0;
		Student st = null;

		Course c[] = new Course[3];
		c[0] = new Course(101, "Java", 45000);
		c[1] = new Course(102, ".net", 33000);
		c[2] = new Course(103, "Python", 51000);

		StudentDaoImpl sdao = new StudentDaoImpl();

		do {

			System.out.println("------Student Information------------");

			System.out.println("1. Add Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Show all Student");
			System.out.println("5. Search Student by Id");

			System.out.println("---------------------------------------");

			System.out.println("Enter Your Choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----------Add Student------------");
				System.out.println("Enter how many student do you want to add ?");
				noOfStud = sc.nextInt();
				for (int i = 0; i < noOfStud; i++) {
					System.out.println("Enter Student Id:");
					sid = sc.nextInt();

					System.out.println("Enter Student Name:");
					sname = sc.next();

					System.out.println("Enter Marks of Student:");
					marks = sc.nextDouble();

					System.out.println("Select Course :");
					System.out.println("1. Java");
					System.out.println("2. .Net");
					System.out.println("3. Python");

					int cNo = sc.nextInt();

					st = new Student(sid, sname, marks, c[cNo - 1]); // -1 to get actual indexValue

					sdao.addStudent(st);
				}
				break;

			case 2:
				System.out.println("---------Update Student-----------");
				System.out.println("Enter student id:");
				sid = sc.nextInt();

				System.out.println("Enter student name:");
				sname = sc.next();

				System.out.println("Enter marks of student:");
				marks = sc.nextDouble();

				System.out.println("Select Course :");
				System.out.println("1. Java");
				System.out.println("2. .Net");
				System.out.println("3. Python");

				int cNo = sc.nextInt();

				st = new Student(sid, sname, marks, c[cNo - 1]);

				sdao.updateStudent(st);

				break;

			case 3:
				System.out.println("---------Delete Student----------");
				System.out.println("Enter Student Id:");
				sid = sc.nextInt();

				sdao.deleteStudent(sid);
				break;

			case 4:
				System.out.println("---------Show Student-----------");
				if (noOfStud != 0) {
					sdao.showAllStudent();
				} else {
					System.out.println("No Such Student Found");
				}
				break;

			case 5:
				System.out.println("-------Student Search by Id--------");
				System.out.println("Enter student id:");
				sid = sc.nextInt();

				sdao.searchStudentById(sid);
				break;

			default:
				System.out.println("Invalid operation");
				break;
			}

			System.out.println("do u want to continue??");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		sc.close();
	}

}

