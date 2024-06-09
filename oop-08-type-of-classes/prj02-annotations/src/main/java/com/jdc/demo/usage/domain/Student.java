package com.jdc.demo.usage.domain;

import java.time.LocalDate;

import com.jdc.demo.usage.NotBlank;
import com.jdc.demo.usage.NotNull;

import lombok.Data;

@Data
public class Student {

	@NotBlank("Please Enter name")
	private String name;
	@NotBlank("Please Enter phone")
	private String phone;
	@NotBlank("Please Enter dob")
	private LocalDate dob;

}
