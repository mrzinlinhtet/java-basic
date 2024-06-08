package com.jdc.demo;

import org.junit.jupiter.api.Test;

public class LoggerTest {
	
	@Test
	void test() {
		Logger logger = new LoggerImpl();
		use(logger, "Hello World");
		
		Logger logger2 = new Logger() {
			
			@Override
			public void log(String message) {
				System.out.println(message);
			}
		};
		use(logger2, "Hello World with anonymous inner class");
	}
	
	void use(Logger logger, String message) {
		logger.log(message);
	}
}
