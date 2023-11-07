package com.interfaces;

public class Dog implements AnimalSound
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
	}

}
