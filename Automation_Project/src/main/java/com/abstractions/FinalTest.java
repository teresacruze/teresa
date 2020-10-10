package com.abstractions;

public class FinalTest extends  AbstructTest1{
	
	void getSephora() {
		System.out.println("I am Sephora in the abstract class");	
	}

	@Override
	void geteyeLiner1() {
		
	System.out.println("I am getting eyeLiner from sephora");	
	}

	@Override
	void getlipstrickColour1() {
		
	System.out.println("lipstrick Colour is;\"+ \"red, blue,yellow,pink,brown");	
	}

	@Override
	void getfoundation1() {
		
	System.out.println("sephora is good for foundation");	
	}
   public static void main(String[] args) {
	   FinalTest obj = new FinalTest();
	    obj.getSephora();
        obj.geteyeLiner1();
        obj.getlipstrickColour1();
        obj.getfoundation();
	}
}
