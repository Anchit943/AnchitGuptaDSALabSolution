package com.greatlearning.brackets;

import java.util.*;

public class BalancedBrackets {

	// function to check if brackets are balanced
	public static boolean areBracketsBalanced(String expr) {

		Deque<Character> stack = new ArrayDeque<Character>();

		

		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

}
