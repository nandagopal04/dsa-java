package com.dsa.app;

import com.dsa.structure.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.appand(2);
//		myLinkedList.appand(3);
//		myLinkedList.appand(4);
//		myLinkedList.appand(5);
		myLinkedList.printLinkedList();
		System.out.println();
		System.out.println();
		myLinkedList.printLinkedList();
	}

}
