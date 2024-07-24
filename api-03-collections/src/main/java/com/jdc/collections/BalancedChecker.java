package com.jdc.collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class BalancedChecker {

	private Queue<Character> stack;

	public Boolean isBalance(String value) {

		stack = Collections.asLifoQueue(new ArrayDeque<>());

		var chars = value.toCharArray();

		if (chars.length == 0) {
			return false;
		}

		for (var c : chars) {
			if (isOpen(c)) {
				stack.offer(c);

			} else if (isClose(c)) {
				var last = stack.poll();

				if (null == last) {
					return false;
				}
				if (!isMatch(last, c)) {
					return false;
				}

			} else {
				throw new IllegalArgumentException();
			}
		}

		return stack.isEmpty();
	}

	private boolean isMatch(Character last, char c) {
		return (last == '(' && c == ')') || (last == '[' && c == ']') || (last == '{' && c == '}');

	}

	private boolean isOpen(char c) {
		return c == '(' || c == '[' || c == '{';
	}

	private boolean isClose(char c) {
		return c == ')' || c == ']' || c == '}';
	}

}
