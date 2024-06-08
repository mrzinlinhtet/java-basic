package jp.fixie.test;

import java.util.Scanner;

public class AssignmentAPI4 {

	// 大問2 - Javaの標準API
	// 小問4

	public static void main(String[] args) {
		System.out.println("API-小問4");
		// Call Scanner to get user input
		Scanner sc = new Scanner(System.in);
		String hoge1 = sc.next();
		String hoge2 = sc.next();
		// Do Concatenate both
		String inputResult = hoge1 + hoge2;
		// Output values
		System.out.println("input1 = " + hoge1);
		System.out.println("input2 = " + hoge2);
		System.out.println("inputResult = " + inputResult);
	}
}
