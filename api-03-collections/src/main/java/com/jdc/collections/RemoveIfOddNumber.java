package com.jdc.collections;

import java.util.Iterator;
import java.util.List;

import lombok.experimental.var;

public class RemoveIfOddNumber {

	public List<Integer> removeIfOdd(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			var item = list.get(i);
			if (item % 2 != 0) {
				list.remove(item);
			}
		}

		return list;
	}

}
