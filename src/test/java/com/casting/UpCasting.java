package com.casting;

public class UpCasting {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.test();
		
		Child c1 = new Child();
		c1.test();
		
		System.out.println("================");

		Parent p2 = (Parent)new Child();
		p2.test();
		
//		Child c2 = new Parent();
//		c2.test();
		
		
	}

}
