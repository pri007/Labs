package com.cg.eis.bean;

public class Employee {
	String empid;
	String name;
	double salary;
	String designation;
	String insuranceScheme;
	public Employee() {
		super();
	}
	public Employee(String empid, String name, double salary, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Id: "+empid+" | Name: "+name+" | Salary: "+salary+" | Designation: "+designation+
				" | Insurance scheme: "+insuranceScheme;
	}
	
}
