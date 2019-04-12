package com.cg.eis.service;

import java.util.List;
import com.cg.eis.bean.Employee;


public interface EmployeeService {
	public String addEmployee(Employee emp);	
	public Employee searchEmployee(String empid);
	public String findInsurance(Employee emp);
	public List<Employee> allEmployee();
}
