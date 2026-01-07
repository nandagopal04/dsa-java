package com.dsa.app;

import com.dsa.structure.DoublyLinkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList(4);
		doublyLinkedList.printHead();
		doublyLinkedList.printTail();
		doublyLinkedList.printLength();
		doublyLinkedList.printList();

	}

}
