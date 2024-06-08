package com.jdc.basic.oop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class InheritanceTest {
	
	@Test @Disabled
	void test1() {
		
		var sportCar = new SportCar();
		sportCar.power = 20;
		sportCar.park();
		sportCar.drive();
	}
	
	@Test
	void test2() {
		
//		SportSuvCar sportSuvCar = new SportSuvCar();
//		
//		sportSuvCar.startFourWheel();
//		
//		SportCar sportCar = sportSuvCar;
//		Car car = sportSuvCar;
//		Object obj = sportSuvCar;
		
		Car car = new SportCar(10);
		car.drive();
		
		SportCar spCar = (SportCar) car;
		spCar.turboOn();
		
//		Motorcycle motorcycle = (Motorcycle) car;
		
//		if(car instanceof SportCar sportCar) {
//		SportCar sportCar = (SportCar) car;
//			sportCar.turboOn();			
//		}
	}

}
