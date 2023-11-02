package com.poly;

public class Sample {

	public static void main(String[] args) {
		Sample s1 = new  Sample();
		s1.test();
		s1.test(10);
		s1.test("Hello");

	}
	
	public static void test() {
		System.out.println("Test method - No Arg");
	}
	
	public static void test(String s1) {
		System.out.println("Test method - Arg="+s1);
	}
	
	public static void test (int a) {
		System.out.println("Test int arg method="+a);
	}

}
