package com.dsa.app;

import com.dsa.structure.DoublyLinkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList(4);
		doublyLinkedList.append(1);
		doublyLinkedList.append(6);
		doublyLinkedList.append(7);
		doublyLinkedList.printList();
		System.out.println();
		doublyLinkedList.removeLast();
		doublyLinkedList.printList();

	}

}
