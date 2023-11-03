package com.Lists;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		
		for (int i = 0; i <= 100; i++) 
		{
			if(i%2!=0) {
				a1.add(i);
			}
		}
		
		
		System.out.println(a1);
		
	
		
		
	}

}
