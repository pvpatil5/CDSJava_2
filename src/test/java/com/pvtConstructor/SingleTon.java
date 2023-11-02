package com.pvtConstructor;

public class SingleTon {

	String city ="mumbai";
	
	private static SingleTon ref;
	
	public void m2() {
		System.out.println("This is NS Method");
	}
	
	
	private SingleTon()
	{
		
	}
	
	
	public static SingleTon getRef() {
		if(ref==null) {
			ref = new SingleTon();
		}
		return ref;
	}
	
}
