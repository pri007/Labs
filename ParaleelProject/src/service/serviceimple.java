/**
 * 
 */
package service;

import java.util.List;

import bean.Customer;
import dao.daoimple;
import dao.interdao;

/**
 * @author GANGWAR
 *
 * 
 */
public class serviceimple implements interservice {
	interdao i=new daoimple();
	/* (non-Javadoc)
	 * @see service.interservice#CreateAccount(bean.Customer)
	 */
	@Override
	public String CreateAccount(Customer c) {
		String pattern="[A-Z]{1}[a-z]{2,}[A-Z]{1}[a-z]{2,}";
		boolean bb=c.getName().matches(pattern);
		if(bb==false)
		{
			return "Wrong Name Pattern";
		}
		else if(c.getAge()<18||c.getAge()>100)
		{
			return "Age should be between 18 and 100";
		}
		else if(c.getBalance()<500)
		{
			return "Minimum balance should be 500";
		}
		else if(c.getPassword().length()!=4)
		{
			return "Password length must be 4";
		}
		else
		{
			return i.CreateAccount(c);
		}
	}

	/* (non-Javadoc)
	 * @see service.interservice#Showbalance(long)
	 */
	@Override
	public String Showbalance(long accno) {
		// TODO Auto-generated method stub
		if(String.valueOf(accno).length()!=16)
		{
			return "Invalid Account Number";
		}
		else {
		return i.Showbalance(accno);
		}
		
	}

	/* (non-Javadoc)
	 * @see service.interservice#Deposit(int, long)
	 */
	@Override
	public String Deposit(int amt, long accno) {
		// TODO Auto-generated method stub
		if(String.valueOf(accno).length()!=16)
		{
			return "Invalid Account Number";
		}
		else
		{
		return i.Deposit(amt, accno);
		}
	}

	/* (non-Javadoc)
	 * @see service.interservice#Withdraw(int, long)
	 */
	@Override
	public String Withdraw(int amt, long accno) {
		// TODO Auto-generated method stub
		if(String.valueOf(accno).length()!=16)
		{
			return "Invalid Account Number";
		}
		else
		{
		return i.Withdraw(amt, accno);
		}
	}

	/* (non-Javadoc)
	 * @see service.interservice#Fndtransfer(int, long, long)
	 */
	@Override
	public String Fndtransfer(int amt, long accno1, long accno2) {
		// TODO Auto-generated method stub
		if(String.valueOf(accno1).length()!=16||String.valueOf(accno2).length()!=16)
		{
			return "Invalid Account Number";
		}
		else 
		{
		return i.Fndtransfer(amt, accno1, accno2);
		}
	}

	/* (non-Javadoc)
	 * @see service.interservice#PrintTransactions()
	 */
	
	/* (non-Javadoc)
	 * @see service.interservice#allCustomer()
	 */
	@Override
	public List<Customer> allCustomer() {
		// TODO Auto-generated method stub
		return i.allCustomer();
	}

	public String PrintTransactions(long accno) {
		return i.PrintTransactions(accno);
	}
	

}
