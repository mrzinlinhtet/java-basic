package jp.fixie.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentLoop3 {

	// ループ文
	// 小問3

	public static void main(String[] args) {
		System.out.println("ループ-小問3");
		// Declare variable hashMap
		Map<Integer, String> hashMap;
		// Call constructor of LinkedHashMap and store in linkedHashMap
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		// Set values in linkedHashMap
		linkedHashMap.put(1, "Java");
		linkedHashMap.put(2, "研修");
		linkedHashMap.put(3, "マップ");
		// Use java.util.Map.values to output values using an extended for statement
		for (String value : linkedHashMap.values()) {
			System.out.println("拡張for文:Map-values : " + value);
		}
		// Use java.util.Map.entrySet to output keys and values using an extended for statement
		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("拡張for文:Map-entrySet:key = " + entry.getKey() + ", value = " + entry.getValue());
		}
	}

}
