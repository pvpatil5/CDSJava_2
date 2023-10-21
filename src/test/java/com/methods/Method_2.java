package com.methods;

public class Method_2 {

	public static void main(String[] args) {

		Method_2 m2 = new Method_2();
		m2.reverseString("Akshay");
		m2.reverseString("Maharashtra");
		m2.reverseString("Mumbai");
	}
	
	
	public void reverseString(String name) 
	{
		String temp="";

		for (int i = name.length()-1; i >= 0; i--)
		{
			temp=temp+name.charAt(i);
		}
		System.out.println(temp);

	}

}
