package jp.fixie.test;

import java.util.Arrays;
import java.util.List;

public class AssignmentLoop2 {
	
	// ループ文
	// 小問2
	
	public static void main(String[] args) {
		System.out.println("ループ-小問2");
		// Declare variable of String array with initial values
        String[] array1 = {"Java", "研修", "配列", "課題"};
        // Declare variable arrayList1
        List<String> arrayList1;
        // Use asList for array1 and store in arrayList1
        arrayList1 = Arrays.asList(array1);
        // Using for statement
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println("通常for文:配列 : " + arrayList1.get(i));
        }
        // Using an enhanced for statement
        for (String element : arrayList1) {
            System.out.println("拡張for文:配列 : " + element);
        }
	}
}
