package CompleteInterview.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class TreeTraversal {

	static List<Integer> values = new ArrayList<>();

	public static void preOrder(Node root) {
		findPreorderRecursive(root);
		findInorderRecursive(root);
		findPostorderRecursive(root);
		System.out.println(values.toString().replaceAll("\\D+", " ").trim());
	}

	private static void findPostorderRecursive(Node root) {
		if (root != null) {
			findPreorderRecursive(root.left);
			findPreorderRecursive(root.right);
			values.add(root.data); // PostOrder Traversal 
		}
	}

	private static void findInorderRecursive(Node root) {
		if (root != null) {
			findPreorderRecursive(root.left);
			values.add(root.data); // InorderOrder Traversal 
			findPreorderRecursive(root.right);
		}
	}

	private static void findPreorderRecursive(Node root) {
		if (root != null) {
			values.add(root.data); // Preorder 
			findPreorderRecursive(root.left);
			findPreorderRecursive(root.right);
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		preOrder(root);
	}
}
