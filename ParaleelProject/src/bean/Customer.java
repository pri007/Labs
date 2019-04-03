/**
 * 
 */
package bean;

/**
 * @author GANGWAR
 *
 * 
 */
public class Customer {
	String name;
	int age;
	long accno;
	String password;
	int balance;
	String address;
	String transaction="";
	public void Transcript(String s)
	{
		transaction=transaction+"\n"+s;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String name, int age, long accno, String password, int balance, String address) {
		super();
		this.name = name;
		this.age = age;
		this.accno = accno;
		this.password = password;
		this.balance = balance;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Name-"+name+" Account no-"+accno+"\n";
	}
	

}
