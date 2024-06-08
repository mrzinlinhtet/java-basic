package jp.fixie.test;

import java.util.Map;
import java.util.TreeMap;

public class AssignmentMap2 {
	
	// 大問4	 - java.util.Map					
	// 小問2
	
	public static void main(String[] args) {
		System.out.println("マップ-小問2");
		// Declare and initialize treeMap
        Map treeMap = new TreeMap();
        // Set the values in the treeMap
        treeMap.put(1, "マップ1");
        treeMap.put(3, "マップ2");
        treeMap.put(5, "マップ3");
        treeMap.put(7, "マップ4");
        treeMap.put(9, "マップ5");
        treeMap.put(0, "マップ6"); 
        treeMap.put(2, "マップ7");
        treeMap.put(4, "マップ8");
        treeMap.put(6, "マップ9");
        treeMap.put(8, "マップ10");
        treeMap.put(0, "マップ11"); // Overwrites
        // Output treeMap
        System.out.println("treeMap = " + treeMap);
	}
}
