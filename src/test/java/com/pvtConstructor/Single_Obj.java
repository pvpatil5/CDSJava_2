package com.pvtConstructor;

public class Single_Obj {

	public static void main(String[] args) {
	
		SingleTon a = SingleTon.getRef();

		System.out.println(a.city);
		a.m2();
		System.out.println(a);
		
	}

}
