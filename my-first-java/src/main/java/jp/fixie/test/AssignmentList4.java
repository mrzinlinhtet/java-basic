package jp.fixie.test;

import java.util.ArrayList;
import java.util.List;

public class AssignmentList4 {

	// 大問4 - java.util.List
	// 小問4

	public static void main(String[] args) {
		System.out.println("リスト-小問4");
		// Declare arrayList2 as List<Long> type
		List<Long> arrayList2 = new ArrayList<>();
		// Add values
		arrayList2.add(3L);
		arrayList2.add(7L);
		arrayList2.add(5L);
		Long var3 = arrayList2.get(0);
		Long var4 = arrayList2.get(2);
		Long result2 = var3 + var4;
		// Output result2
		System.out.println("result2 = " + result2);
	}

}
