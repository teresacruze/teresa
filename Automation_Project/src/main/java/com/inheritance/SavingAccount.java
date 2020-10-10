package com.inheritance;

public class SavingAccount {
	static String name;
	static double Initialblance;
	static double deposit;
    static double withdraw;
    static double blance;
    
    protected void openAccount() {
	
     name ="Sharon";
     int id =1003;
     int accountNumber =748784787;
     String Address ="2676-LampasasLn";
     String Customer =(" Customer name:"+ name + "Customer id:" + id + "Customer address:" + Address + accountNumber);
     System.out.println("Customer name:" + name);
     System.out.println("Customer account num :"+ accountNumber);
     
    }
    protected void savingDetails() {
    	Initialblance =2000.88;
    	deposit = 1000.55;
    	withdraw =500;
    	blance = Initialblance + deposit - withdraw;
    	System.out.println("Customer total savings:"+ blance);	  	
	}
    		 
	public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		obj.openAccount();
		obj.savingDetails();
		
	}

}
