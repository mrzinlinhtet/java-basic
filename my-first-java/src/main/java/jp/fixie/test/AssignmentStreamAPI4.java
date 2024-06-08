package jp.fixie.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AssignmentStreamAPI4 {

	// StreamAPI
	// 小問4

	public static void main(String[] args) {
		System.out.println("streamAPI-小問4");
		// Declare a List<String> variable [list] and initialize
		List<String> list = Arrays.asList("bb", "aa", "cc");

		// Generate a stream from list, find maximum, and output
		Optional<String> maxElement = list.stream().max(Comparator.naturalOrder());

		// Retrieve maximum and output
		maxElement.ifPresent(s -> System.out.println("max : " + s));
	}
}
