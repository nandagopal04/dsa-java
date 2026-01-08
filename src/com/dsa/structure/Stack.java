package com.dsa.structure;

public class Stack {

	private Node top;
	private int length;

	public class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		length = 1;
	}

	public void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printLength() {
		System.out.println("Length: " + length);
	}

	public void printTop() {
		if (length > 0) {
			System.out.println("Top: " + top.value);
		} else {
			System.out.println("Stack is empty!");
		}
	}

}
