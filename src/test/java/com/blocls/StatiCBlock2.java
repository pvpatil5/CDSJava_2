package com.blocls;

public class StatiCBlock2 {
	
	public static void add() {
		System.out.println(5+10);
	}
	
	public void subtract() {
		System.out.println(50-25);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("mms");
		
		StatiCBlock2.add();
		
		System.out.println("mme");

	}

	
	// when u want to execute any code before main 
	// method then u put that code in static block
	
	
	
	static {
		System.out.println("This is ststic block");
		StatiCBlock2.add();
		StatiCBlock2 s1 = new StatiCBlock2();
		s1.subtract();	
	}

	
	
}
