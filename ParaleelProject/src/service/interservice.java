/**
 * 
 */
package service;

import java.util.List;

import bean.Customer;

/**
 * @author GANGWAR
 *
 * 
 */
public interface interservice {
	public String CreateAccount(Customer c);
	public String Showbalance(long accno);
	public String Deposit(int amt,long accno);
	public String Withdraw(int amt,long accno);
	public String Fndtransfer(int amt,long accno1,long accno2);
	public String PrintTransactions(long accno);
	public List<Customer> allCustomer();

}
