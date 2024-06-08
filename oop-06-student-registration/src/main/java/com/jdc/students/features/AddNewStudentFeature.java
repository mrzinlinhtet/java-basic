package com.jdc.students.features;

import com.jdc.console.app.AbstractFeature;

public class AddNewStudentFeature extends AbstractFeature{

	public AddNewStudentFeature(int id) {
		super(id, "Add new student");
	}

	@Override
	public void doBusiness() {
		System.out.println("Doing add new student");
	}

}
