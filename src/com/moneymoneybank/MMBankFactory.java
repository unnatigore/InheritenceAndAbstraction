package com.moneymoneybank;
public class MMBankFactory extends BankFactory {
	
	@Override
	public SavingsAccount getNewSavingsAccount(int accountNumber, String name,
			int accountBalance, boolean isSalaried) {
		
		return new MMSavingsAccount(accountNumber, name, accountBalance, isSalaried);
	}
	@Override
	public CurrentAccount getNewCurrentAccount(int accountNumber, String name,
			int accountBalance, int creditLimit) {
		return new MMCurrentAccount(accountNumber, name, accountBalance, creditLimit);
		
	}
	
}
