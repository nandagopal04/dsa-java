package com.dsa.app;

import com.dsa.structure.HashTable;

public class HashTableApp {

	public static void main(String[] args) {

		HashTable hashTable = new HashTable();
		hashTable.printHashTable();
		hashTable.set("Mangos", 10);
		hashTable.set("Apples", 20);
		hashTable.set("Grapes", 30);
		System.out.println();
		hashTable.printHashTable();
		System.out.println("Mangos: " + hashTable.get("Mangos"));
		System.out.println("\n \n");
		System.out.println(hashTable.keys());
	}

}
