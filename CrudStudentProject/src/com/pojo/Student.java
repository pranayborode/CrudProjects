package com.pojo;

public class Student {
	
	private int sid;
	private String sname;
	private double marks;
	private Course course;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, double marks,Course course) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.course=course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [" + sid + " " + sname + " " + marks + " "+course+"]";
	}
	

}
