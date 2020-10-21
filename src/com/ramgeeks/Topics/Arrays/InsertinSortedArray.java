package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class InsertinSortedArray {

	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		int key = 40;
		int[] newarr = Arrays.copyOf(arr, arr.length + 1);
		insertIntoArray(arr, key, newarr);
		System.out.println(Arrays.toString(newarr));
	}

	private static void insertIntoArray(int[] arr, int key, int[] newarr) {
		int higherIndex = getHigherIndex(arr, key, 0, arr.length - 1);
		int temp = newarr[higherIndex];
		newarr[higherIndex] = key;
		for (int i = higherIndex + 1; i < newarr.length; i++) {
			int temp2 = newarr[i];
			newarr[i] = temp;
			temp = temp2;
		}
	}

	private static int getHigherIndex(int[] arr, int key, int start, int end) {
		if (end <= start) {
			return start;
		}
		int mid = (start + end) / 2;
		if (arr[mid] > key && mid > 0 && arr[mid - 1] < key) {
			return mid;
		} else if (arr[mid] < key) {
			return getHigherIndex(arr, key, mid + 1, end);
		} else {
			return getHigherIndex(arr, key, start, mid);
		}
	}
}
