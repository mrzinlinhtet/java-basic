package jp.fixie.test;

public class AssignmentAPI2 {

	// 大問2 - Javaの標準API
	// 小問2

	public static void main(String[] args) {
		System.out.println("API-小問2");
		// Declare variables and initialize
		int value1 = -10;
		double value2 = 5;
		// Compare values for max, min, absoulute
		double compare1 = Math.max(value1, value2);
		double compare2 = Math.max(Math.abs(value1), Math.abs(value2));
		double compare3 = Math.min(value1, value2);
		double compare4 = Math.min(Math.abs(value1), Math.abs(value2));
		// Output values
		System.out.println("compare1 = " + compare1);
		System.out.println("compare2 = " + compare2);
		System.out.println("compare3 = " + compare3);
		System.out.println("compare4 = " + compare4);
	}
}
