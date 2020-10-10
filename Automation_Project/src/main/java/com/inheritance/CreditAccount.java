package com.inheritance;

public class CreditAccount extends CheckingAccount{
	
	protected void creditDetails() {
		SavingAccount.Initialblance =100000;
		SavingAccount.deposit =4000; 
		SavingAccount.withdraw =3000;
		SavingAccount.blance = SavingAccount .Initialblance + SavingAccount.deposit - SavingAccount. withdraw;
		System.out.println("Customer total credit account money :" + SavingAccount. blance);	 
		}
    public static void main(String[] args) {
	 CreditAccount obj = new CreditAccount();
	 obj.openAccount();
	 obj.savingDetails();
	 obj.checkingDetails();
	 obj.creditDetails();
	 
	
}
}
