package com.Lists;

import java.util.HashSet;

public class TestRev {

	public static void main(String[] args) {

		// Duplicate character should not print/ remove

		String s1 = "Maharashtra";

		// 1. convert to char array
		// 2. insert into set

		char arr[]=s1.toCharArray();

		HashSet<Character> h1 = new HashSet<Character>();

		for (int i = 0; i < arr.length; i++) 
		{
			h1.add(arr[i])	;
		}
		
		System.out.println(h1);
		
		//===============
		
	//	int arr[]= {55,4,78,25,32};
		// sort,min,2nd min,max,2ndmax


	}

}
