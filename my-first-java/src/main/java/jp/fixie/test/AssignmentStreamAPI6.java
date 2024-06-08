package jp.fixie.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentStreamAPI6 {

	// StreamAPI
	// 小問6

	public static void main(String[] args) {
		System.out.println("streamAPI-小問6");
		// Declare a List<String> variable [list2] and initialize
		List<String> list2 = Arrays.asList("bb", "aa", "cc", "bb");

		// Generate a stream from list2, apply distinct and collect result into result1
		List<String> result1 = list2.stream().distinct().collect(Collectors.toList());

		// Generate a stream from list2, apply filter and collect result into result2
		List<String> result2 = list2.stream().filter(s -> s.equals("bb")).collect(Collectors.toList());

		// Output list2
		System.out.println("list2 : " + list2);

		// Output distinct operation (result1)
		System.out.println("list2-result1 : " + result1);

		// Output filter operation (result2)
		System.out.println("list2-result2 : " + result2);
	}
}
