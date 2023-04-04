package differentTasks;

import java.util.Stack;

public class CheckForValidParenthesis {
	
	public static void main(String[] args) {
		System.out.println(checkValues("{}[])"));
	}

	public static boolean checkValues(String s) {

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			switch (ch) {
			case '(':
			case '{':
			case '[':
				stack.push(ch);
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
				break;
			case ('}'):
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
				break;
			case (']'):
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
	}
}
