package day16and17;

import day14BasciA.MyStack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String exp = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		MyStack<Character> stack = new MyStack<Character>();
		boolean isBalanced = false;
		for (int i = 0; i < exp.length(); i++) {
			isBalanced = false;
			if (exp.charAt(i) == '(') {
				stack.push('(');
				System.out.print("Peek : " + stack.peak());
			} else if (exp.charAt(i) == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
					isBalanced = true;
				}

			}
		}
		if (stack.isEmpty() && isBalanced) {
			System.out.println("\nExpression has balanced Parenthesis");
		} else {
			System.out.println("\nExpression has not balanced Parenthesis");
		}

	}
}
