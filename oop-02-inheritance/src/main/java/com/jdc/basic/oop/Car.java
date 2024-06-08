package com.jdc.basic.oop;

public class Car extends Vehicle {

	protected double power;
	
	public Car(double power) {
		super();
		this.power = power;
		System.out.println("Constructing car");
	}

	public void park() {
		System.out.println("parking");
	}
	
	public void drive() {
		System.out.println("driving");
	}
}
