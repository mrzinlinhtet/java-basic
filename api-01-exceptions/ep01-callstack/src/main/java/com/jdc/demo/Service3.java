package com.jdc.demo;

public class Service3 {

	public void execute(int a, int b) {
		System.out.println("Executed Service3");
		var result = a / b;
		System.out.printf("A = %d, B= %d, A / B = %d%n", a, b, result);
		System.out.println("Finished Service3");
	}
}
