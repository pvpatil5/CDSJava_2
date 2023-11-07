package com.Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	
	public void sound() {
		System.out.println("Hello");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		
		
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Hyd");
		a1.add("mumbai");
		a1.add("pune");
		a1.add("blr");
		a1.add("chennai");
		a1.add("delhi");
		a1.add("pune");
		
		
//		for(int i=a1.size()-1;i>=0;i--) {
//			String str=a1.get(i);
//			char arr[]=str.toCharArray();
//			String temp="";
//			for (int j = arr.length-1;j>=0;j--)
//			{
//				temp=temp+arr[j];
//			}
//		
//			System.out.println(temp);
//			
//		}
//		
		
//		for(String s:a1) {
//			
//			char arr[]=s.toCharArray();
//			String temp="";
//			for (int j = arr.length-1;j>=0;j--)
//			{
//				temp=temp+arr[j];
//			}
//		
//			System.out.println(temp);
//		}
		
		
		Iterator<String> ref = a1.iterator();
		
		while (ref.hasNext()) {
		String str=ref.next();
		
		char arr[]=str.toCharArray();
		String temp="";
		for (int j = arr.length-1;j>=0;j--)
		{
			temp=temp+arr[j];
		}
	
		System.out.println(temp);
			
		}
		
		
		
//		System.out.println(a1);
//		
//		for (int i = 0; i < a1.size(); i++) {
//			
//			System.out.println(a1.get(i));
//			Thread.sleep(500);
//		}
		
//		
//		for(String str:a1) 
//		{
//			System.out.println(str);
//			Thread.sleep(500);
//		}
	
		
		

	}

}
