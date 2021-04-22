package com.ramgeeks.Topics.Arrays;

public class KThSmallestLargestElement {
	/*
	 * Given an array arr[] and a number K where K is smaller than size of array,
	 * the task is to find the Kth smallest element in the given array. It is given
	 * that all array elements are distinct.
	 * 
	 * Example 1:
	 * 
	 * Input: N = 6 arr[] = 7 10 4 3 20 15 K = 3 Output : 7 Explanation : 3rd
	 * smallest element in the given array is 7.
	 */

	public static void main(String[] args) {
		int[] arr = { 73, 188, 894, 915, 940, 616, 900, 548 };
		int k = 7;
		System.out.println(kthSmallest(arr, 0, arr.length - 1, k));
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {	
			int pos = partition(arr, l, r);
			if (pos - l == k - 1)
				return arr[pos];
			if (pos - l > k - 1)
				return kthSmallest(arr, l, pos - 1, k);

			return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
		}
		return Integer.MAX_VALUE;
	}

	private static int partition(int[] arr, int l, int r) {
		int piviot = arr[r];
		int m = l;
		for (int i = l; i <= r - 1; i++) {
			if (arr[i] <= piviot) {
				int temp = arr[i];
				arr[i] = arr[m];
				arr[m] = temp;
				m++;
			}

		}
		int tem = arr[m];
		arr[m] = arr[r];
		arr[r] = tem;
		return m;
	}

}
