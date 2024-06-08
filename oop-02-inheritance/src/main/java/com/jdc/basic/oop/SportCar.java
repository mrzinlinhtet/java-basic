package com.jdc.basic.oop;

public class SportCar extends Car {
	
	public SportCar() {
		super(6.0);
		System.out.println("sport car with default power");

	}
	
	public SportCar(double power) {
		super(power);
		System.out.println("sport car with custom power");
	}
	
	public void turboOn() {
		System.out.println("Turbo mode on");
	}
	
	@Override
	public void drive() {
		System.out.println("Driving too fast");
	}

}
