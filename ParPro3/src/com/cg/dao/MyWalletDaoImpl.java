package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.MyWallet;
import com.cg.bean.Transaction;

/**
 * 
 * @author Saksham
 *
 */
@Repository
@Transactional
public class MyWalletDaoImpl {

	@PersistenceContext
	EntityManager em;

	String res;
	double bal1;

	public String create(MyWallet m) {
		// TODO Auto-generated method stub
		em.persist(m);
		return "Successfully Added In Your Acccount Number :: " + (m.getAccountNo());

	}

	public String showBal(int acc) {
		// TODO Auto-generated method stub
		MyWallet m = em.find(MyWallet.class, acc);
		if (m == null) {
			return "account invalid";
		} else
			return String.valueOf(m.getInitBal());
	}

	public String deposit(int acc, double amount) {
		// TODO Auto-generated method stub
		MyWallet m = em.find(MyWallet.class, acc);
		if (m == null) {
			return "account invalid";
		} else {
			double bal = m.getInitBal() + amount;
			m.setInitBal(bal);
			em.merge(m);
			String str = "Credited: " + amount;
			Transaction t = new Transaction(str, acc);
			em.persist(t);
			return "Amount Credited";
		}
	}

	public String withdraw(int acc, double amount) {
		// TODO Auto-generated method stub
		MyWallet m = em.find(MyWallet.class, acc);
		if (m == null) {
			return "account invalid";
		} else {
			double bal = m.getInitBal();
			if (bal >= amount) {
				bal = bal - amount;
				m.setInitBal(bal);
				em.merge(m);
				String str = "Debited: " + amount;
				Transaction t = new Transaction(str, acc);
				em.persist(t);
				;
				return "Amount Debited";
			} else {
				return "Not enough balance";
			}
		}
	}

	public String fundTransfer(int acc1, int acc2, double amount) {
		// TODO Auto-generated method stub
		MyWallet m = em.find(MyWallet.class, acc1);
		if (m == null) {
			return "account 1 invalid";
		} 
		else 
		{
			MyWallet m1 = em.find(MyWallet.class, acc2);
			if (m1 == null) {
				return "account 2 invalid";
			} else {
				double bal = m.getInitBal();
				if(bal<amount)
				{
					return "not enough balance";
				}
				else
				{
				bal = bal - amount;
				m.setInitBal(bal);
				double bal1 = m1.getInitBal() + amount;
				m1.setInitBal(bal1);
				em.merge(m);
				em.merge(m1);
				String str = "Debited: " + amount;
				Transaction t = new Transaction(str, acc1);
				em.persist(t);
				;
				String str1 = "Credited: " + amount;
				Transaction t1 = new Transaction(str1, acc2);
				em.persist(t1);

				return "Fund Transferred";
				}
			}
		}
	}

	public List<String> print(int acc) {
		// TODO Auto-generated method stub
		TypedQuery<String> q = em.createQuery("select t.transactions from Transaction t where t.acc_no=:acc",
				String.class);
		q.setParameter("acc", acc);
		List<String> li = q.getResultList();
		return li;
	}
}