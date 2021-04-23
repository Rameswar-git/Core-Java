package com.ramgeeks.Topics.Arrays;

import java.util.HashMap;

/*
 * Given an array of 0s and 1s. Find the length of the largest subarray with equal number of 0s and 1s.

Example 1:

Input:
N = 4
A[] = {0,1,0,1}
Output: 4
Explanation: The array from index [0...3]
contains equal number of 0's and 1's.
Thus maximum length of subarray having
equal number of 0's and 1's is 4.
 * 
 * 
 */

public class LargestSubArray1 {

	// Returns largest subarray with
	// equal number of 0s and 1s

	int maxLen(int arr[], int N) {
		// Creates an empty hashMap hM

		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		// Initialize sum of elements
		int sum = 0;

		// Initialize result
		int max_len = 0;
		int ending_index = -1;

		for (int i = 0; i < N; i++) {
			arr[i] = (arr[i] == 0) ? -1 : 1;
		}

		// Traverse through the given array

		for (int i = 0; i < N; i++) {
			// Add current element to sum

			sum += arr[i];

			// To handle sum=0 at last index

			if (sum == 0) {
				max_len = i + 1;
				ending_index = i;
			}

			// If this sum is seen before,
			// then update max_len if required
			if (hM.containsKey(sum)) {
				if (max_len < i - hM.get(sum)) {
					max_len = i - hM.get(sum);
					ending_index = i;
				}
			} else // Else put this sum in hash table
				hM.put(sum, i);
		}

//		for (int i = 0; i < N; i++) {
//			arr[i] = (arr[i] == -1) ? 0 : 1;
//		}

		int end = ending_index - max_len + 1;

		return max_len;
	}

	/* Driver program to test the above functions */
	public static void main(String[] args) {
		LargestSubArray1 sub = new LargestSubArray1();
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int n = arr.length;

		System.out.println(sub.maxLen(arr, n));
		;
	}

}
