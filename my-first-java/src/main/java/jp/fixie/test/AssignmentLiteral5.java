package jp.fixie.test;

public class AssignmentLiteral5 {

	// 大問1 リテラル
	// 小問5

	public static void main(String[] args) {
		System.out.println("リテラル-小問5");
		// Declare variables and initialize
		int value1 = 100;
		long value2 = 150;
		double value3 = 1.5;
		value1++;
		value2++;
		value2--;
		value3--;
		int division1 = (int) (value2 / value1);
		int division2 = (int) (value2 % value1);
		// Output values
		System.out.println("division1 = " + division1);
		System.out.println("division2 = " + division2);
	}
}
