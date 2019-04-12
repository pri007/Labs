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
		String pattern="[A-Za-z]{2,}";
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
	public String Showbalance(String accno) {
		// TODO Auto-generated method stub
		if(accno.length()==16)
		{
		return i.Showbalance(accno);
		}
		else
		{
			return "Account Number format is wrong ";
		}
		
		
	}

	/* (non-Javadoc)
	 * @see service.interservice#Deposit(int, long)
	 */
	@Override
	public String Deposit(int amt, String accno) {
		// TODO Auto-generated method stub
		if(amt<100)
		{
			return "Minimum deposit amount is 100";
		}
		else if(accno.length()!=16)
		{
			return "Account Number format is wrong ";
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
	public String Withdraw(int amt, String accno) {
		// TODO Auto-generated method stub
		if(amt<0)
		{
			return "Amount cant be negative";
		}
		
		else if(accno.length()!=16)
		{
			return "Account Number format is wrong ";
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
	public String Fndtransfer(int amt, String accno1, String accno2) {
		// TODO Auto-generated method stub
		if(accno1.length()!=16||accno2.length()!=16)
		{
			return "Invalid Account Number";
		}
		else if(amt<0)
		{
			return "Amount can not b negative";
		}
		else 
		{
		return i.Fndtransfer(amt, accno1, accno2);
		}
	}

	/* (non-Javadoc)
	 * @see service.interservice#PrintTransactions()
	 */
	
	

	public List<String> PrintTransactions(String accno) {
		if(accno.length()!=16)
		{
			throw new RuntimeException("Account Format Is wrong");
		}
		else
		{
		return i.PrintTransactions(accno);
		}
	}
	

}
