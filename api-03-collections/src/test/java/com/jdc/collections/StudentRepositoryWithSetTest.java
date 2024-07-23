package com.jdc.collections;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.jdc.collections.Student.Gender;

public class StudentRepositoryWithSetTest {

	private static StudentRepository repo;

	@BeforeAll
	static void beforeAll() {
		repo = new StudentRepositoryWithSet();
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/data/add-error.txt", delimiterString = "\t")
	void test_add_error(String name, LocalDate dob, Gender gender, String phone, String email, int errorCount) {

		var student = new Student(0, name, gender, dob, phone, email);

		var exception = assertThrows(BusinessException.class, () -> {
			repo.add(student);
		});

		assertEquals(errorCount, exception.getMessages().size());
	}

}
