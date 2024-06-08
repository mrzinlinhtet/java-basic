package jp.fixie.test;

import java.util.Arrays;

public class AssignmentArray4 {

	// 大問3 - 配列
	// 小問4

	public static void main(String[] args) {
		System.out.println("配列-小問4");
		// Declare array2 as String array type
		String[] array2 = new String[4];
		// Add values
		array2[0] = "Java";
		array2[1] = "研修";
		array2[2] = "配列";
		array2[3] = "課題";
		// Declare 2D String array type for array3
		String[][] array3 = { { "Java", "研修" }, { "多次元", "配列" } };
		// Output array3
		System.out.println("1番目の要素 = " + Arrays.toString(array3[0]));
		System.out.println("2番目の要素 = " + Arrays.toString(array3[1]));
		System.out.println("1番目中の1番目の要素 = " + array3[0][0]);
		System.out.println("2番目中の2番目の要素 = " + array3[1][1]);
	}

}
