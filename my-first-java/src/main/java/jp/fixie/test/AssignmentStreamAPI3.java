package jp.fixie.test;

import java.util.Arrays;
import java.util.List;

public class AssignmentStreamAPI3 {

	// StreamAPI
	// 小問3

	public static void main(String[] args) {
		System.out.println("streamAPI-小問3");
		// Declare a List<String> variable [list] and initialize
		List<String> list = Arrays.asList("bb", "aa", "cc");
		
		// Generate a stream from list and call forEach method, and output
		list.stream().forEach(s -> System.out.println("forEach : " + s));
	}
}
