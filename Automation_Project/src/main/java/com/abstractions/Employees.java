 package com.abstractions;

public class Employees  implements CompanyIdea{

	public void getEmployees() {
		// TODO Auto-generated method stub
	System.out.println("Employee name is:Teresa");
	}

	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee salary:10000.00");
	}

	public void getCar() {
		// TODO Auto-generated method stub
		System.out.println("Employees get new car");	
	}

	public void getMedicare() {
		// TODO Auto-generated method stub
		System.out.println("Employees get:full coverage");
	
	}
    public static void main(String[] args) {
	Employees obj = new Employees();
	obj.getEmployees();
	obj.getSalary();
	obj.getCar();
	obj.getMedicare();
	
	
	
}
}
