package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

/*
 * Given an array arr[] of size N (consisting of duplicates), 
 * the task is to check if the given array can be converted to a 
 * non-decreasing array by rotating it. If it’s not possible to
 *  do so, then print “No“. Otherwise, print “Yes“.
 */

public class FormArrayToNonDecreasingArray {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };
		int[] clone = arr.clone();
		Arrays.sort(clone);
		int key = clone[0];
		int m = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				m = i;
				break;
			}
		}
		int cnt = 1;
		for (int i = 4; m != i % clone.length; i++) {
			if (arr[i % clone.length] != clone[cnt++]) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

}
