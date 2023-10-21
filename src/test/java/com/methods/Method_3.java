package com.methods;

public class Method_3 {


	public static void main(String[] args) 
	{
		Method_3.test();
		
		Method_3 m3 = new  Method_3();
		m3.test2();
	}

	
	public static void  test() {
		System.out.println("This is static method");
	}
	
	
	public void test2() {
		System.out.println("this is non static method");
	}
}
