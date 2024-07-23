package com.jdc.demo.app;

import java.util.Scanner;

import com.jdc.demo.app.exceptions.ApplicationExcecption;
import com.jdc.demo.app.exceptions.ApplicationExcecption.Type;

public class ControllerClass {

	private ServiceClass service = new ServiceClass();
	private Scanner scanner = new Scanner(System.in);

	public void search() {

		try {

			System.out.println("Enter Param: ");
			var param = scanner.nextLine();

			var array = service.search(param);

			System.out.println("Search Result: ");
			for (var data : array) {
				System.out.println(data);
			}
		} catch (ApplicationExcecption e) {
			System.out.println(e.getMessage());

			if (e.getType() == Type.Error) {
				throw new RuntimeException(e);
			}
		}
	}

}
