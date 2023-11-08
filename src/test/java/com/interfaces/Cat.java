package com.interfaces;

public class Cat implements AnimalSound
{

	@Override
	public void sound() {
		System.out.println("Meow");
		
	}

	@Override
	public void food() {
		System.out.println("Milk");
		
	}

	public void lowspeed() {
		System.out.println("low speed cat");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
