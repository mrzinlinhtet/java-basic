package com.jdc.demo;

public class Service2 {

	private Service3 service = new Service3();

	public void execute(int a, int b) {
		System.out.println("Executed Service2");
		service.execute(a, b);
		System.out.println("Finished Service2");
	}

}
