package com.dsa.app;

import com.dsa.structure.Stack;

public class StackApp {

	public static void main(String[] args) {

		Stack stack = new Stack(3);
		stack.printTop();
		stack.printStack();
		System.out.println();

		stack.push(4);
		stack.push(5);

		stack.printStack();
		stack.printTop();

		System.out.println();
		System.out.println(stack.pop().getValue());
		stack.printTop();

	}

}
