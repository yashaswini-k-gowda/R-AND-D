package com.capgemini.bank;

public class CurrentAccount extends BankAccount {

	
	@Override
	public void withdraw(double amount) {
	System.out.println("current account withdraw method");
	}

}
