package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.MyWallet;
import com.cg.dao.MyWalletDaoImpl;
/**
 * 
 * @author Saksham
 *
 */
@Service
public class MyWalletServiceImpl{

	@Autowired
	MyWalletDaoImpl mdao;
	public String create(MyWallet m) {
		// TODO Auto-generated method stub
		String str;
		int flag2=0,flag3=0;
		if(m.getAge()>=18 && m.getAge()<=100)
		{
			flag2=1;
		}
		else
		{
			return "Age less than 18 not allowed";
		}
		if(m.getInitBal()>=500)
		{
			flag3=1;
		}
		else
		{
			return "Minimum Balance is 500";
		}
		if(flag2==1 && flag3==1)
		{
			str=mdao.create(m);
			return str;
		}
		else
		{
			return "Account Not Created";
		}
	}

	public String showBal(int acc) {
		// TODO Auto-generated method stub
		String str=mdao.showBal(acc);
		return str;
	}

	public String deposit(int acc, double amount) {
		// TODO Auto-generated method stub
		if(amount<100)
		{
			return "Minimum amount is 100";
		}
		else
		{

			String str=mdao.deposit(acc, amount);
			return str;
		}
	}

	public String withdraw(int acc, double amount) {
		// TODO Auto-generated method stub
		return mdao.withdraw(acc, amount);
	}

	public String fundTransfer(int acc1, int acc2, double amount) {
		// TODO Auto-generated method stub
		if(acc1==acc2)
		{
			return "Sender and Reciever can't be same";
		}
		else
		{
			String str=mdao.fundTransfer(acc1, acc2, amount);
			return str;
		}
	}

	public List<String> print(int acc) {
		List<String>li=mdao.print(acc);
		return li;
		// TODO Auto-generated method stub
		
	}

}
