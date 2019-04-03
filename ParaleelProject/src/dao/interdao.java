/**
 * 
 */
package dao;

import java.util.List;

/**
 * @author GANGWAR
 *
 * 
 */
import bean.Customer;
public interface interdao {
	public String CreateAccount(Customer c);
	public String Showbalance(long accno);
	public String Deposit(int amt,long accno);
	public String Withdraw(int amt,long accno);
	public String Fndtransfer(int amt,long accno1,long accno2);
	public String PrintTransactions(long accno);
	public List<Customer> allCustomer();
}
