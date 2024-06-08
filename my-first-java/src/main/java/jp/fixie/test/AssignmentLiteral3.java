package jp.fixie.test;

public class AssignmentLiteral3 {

	// 大問1 リテラル
	// 小問3

	public static void main(String[] args) {
		System.out.println("リテラル-小問3");
		// Declare variables and initialize
		int value1 = 100;
		long value2 = 150;
		double value3 = 1.5;
		value1++;
		value2++;
		value2--;
		value3--;
		int result1 = (int) (value1 + value2);
		double result2 = result1 * value3;
		// Output values
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
