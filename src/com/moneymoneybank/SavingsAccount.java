package com.moneymoneybank;
public abstract class SavingsAccount extends BankAccount {
	private boolean isSalaried;

	public SavingsAccount(int accountNumber, String name, int accountBalance,
			boolean isSalaried) {
		super(accountNumber, name, accountBalance);
		this.isSalaried = isSalaried;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public static final float MIN_BAL=1000;

	

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried + ", accountBalance="
				+ accountBalance + ", isSalaried()=" + isSalaried()
				+ ", getName()=" + getName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountBalance()="
				+ getAccountBalance() + "]";
	}

	@Override
	public void amountWithdraw(float amount) throws Exception {
		if (super.accountBalance > 1000)
			super.amountDeposite(-amount);
		else 
			throw new Exception("Invalid amount"); 
	}
	
}