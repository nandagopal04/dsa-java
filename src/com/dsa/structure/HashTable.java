package com.dsa.structure;

public class HashTable {

	private Node[] dataMap;
	private int size = 7;

	public class Node {
		String key;
		int value;
		Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public HashTable() {
		dataMap = new Node[size];
	}

	public void printHashTable() {
		for (int i = 0; i < size; i++) {
			System.out.println(i + ":");
			Node temp = dataMap[i];
			while (temp != null) {
				System.out.println("	{" + "key: " + temp.key + ", value: " + temp.value + "}");
				temp = temp.next;
			}
		}
	}

	/**
	 * @param key
	 * @return a random hash value generated between 0-6
	 */
	private int hash(String key) {
		int hash = 0;
		char[] charArray = key.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int asciiValue = charArray[i];

			/*
			 * number 23 is a prime number used to generate a random number.
			 * 
			 * Instead of 23 we can use any other prime number.
			 * 
			 * We can replace (hash + asciiValue * 23) with any other logic to generate a
			 * random number.
			 * 
			 * By doing modular division with dataMap.length which is 7 we always get a
			 * number between 0-6
			 * 
			 */
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}

}
