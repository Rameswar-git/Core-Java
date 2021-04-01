package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

/*
 * 
 * Given an array Arr of N integers, task is to print the array in the order –
 *  smallest number, largest number, 2nd smallest number,
 *  2nd largest number, 3rd smallest number, 3rd largest number and so on.
 */

public class RearrangeTheArray {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
		new RearrangeTheArray().rearrangeArray(arr, arr.length);
	}

	void rearrangeArray(int[] arr, int n) {
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int m = 0;
		for (int i = 0, j = n - 1; i <= n / 2 || j >= n / 2; i++, j--) {
			if(m < n)  {
				temp[m++] = arr[i];
			}
			if( m < n) {
				temp[m++] = arr[j];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];			
		}
	}

}
