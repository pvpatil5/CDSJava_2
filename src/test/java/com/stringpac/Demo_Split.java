package com.stringpac;

public class Demo_Split {

	public static void main(String[] args) {
		//
		//		String s1 = "admin@gmail.com";
		//
		//		//split
		//
		//		String[] ref = s1.split("@");
		//
		//		System.out.println(ref[0]);
		//
		//
		//		String s2 ="Product_799";
		//
		//		String[] ref2 = s2.split("_");
		//		System.out.println(ref2[1]);

		System.out.println("=================");

		String s3 ="India is my country";
		String 	ref3 []=s3.split(" ");

		// india  is  my  country
		//  0      1  2    3

		for(int i=0;i<ref3.length;i++)
		{
			String temp =ref3[i]; //india
			char[] arr = temp.toCharArray();

			for (int j=arr.length-1;j>=0;j--) 
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}




	}

}
