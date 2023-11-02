package com.pvtConstructor;

public class Demo 
{

	String name = "Pune";
	int talukas=10;

	private static Demo ref;

	public void m1() {
		System.out.println("this is m1");
	}

	private Demo() {
		System.out.println("This is Constructor executing");
	}

	public static  Demo getRef() {
		if(ref==null) {
			ref= new Demo();
		}
		return ref;
	}

	public static Demo ref2() {
		if(ref==null) {
			ref= new Demo();
		}
		return ref;
	}


}
