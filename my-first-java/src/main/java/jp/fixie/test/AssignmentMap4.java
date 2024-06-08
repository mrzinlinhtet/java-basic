package jp.fixie.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AssignmentMap4 {

	// 大問4	 - java.util.Map					
	// 小問4
	
	public static void main(String[] args) {
		System.out.println("マップ-小問4");
		// Declare and initialize hashMap
        Map hashMap = new HashMap();
        // Set the values in the hashMap
        hashMap.put(1, "マップ1");
        hashMap.put(3, "マップ2");
        hashMap.put(5, "マップ3");
        hashMap.put(7, "マップ4");
        hashMap.put(9, "マップ5");
        hashMap.put(0, "マップ6");
        hashMap.put(2, "マップ7");
        hashMap.put(4, "マップ8");
        hashMap.put(6, "マップ9");
        hashMap.put(8, "マップ10");
        hashMap.put(0, "マップ11"); // Overwrites
        // Initialize treeMap with the same values
        Map treeMap = new TreeMap();
        treeMap.putAll(hashMap);
        // Initialize linkedHashMap with the same values
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(hashMap);
        // Get the value from hashMap by key[9] and output
        System.out.println("hashMap-key9 = " + hashMap.get(9));
        // Delete the element from hashMap by key[9]
        hashMap.remove(9);
        // Output hashMap
        System.out.println("hashMap = " + hashMap);
        // Clear treeMap
        treeMap.clear();
        // Output treeMap
        System.out.println("treeMap = " + treeMap);
        // Calculate number of elements of the hashMap and output
        System.out.println("hashMap要素数 = " + hashMap.size());
        // Calculate number of elements of the treeMap and output
        System.out.println("treeMap要素数 = " + treeMap.size());
        // Calculate number of elements of the linkedHashMap and output
        System.out.println("linkedHashMap要素数 = " + linkedHashMap.size());
        // Check key[0] exists in hashMap and output
        System.out.println("hashMap-key[0]の有無 = " + hashMap.containsKey(0));
        // Check key[9] exists in hashMap and output
        System.out.println("hashMap-key[9]の有無 = " + hashMap.containsKey(9));
        // Check value マップ11 exists in hashMap and output
        System.out.println("hashMap-value[マップ11]の有無 = " + hashMap.containsValue("マップ11"));
        // Check value マップ5 exists in hashMap and output
        System.out.println("hashMap-value[マップ5]の有無 = " + hashMap.containsValue("マップ5"));
        // Output list of values of hashMap
        System.out.println("hashMap-value一覧 = " + hashMap.values());
        // Check treeMap empty and output
        System.out.println("treeMap-空チェック = " + treeMap.isEmpty());
	}
}
