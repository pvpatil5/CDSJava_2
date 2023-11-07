package com.Lists;

import java.util.HashSet;
import java.util.Iterator;

public class Sampleset {

	public static void main(String[] args) {

		HashSet<Integer> s1= new HashSet<Integer>();
		
		s1.add(20);
		s1.add(25);
		s1.add(30);
		s1.add(4);
		s1.add(30);
		
		
		Iterator<Integer> it = s1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		int i =5;
		
		while(i<10) {
			System.out.println("hello");
			i++;
		}
		
		
		
		
	
		

	}

}
