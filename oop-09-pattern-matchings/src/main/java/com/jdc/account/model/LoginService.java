package com.jdc.account.model;

public class LoginService {

	private LoginUser [] users;
	public LoginResult login(LoginUser account) {
		
		for(var user : users) {
			 if(user.loginId().equals(account.loginId()) && user.password().equals(account.password())) {
				 // return login result
				 if (isAcitve(account)) {
					 return getLoginResult(account, "Login success") {
						 
					 };
				 };
			 }
		}
		return null;
	}
	
	// Pattern Matching in switch expression with record pattern
	private LoginResult getLoginResult(LoginUser account, String messages) {
		return switch(account) {
		case Employee(var name, var loginId, var password, var role,var status) -> new LoginResult(name, loginId, messages);
		case Student(var code, var name, var password, var status, var start, var end) -> new LoginResult(name, code, messages);
		case Teacher(var loginId, var password, var name, var staus) -> new LoginResult(name, loginId, messages);
		};
	}

	// Pattern Matching in switch expression with type pattern
	private boolean isAcitve(LoginUser account) {
		return switch(account) {
		case Employee e -> isActiveState(e.status());
		case Student s -> isActiveState(s.status());
		case Teacher t -> isActiveState(t.status());
		};
	}
	
	private boolean isActiveState(AccountState state) {
		return switch(state) {
		case 
		com.jdc.account.model.Student.Status.Active,
		com.jdc.account.model.Teacher.Status.Active, 
		com.jdc.account.model.Employee.Status.Active,
		com.jdc.account.model.Employee.Status.Leave
		-> true;
		case 
		com.jdc.account.model.Student.Status.Finished,
		com.jdc.account.model.Teacher.Status.Retried, 
		com.jdc.account.model.Employee.Status.Retried
		-> false;
		default -> throw new IllegalArgumentException("Unexpected value: " + state);
		};
	}
}
