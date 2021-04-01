package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

/*
 * Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in 
 * “arr[]” according to given index array. It is not allowed to given array arr’s length.

Example: 

Input:  arr[]   = [10, 11, 12];
        index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
        index[] = [0,  1,  2] 

Input:  arr[]   = [50, 40, 70, 60, 90]
        index[] = [3,  0,  4,  1,  2]
Output: arr[]   = [40, 60, 90, 50, 70]
        index[] = [0,  1,  2,  3,   4]
 * 
 */

public class ReorderArrayAccordingGivenIndexes {

	public static void main(String[] args) {
		int arr[] = { 50, 40, 70, 60, 90 };
		int index[] = { 3, 0, 4, 1, 2 };
		reorder(arr, index);
//		int[] orderedArray = getOrderedArray(arr, index);
		System.out.println(Arrays.toString(arr).replaceAll("\\W+", " ").trim());

	}

	private static void reorder(int[] arr, int[] index) {
		for (int i = 0; i < arr.length; i++) {
			while (index[i] != i) {
				int oldIndex = index[index[i]];
				int oldElement = arr[index[i]];
				
				arr[index[i]] = arr[i];
				index[index[i]] = index[i];
				
				arr[i] = oldElement;
				index[i] = oldIndex;
			}
		}
	}

	private static int[] getOrderedArray(int[] arr, int[] index) {
		int[] temp = new int[arr.length];
		for (int i = 0; i < index.length; i++) {
			temp[index[i]] = arr[i];
		}
		return temp;
	}

}
