package com.capgemini.cust;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.Insurance;
import com.capgemini.bank.SavingAccount_2;

public class Customer {
	
	
	public static void main(String[] args)
	{
		
		
		Insurance in=null;
		in=new SavingAccount_2();
		//acc1=new CurrentAccount();
		in.getInsuranceAmount(40000);
		System.out.println(in);
		
		//acc.isSalaryAccount();
		
		/*SavingAccount acc1=new SavingAccount();
		System.out.println(acc1);
		
		acc1.withdraw(5000);
		System.out.println(acc1);
		
		
		
		CurrentAccount acc2=new CurrentAccount();
		
System.out.println(acc1);
		
		acc1.withdraw(5000);
		System.out.println(acc1);
		*/
		
		
		
		
		
		
		
		/*  BankAccount acc1=new BankAccount();
		acc1.withdraw(5000);
		acc1.deposit(10000);
		BankAccount acc2=new BankAccount();
		BankAccount acc3=acc1;
		
		
		System.out.println("BankAcoount1:" +acc1);
		System.out.println("BankAcoount2:" +acc2);
		System.out.println("BankAcoount3:" +acc3);  */
		
	}
	
	
}
