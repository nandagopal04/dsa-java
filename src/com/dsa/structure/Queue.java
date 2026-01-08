package com.dsa.structure;

public class Queue {

	private Node first;
	private Node last;
	private int length;

	public class Node {

		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}

	public void printQueue() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printFirst() {
		if (length != 0)
			System.out.println("First: " + first.value);
		else
			System.out.println("Queue is empty!");
	}

	public void printLast() {
		if (length != 0)
			System.out.println("Last: " + last.value);
		else
			System.out.println("Queue is empty!");
	}

	public void printLength() {
		System.out.println("Length: " + length);
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}

}
