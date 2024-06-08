package jp.fixie.test;

import java.util.Arrays;
import java.util.List;

public class AssignmentStreamAPI1 {

	// StreamAPI
	// 小問1

	public static void main(String[] args) {
		System.out.println("streamAPI-小問1");
		// Declare a List<String> variable [list] and initialize
		List<String> list = Arrays.asList("bb", "aa", "cc");

		// Generate a stream from list and call allMatch method, and output
		boolean allMatchTwoChars = list.stream().allMatch(s -> s.length() == 2);
		System.out.println("allMatch-2桁 : " + allMatchTwoChars);

		// Generate a stream from list and call allMatch method, and output
		boolean allMatchThreeChars = list.stream().allMatch(s -> s.length() == 3);
		System.out.println("allMatch-3桁 : " + allMatchThreeChars);

		// Generate a stream from list and call anyMatch method, and output
		boolean anyMatchAa = list.stream().anyMatch(s -> s.equals("aa"));
		System.out.println("anyMatch-aa : " + anyMatchAa);

		// Generate a stream from list and call anyMatch method, and output
		boolean anyMatchDd = list.stream().anyMatch(s -> s.equals("dd"));
		System.out.println("anyMatch-dd : " + anyMatchDd);

		// Generate a stream from list and call noneMatch method, and output
		boolean noneMatchAa = list.stream().noneMatch(s -> s.equals("aa"));
		System.out.println("noneMatch-aa : " + noneMatchAa);

		// Generate a stream from list and call noneMatch method, and output
		boolean noneMatchDd = list.stream().noneMatch(s -> s.equals("dd"));
		System.out.println("noneMatch-dd : " + noneMatchDd);
	}
}
