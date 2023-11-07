package com.Lists;

import java.util.LinkedList;

public class Sample2 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> a1 = new LinkedList<Integer>();
		
		a1.add(55);
		a1.add(23);
		a1.add(74);
		a1.add(24);
		
//		for(int sjbnfjbb :a1) 
//		{
//			System.out.println(sjbnfjbb);
//		}
		
		for (int i = a1.size()-1; i >=0; i--) 
		{
			System.out.println(a1.get(i));
		}
		
		
		
//		System.out.println(a1);
//		
//		
//		a1.remove(3);
//		
//		System.out.println(a1);
		
		
	}

}
