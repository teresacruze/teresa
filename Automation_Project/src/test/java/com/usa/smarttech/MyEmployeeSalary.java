package com.usa.smarttech;

public class MyEmployeeSalary {
	
	String fname;
	String lname;
	int salary;
	
	public void getname() {
		fname =" Eliza";
		lname =" costa";
		salary =10000;
		System.out.println("My Employee name:"+"fname"+ " lname"+ " salary");
	}
		
		public void getsalary() {
			
			fname ="moni";
			lname = "farhana";
			salary = 9400;
			System.out.println("My Emplpoyee name:;"+" fname"+" lname"+" salary");
		}

	public static void main(String[] args) {
		
		//TODO Auto-generated method stub
		
		MyEmployeeSalary obj= new MyEmployeeSalary(); 
		obj.getname();
		obj.getsalary(); 
		

	}

}
