package com.ramgeeks.Topics.Arrays;

/*
 * Given an array of positive integers. Find the maximum length of Bitonic subsequence. 
A subsequence of array is called Bitonic if it is first increasing, then decreasing.
 

Example 1:

Input: nums = [1, 2, 5, 3, 2]
Output: 5
Explanation: The sequence {1, 2, 5} is
increasing and the sequence {3, 2} is 
decreasing so merging both we will get 
length 5.
Example 2:

Input: nums = [1, 11, 2, 10, 4, 5, 2, 1]
Output: 6
Explanation: The bitonic sequence 
{1, 2, 10, 4, 2, 1} has length 6.
 * 
 */

public class LongestBitonicSubsequence {

	static int lbs(int arr[], int n) {
		int i, j;

		/*
		 * Allocate memory for LIS[] and initialize LIS values as 1 for all indexes
		 */
		int[] lis = new int[n];
		for (i = 0; i < n; i++)
			lis[i] = 1;

		/* Compute LIS values from left to right */
		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		/*
		 * Allocate memory for lds and initialize LDS values for all indexes
		 */
		int[] lds = new int[n];
		for (i = 0; i < n; i++)
			lds[i] = 1;

		/* Compute LDS values from right to left */
		for (i = n - 2; i >= 0; i--)
			for (j = n - 1; j > i; j--)
				if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
					lds[i] = lds[j] + 1;

		/* Return the maximum value of lis[i] + lds[i] - 1 */
		int max = lis[0] + lds[0] - 1;
		for (i = 1; i < n; i++)
			if (lis[i] + lds[i] - 1 > max)
				max = lis[i] + lds[i] - 1;

		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		int n = arr.length;
		System.out.println("Length of LBS is " + lbs(arr, n));
	}

}
