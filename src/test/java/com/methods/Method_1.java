package com.methods;

public class Method_1 {

	public static void main(String[] args) {
		
		 Method_1.method_static();
		 
		 Method_1 m1 = new Method_1 ();
		 
		 m1.method_nonstatic();
		
	}

	// method syntax static --> void type

	// Access specifier	  			return type        
	public 				  static      void        method_static ()
	{
		System.out.println(" This is static method");
	}
	
	
	public void method_nonstatic() 
	{
		System.out.println("this is non static method");
	}


}
