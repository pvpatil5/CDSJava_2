package com.methods;

public class NonVoid_Methods2 
{

	public int add() {
		int a=50;
		int b=10;
		int c=a+b;
		return c;


	}
	public String  state()
	{
		String name="Maharashtra";
		return name;
	}

	public  double test() 
	{
		
		return 20.5;
	}
	
	public static void main(String[] args) {
		
		NonVoid_Methods2 ref = new NonVoid_Methods2();
		double a1 = ref.test();
		
		System.out.println(a1);
		
		
		int a2=ref.add();
		System.out.println(a2);
		
		
		String s1=ref.state();
		System.out.println(s1);
	}

}
