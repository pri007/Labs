/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Customer;
import util.Myconnection;

/**
 * @author GANGWAR

 * 
 */
public class daoimple implements interdao {
	List<Customer> li=new ArrayList<Customer>();
	Connection con=Myconnection.getConnection();
	PreparedStatement ps;
	String ss;
	int initbal;
	@Override
	public String CreateAccount(Customer c) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("insert into bank values(?,?,?,?,?,?)");
			ps.setString(1, c.getName());
			ps.setInt(2, c.getAge());
			ps.setString(3, c.getAccno());
			ps.setString(4,c.getPassword());
			ps.setInt(5, c.getBalance());
			ps.setString(6, c.getAddress());
			int x=ps.executeUpdate();
			if(x!=0)
			{
				ss= "Account Succesfully Created with AccountNumber "+c.getAccno();
			}
			else
			{
				ss= "Account not Created";
			}
			initbal=c.getBalance();
			String s="Initial balnce :"+initbal;
			ps=con.prepareStatement("insert into transactions values(?,?)");
			ps.setString(1, c.getAccno());
			ps.setString(2, s);
			ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Showbalance(long)
	 */
	@Override
	public String Showbalance(String accno) 
	{
		try {
			ps=con.prepareStatement("select balance from bank where accno like ?");
			ps.setString(1, accno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()==true)
			{
			ss= String.valueOf(rs.getInt(1));
			}
			else
			{
				ss= "Account not Found";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;
		
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Deposit(int, long)
	 */
	@Override
	public String Deposit(int amt, String accno) {
		try {
			ps = con.prepareStatement("update bank set balance = balance + ? where accno like ?");
			ps.setDouble(1, amt);
			ps.setString(2, accno);
			int a=ps.executeUpdate();
			if(a>0)
			{
				String s=amt+" Rupees Credited" ;
				ps=con.prepareStatement("insert into transactions values(?,?)");
				ps.setString(1,accno);
				ps.setString(2, s);
				ps.execute();
				ss= "Successfully Deposited";
				
			}
			else
			{
				
				ss= "Account Not Found";
			}
				
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return ss;
		
		
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Withdraw(int, long)
	 */
	@Override
	public String Withdraw(int amt, String accno) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("select balance from bank where accno like ?");
			ps.setString(1, accno);
			ResultSet rs=ps.executeQuery();
		
			if (rs.next()==true ) 
			{   
				
			if(rs.getInt(1)>=amt)
			{
				ps = con.prepareStatement("update bank set balance = balance - ? where accno = ?");
				ps.setDouble(1, amt);
				ps.setString(2, accno);
				int a=ps.executeUpdate();
				if(a>0)
				{
					String s=amt+" Rupees Debited";
					ps=con.prepareStatement("insert into transactions values(?,?)");
					ps.setString(1, accno);
					ps.setString(2, s);
					ps.execute();
					
					ss= "Balance Deducted";
				}
				else
				{
					
					ss= "Account Not Found";
				}
			}
			else
			{
			
				ss= "not enough Balance";
			}
			}
			else
			{
				ss="Account not Found ";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;
		
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#Fndtransfer(int, long, long)
	 */
	@Override
	public String Fndtransfer(int amount, String acc1,String acc2) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("select balance from bank where accno like ?");
			ps.setString(1, acc1);
			ResultSet rs=ps.executeQuery();
			if(rs.next()==true)
			{
			if(rs.getDouble(1)>=amount)
			{
				ps = con.prepareStatement("update bank set balance = balance - ? where accno = ?");
				ps.setDouble(1, amount);
				ps.setString(2, acc1);
				int a=ps.executeUpdate();
				ps = con.prepareStatement("update bank set balance = balance + ? where accno = ?");
				ps.setDouble(1, amount);
				ps.setString(2, acc2);
				a=ps.executeUpdate();
				if(a>0)
				{
					String s=amount+" Rupees Debited";
					ps=con.prepareStatement("insert into transactions values(?,?)");
					ps.setString(1, acc1);
					ps.setString(2, s);
					ps.execute();
					String s1=amount+" Rupees Credited";
					ps=con.prepareStatement("insert into transactions values(?,?)");
					ps.setString(1, acc2);
					ps.setString(2, s1);
					ps.execute();
					
					
					ss= "Balance Deducted";
				}
				else
				{
					
					ss= "Recievers Account not found";
				}
			}
			else
			{
				
				ss="not enough Balance";
			}
			}
			else
			{
				ss="Senders Account Not found";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;
		
		
	}

	/* (non-Javadoc)
	 * @see dao.interdao#PrintTransactions()
	 */
	@Override
	public List<String> PrintTransactions(String accno) {
		// TODO Auto-generated method stub
		List<String> li= new ArrayList<String>();
		try {
			ps=con.prepareStatement("select trans from transactions where accno like ?");
			ps.setString(1, accno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()==true)
			{
			li.add(rs.getString(1));
			while(rs.next())
			{
				li.add(rs.getString(1));
			}
			ps.close();
			rs.close();
			}
			else
			{
				throw new RuntimeException("Account not Found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}

	


}
