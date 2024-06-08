package jp.fixie.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentMap3 {
	
	// 大問4	 - java.util.Map					
	// 小問3
	
	public static void main(String[] args) {
		System.out.println("マップ-小問3");
		 // Declare and initialize linkedHashMap
        Map linkedHashMap = new LinkedHashMap();
        // Set the values in the linkedHashMap
        linkedHashMap.put(1, "マップ1");
        linkedHashMap.put(3, "マップ2");
        linkedHashMap.put(5, "マップ3");
        linkedHashMap.put(7, "マップ4");
        linkedHashMap.put(9, "マップ5");
        linkedHashMap.put(0, "マップ6"); 
        linkedHashMap.put(2, "マップ7");
        linkedHashMap.put(4, "マップ8");
        linkedHashMap.put(6, "マップ9");
        linkedHashMap.put(8, "マップ10");
        linkedHashMap.put(0, "マップ11"); // Overwrites
        // Output linkedHashMap
        System.out.println("linkedHashMap: " + linkedHashMap);
	}

}
