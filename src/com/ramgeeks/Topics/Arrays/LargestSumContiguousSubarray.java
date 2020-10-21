package com.ramgeeks.Topics.Arrays;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int max_val = Integer.MIN_VALUE, max_upto = 0, start = 0, end = 0, s = 0;
		for (int i = 0; i < arr.length; i++) {
			max_upto = max_upto + arr[i];
			if (max_upto < 0) {
				max_upto = 0;
				s = i + 1;
			} else if (max_upto > max_val) {
				max_val = max_upto;
				start = s;
				end = i;
			}

		}
		System.out.println(start + " " + end);
		System.out.println(max_val);
	}

}
