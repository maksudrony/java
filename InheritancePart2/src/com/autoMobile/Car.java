package com.autoMobile;

public class Car extends Vehicle {
//override
	public void move() {
		wheels=4;
		System.out.println("car is moving with "+ wheels+ " wheels");
		
	}
	public void changewheel() {
		wheels=5;
		System.out.println("new wheels are "+ wheels);
		mainmove();
	}

	
	
	
}
