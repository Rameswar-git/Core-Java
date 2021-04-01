package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class MoveNegativestoEnd {

	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
		new MoveNegativestoEnd().segregateElements(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

//	public void segregateElements(int arr[], int n) {
//		for (int i = 0; i < arr.length; i++) {
//			int key = arr[i];
//			if (key < 0) {
//				continue;
//			}
//
//			int j = i - 1;
//
//			while (j >= 0 && arr[j] < 0) {
//				arr[j + 1] = arr[j];
//				j--;
//			}
//			arr[j + 1] = key;
//		}
//
//	}

	public void segregateElements(int arr[], int n) {
		int[] temp = new int[arr.length];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) {
				temp[index++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				temp[index++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}

	}

}
