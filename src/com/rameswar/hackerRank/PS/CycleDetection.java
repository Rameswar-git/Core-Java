package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CycleDetection {

//	static boolean hasCycle(SinglyLinkedListNode head) {
//		HashMap<Integer, Integer> cnt = new HashMap<>();
//		cnt.put(head.data, 1);
//		while (head.next != null) {
//			head = head.next;
//			if(cnt.containsKey(head.data))
//				return true;
//		}
//		return false;
//	}

	static int HasCycle(SinglyLinkedListNode head) {
		SinglyLinkedListNode slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
               && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return 1;
        else
        	return 0;
	}

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int tests = input.nextInt();
		for (int testsItr = 0; testsItr < tests; testsItr++) {
//			int index = input.nextInt();

			SinglyLinkedList llist = new SinglyLinkedList();

			int llistCount = input.nextInt();

			for (int i = 0; i < llistCount; i++) {
				int llistItem = input.nextInt();
				llist.insertNode(llistItem);
			}

//			SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
//			SinglyLinkedListNode temp = llist.head;

//			for (int i = 0; i < llistCount; i++) {
//				if (i == index) {
//					extra = temp;
//				}
//
//				if (i != llistCount - 1) {
//					temp = temp.next;
//				}
//			}
//
//			temp.next = extra;

			int result = HasCycle(llist.head);
			System.out.println(result);

		}

	}
}
