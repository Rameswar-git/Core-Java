package com.ramgeeks.Topics.Arrays;

public class KadanesAlgorithmOfMaxSum {

	public static void main(String[] args) {
		int[] arr = { 9, -51, -20, -13, -51, 40, -21, 75, -24, 29, -86, 5, -38, 15, 48, -87, -9, 42, 39, 64, 47, -63,
				22, -81, -20, -100, 28 };
		System.out.println(new KadanesAlgorithmOfMaxSum().maxSubarraySum(arr, arr.length));
		;
	}

	int maxSubarraySum(int[] a, int size) {

		int max_sum = a[0];
		int curr_sum = 0;

		for (int i = 0; i < size; i++) {
			curr_sum = curr_sum + a[i];
			if(curr_sum < 0) {
				curr_sum = 0;
			}else if(max_sum < curr_sum) {
				max_sum = curr_sum;
			}
		}

		return max_sum;
	}

}
