package jp.fixie.test;

import java.util.Arrays;
import java.util.List;

public class AssignmentStreamAPI2 {

	// StreamAPI
	// 小問2

	public static void main(String[] args) {
		System.out.println("streamAPI-小問2");
		// Declare a List<String> variable [list] and initialize
		List<String> list = Arrays.asList("bb", "aa", "cc");

		// Generate a stream from list and call count method, and output
		long count = list.stream().count();
		System.out.println("count : " + count);
	}
}
