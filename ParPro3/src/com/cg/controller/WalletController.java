package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.MyWallet;
import com.cg.service.MyWalletServiceImpl;;

@Controller
public class WalletController {
	@Autowired
	MyWalletServiceImpl myWalletService;
	
	@RequestMapping("/")
	public String firstPage()
	{
		return "first";
	}
	@RequestMapping("/pCreate")
	public String pCreate()
	{
		return "create";
	}
	@RequestMapping("/Create")
	public String create(MyWallet wal,Model m)
	{
		System.out.println("********************");
		String s=myWalletService.create(wal);
		m.addAttribute("msg", s);
		return "create";
	}
	
	@RequestMapping("/pDeposit")
	public String pDeposit()
	{
		return "deposit";
	}
	@RequestMapping("/Deposit")
	public String deposit(@RequestParam("t1")int acc, @RequestParam("t2")double amt,Model m)
	{
		System.out.println("********************");
		String s=myWalletService.deposit(acc,amt);
		m.addAttribute("msg", s);
		return "deposit";
	}
	

	@RequestMapping("/pWithdrawl")
	public String pWithdrawl()
	{
		return "withdrawl";
	}
	@RequestMapping("/Withdrawl")
	public String withdrawl(@RequestParam("t1")int acc, @RequestParam("t2")double amt,Model m)
	{
		System.out.println("********************");
		String s=myWalletService.withdraw(acc,amt);
		m.addAttribute("msg", s);
		return "withdrawl";
	}
	

	@RequestMapping("/pTransfer")
	public String pTransfer()
	{
		return "transfer";
	}
	@RequestMapping("/Transfer")
	public String transfer(@RequestParam("t1")int acc1,@RequestParam("t2")int acc2, @RequestParam("t3")double amount,Model m)
	{
		System.out.println("********************");
		String s=myWalletService.fundTransfer(acc1, acc2, amount);
		m.addAttribute("msg", s);
		return "transfer";
	}
	

	@RequestMapping("/pShow")
	public String pShow()
	{
		return "show";
	}
	@RequestMapping("/Show")
	public String show(@RequestParam("t1")int acc, Model m)
	{
		System.out.println("********************");
		String s=myWalletService.showBal(acc);
		m.addAttribute("msg", s);
		return "show";
	}
	@RequestMapping("/pHistory")
	public String pHistory()
	{
		return "history";
	}
	@RequestMapping("/History")
	public String history(@RequestParam("t1")int acc, Model m)
	{
		System.out.println("********************");
		List<String> s=myWalletService.print(acc);
		m.addAttribute("msg", s);
		return "history";
	}
	
}
