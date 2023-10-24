package com.blocls;

public class NSBlock {
	
	public void add() {
		System.out.println(50+20);
	}

	public static void main(String[] args) 
	{
		//NSBlock n2 = new NSBlock();
		
		
	}
	
	static {
		System.out.println("Hi ");
		NSBlock n2 = new NSBlock();
	}
	
	{
		System.out.println("This is Non static block");
	}
	
}
