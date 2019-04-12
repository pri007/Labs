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
	public String Showbalance(String accno);
	public String Deposit(int amt,String accno);
	public String Withdraw(int amt,String accno);
	public String Fndtransfer(int amt,String accno1,String accno2);
	public List<String> PrintTransactions(String accno);
	
}
