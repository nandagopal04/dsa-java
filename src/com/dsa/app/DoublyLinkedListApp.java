package com.dsa.app;

import com.dsa.structure.DoublyLinkedList;

public class DoublyLinkedListApp {

	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList(4);
		doublyLinkedList.append(1);
		doublyLinkedList.append(2);
		doublyLinkedList.append(7);
		doublyLinkedList.printList();
		System.out.println();
		System.out.println(doublyLinkedList.get(3).getValue());

	}

}
