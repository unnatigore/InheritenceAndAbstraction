package com.moneymoneybank;
class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(int accountNumber, String name, int accountBalance,
			float creditLimit) {
		super(accountNumber, name, accountBalance, creditLimit);
		
	}

	@Override
	public void amountWithdraw(float amount) throws Exception {
		
		super.amountWithdraw(amount);
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
