package com.ramgeeks.Topics.Arrays;

public class MinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 1, 2, 3 };
		
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				break;
			}
					
		}
		
		System.out.println(min);
	}

}
