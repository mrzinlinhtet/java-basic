package com.jdc.demo;

public class Service1 {

	private Service2 service = new Service2();

	public void execute(int a, int b) {
		System.out.println("Executed Service1");
		service.execute(a, b);
		System.out.println("Finished Service1");
	}

}
