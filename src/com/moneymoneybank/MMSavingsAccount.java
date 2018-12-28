package com.moneymoneybank;

public class MMSavingsAccount extends SavingsAccount {
	private static final float MIN_BAL=1000;

	public MMSavingsAccount(int accountNumber, String name, int accountBalance,
			boolean isSalaried) {
		super(accountNumber, name, accountBalance, isSalaried);
		
	}

	@Override
	public void amountWithdraw(float amount) throws Exception {
		super.amountWithdraw(amount);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
