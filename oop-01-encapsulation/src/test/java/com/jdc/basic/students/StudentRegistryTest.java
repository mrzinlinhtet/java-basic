package com.jdc.basic.students;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StudentRegistryTest {

	private StudentRegistry registry;

	@BeforeEach
	void beforeEach() {
		registry = new StudentRegistry();
	}

	@ParameterizedTest
	@CsvSource(value = { "Aung Aung,03938833,aung@gmail.com,1", "Maung Maung,,,1" })
	void test_add(String name, String phone, String email, int expectedId) {

		// Prepare input
		var input = new Student(name, phone, email);

		// Execute target method
		var result = registry.add(input);

//		input.setPhone("34343434");

		// Check result
		assertEquals(expectedId, result.id());
		assertEquals(name, result.name());
		assertEquals(phone, result.phone());
		assertEquals(email, result.email());
	}
	
	@Test
	void test_getAll() {
		
		// Prepare input
		registry.add(new Student("Thidar", null, null));
		registry.add(new Student("Aye Aye", null, null));
		registry.add(new Student("Lwin Oo", null, null));
		registry.add(new Student("Myo Oo", null, null));
		registry.add(new Student("Tun Tun Oo", null, null));
		
		var students = 	registry.getAll();
		
		Arrays.sort(students, (a,b) -> a.name().compareTo(b.name()));
		
		assertEquals(1, registry.getAll()[0].id());
		assertEquals("Thidar", registry.getAll()[0].name());
		
		assertEquals(5, students[registry.getAll().length - 1].id());
		assertEquals("Tun Tun Oo", students[registry.getAll().length - 1].name());
		
		
	}

}
