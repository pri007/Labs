package com.cg.eis.dao;

import java.util.List;
import com.cg.eis.bean.Employee;

public interface EmployeeDao {
	public String addEmployee(Employee emp);
	public String deleteEmployee(String empid);
	public Employee searchEmployee(String empid);
	public String findInsurance(Employee emp);
	public List<Employee> allEmployee();
}
