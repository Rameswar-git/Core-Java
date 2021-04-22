package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

/*
 * Given a binary array A[] of size N. The task is to arrange the array in increasing order
 * Input: 
5
1 0 1 1 0

Output: 
0 0 1 1 1
 */

public class Segregate0sand1s {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		binSort(arr, arr.length);
	}

	static void binSort(int A[], int N) {
		int idx_start = 0;
		int idx_end = N - 1;
		while (idx_start < idx_end) {
			if (A[idx_start] == 1) {
				int temp = A[idx_start];
				A[idx_start] = A[idx_end];
				A[idx_end] = temp;
				idx_end--;
			} else {
				idx_start++;
			}
		}
		
        for(int a : A){
            System.out.print(a+" ");
        }

//		System.out.println(Arrays.toString(A).replaceAll("\\W+", " ").trim());
	}

}
