package com.methods;

public class ArgumentMethods 
{

	
	public static void add(int a,int b) 
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public static void temp(String a) {
		//System.out.println("This is non arg method");
		System.out.println(a);
	}
	
	public  static void temp2(boolean a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		ArgumentMethods.add(5, 10);
		ArgumentMethods.temp("pavan");
		ArgumentMethods.temp2(true);
	}
	
	
}
