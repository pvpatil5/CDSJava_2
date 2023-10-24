package com.constructors;

public class Sample_2 {

	public Sample_2(int a,int b) 
	{
		System.out.println("This is arg Const="+(a+b));
	}
	
	public void test(String s1, String s2) {
		System.out.println(s1+" "+s2);
	}
	
	public static void main(String[] args)
	{
		Sample_2 s1 = new Sample_2(20, 50);
			
		Sample_2 s3 = new Sample_2(50, 50);
		
		s1.test("CDS", "JAVA");
		
		
	}

}
