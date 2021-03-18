package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {
		int arr[] = { 12, 10, 5, 6, 52, 36 };
		int k = 2;
		int[] copyOfRange = Arrays.copyOfRange(arr, 0, k);
		int[] copyOfRange2 = Arrays.copyOfRange(arr, k, arr.length);
		mergeArrays(copyOfRange, copyOfRange2);
		System.out.println("Hel");
	}

	private static void mergeArrays(int[] copyOfRange, int[] copyOfRange2) {
		int[] result = new int[copyOfRange.length + copyOfRange2.length];
		Arrays.toString(copyOfRange2);
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < copyOfRange2.length || j < copyOfRange.length) {
			if(i < copyOfRange2.length)
			result[k++] = copyOfRange2[i++];
			else
			  result[k++] = copyOfRange[j++];
		}
		System.out.println(Arrays.toString(result));
	}

}
