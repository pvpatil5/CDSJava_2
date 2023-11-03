package com.Lists;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo2 {

	public static void main(String[] args) {


		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Hyd");
		a1.add("mumbai");
		a1.add("pune");
		a1.add("blr");
		a1.add("chennai");
		a1.add("delhi");
		a1.add("pune");
		
	//	System.out.println(a1.size());
		
		HashSet<String> s1 = new HashSet<String>();
		
		for (int i = 0; i < a1.size(); i++) 
		{
			s1.add(a1.get(i));
		}
		
		System.out.println(s1);
		
		
		System.out.println(s1.contains("delhi"));
		
		
		
		
		
		
		
		


	}

}
