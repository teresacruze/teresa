package com.usa.smarttech;

public class MyEmployeeClass {
	
String first_name;
String Last_name;
int ID;
String City;

public void getname(){
	
	first_name = "James";
    Last_name = "Mosely";	
	ID =902;
	City ="charlotte";

	System.out.println("my employee name"+"first_naeme"+"Last_Name"+"ID"+"City");
}

	public static void main(String[] args) {
		
	MyEmployeeClass obj = new MyEmployeeClass();
	obj.getname();
	
		
		
		// TODO Auto-generated method stub

	}

}
