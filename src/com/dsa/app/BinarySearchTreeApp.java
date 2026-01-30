package com.dsa.app;

import com.dsa.structure.BinarySearchTree;

public class BinarySearchTreeApp {

	public static void main(String[] args) {

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		System.out.println("Root: " + binarySearchTree.getRoot());

		binarySearchTree.rInsert(47);
		binarySearchTree.rInsert(21);
		binarySearchTree.rInsert(76);
		binarySearchTree.rInsert(18);
		binarySearchTree.rInsert(27);
		binarySearchTree.rInsert(52);
		binarySearchTree.rInsert(82);

		System.out.println("BFS:");
		System.out.println(binarySearchTree.bfs());
		System.out.println("DFS(Pre Order):");
		System.out.println(binarySearchTree.preOrder());

	}

}
