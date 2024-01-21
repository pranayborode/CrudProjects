package com.hashmapdemo;

import java.io.ObjectInputStream;
import java.util.Objects;

public class Student {
	
	private int id;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public int hashCode()
//	{
//		return Objects.hash(id,name);
//		//return 1;
//	}
//	
//	public boolean equals(Object obj)
//	{
//		if(this==obj)
//			return true;
//		if(obj==null)
//			return false;
//		if(this.getClass()!=obj.getClass())
//			return false;
//		
//		Student s= (Student) obj;
//		if(this.id!=s.id)
//			return false;
//		if(this.name!=s.name)
//			return false;
//		
//		return true;
//	}
//	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}
