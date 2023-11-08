package com.interfaces;

public class Dog implements AnimalSound,Home
{
	
	

	@Override
	public void sound() {
		
		System.out.println("Bark");
	}

	@Override
	public void food() {
	
		System.out.println("Bone");
	}
	
	public void highspeed() {
		System.out.println("High speed Dog");
		System.out.println(AnimalSound.a);
	}

	@Override
	public void typeHome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		System.out.println("Hello");
		
	}

	

}
