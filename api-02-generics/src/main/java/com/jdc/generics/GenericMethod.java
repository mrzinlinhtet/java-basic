package com.jdc.generics;

public class GenericMethod {
	
	public static void main(String[] args) {
		var hello = new SuperType<String>();
		System.out.println(hello);
	}
	
	public static<T> void show(T data) {
		
	}

}
