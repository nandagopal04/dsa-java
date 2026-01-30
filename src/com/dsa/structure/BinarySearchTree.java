package com.dsa.structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.dsa.constants.DfsOrder;

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
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	public boolean contains(int value) {
		Node temp = root;
		while (temp != null) {
			if (value < temp.value) {
				temp = temp.left;
			} else if (value > temp.value) {
				temp = temp.right;
			} else {
				return true;
			}
		}
		return false;
	}

	public boolean rContains(int value) {
		return rContains(root, value);
	}

	private boolean rContains(Node currentNode, int value) {
		if (currentNode == null)
			return false;
		if (currentNode.value == value)
			return true;
		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else {
			return rContains(currentNode.right, value);
		}
	}

	public void rInsert(int value) {
		if (root == null)
			root = new Node(value);
		rInsert(root, value);
	}

	private Node rInsert(Node currentNode, int value) {
		if (currentNode == null)
			return new Node(value);
		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = rInsert(currentNode.right, value);
		}
		return currentNode;
	}

	public void deleteNode(int value) {
		deleteNode(root, value);
	}

	private Node deleteNode(Node currentNode, int value) {
		if (currentNode == null) {
			return null;
		}
		if (value < currentNode.value) {
			currentNode.left = deleteNode(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = deleteNode(currentNode.right, value);
		} else {
			if (currentNode.left == null && currentNode.right == null) {
				return null;
			} else if (currentNode.left == null) {
				return currentNode.right;
			} else if (currentNode.right == null) {
				return currentNode.left;
			} else {
				int subTreeMin = minValue(currentNode.right);
				currentNode.value = subTreeMin;
				currentNode.right = deleteNode(currentNode.right, subTreeMin);
			}
		}
		return currentNode;
	}

	public int minValue(Node currentNode) {
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}

	public List<Integer> bfs() {
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		List<Integer> values = new ArrayList<>();
		queue.add(currentNode);
		while (queue.size() > 0) {
			currentNode = queue.remove();
			values.add(currentNode.value);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return values;
	}

//	public List<Integer> preOrder() {
//		List<Integer> result = new ArrayList<>();
//		class Traverse {
//			public Traverse(Node currentNode) {
//				result.add(currentNode.value);
//				if (currentNode.left != null) {
//					new Traverse(currentNode.left);
//				}
//				if (currentNode.right != null) {
//					new Traverse(currentNode.right);
//				}
//			}
//		}
//		new Traverse(root);
//		return result;
//	}

	public List<Integer> dfs(DfsOrder order) {

		if (order == null) {
			throw new IllegalArgumentException("Order can not be null");
		}

		List<Integer> result = new ArrayList<>();
		switch (order) {
		case PRE_ORDER:
			preOrder(root, result);
			break;
		case POST_ORDER:
			postOrder(root, result);
			break;
		case IN_ORDER:
			inOrder(root, result);
			break;
		}
		return result;
	}

	private void preOrder(Node currentNode, List<Integer> list) {
		if (currentNode == null)
			return;

		list.add(currentNode.value);
		if (currentNode.left != null) {
			preOrder(currentNode.left, list);
		}
		if (currentNode.right != null) {
			preOrder(currentNode.right, list);
		}
	}

	private void postOrder(Node currentNode, List<Integer> result) {
		if (currentNode == null)
			return;

		if (currentNode.left != null) {
			postOrder(currentNode.left, result);
		}
		if (currentNode.right != null) {
			postOrder(currentNode.right, result);
		}
		result.add(currentNode.value);
	}

	private void inOrder(Node currentNode, List<Integer> result) {
		if (currentNode == null)
			return;

		if (currentNode.left != null) {
			inOrder(currentNode.left, result);
		}
		result.add(currentNode.value);
		if (currentNode.right != null) {
			inOrder(currentNode.right, result);
		}
	}

}
