package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="transaction1")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transaction_id;
	private String transactions;
	private int acc_no;
	Transaction(){}
	public Transaction(String st,int accno)
	{
		this.transactions=st;
		this.acc_no=accno;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getTransactions() {
		return transactions;
	}
	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	

}
