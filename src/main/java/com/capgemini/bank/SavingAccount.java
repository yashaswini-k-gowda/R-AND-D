package com.capgemini.bank;

public class SavingAccount extends BankAccount{

	@Override
	public void withdraw(double amount) {
	System.out.println("saving account withdraw method");
	}

	public void isSalaryAccount() {
		System.out.println("Salary Account");
	}
	
}
