package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

//https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
public class PairSumInArray {

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 1 };
		int ele = -2;
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == ele) {
				System.out.println(arr[start]+" "+arr[end]);
				break;
			}else if(sum < ele) {
				start++;
			}else {
				end--;
			}
		}
	}

//	public static void main(String[] args) {
//		int[] arr = new int[100];
//		int key = 93;
//		for (int i = 0; i < 100; i++) {
//			int gn = (int)(Math.random() * 100);
//			if(gn == key) {
//				System.out.println("Present");
//			}
//			arr[i] = gn;
//		}
//		Arrays.sort(arr);
//		int idx = binarySearch(arr,key,0,arr.length-1);
//		if(idx >=0 )
//		 System.out.println(arr[idx]);
//	}
}
