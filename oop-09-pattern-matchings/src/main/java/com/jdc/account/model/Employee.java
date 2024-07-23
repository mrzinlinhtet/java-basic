package com.jdc.account.model;

public record Employee(String name, String loginId, String password, Status status, Role role) implements LoginUser{

	public enum Status implements AccountState{
		Active, Leave, Retried
	}

	public enum Role {
		Manager, Employee
	}
}
