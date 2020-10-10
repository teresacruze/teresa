package com.usa.smarttech;

public class MyEmployee {
	
	String fname;
	String lname;
	int salary;
	
	public void getname() {
		fname =" Jeff";
		lname = " gomes";
		salary = 90000;
		System.out.println("My employee name:" +fname + lname + "My salary is :" +salary);
		
		
	}
	
	
	public void getsalary() {
	 fname =" joan";
		lname = " cruze";
		salary= 8500;
		System.out.println("My employee name:" +fname + lname + "My salary is :" +salary);}
		
	
	public static void main(String[] args) {
		
		MyEmployee obj=new MyEmployee ();
		obj.getname();
		
		obj.getsalary();
		
		
		// TODO Auto-generated method stub

	}

}
