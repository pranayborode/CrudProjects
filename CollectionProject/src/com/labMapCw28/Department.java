package com.labMapCw28;

public class Department {

	private int deptid;
	private String deptname;
	private String location;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depid, String deptname, String location) {
		super();
		this.deptid = depid;
		this.deptname = deptname;
		this.location = location;
	}

	public int getDepid() {
		return deptid;
	}

	public void setDepid(int depid) {
		this.deptid = depid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [depid=" + deptid + ", deptname=" + deptname + ", location=" + location + "]";
	}

}
