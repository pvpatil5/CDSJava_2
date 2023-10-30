package com.stringpac;

public class Sample {

	public static void main(String[] args) {

		String s1 = "worldcup";
		//			 01234567
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(7));
		
		System.out.println(s1.startsWith("wot"));
		
		System.out.println(s1.endsWith("cut"));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1);
		
		System.out.println(s1.substring(5));
		
		System.out.println(s1.substring(2, 6));
		
		System.out.println(s1);
		
		System.out.println(s1.subSequence(2, 6));
		
		System.out.println(s1.indexOf('d'));
		
		System.out.println(s1.lastIndexOf('d'));
		
		System.out.println(s1.replace("cup", "eee"));

	}

}
