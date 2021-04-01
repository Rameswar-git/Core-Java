package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		rearrange(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void rearrange(int arr[], int n) {
		int[] result = new int[n];
		int cnt = 0;
		for (int i = 0, j = n - 1; i < n && j >= 0 && cnt < n; i++, j--) {
			result[cnt++] = arr[j];
			result[cnt++] = arr[i];
		}
		for (int i = 0; i < result.length; i++) {
			arr[i] = result[i];
		}
	}

}
