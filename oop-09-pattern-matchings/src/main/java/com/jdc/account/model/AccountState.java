package com.jdc.account.model;

public sealed interface AccountState permits Employee.Status, Student.Status, Teacher.Status{
	
}
