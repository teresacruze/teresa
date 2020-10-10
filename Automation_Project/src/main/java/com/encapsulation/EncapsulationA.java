package com.encapsulation;

public class EncapsulationA {
	//we have to declare the value as that private access modify
	private String studentName ="kavin scotte";
	private String studentAdress="3412 Belmont,21428";
	private int studentID = 97;
	
	//We need getter and setter method
	public String getStudentName() {
		return studentName;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public int getStudentID() {
		return studentID;
		
	}//We have to finish within class
	public static void main(String[] args) {
		EncapsulationA obj = new EncapsulationA();
		System.out.println(obj.getStudentID());
		System.out.println(obj.getStudentName());
		System.out.println(obj.getStudentAdress());
		
	}
	
}
