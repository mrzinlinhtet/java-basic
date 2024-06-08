package com.jdc.basic.oop;

public class SportCarFactory extends CarFactory {

	@Override
	protected SportCar create() {
		return new SportCar();
	}
}
