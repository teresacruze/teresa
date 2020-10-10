package com.usa.smarttech;

public class dog {
	int age;
   static int numberoflegs =4;
   public void get(int a) {
	System.out.println("this dog is:"+a+".");
	System.out.println("All dog have"+numberoflegs+"legs");
};


	

	public static void main(String[] args) {
	dog joey = new dog();
	joey.age=5;
	joey.get(joey.age);

		

	}

}
