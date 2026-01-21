package com.dsa.app;

import com.dsa.structure.BinarySearchTree;

public class BinarySearchTreeApp {

	public static void main(String[] args) {

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		System.out.println("Root: " + binarySearchTree.getRoot());

		binarySearchTree.rInsert(10);
		binarySearchTree.rInsert(11);
		binarySearchTree.rInsert(12);
		System.out.println(binarySearchTree.getRoot().right.value);
		System.out.println(binarySearchTree.contains(11));
		System.out.println(binarySearchTree.rContains(11));

	}

}
