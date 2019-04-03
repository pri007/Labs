/**
 * 
 */
package employee;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import department.Department;
import employee.Employee;
import java.util.function.*;
import employee.EmployeeRepository;

/**
 * @author GANGWAR
 *
 * 
 */
public class EmployeeService {
	public static void main(String args[])
	{
		List<Employee> li=new ArrayList<Employee>();
		li=EmployeeRepository.getEmployees();
		 Double summ = li.stream().map(Employee->Employee.getSalary())
				 .reduce(0.0,(sum,sal)->sum+sal);
		 Double total=li.stream().collect(Collectors.summingDouble(Employee->Employee.getSalary()));
     System.out.println(summ);
     System.out.println(total);
     System.out.println("?????????");
//two ways for finding the gruouping by and their numbers
     Map<Department,Long> dd=li.stream().filter(p->p.getDepartment()!=null).map(p->p.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   // Map<Department,Long> ee=li.stream().filter(p->p.getDepartment()!=null).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
     	System.out.println(dd);
     	System.out.println("+++++++++++");
     //	ee.forEach((k,v)->System.out.println(k.getDepartmentName()+"\t"+v));;
     Employee e=li.stream().max((Employee1,Employee2)->Employee1.getHireDate().isBefore(Employee2.getHireDate())?1:-1).get();
     System.out.println(e.getFirstName()+" "+e.getLastName());
     System.out.println("{{{{{{{{{{{{");
     
    List<Employee> li2=new ArrayList<Employee>();
    li2=li.stream().filter(p->p.getDepartment()==null).collect(Collectors.toList());
    System.out.println(li2);
    System.out.println("***************");
    
 
   List<Department> li3=new ArrayList<Department>();
    li3=EmployeeRepository.getDepartments();
    
   List<String> li4=li3.stream().map(p->p.getDepartmentName()).collect(Collectors.toList());
   List<String> li5=li.stream().filter(p->p.getDepartment()!=null).map(c->c.getDepartment().getDepartmentName()).collect(Collectors.toList());
  
   li4.removeAll(li5);
   System.out.println(li4);
    
    System.out.println("~~~~~~~~~~~~~");
    Department dn= Collections.max(dd.entrySet(),(e1,e2)->e1.getValue()>e2.getValue()?1:-1).getKey();
    System.out.println(dn.getDepartmentName());
    
    
    for(Employee f:li)
    {
    	LocalDate a = f.getHireDate();

        System.out.println(f.getFirstName()+" "+f.getLastName()+" "+f.getHireDate()+" "+a.getDayOfWeek().name());
    }
    System.out.println("^^^^^^^^^^^^^^^^^^^");
    for(Employee h:li)
    {
    	LocalDate b = h.getHireDate();
    	if(b.getDayOfWeek().name().equalsIgnoreCase("FRIDAY"))
    	{
    		System.out.println(h.getFirstName()+" "+h.getLastName()+" "+h.getHireDate());
    	}
    }
    System.out.println("---------------------");
    for(Employee ff:li)
    {System.out.println(ff.getManagerId()+"-----");
    	for(Employee hh:li)
    	{
    		
    		System.out.println(hh.getEmployeeId());
    		if(ff.getManagerId()==hh.getEmployeeId())
    		{
    			
    			System.out.println(ff.getFirstName()+" reports to "+hh.getFirstName());
    		}
    	}
    }
    
  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
  for(Employee t:li)
  {
	  Double gf=((t.getSalary()*15)/100)+t.getSalary();
	  System.out.println(t.getFirstName()+" "+t.getLastName()+" Original salary"+t.getSalary()+" After Increment"+gf);
  }
    System.out.println("$$$$$$$$$$$$$$$$$");
    li.stream().filter(u->u.getManagerId()==null).forEach(System.out::println);
    System.out.println("@@@@@@@@@@@@@@@");
    
   li.stream().sorted((e1,e2)->e1.getEmployeeId().compareTo(e2.getEmployeeId())).forEach(System.out::println);
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
   li.stream().filter(p->p.getDepartment()!=null).sorted((p1,p2)->p1.getDepartment().getDepartmentId()<p2.getDepartment().getDepartmentId()?1:-1).forEach(System.out::println);;
   System.out.println("##################");
   li.stream().sorted((r1,r2)->r1.getFirstName().compareTo(r2.getFirstName())).forEach(System.out::println);
    }

}
