package com.dsa.structure;

public class BinarySearchTree {
	
	private Node root;
	
	public class Node{
		Node left;
		int value;
		Node right;
		public Node(int value) {
			this.value = value;
		}
	}
	
	public Node getRoot() {
		return root;
	}

}
