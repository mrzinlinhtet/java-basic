package com.jdc.collections;

import java.util.List;

public class RemoveIfOddNumber {

	public List<Integer> removeIfOdd(List<Integer> list) {

//		for (int i = 0; i < list.size(); i++) {
//			var item = list.get(i);
//			if (item % 2 != 0) {
//				list.remove(item);
//			}
//		}

//		for (var item : list) {
//			var index = list.indexOf(item);
//
//			if (item % 2 != 0) {
//				list.remove(index);
//			}
//		}

		var iterator = list.iterator();
		while (iterator.hasNext()) {
			var item = iterator.next();
			if (item % 2 != 0) {
				iterator.remove();
			}
		}

		return list;
	}

}
