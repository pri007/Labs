package com.cg.eis.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	List <Employee> list = new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee emp) {
		list.add(emp);
		return "Employee added!";
	}

	@Override
	public String deleteEmployee(String empid) {
		for (Employee employee : list) {
			if(employee.getEmpid().equals(empid)) {
				list.remove(employee);
			}
		}
		return "Employee deleted!!";
	}

	@Override
	public Employee searchEmployee(String empid) {
		Employee emp = null;
		for (Employee employee : list) {
			if(employee.getEmpid().equals(empid)) {
				emp = employee;
			}
		}
		return emp;
	}

	@Override
	public List<Employee> allEmployee() {
		return list;
	}

	@Override
	public String findInsurance(Employee emp) {
		if((emp.getSalary()>5000 && emp.getSalary()<20000) && (emp.getDesignation().equals("System Associate"))) {
			return "Scheme C";
		}
		else if ((emp.getSalary()>=20000 && emp.getSalary()<40000) && (emp.getDesignation().equals("Programmer"))) {
			return "Scheme B";
		}
		else if ((emp.getSalary()>=40000) && (emp.getDesignation().equals("Manager"))) {
			return "Scheme A";
		}
		else {
			return "No Scheme";
		}
	}
}