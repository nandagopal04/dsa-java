package com.dsa.structure;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		Node prev;
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public Node getPrev() {
			return prev;
		}

		@Override
		public String toString() {
			return "Node [prev=" + prev + ", value=" + value + ", next=" + next + "]";
		}
	}

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		this.head = newNode;
		this.tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printHead() {
		System.out.println("Head: " + head);
	}

	public void printTail() {
		System.out.println("Tail: " + tail);
	}

	public void printLength() {
		System.out.println("Length: " + length);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

}
