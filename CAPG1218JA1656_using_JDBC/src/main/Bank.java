/**
 * 
 */
package main;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import bean.Customer;
import service.interservice;
import service.serviceimple;

/**
 * @author GANGWAR
 *
 * 
 */
public class Bank {
	public static void main(String args[])
	{
		Random rang=new Random();
		Scanner s=new Scanner(System.in);
		interservice k=new serviceimple();

		
		System.out.println("-----------WELCOME TO UNLIMITED BANK-----------");
		try
		{
		do
		{
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("1.Create Account\n2.Show Balance\n3.Deposit\n4.Withdraw\n5.FundTransfer\n6.Print Transactions\n7.Exit");
			System.out.println("Enter your Choice");
			int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter Fullname Without Spaces(eg.PriyeshGangwar)");
			String name=s.next();
			System.out.println("Enter age between 18 and 100");
			int age=s.nextInt();
			long accno = (rang.nextLong() % 100000000000000L) + 5200000000000000L;
			String accountnum=String.valueOf(accno);
			System.out.println("Enter 4 digit password");
			String pinn=s.next();
			System.out.println("Enter initial balance(Minimum Balance should be 500)");
			int bal=s.nextInt();
			System.out.println("Enter City");
			String add=s.next();
			Customer m=new Customer(name,age,accountnum,pinn,bal,add);
			System.out.println(k.CreateAccount(m));
			break;
		case 2:
				System.out.println("Enter 16 digit Account Number");
				String z=s.next();
				System.out.println(k.Showbalance(z));
				break;
		case 3:
				System.out.println("Enter the amount");
				int y=s.nextInt();
				System.out.println("Enter 16 digit Account Number");
				String w=s.next();
				System.out.println(k.Deposit(y,w));
				break;
		case 4:
			System.out.println("Enter amount");
			int amm=s.nextInt();
			System.out.println("Enter 16 digit Account Number");
			String acc=s.next();
			System.out.println(k.Withdraw(amm,acc));
			break;
		case 5:
			System.out.println("Entet 16 digit account number from which amount will be transferred");
			String p=s.next();
			System.out.println("Enter 16 digit account number to which ammount will be transfereed");
			String q=s.next();
			System.out.println("Enter amount to be transfreed");
			int r=s.nextInt();
			System.out.println(k.Fndtransfer(r, p, q));
			break;
		case 6:
			System.out.println("enter account number");
			String cc=s.next();
			try
			{
			List<String> ls=k.PrintTransactions(cc);
			for(String tr:ls)
			{
				System.out.println(tr);
			}
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
				break;
		case 7:
			System.out.println("Thanks For Vsisting");
			return;
		default:
			System.out.println("OOPs!! Wrong input");
			break;				 		
		}
		}while(true);
		}catch(Exception e)
		{
			System.out.println("Field not correctly filled");
		}
	}


}
