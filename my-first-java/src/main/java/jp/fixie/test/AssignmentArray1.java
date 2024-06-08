package jp.fixie.test;

import java.util.Arrays;

public class AssignmentArray1 {

	// 大問3 - 配列
	// 小問1

	public static void main(String[] args) {
		System.out.println("配列-小問1");
		// Declare array1, array2 as String array type
		String[] array1 = { "Java", "研修", "配列", "課題" };
		String[] array2 = new String[4];
		// Add values
		array2[0] = "Java";
		array2[1] = "研修";
		array2[2] = "配列";
		array2[3] = "課題";
		// Output array1, array2
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));
	}
}
