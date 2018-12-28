package com.inheritenceandabstraction.test;
import static org.junit.Assert.*;

import org.junit.Test;
import com.moneymoneybank.*;
public class MoneyMoneyBankTest {
	
	/*@Test
	public void WithdrawTest()  {
		BankFactory account= new MMBankFactory();
		SavingsAccount savings=account.getNewSavingsAccount(100,"Unnati",100000,true);
		CurrentAccount current=account.getNewCurrentAccount(101, "Anuradha",50000, 2000);
		try {
			savings.amountWithdraw(1000000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}*/
	
	@Test
	public void DepositTest()  {
		BankFactory account= new MMBankFactory();
		SavingsAccount savings=account.getNewSavingsAccount(100,"Unnati",100000,true);
		CurrentAccount current=account.getNewCurrentAccount(101, "Anuradha",50000, 2000);
		try {
			savings.amountDeposite(1000000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		double actual=savings.getAccountBalance();
		assertEquals(1100000, actual,0.0);
		
	}

}