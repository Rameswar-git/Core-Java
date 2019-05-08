package TreeAlgorithams;

import java.util.HashMap;
import java.util.Map;


public class BinarySearchTree {

	public static void main(String[] args) {
       Map<Integer,int[]> mps=new HashMap<>();
//       int[] child1= {1,2};
//       int[] child2= {3,4};
//       int[] child3= {5,6};
//       mps.put(0, child1);
//       mps.put(1, child2);
//       mps.put(2, child3);
//       Node nd=createBinaryTree(mps,0);
//       System.out.println(IsBinarySearchTree(nd,null,null));  /*should return false*/
       
       HashMap<Integer, int[]> mapping3 = new HashMap<Integer, int[]>();
       int[] childrenG = {1, 5};
       int[] childrenH = {0, 2};
       int[] childrenI = {4, 6};
       mapping3.put(3, childrenG);
       mapping3.put(1, childrenH);
       mapping3.put(5, childrenI);

       Node head3 = createBinaryTree(mapping3, 3); 
       System.out.println(IsBinarySearchTree(head3,null,null));  /*should return true*/
	}
	
	private static Boolean IsBinarySearchTree(Node nd, Integer lowerlimit, Integer upperlimit) {
		if(null!=lowerlimit &&  nd.value < lowerlimit) {
			return false;
		}
		if(null!=upperlimit && upperlimit < nd.value) {
			return false;
		}
		boolean isleftbalanced=true;
		boolean isrightbalanced=true;
		if(nd.left!=null) {
			isleftbalanced=IsBinarySearchTree(nd.left,lowerlimit,nd.value);
		}
		if(isleftbalanced && nd.right!=null) {
			isrightbalanced=IsBinarySearchTree(nd.right,nd.value,upperlimit);
		}
		return isleftbalanced && isrightbalanced;
	}

	private static Node createBinaryTree(Map<Integer, int[]> mps, int headnode) {
		Node head=new Node(headnode,null,null);
		Map<Integer,Node> nodes=new HashMap<>();
		nodes.put(headnode, head);
		for (Map.Entry<Integer, int[]> entry : mps.entrySet()) {
			int[] value = entry.getValue();
			Node leftnode=new Node(value[0],null,null);
			Node rightnode=new Node(value[1],null,null);
			nodes.put(value[0], leftnode);
			nodes.put(value[1], rightnode);
		}
		for (Integer key : mps.keySet()) {
			int[] is = mps.get(key);
			nodes.get(key).left=nodes.get(is[0]);
			nodes.get(key).right=nodes.get(is[1]);
		}
		return head;
	}

	public static class Node{
		public int value;
		public Node left;
		public Node right;
		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
		@Override
		public String toString() {
			return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
		}
	}

}
