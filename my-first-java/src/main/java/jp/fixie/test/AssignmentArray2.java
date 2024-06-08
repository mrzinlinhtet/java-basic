package jp.fixie.test;

public class AssignmentArray2 {

	// 大問3 - 配列
	// 小問2

	public static void main(String[] args) {
		System.out.println("配列-小問2");
		// Declare array1, array2 as String array type
		String[] array1 = { "Java", "研修", "配列", "課題" };
		String[] array2 = new String[4];
		// Add values
		array2[0] = "Java";
		array2[1] = "研修";
		array2[2] = "配列";
		array2[3] = "課題";
		// Output array1, array2
		System.out.println("1番目の要素 = " + array1[0]);
		System.out.println("4番目の要素 = " + array1[3]);
	}
}
