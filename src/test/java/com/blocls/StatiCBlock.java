package com.blocls;

public class StatiCBlock {
	
	public static void add() {
		System.out.println(5+10);
	}

	public static void main(String[] args) 
	{
		
		System.out.println("mms");
		
		StatiCBlock.add();
		
		System.out.println("mme");

	}

	
	// when u want to execute any code before main 
	// method then u put that code in static block
	
	
	
	static {
		System.out.println("This is second block");
		StatiCBlock.add();
	}
	
	static 
	{
		System.out.println("Static Block Executing");
	}
	
	
	
}
