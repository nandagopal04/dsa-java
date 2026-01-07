package com.dsa.structure;

public class LinkedList {

	private Node head;
	private Node tail;
	private Integer length;

	public class Node {
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
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printHead() {
		if (head == null) {
			System.out.println("Head: null");
		} else {
			System.out.println("Head: " + head.value);
		}
	}

	public void printTail() {
		if (tail == null) {
			System.out.println("Tail: null");
		} else {
			System.out.println("Tail: " + tail.value);
		}
	}

	public void printLenght() {
		if (length == 0) {
			System.out.println("Empty List!");
		} else {
			System.out.println("Length: " + length);
		}
	}

	public void appand(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = pre;
			tail.next = null;
		}
		length--;
		return temp;
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		if (length <= index || index < 0) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp == null) {
			return false;
		}
		temp.value = value;
		return true;
	}

	public boolean insert(int index, int value) {
		Node temp = head;
		Node pre = head;
		if (index < 0 || index > length) {
			return false;
		} else if (index == length) {
			appand(value);
		} else {
			for (int i = 0; i < index; i++) {
				pre = temp;
				temp = temp.next;
			}
			Node newNode = new Node(value);
			pre.next = newNode;
			newNode.next = temp;
			length++;
		}
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		if (index == length - 1) {
			return removeLast();
		}
		Node pre = get(index - 1);
		Node temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}
	
	public void reverse() {
		if(length == 0 || length == 1) {
			return;
		}
		Node pre = head;
		Node temp = pre.next;
		while(temp != null) {
			pre.next = temp.next;
			temp.next = head;
			head = temp;
			temp = pre.next;
		}
		tail = pre;
	}

}
