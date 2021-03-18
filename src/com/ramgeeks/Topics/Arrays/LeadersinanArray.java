package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;

/*
 * https://www.geeksforgeeks.org/leaders-in-an-array/
 */

public class LeadersinanArray {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					break;
			}
			if(j == arr.length)
				System.out.print(arr[i]+" ");
		}
	}

}
