package com.jdc.basic.oop;

public class SportSuvCar extends SportCar {
	
	public SportSuvCar() {
		System.out.println("Constructing sportsuvcar");
	}
	
	public void startFourWheel() {
		System.out.println("Four wheel mode on");
	}

	@Override
	public void drive() {
		System.out.println("Driving too fast for sport suv car");
	}
}
