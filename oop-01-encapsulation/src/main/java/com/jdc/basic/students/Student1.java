//package com.jdc.basic.students;
//
//import java.util.Objects;
//
//public class Student1 {
//
//	private final int id;
//	private final String name;
//	private final String phone;
//	private final String email;
//
//	public Student1(int id, String name, String phone, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.phone = phone;
//		this.email = email;
//	}
//
//	public Student1(String name, String phone, String email) {
//		super();
//		this.id = 0;
//		this.name = name;
//		this.phone = phone;
//		this.email = email;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//	
//	public Student1 withId(int id) {
//		return new Student1(id, name, phone, email);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, id, name, phone);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student1 other = (Student1) obj;
//		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
//				&& Objects.equals(phone, other.phone);
//	}
//	
//	
//
//}
