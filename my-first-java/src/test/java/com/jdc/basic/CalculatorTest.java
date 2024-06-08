package com.jdc.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	private Calculator calc;

//	@BeforeAll
//	static void beforeAll() {
//		System.out.println("Before All");
//	}

	@BeforeEach
	void beforeEach() {
		calc = new Calculator();
	}

//	@AfterEach
//	void afterEach() {
//		System.out.println("After Each");
//	}

//	@AfterAll
//	static void afterAll()	{
//		System.out.println("After All");
//	}

	@ParameterizedTest
	@CsvSource(value = {
			"1,5,6",
			"2,6,8",
			"10,3,13",
			"-1,9,8"
	})
	void test_add(int digit1, int digit2, int expected) {

		var result = calc.add(digit1, digit2);

		assertEquals(expected, result);
	}

}
