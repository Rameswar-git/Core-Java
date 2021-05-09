package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;

/*
 * Given K sorted arrays arranged in the form of a matrix of size K*K. The task is to merge them into one sorted array.
Example 1:

Input:
K = 3
arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
Output: 1 2 3 4 5 6 7 8 9
Explanation:Above test case has 3 sorted
arrays of size 3, 3, 3
arr[][] = [[1, 2, 3],[4, 5, 6], 
[7, 8, 9]]
The merged list will be 
[1, 2, 3, 4, 5, 6, 7, 8, 9].
 * 
 */

public class MergeKsortedArrays {

	public static void main(String[] args) {

		int[][] arr = { { 2, 6, 12, 34 }, { 1, 9, 20, 1000 }, { 23, 34, 90, 2000 } };

		System.out.println("Merged array is :");

		System.out.println(mergeKArrays(arr, arr.length));

	}

	static class MinHeapNode {
		public int element;
		public int arr_no;
		public int ele_indx;

		public MinHeapNode(int ele, int arr, int idx) {
			this.element = ele;
			this.arr_no = arr;
			this.ele_indx = idx;
		}
	}

	static class MinHeap {
		public MinHeapNode[] harr;
		public int heapsize;

		public MinHeap(MinHeapNode[] arr, int size) {
			this.harr = arr;
			this.heapsize = size;
			int i = (heapsize - 1) / 2;
			while (i >= 0) {
				heapify(i);
				i--;
			}
		}

		private void heapify(int i) {
			int l = left(i);
			int r = right(i);
			int smaller = i;
			if (l < heapsize && harr[l].element < harr[i].element) {
				smaller = l;
			}
			if (r < heapsize && harr[r].element < harr[smaller].element) {
				smaller = r;
			}

			if (smaller != i) {
				swap(harr, i, smaller);
				heapify(smaller);
			}

		}

		private void swap(MinHeapNode[] harr2, int i, int smaller) {
			MinHeapNode minHeapNode = harr2[i];
			harr2[i] = harr2[smaller];
			harr2[smaller] = minHeapNode;
		}

		private int right(int i) {
			return (2 * i) + 2;
		}

		private int left(int i) {
			return (2 * i) + 1;
		}

		public MinHeapNode getMinimum() {
			if(heapsize <= 0)
				return null;
			return harr[0];
		}

		public void replaceMin(MinHeapNode minimum) {
			harr[0] = minimum;
			heapify(0);
		}
	}

	public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
		MinHeapNode[] node = new MinHeapNode[K];
		int resultSize = 0;
		for (int i = 0; i < arr.length; i++) {
			node[i] = new MinHeapNode(arr[i][0], i, 1);
			resultSize += arr[i].length;
		}
		MinHeap mh = new MinHeap(node, K);
		ArrayList<Integer> result = new ArrayList<>(resultSize);

		for (int e = 0; e < resultSize; e++) {
			MinHeapNode minimum = mh.getMinimum();
			result.add(minimum.element);

			if(minimum.ele_indx < arr[minimum.arr_no].length) {
				minimum.element = arr[minimum.arr_no][minimum.ele_indx++];
			}else {
				minimum.element = Integer.MAX_VALUE;
			}
			
			mh.replaceMin(minimum);
		}

		return result;
	}
}
