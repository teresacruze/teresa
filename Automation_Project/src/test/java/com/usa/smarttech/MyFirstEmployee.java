package com.usa.smarttech;

public class MyFirstEmployee {
	
	String fname;
	String lname;
	String city;
	int salary;
	
	public void getEmployeename(){
	
	fname = "Halima";
	lname = "Aktar";
	city = "Charoltte";
	salary = 9000;
	
	System.out.println("MyEmployee name:"+ " fname"+" lname"+" city"+" salary");
	}
	
	
	public void Employeesalary() {
	
	 fname ="Lee";
	 lname ="brown";
	 city ="NewYork";
	 salary = 8000;
	
	 System.out.println("MyEmployee salary:"+" fname"+" lname"+" city"+" salary");}
	 
	 public void Employeecity() {
	
		 fname ="maria";
		 lname ="scott";
		 city ="California";
		 salary =9000;
		 
		 System.out.println("MyEmployee city:"+" fname"+" lname"+" city"+" salary");

	
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MyFirstEmployee obj = new MyFirstEmployee();
		obj.getEmployeename();
		obj.Employeesalary();
		obj.Employeecity();
	}

}
