package com.stringpac;

import java.util.Iterator;

public class Demo3 extends Object{

	public static void main(String[] args) {


		String s1 = "india";


		//		System.out.println(s1.length());
		//		
		//		System.out.println(s1.toUpperCase());

		// if u want to convert string into array[character]

		char[] arr = s1.toCharArray();

		//		for(int i =10; i>0;i--) {
		//			System.out.println(i);
		//		}

		for(int j =arr.length-1;j>=0;j-- ) {
			System.out.print(arr[j]);
		}

		System.out.println("=============");
		StringBuffer sb = new StringBuffer("INdia");
		System.out.println(sb.reverse());




	}

}
