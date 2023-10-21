package com.methods;

public class NonVoid_Methods 
{

	public static int add () 
	{
		int a=10;
		int b=20;
		int c= a+b;
		
		return c;

	}
	
	public static String temp() {
		return "pune";
	}
	
	public static boolean temp2() {
		return true;
	}
	
	public static float temp3() {
		
		return 3.05f;
		
		
	}
	public static void main(String[] args) {
		int temp = NonVoid_Methods.add();
		System.out.println(temp);
		
		String a = NonVoid_Methods.temp();
		
		System.out.println(a);
		
		boolean a2 = NonVoid_Methods.temp2();
		
		System.out.println(a2);
		
		float f1 = temp3();
		
		
		
	}

}
