package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class EvenOddPositionsPositiveNegative {

	public static void main(String[] args) {
		int[] arr = { 1, -3, 5, 6, -3, 6, 7, -4, 9, 10 };
		rearrange(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void rearrange(int[] arr, int length) {
		int positive = 0, negative = 1;
		while (true) {
			while (positive < length && arr[positive] >= 0) {
				positive += 2;
			}

			while (negative < length && arr[negative] < 0) {
				negative += 2;
			}
			if (positive < length && negative < length) {
				int temp = arr[positive];
				arr[positive] = arr[negative];
				arr[negative] = temp;
			}else {
				break;
			}
		}
	}

}
