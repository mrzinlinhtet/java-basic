package jp.fixie.test;

public class AssignmentLiteral4 {

	// 大問1 リテラル
	// 小問4

	public static void main(String[] args) {
		System.out.println("リテラル-小問4");
		// Declare variables and initialize
		int value1 = 100;
		long value2 = 150;
		double value3 = 1.5;
		value1++;
		value2++;
		value2--;
		value3--;
		float cast1 = value1;
		long cast2 = (long) value3;
		// Output values
		System.out.println("cast1 = " + cast1);
		System.out.println("cast2 = " + cast2);
	}
}
