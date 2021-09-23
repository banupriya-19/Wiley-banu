package com.employee;

public class Employee {
	private String	empName;
	private int	empId;
	private int	empAge;
	private String	empdesgn;
	private String	empLocation;
	private int	empExpInYrs;
	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
	public Employee(String empName, int empId, int empAge, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
	}
	public Employee(String empName, int empId, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
	}
	public Employee(int empId, int empAge, String empLocation, int empExpInYrs) {
		super();
		this.empId = empId;
		this.empAge = empAge;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
	public Employee(String empdesgn, String empLocation, int empExpInYrs) {
		super();
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	public Employee(String empName) {
		super();
		this.empName = empName;
	}


}
