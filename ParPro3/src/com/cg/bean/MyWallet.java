package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Saksham
 *
 */
@Entity
@Table(name="wallet3")
public class MyWallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNo;
	private String name;
	private int age;
	private double initBal;
	private String address;

	//public MyWallet() {}

//	public MyWallet(String name, int age, double initBal, String address) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.initBal = initBal;
//		this.address = address;
//	}
	
	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
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
	public double getInitBal() {
		return initBal;
	}
	public void setInitBal(double initBal) {
		this.initBal = initBal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}