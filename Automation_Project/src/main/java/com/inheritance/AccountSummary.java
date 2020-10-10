package com.inheritance;

public class AccountSummary extends CreditAccount{
	
	public static void main(String[] args) {
		
		//If we need both class property then we need to be create child class object
		
		AccountSummary obj = new AccountSummary();
		obj.openAccount();
		obj.savingDetails();
		obj.checkingDetails();
		obj.creditDetails();
		
	}
	

}
