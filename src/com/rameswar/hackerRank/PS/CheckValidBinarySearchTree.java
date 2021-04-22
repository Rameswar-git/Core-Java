package com.rameswar.hackerRank.PS;

public class CheckValidBinarySearchTree {

	class Node {
		int data;
		Node left;
		Node right;
	}

	boolean checkBST(Node root) {
		return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBst(Node root, int minValue, int maxValue) {
		if (root == null)
			return true;
		if (root.data < minValue && root.data > maxValue)
			return false;

		return (isBst(root.left, minValue, root.data - 1) && isBst(root.right, root.data + 1, maxValue));
	}

}
