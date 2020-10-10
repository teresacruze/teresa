package com.inheritance;

public class CheckingAccount extends SavingAccount {
	protected void checkingDetails() {
	SavingAccount.Initialblance =5000.9;
	SavingAccount.deposit = 9000.22;
	SavingAccount.withdraw =1000;
	SavingAccount.blance = SavingAccount .Initialblance + SavingAccount.deposit - SavingAccount. withdraw;
	System.out.println("Customer total checking account money : "+ SavingAccount. blance);	 
	}
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.checkingDetails();
		obj.savingDetails();
		
	}
	
	

}
