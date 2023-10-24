package com.constructors;

public class Sample {

	

	public  Sample() {
		System.out.println("Non argument Constructor Execution Starts");
	}

	public Sample (int a) {
		System.out.println("This is Argument Constructor="+a);
	}

	public Sample(String s1) {
		System.out.println("This is Argument Constructor="+s1);
	}

	public static void main(String[] args) 
	{

		Sample s1 = new Sample();

		Sample s2 = new Sample (2);

		Sample s3 = new Sample("Mumbai");

	}

}
