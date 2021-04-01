package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Given an array of numbers, arrange them 
 * in a way that yields the largest value. For example,
 * if the given numbers are {54, 546, 548, 60}, 
 * the arrangement 6054854654 gives the largest value.
 * And if the given numbers are {1, 34, 3, 98, 9, 76, 45, 4},
 * then the arrangement 998764543431 gives the largest value.
 * 
 */

public class FormBiggestNumber {

	public static void main(String[] args) {
		Integer[] arr = { 250, 74, 659, 931, 273, 545, 879, 924 };
		Arrays.sort(arr,(o1,o2) -> {
			return o1 - o2;
		});
		System.out.println(Arrays.toString(arr));
		String[] strarr = new String[arr.length];
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = String.valueOf(arr[i]);
		}
		String result = new FormBiggestNumber().printLargest(strarr);
		System.out.println(result);
	}

	String printLargest(String[] arr) {
		Arrays.sort(arr, new SortComparator());
		return Arrays.toString(arr).replaceAll("\\W+", "").trim();
	}

	public class SortComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			String x = o1 + o2;
			String y = o2 + o1;
			int val = x.compareTo(y);
			return val > 0 ? -1 : 1;

		}

	}

}
