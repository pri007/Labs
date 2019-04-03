/**
 * 
 */
package main;

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
		//long t = (rang.nextLong() % 100000000000000L) + 5200000000000000L;
		
		System.out.println("-----------WELCOME TO UNLIMITED BANK-----------");
		
		do
		{
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("1.Create Account\n2.Show Balance\n3.Deposit\n4.Withdraw\n5.FundTransfer\n6.Print Transactions\n7.List all Customers");
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
			System.out.println("Enter 4 digit pin");
			String pinn=s.next();
			System.out.println("Enter initial balance(Minimum Balance should be 500)");
			int bal=s.nextInt();
			System.out.println("Enter City");
			String add=s.next();
			Customer m=new Customer(name,age,accno,pinn,bal,add);
			System.out.println(k.CreateAccount(m));
			break;
		case 2:
				System.out.println("Enter Account Number");
				long z=s.nextLong();
				System.out.println(k.Showbalance(z));
				break;
		case 3:
				System.out.println("Enter the amount");
				int y=s.nextInt();
				System.out.println("Enter the Account Number");
				long w=s.nextLong();
				System.out.println(k.Deposit(y,w));
				break;
		case 4:
			System.out.println("Enter amount");
			int amm=s.nextInt();
			System.out.println("Enter the Account Number");
			long acc=s.nextLong();
			System.out.println(k.Withdraw(amm,acc));
			break;
		case 5:
			System.out.println("Entet account from which amount will be transferred");
			long p=s.nextLong();
			System.out.println("Enter account to which ammount will be transfereed");
			long q=s.nextLong();
			System.out.println("Enter amount to be transfreed");
			int r=s.nextInt();
			System.out.println(k.Fndtransfer(r, p, q));
			break;
		case 6:
			System.out.println("enetr account number");
			long cc=s.nextLong();
			System.out.println(k.PrintTransactions(cc));
				break;
		case 7:
			System.out.println(k.allCustomer());
			break;
		default:
			System.out.println("OOPs!! Wrong input");
			break;				 		
		}
		}while(true);
	}


}
