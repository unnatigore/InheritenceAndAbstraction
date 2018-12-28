package com.moneymoneybank;
public abstract class BankFactory {
	
	public abstract SavingsAccount getNewSavingsAccount(int accountNumber , String name , int accountBalance , boolean isSalaried); 
	
	public abstract CurrentAccount getNewCurrentAccount(int accountNumber , String name , int accountBalance , int creditLimit);
	
}
