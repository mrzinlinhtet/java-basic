package jp.fixie.test;

public class AssignmentLoop1 {
	
	// ループ文
	// 小問1
	
	public static void main(String[] args) {
		System.out.println("ループ-小問1");
		// Declare variable of String array with initial values
        String[] array1 = {"Java", "研修", "配列", "課題"};
        // Using for statement
        for (int i = 0; i < array1.length; i++) {
            System.out.println("通常for文:配列 : " + array1[i]);
        }
        // Using an enhanced for statement
        for (String element : array1) {
            System.out.println("拡張for文:配列 : " + element);
        }
	}

}
