package com.moneymoneybank;

public abstract class BankAccount {
	private int accountNumber;
	private String name;
	protected int accountBalance;
		

	public BankAccount(int accountNumber,String name,int accountBalance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.accountBalance=accountBalance;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public abstract void amountWithdraw(float amount) throws Exception;
	
	public void amountDeposite(float amount) throws Exception {
		if(amount > 0)
			this.accountBalance += amount;
		else
			throw new Exception("Invalid Amount !");
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name
				+ ", accountBalance=" + accountBalance + "]";
	}

	
	
	
}
