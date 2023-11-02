package com.pvtConstructor;

public class Sample {

	public static void main(String[] args) {
		
		Demo d1 = Demo.getRef();
		System.out.println(d1.name);
		System.out.println(d1.talukas);
		d1.m1();
		System.out.println("===================");
		System.out.println(Demo.getRef());
		
		Demo d2 = Demo.ref2();
		
		System.out.println(d2.name);
		System.out.println(d2.talukas);
		d2.m1();
		System.out.println(Demo.ref2());
		
		
		

		
		
	}

}
