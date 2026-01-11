package com.dsa.structure;

public class BinarySearchTree {

	private Node root;

	public class Node {
		public Node left;
		public int value;
		public Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public Node getRoot() {
		return root;
	}

	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (temp.value == newNode.value) {
				return false;
			}
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}

}
