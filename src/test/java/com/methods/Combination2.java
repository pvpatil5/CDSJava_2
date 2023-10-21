package com.methods;

public class Combination2 {

	public  int add(int a,int b) {
		int c= a*5+b*10;
		return c;
	}
	public  String name(String a1) {
		return a1+"CDS";
	}

	public  String m1(boolean b1) 
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
		
		Combination2 c2= new Combination2();
		
		int e=c2.add(5, 10);
		System.out.println(e);

		String	a=c2.name("Java");
		System.out.println(a); 

		String 	s1=c2.m1(false);	
		System.out.println(s1);
	}

}
