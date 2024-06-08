package jp.fixie.test;

import java.util.HashMap;
import java.util.Map;

public class AssignmentMap1 {
	
	// 大問4	 - java.util.Map					
	// 小問1
	
	public static void main(String[] args) {
		System.out.println("マップ-小問1");
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
        // Output hashMap 
        System.out.println("hashMap = " + hashMap);
	}
}
