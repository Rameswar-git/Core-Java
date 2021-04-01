package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

/*
 * Given an array of integers of size, N. Assume ‘0’ 
 * as the invalid number and all others as a valid number.
 *  Write a program that modifies the array in such a way
 *   that if the next number is a valid number and is the
 *    same as the current number, double the current number
 *     value and replace the next number with 0. After the
 *      modification, rearrange the array such that all 0’s
 *       are shifted to the end and the sequence of the valid number or
 *  new doubled number is maintained as in the original array.
 * 
 * 
 */

public class EaseTheArray {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
		int n = arr.length;

		System.out.print("Original array: ");
		System.out.println(Arrays.toString(arr).replaceAll("\\W+", " ").trim());

		modifyAndRearrangeArr(arr, n);
		shiftAllZeroToLeft(arr, n);

		System.out.print("Modified array: ");
		System.out.println(Arrays.toString(arr).replaceAll("\\W+", " ").trim());
	}

	private static void shiftAllZeroToLeft(int[] arr, int n) {
		int lastZeroPosition = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[lastZeroPosition];
				arr[lastZeroPosition] = temp;
				lastZeroPosition++;
			}
		}
	}

	private static void modifyAndRearrangeArr(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			if ((arr[i] != 0) && arr[i] == arr[i + 1]) {
				arr[i] = arr[i] + arr[i];
				arr[i + 1] = 0;
			}
		}
//		moveZerostoEnd(arr, n);
	}

	private static void moveZerostoEnd(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < n) {
			arr[count++] = 0;
		}
	}

}
