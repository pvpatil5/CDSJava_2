package com.stringpac;

public class Demo2 extends Object{

	public static void main(String[] args) {



		String s1 = "pune";

		String s2 = "Pune";


		String s3 = new String("pune");

		String s4 = new String("pune");


		// object comparison or address comparison
		System.out.println(s1==s2);

		//		System.out.println(s3==s4);
		//		
		//		System.out.println(s1==s3);
		//		
		//		
		//		System.out.println("============================");
		//		
		//		// compare the content of the string
		//		
		System.out.println(s1.equalsIgnoreCase(s2));
		//		



	}

}
