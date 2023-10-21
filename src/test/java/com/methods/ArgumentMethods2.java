package com.methods;

public class ArgumentMethods2 
{

	
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	
	public void name(String n1) {
		System.out.println(n1);
	}
	
	public static void main(String[] args)
	{
		ArgumentMethods2 ref = new ArgumentMethods2();
		ref.add(5.03, 5.0005);
		ref.name("30");	
	}
	
}
