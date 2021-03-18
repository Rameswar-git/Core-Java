package com.ramgeeks.Topics.Arrays;

public class RotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {15, 18, 2, 3, 6, 12};
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				break;
			}
		}
		if(i == arr.length-1)
			System.out.println(0);
		else
			System.out.println(i+1);
	}

}
