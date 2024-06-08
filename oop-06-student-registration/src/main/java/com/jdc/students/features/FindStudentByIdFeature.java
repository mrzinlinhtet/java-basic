package com.jdc.students.features;

import com.jdc.console.app.AbstractFeature;

public class FindStudentByIdFeature extends AbstractFeature {

	public FindStudentByIdFeature(int id) {
		super(id, "Find student by id");
		
	}

	@Override
	public void doBusiness() {
		System.out.println("Doing find student by id");
	}

}
