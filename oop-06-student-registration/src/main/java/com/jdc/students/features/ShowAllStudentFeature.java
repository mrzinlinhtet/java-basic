package com.jdc.students.features;

import com.jdc.console.app.AbstractFeature;

public class ShowAllStudentFeature extends AbstractFeature {

	public ShowAllStudentFeature(int id) {
		super(id, "Show All Student");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doBusiness() {
		System.out.println("Doing Show all Students");
	}

}
