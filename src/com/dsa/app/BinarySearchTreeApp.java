package com.dsa.app;

import com.dsa.structure.BinarySearchTree;

public class BinarySearchTreeApp {

	public static void main(String[] args) {

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		System.out.println("Root: " + binarySearchTree.getRoot());
		
		binarySearchTree.insert(10);
		binarySearchTree.insert(11);
		binarySearchTree.insert(12);

	}

}
