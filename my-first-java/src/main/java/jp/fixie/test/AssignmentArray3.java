package jp.fixie.test;

import java.util.Arrays;

public class AssignmentArray3 {

	// 大問3 - 配列
	// 小問3

	public static void main(String[] args) {
		System.out.println("配列-小問3");
		// Declare 2D String array type for array3
		String[][] array3 = { { "Java", "研修" }, { "多次元", "配列" } };
		String[][] array4 = new String[2][2];
		// Add values
		array4[0][0] = "Java";
		array4[0][1] = "研修";
		array4[1][0] = "二次元";
		array4[1][1] = "配列";
		// Output array3, array4
		System.out.println("array3 = " + Arrays.deepToString(array3));
		System.out.println("array4 = " + Arrays.deepToString(array4));
	}

}
