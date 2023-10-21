package com.methods;

public class Combination {

	public static int add(int a,int b) {
		int c= a*5+b*10;
		return c;
	}
	public static String name(String a1) {
		return a1+"CDS";
	}

	public static String m1(boolean b1) 
	{
		if(b1==true) 
		{
			return "India";
		}
		else 
		{
			return "Mumbai";
		}

	}


	public static void main(String[] args) {

		int e=Combination.add(5, 10);
		System.out.println(e);

		String	a=Combination.name("Java");
		System.out.println(a); 

		String 	s1=Combination.m1(false);
		
		System.out.println(s1);
	}

}
