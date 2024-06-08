package jp.fixie.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AssignmentStreamAPI5 {

	// StreamAPI
	// 小問5

	public static void main(String[] args) {
		System.out.println("streamAPI-小問5");
		// Declare a List<String> variable [list] and initialize
		List<String> list = Arrays.asList("bb", "aa", "cc");

		// Generate a stream from list and find first, then output
		Optional<String> firstElement = list.stream().findFirst();

		// Retrieve first and output
		firstElement.ifPresent(f -> System.out.println("findFirst : " + f));

		// Generate a stream from list and find any, then output
		Optional<String> anyElement = list.stream().findAny();

		// Retrieve any and output
		anyElement.ifPresent(a -> System.out.println("findAny : " + a));
	}
}
