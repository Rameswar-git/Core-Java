package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class MergeArrayNwithMPlusNSize {

	public static void main(String[] args) {

		/* Initialize arrays */
		// o/p 2 5 7 8 9 13 15 20 25

		int mPlusN[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
		int N[] = { 5, 7, 9, 25 };
		int n = N.length;
		int m = mPlusN.length - n;
		moveToEnd(mPlusN);
		mergeArrays(mPlusN, N, n, m);
		System.out.println(Arrays.toString(mPlusN));
	}

	private static void moveToEnd(int[] mPlusN) {
		int j = mPlusN.length - 1;
		for (int i = mPlusN.length-1; i >= 0; i--) {
			if (mPlusN[i] != -1) {
				 mPlusN[j] = mPlusN[i];
				j--;
			}

		}
	}

	private static void mergeArrays(int[] mPlusN, int[] arr, int n, int m) {
		int i = n;
		
		int j = 0;
		
		int k = 0;
		
		while(k < (m+n)) {
			if(i < (m+n) && (mPlusN[i] < arr[j]) || j == n) {
				mPlusN[k] = mPlusN[i];
				i++;
				k++;
			}else {
				mPlusN[k] = arr[j];
				j++;
				k++;
			}
		}
	}

}
