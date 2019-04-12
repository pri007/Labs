package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;
/**
 * 
 * @author HPP
 *
 */


public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService eservice = new EmployeeServiceImpl();
		Employee emp1 = new Employee("A1001", "Rajat Ambastha", 32000, "Programmer");
		Employee emp2 = new Employee("A1002", "Inderpreet", 54000, "Manager");
		Employee emp3 = new Employee("A1003", "Raman", 15000, "System Associate");
		Employee emp4 = new Employee("A1004", "Tushar Sonkar", 25000, "Clerk");
//		Employee emp1 = new Employee("A1005", "Rajat Ambastha", 32000, "Programmer");
//		System.out.println(eservice.addEmployee(emp1));
		eservice.addEmployee(emp1);
		eservice.addEmployee(emp2);
		eservice.addEmployee(emp3);
		eservice.addEmployee(emp4);
		
		System.out.println(eservice.findInsurance(emp1));
		System.out.println(eservice.findInsurance(emp2));
		System.out.println(eservice.findInsurance(emp3));
		System.out.println(eservice.findInsurance(emp4));
		
	}
}
