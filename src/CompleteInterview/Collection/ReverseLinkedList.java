package CompleteInterview.Collection;
/*
 * This is an in complete ReverseLinkedList class 
 * 
 * do not refer this
 */

public class ReverseLinkedList {

	static class CustomLinkedList {
		private Node head;

		private static class Node {
			int data;
			Node next;

			public Node(int data) {
				this.data = data;
				this.next = null;
			}

		}

		public boolean add(int a) {
			if (head == null) {
				head = new Node(a);
			}else {
				Node nxt = new Node(a);
				head.next = nxt;
				head = nxt;
			}
				
			return true;
		}
		
		public Node reverse () {
			Node next = null;
			Node current  = head;
			Node prev = null;
			while(current != null) {
				next  = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			return prev;
		}
		
		public Node reverse (Node element) {
			Node current = element;
			Node prev = null;
			Node next = null;
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			element = prev;
			return element;
		}
		
		public void print() {
			Node next = head;
			while(next != null) {
				System.out.print(next.data+" ");
				next = next.next;
			}
		}
		
		public void print(Node head) {
			Node next = head;
			while(next != null) {
				System.out.print(next.data+" ");
				next = next.next;
			}
		}

	}

	public static void main(String[] args) {
		CustomLinkedList lst = new CustomLinkedList();
		lst.add(85);
		lst.add(15);
		lst.add(4);
		lst.add(20);
		lst.reverse();
		lst.print();
	}

}
