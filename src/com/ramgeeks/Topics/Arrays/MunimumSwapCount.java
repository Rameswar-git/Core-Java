package com.ramgeeks.Topics.Arrays;

public class MunimumSwapCount {

	public static void main(String[] args) {
//		int arr[] = { 2, 1, 5, 6, 3 };
//		int n = arr.length;
//		int k = 3;
//		System.out.print(minSwap(arr, n, k) + "\n");

		int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
		int n = arr1.length;
		int k = 5;
		System.out.print(minSwap(arr1, n, k));
	}

	private static String minSwap(int[] arr, int n, int k) {
		int minCount = 0;
		int swapCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= k) {
				minCount++;
			}
		}

		for (int i = 0; i < minCount; i++) {
			if (arr[i] > k) {
				swapCount++;
			}
		}
		int ans = swapCount;
		for (int i = 0, j = minCount; j < n; i++, j++) {
			if (arr[i] > k)
				swapCount--;

			if (arr[j] > k)
				swapCount++;

			ans = Math.min(ans, swapCount);
		}

		return String.valueOf(ans);
	}

}
