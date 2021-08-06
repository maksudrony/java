package com.autoMobile;

public class AutoMobileManagement {
	public static void main(String[] args) {
		Car bmw=new Car();
		Car merci= new Car();
		merci.wheels=10;
		
		Bike b1= new Bike();
		Bike b2=new Bike();
		b1.wheels=2;
		b2.wheels=2;
		
		bmw.move();
		b2.move();
		SuperCar lembor=new SuperCar();
		lembor.turbo();
	}

}
