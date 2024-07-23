package com.jdc.collections;

import java.time.LocalDate;

public record Student(int id, String name, Gender gender, LocalDate dob, String phone, String email) {

	public Student withId(int id) {
		return new Student(id, name, gender, dob, phone, email);
	}
	public enum Gender {
		Male, Female
	}

}
