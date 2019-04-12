package com.cg.eis.service;

import java.util.List;
import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDao;
import com.cg.eis.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao edao = new EmployeeDaoImpl();
	@Override
	public String addEmployee(Employee emp) {
		if(emp == null || emp.getName().length()<4) {
			return "Invalid data!!";
		}
		else
			return edao.addEmployee(emp);
	}

	public String deleteEmployee(String empid) {
		if(empid == null || empid.length()<4) {
			return "Employee id is invalid!";
		}
		else
			return edao.deleteEmployee(empid);
	}

	@Override
	public Employee searchEmployee(String empid) {
		if(empid == null || empid.length()<4) {
			return null;
		}
		else
			return edao.searchEmployee(empid);
	}

	@Override
	public List<Employee> allEmployee() {
		return edao.allEmployee();
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
