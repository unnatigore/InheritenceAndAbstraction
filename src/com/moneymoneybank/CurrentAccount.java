package com.moneymoneybank;

public abstract class CurrentAccount extends BankAccount {
	private final float creditLimit;

	public CurrentAccount(int accountNumber, String name, int accountBalance,
			float creditLimit) {
		super(accountNumber, name, accountBalance);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void amountWithdraw(float amount) throws Exception {
		if (amount > super.accountBalance+creditLimit)
			super.accountBalance -= amount;
		else 
			throw new Exception ("Invalid Amount");
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit
				+ ", accountBalance=" + accountBalance + ", getCreditLimit()="
				+ getCreditLimit() + ", getName()=" + getName()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + "]";
	}

	

	
}
