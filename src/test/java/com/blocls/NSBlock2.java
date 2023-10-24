package com.blocls;

public class NSBlock2 {
	
	// Whenever a object for a class is created Non Static block will get executed.
	
	{
		System.out.println("This is Non static block");
	}
	
	public static void main(String[] args) 
	{
		NSBlock2 ref = new NSBlock2();
		
		NSBlock2 ref2 = new NSBlock2();
		
	}
	
	
	static {
		System.out.println("This is static block");
	}
	
}
