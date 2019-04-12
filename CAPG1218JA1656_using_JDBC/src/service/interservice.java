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
	public String Showbalance(String accno);
	public String Deposit(int amt,String accno);
	public String Withdraw(int amt,String accno);
	public String Fndtransfer(int amt,String accno1,String accno2);
	public List<String> PrintTransactions(String accno);
	

}
