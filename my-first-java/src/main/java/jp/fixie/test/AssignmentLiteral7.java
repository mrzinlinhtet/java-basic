package jp.fixie.test;

public class AssignmentLiteral7 {

	// 大問1 リテラル
	// 小問7

	public static void main(String[] args) {
		System.out.println("リテラル-小問7");
		// Declare variables and initialize
		int value1 = 100;
		long value2 = 150;
		double value3 = 1.5;
		value1++;
		value2++;
		value2--;
		value3--;
		// Add with 5 and output
		value1 += 5;
		System.out.println("value1 =" + value1);
		// Subtract with 5 and output
		value1 -= 5;
		System.out.println("value1 =" + value1);
		// Multiply with 5 and output
		value1 *= 5;
		System.out.println("value1 =" + value1);
		// Divided with 5 and output
		value1 /= 7;
		System.out.println("value1 =" + value1);
		// Divided with 5 and output remainder
		value1 %= 7;
		System.out.println("value1 =" + value1);
	}
}
