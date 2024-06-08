package jp.fixie.test;

public class AssignmentAPI5 {

	// 大問2 - Javaの標準API
	// 小問5

	public static void main(String[] args) {
		System.out.println("API-小問5");
		// Declare variables and initialize
		String str1 = "Java研修";
		String str2 = "Java";
		String str3 = "研修";
		// Check and Output values
		System.out.println(str1.equals(str2));
		String combinedStr = str2 + str3;
		System.out.println(str1.equals(combinedStr));
		System.out.println(str1.charAt(1));
		System.out.println(str1.indexOf('v'));
		System.out.println(str1.indexOf('k'));
		System.out.println(str1.isEmpty());
		System.out.println(str1.length());
		System.out.println(str1.replace(str2, str3));
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 5));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		String str4 = " Java研修 ";
		System.out.println(str4.trim());
		double str5 = 1234;
		System.out.println(String.valueOf(str5));
	}
}
