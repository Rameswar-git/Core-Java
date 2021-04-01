package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class RearrangePositiveNegativeNumbers {

	public static void main(String[] args) {
		int[] arr = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		RearrangePosNeg(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	static void RearrangePosNeg(int arr[], int n) {
		int key, j;
		for (int i = 0; i < arr.length; i++) {
			key = arr[i];

			if (key > 0)
				continue;

			j = i - 1;
			while (j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
