package com.jdc.demo;

public class MainApplication {

	public static void main(String[] args) {

		System.out.println("Start main method");
		var service = new Service1();
		service.execute(10, 0);
		System.out.println("End main method");
	}
}
