package com.jdc.demo;

import java.io.IOException;

import com.jdc.demo.app.exceptions.ApplicationExcecption;
import com.jdc.demo.app.exceptions.ApplicationExcecption.Type;

public class DemoApplication {

	public static void demo(SuperClass obj) {
		try {
			obj.someMethod();

		} catch (IOException e) {
			throw new ApplicationExcecption(Type.Error,"Please check IO related");
		}
	}
}
