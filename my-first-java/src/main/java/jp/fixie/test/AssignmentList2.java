package jp.fixie.test;

import java.util.ArrayList;
import java.util.List;

public class AssignmentList2 {

	// 大問4 - java.util.List
	// 小問2

	public static void main(String[] args) {
		System.out.println("リスト-小問2");
		// Declare arrayList1 as List type
		List arrayList1 = new ArrayList();
		// Add values
		arrayList1.add(1);
		arrayList1.add("Java");
		arrayList1.add(1.5);
		Integer var1 = (Integer) arrayList1.get(0);
		double var2 = (Double) arrayList1.get(2);
		Double result1 = var1 + var2;
		// Output result1
		System.out.println("result = " + result1);
	}
}
