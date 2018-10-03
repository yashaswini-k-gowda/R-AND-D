package com.capgemini.bank;

/** this comment is documentation based comment 

*
* @author yashak
* @since  03-10-2018
*/
public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	 static int autoAccountNoGen;
	
	public BankAccount() {
		accountNo=++autoAccountNoGen;
		accountHolderName="unknown";
		accountBalance=0;
		
	}

	
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	
	public abstract void withdraw(double amount);
	public void deposit(double amount) {
		accountBalance+=amount;
		
	}
	
	
	
	public int getAccountNo() {
		return accountNo;
	}

   public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}


	
}
