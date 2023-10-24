package com.constructors;

public class Const_2 {

	public  Const_2 () {
		System.out.println("This is constructor executing");
		
	}
	
	{
		System.out.println("this ns block");
	}
	
	static {
		System.out.println("this static block");
	}
	
	public static void main(String[] args) 
	{
		Const_2 c1 = new Const_2();

	}

}
