/**
 * 
 */
package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Customer;

/**
 * @author GANGWAR
 *
 * 
 */
public class daoimple implements interdao {
	List<Customer> li=new ArrayList<Customer>();
	@Override
	public String CreateAccount(Customer c) {
		// TODO Auto-generated method stub
		li.add(c);
		return "Account Created with Account Number "+c.getAccno();
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Showbalance(long)
	 */
	@Override
	public String Showbalance(long accno) {
		
		for(Customer e:li)
		{
			if(e.getAccno()==accno)
			{
				return "Account Balance is"+e.getBalance();
			}
		}
		return "Account Not Found";
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Deposit(int, long)
	 */
	@Override
	public String Deposit(int amt, long accno) {
		for(Customer d:li)
		{
			if(d.getAccno()==accno)
			{
				int a=d.getBalance()+amt;
				d.setBalance(a);
				
				d.Transcript(amt+" Rupees Deposited");
				return "Amount deposited";
			}
		}
		return "Account Not Found";
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Withdraw(int, long)
	 */
	@Override
	public String Withdraw(int amt, long accno) {
		// TODO Auto-generated method stub
		for(Customer e:li)
		{
			if(e.getAccno()==accno)
			{
				if(e.getBalance()>amt)
				{
				int a=e.getBalance()-amt;	
				e.setBalance(a);
				e.Transcript(amt+" Rupees Withdrawn");
				return "Amount Withdrawn";
				}
				else
				{
					return "Account have Insufficient balance";
				}
				
					
				
			}
		}
		
		return "Account Not Found";
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Fndtransfer(int, long, long)
	 */
	@Override
	public String Fndtransfer(int amt, long accno1, long accno2) {
		// TODO Auto-generated method stub
		for(Customer f:li)
		{
			if(f.getAccno()==accno1)
			{
				for(Customer g:li)
				{
					if(g.getAccno()==accno2)
					{
						if(f.getBalance()>amt)
						{
						int a=f.getBalance()-amt;
						int b=g.getBalance()+amt;
						f.setBalance(a);
						g.setBalance(b);
						f.Transcript(amt+" Rupees Transferred to another account");
						g.Transcript(amt+" Rupees transferred from another account");
						return "Fund Transferred";
						}
						else
						{
							return "Insufficient balance";
						}
						
					}
				}
			}
		}
		return "Account Not found";
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#PrintTransactions()
	 */
	@Override
	public String PrintTransactions(long accno) {
		// TODO Auto-generated method stub
			for(Customer kk:li)
			{
				if(kk.getAccno()==accno)
				{
					return ""+kk.getTransaction();
				}
			}
			return "Account not Found";
	}

	/* (non-Javadoc)
	 * @see dao.interdao#allCustomer()
	 */
	@Override
	public List<Customer> allCustomer() {
		// TODO Auto-generated method stub
		return li;
	}


}
